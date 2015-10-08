package myMagic8BallPackage;

import java.util.ArrayList;

public class Magic8BallRemembers extends Magic8Ball {
	
	private ArrayList<String> userQuestions;
	private ArrayList<String> userAnswers;
	private int indexCounter;
	
	public Magic8BallRemembers(){
		 super();
		 this.userQuestions = new ArrayList<String>();
		 this.userAnswers = new ArrayList<String>();
		 this.indexCounter = 0;
		 
	}
	
	public int getIndexCounter(){
		return this.indexCounter;
	}
	public String shakeIt(String userQuestion){
		
		String userAnswer = super.shakeIt();
		userQuestions.add(this.getIndexCounter(), userQuestion);
		userAnswers.add(this.getIndexCounter(), userAnswer);
		
		this.indexCounter++;
		return userAnswer;
		
	}
	
	
	public void printHistory(){
		
		for (int i=0; i < this.getIndexCounter(); i++){
			System.out.println("Question! " + (i+1));
			System.out.println(userQuestions.get(i) + "\n" +  userAnswers.get(i));
		}
	}

}
