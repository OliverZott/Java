package chapter7_6_abstract;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game {
	
	public static void main(String[] args) {
		
		HashMap<String, GameObject> gameObjects = new HashMap<>();
		
		
		/**
		 * Example: Content-addressable memory
		 * special Syntax to generate sub-class of game object
		 * and overwrite the abstract method
		 * 
		 * ! ";" at the  end to declare local variable
		 */
		GameObject nullGameObject = new GameObject() {
			
			@Override
			public boolean useOn(GameObject object) {
				return false;
			}
		};		// local variable declaration!
		
		
		// create door and keys
		gameObjects.put("hell-door", new Door(1));
		gameObjects.put("heaven-key", new Key(9));
		gameObjects.put("hell-key", new Key(1));
		
		
		/**
		 * Game function to get user input
		 */
		while (true) {
			System.out.println("What do you want to do?");
			
			@SuppressWarnings("resource")  // to avoid "close" warning
			String input = new Scanner(System.in).nextLine().toLowerCase();
			
			if (input.matches("end|bye|quit")) {
				System.exit(0);
			}
			
			String simplifiedLine = 
					input.replaceAll("use|put| do |with|in|at|on", "");
			StringTokenizer tokenizer = new StringTokenizer(simplifiedLine);
			
			if (tokenizer.countTokens() < 2) {
				System.out.printf("More Deteils please, %s is not enough!", input);
				continue;
			}
			
			GameObject subject = gameObjects.getOrDefault(tokenizer.nextToken(), nullGameObject);
			GameObject object = gameObjects.getOrDefault(tokenizer.nextToken(), nullGameObject);
			
			System.out.println(subject.useOn(object) ? "Done!": "Could not"
					+ " execute '" + input + "' command.");
		}
		
		
		
		
	}

}
