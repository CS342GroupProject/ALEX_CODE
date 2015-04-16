package edu.uic.cs342.aalviz2;
/*
 * This class will hold two things: the number of digits correctly guessed in the right place
 * and the number of correct digits guessed in the the wrong position.
 */

public class CorrectPair {
	private int correctPlace;
	private int wrongPlace;
	
	//constructor
	public CorrectPair(){
		this.correctPlace = this.wrongPlace = 0;
	}//end of constructor
	
	//getter for correctPlaces
	public int getCorrectPlaces(){
		return this.correctPlace;
	}//end of getCorrectPlaces()
	
	//getter for wrongPlaces
	public int getWrongPlaces(){
		return this.wrongPlace;
	}//end of getWrongPlaces()
	
	//setter for correctPlace, which simply increments the count
	public void incrementCorrecPlaces(){
		this.correctPlace++;
	}//end of incrementCorrectPlaces()
	
	//setter for wrongPlaces, which also simply increments the count
	public void incrementWrongPlaces(){
		this.wrongPlace++;
	}//end of incrementWrongPlaces()
}
