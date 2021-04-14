package application;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class Card {

	private String faceName, suit;
	private Image image;
	private String fileName;
	
	public Card(String faceName, String suit) {
		setFaceName(faceName);
		setSuit(suit);
		faceName = faceName.toLowerCase();
		suit = suit.toLowerCase();
//		char k;
		String fileName;
		if(faceName=="10") {
			fileName="T"+""+suit.toUpperCase().charAt(0);
		} else {
			fileName = faceName.toUpperCase().charAt(0)+""+suit.toUpperCase().charAt(0);
		}
		this.fileName=fileName;
		image = new Image("./poker-standard/"+fileName+".png");
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFaceName(String faceName) {
		List<String> validFaceNames = getValidFaceNames();
		faceName = faceName.toLowerCase();
		if(validFaceNames.contains(faceName)) {
			this.faceName=faceName;
		} else {
			throw new IllegalArgumentException("Valid Face Names are: "+getValidFaceNames());
		}
	}
	
	public static List<String> getValidFaceNames() {
		return Arrays.asList("ace","2","3","4","5","6","7","8","9","10","jack","queen","king");
	}
	
	public Image getImage() {
		return image;
	}
	
	public static List<String> getValidSuits(){
		return Arrays.asList("hearts", "spades","clubs","diamonds");
	}
	
	public void setSuit(String suit) {
		List<String> validSuits = getValidSuits();
		suit = suit.toLowerCase();
		if(validSuits.contains(suit)) {
			this.suit=suit;
		} else {
			throw new IllegalArgumentException("Valid suits are: "+getValidSuits());
		}
	}
	public String getFaceName(){
		return this.faceName;
	}
	
	public String getSuit() {
		return this.suit;
	}
	
	public String toString() {
		
		return faceName+" of "+suit;
	}
	
}