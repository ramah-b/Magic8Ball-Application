package myMagic8BallPackage;

import java.util.ArrayList;

public class Magic8BallRemembers extends Magic8Ball {
	
	private ArrayList<String> userQuestions;
	private ArrayList<String> userAnswers;
	
	public Magic8BallRemembers(){
		 super();
		 this.userQuestions = new ArrayList<String>();
		 this.userAnswers = new ArrayList<String>();
	}
	
	public String shakeIt(String userQuestion, int index){
		
		String userAnswer = super.shakeIt();
		userQuestions.add(index, userQuestion);
		userAnswers.add(index, userAnswer);
		
		return userAnswer;
		
	}
	
	public void printHistory(){
		
		for (int i=0; i < userQuestions.size(); i++){
			System.out.println("Question! " + (i+1));
			System.out.println(userQuestions.get(i) + "\n" +  userAnswers.get(i));
		}
	}

}
