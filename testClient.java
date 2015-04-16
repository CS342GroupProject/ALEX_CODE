package edu.uic.cs342.aalviz2;

import java.util.Scanner;

public class Client {
	
	public static void main (String args[]){
		Scanner keyboard = new Scanner(System.in);
		

		String solution = "1234";
		System.out.println("DEBUG: Hardcoded solution for you to guess: "+ solution + "\n");
		
		System.out.print("Please enter your guess: ");
		String input = keyboard.nextLine();

		System.out.println("DEBUG: Your guess was " + input + "\n");
		
		//instantiate evaluator instance
		evaluator v = new evaluator();
		//evaluate two numbers and return a pair
		CorrectPair p2 = v.evaluate(solution, input);
		
		System.out.println("Number of digits that are correct AND in the correct place = " + p2.getCorrectPlaces());
		System.out.println("Number of digits that are correct BUT in the wrong place = " + p2.getWrongPlaces());
		
	}//end of main
}//end of client class
