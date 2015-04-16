package edu.uic.cs342.aalviz2;

/*
 * This class will evaluate the player's guess with the correct answer proposed 
 * by the opponent and return a pair of integers indicating the number of 
 * correct digits that player guessed correctly AND in the correct place as
 * well as the number of digits the player guessed correctly BUT in the wrong place.
 */
public class evaluator {
	
	//method that will evaluate a pair of numbers as indicated above and return a pair
	public CorrectPair evaluate(String s1, String s2){
		
		/* pair that will be returned with correct number of digits in the right place
		 * along with the correct number of digits but in the wrong place
		 */
		CorrectPair retPair = new CorrectPair();
		//array the will hold the player's guess
		char [] guessArr = s1.toCharArray();
		//array that will hold the answer that player is attempting to guess
		char [] answerArr = s2.toCharArray();
		
	
		//first check to see which digits are in the correct place
		if(guessArr[0] == answerArr[0]){
			retPair.incrementCorrecPlaces();
		}
		if(guessArr[1] == answerArr[1]){
			retPair.incrementCorrecPlaces();
		}
		if(guessArr[2] == answerArr[2]){
			retPair.incrementCorrecPlaces();
		}
		if(guessArr[3] == answerArr[3]){
			retPair.incrementCorrecPlaces();
		}
		
		//then check which ones are correct but in the wrong place
		if(guessArr[0] == answerArr[1] || guessArr[0] == answerArr[2] || guessArr[0] == answerArr[3]){
			retPair.incrementWrongPlaces();
		}
		if(guessArr[1] == answerArr[0] || guessArr[1] == answerArr[2] || guessArr[1] == answerArr[3]){
			retPair.incrementWrongPlaces();
		}
		if(guessArr[2] == answerArr[0] || guessArr[2] == answerArr[1] || guessArr[2] == answerArr[3]){
			retPair.incrementWrongPlaces();
		}
		if(guessArr[3] == answerArr[0] || guessArr[3] == answerArr[1] || guessArr[3] == answerArr[2]){
			retPair.incrementWrongPlaces();
		}	
		
		//return the pair of numbers in the form (# of correct digits in right place, # of right digits in wrong place)
		return retPair;
		
	}//end of evaluate(...)
}//end of evaluator class
