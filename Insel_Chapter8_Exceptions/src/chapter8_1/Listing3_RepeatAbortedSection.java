package chapter8_1;

public class Listing3_RepeatAbortedSection {

	public static void main(String[] args) {
		
		int number = 0;
		
		while (true) {
			try {
				String s = javax.swing.JOptionPane.showInputDialog("Please input number");
				number = Integer.parseInt(s);
				break;
			} catch(NumberFormatException e) {
				System.err.println("Only numbers allowed!");
			}
		}
		System.out.printf("Your input was: %d %n", number);
	}
}
