package myMagic8BallPackage;

import java.util.Random;

public class Magic8Ball {
	
	private final String answer0 = "It is certain";
	private final String answer1 = "It is decidedly so";
	private final String answer2 = "Without a doubt";
	private final String answer3 = "Yes - definitely";
	private final String answer4 = "You may rely on it";
	private final String answer5 = "As I see it, yes";
	private final String answer6 = "Most likely";
	private final String answer7 = "Outlook good";
	private final String answer8 = "Signs point to yes";
	private final String answer9 = "Yes";
	private final String answer10 = "Reply hazy, try again";
	private final String answer11 = "Ask again later";
	private final String answer12 = "Better not tell you now";
	private final String answer13 = "Cannot predict now";
	private final String answer14 = "Concentrate and ask again";
	private final String answer15 = "8-BALL ERROR!";
	private final String answer16 = "Don't count on it";
	private final String answer17 = "My reply is no";
	private final String answer18 = "My sources say no";
	private final String answer19 = "Outlook not so good";
	private final String answer20 = "Very doubtful";




	public String shakeIt() {

		Random r = new Random();

		int randomNum = 1 + r.nextInt(21);

		 if (randomNum == 1)
			return answer0; 
		else if (randomNum == 2)
			return answer1;
		else if (randomNum == 3)
			return answer2;
		else if (randomNum == 4)
			return answer3;
		else if (randomNum == 5)
			return answer4;
		else if (randomNum == 6)
			return answer5;
		else if (randomNum == 7)
			return answer6;
		else if (randomNum == 8)
			return answer7;
		else if (randomNum == 9)
			return answer8;
		else if (randomNum == 10)
			return answer9;
		else if (randomNum == 11)
			return answer10;
		else if (randomNum == 12)
			return answer11;
		else if (randomNum == 13)
			return answer12;
		else if (randomNum == 14)
			return answer13;
		else if (randomNum == 15)
			return answer14;
		else if (randomNum == 16)
			return answer15;
		else if (randomNum == 17)
			return answer16;
		else if (randomNum == 18)
			return answer17;
		else if (randomNum == 19)
			return answer18;
		else if (randomNum == 20)
			return answer19;
		else
			return answer20;

		
	}

}
