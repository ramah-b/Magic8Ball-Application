package myMagic8BallPackage;

import java.util.Scanner;

public class Magic8BallApp {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String userQuestion, userAnswer;


		System.out.println("MAGIC 8 BALL APPLICATION");

		System.out
				.print("Ask me any question. When done, you can enter 'history' to print out all questions and answers: ");
		userQuestion = keyboard.nextLine().toLowerCase();
		
		Magic8BallRemembers myMagic = new Magic8BallRemembers();

		do {
			
			if (!userQuestion.equals("history")) {
				
				userAnswer = myMagic.shakeIt(userQuestion);
				System.out.println(userAnswer);
				
				System.out.print("\nAnother question? ");
				userQuestion = keyboard.nextLine().toLowerCase();
			
			}

		} while (!userQuestion.equals("history"));
		
		System.out.println("\nYou have quitted. Here is your questions and answers history:");
		myMagic.printHistory();
		keyboard.close();
	}

}
