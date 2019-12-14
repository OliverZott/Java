package chapter7_6_abstract;

public class Playground_7_6 {

	public static void main(String[] args) {
		Door door1 = new Door(1);
		GameObject key1 = new Key(1);
		GameObject key9 = new Key(9);
		
		System.out.printf("Key-9 use succesfull: %b, Door-1 open: %b\n", key9.useOn(door1), door1.isOpen);
		System.out.printf("Key-1 use succesfull: %b, Door-1 open: %b\n", key1.useOn(door1), door1.isOpen);
	}
}
