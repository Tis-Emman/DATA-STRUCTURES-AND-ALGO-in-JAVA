package p;

import java.util.Stack;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		//STACK DATA STRUCTURES
		
		/*KEYWORDS
		 * stack - print all the stacks items in the data
		 * stack.pop - removes the most updated stack
		 * stack.search - search for the specific stack and will be printed in an integer value
		 * stack.peek - print the most updated stack
		 * 
		 * USES:
		 * 1. undo/redo features in text editors
		 * 2. moving back/forward through browser history
		 * 3. backtracking algorithms (maze, file directories)
		 * 4. calling functions back
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		Stack<String> stack = new Stack<String>();
		
		System.out.println("Our current games: ");
		
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("Subnautica");
		stack.push("Assassin's Creed Valhalla");
		stack.push("Valorant");
		
		
		
		for(int i = 0; i < 1000; i ++) {
			System.out.println(stack.search("Valorant"));
		}
		
		System.out.println("What do you want to order? ");
		String want_order = scanner.nextLine();
		
		System.out.println(stack.peek());
		System.out.println(want_order + " is at stack num: " + stack.search(want_order));
		if(want_order.equalsIgnoreCase("Skyrim")) {
			double price = 2000.00;
			System.out.println("The price is: " + price);
			
		} else if(want_order.equalsIgnoreCase("Minecraft")) {
			double Minecraft_price = 1200.00;
			
			System.out.println("The price is: " + Minecraft_price);
		} else if(want_order.equalsIgnoreCase("Subnautica")) {
			double Subnautica_price = 1500.00;
			System.out.println("The price is: " + Subnautica_price);
			
		} else if(want_order.equalsIgnoreCase("Valorant")) {
			System.out.println("This game is free");
		} else if(want_order.equalsIgnoreCase("Assassin's Creed Valhalla")) {
			double Assassin_Price = 3000;
			System.out.println("The price is: " + Assassin_Price);
		} else {
			System.out.println("Game not found");
		}
		 
		
		
		 
	}
}
