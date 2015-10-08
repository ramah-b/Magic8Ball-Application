package myMagic8BallPackage;

import java.util.Scanner;

public class Magic8BallApp {
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		String userQuestion;
		
		System.out.println("MAGIC 8 BALL APPLICATION");
		
	
		System.out.print("Ask me any question. if you want to quit, enter 'q': ");
		userQuestion = keyboard.nextLine();
		Magic8Ball myMagic = new Magic8Ball();
		
		while (!userQuestion.equals("q") && !userQuestion.equals("Q")){
			
			System.out.println(myMagic.shakeIt());
			System.out.print("\nAnother question? ");
			userQuestion = keyboard.nextLine();
		}
		System.out.println("\nYou have quitted. Nice Game!!");
		keyboard.close();
	}

}
