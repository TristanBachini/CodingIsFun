 package application;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

	private ArrayList<Card> deck;
	private Image backOfCardImage;
	private Card thisCard;
	
	public DeckOfCards(ArrayList<Card> deck) {
		this.deck = deck;
		backOfCardImage = new Image("./poker-standard/B.png");
	}
	
	public DeckOfCards() {
		List<String>suits = Card.getValidSuits();
		List<String> faceNames = Card.getValidFaceNames();
		deck = new ArrayList<>();
		for(String suit:suits) {
			for(String faceName:faceNames) {
				deck.add(new Card(faceName,suit));
			}
		}
		backOfCardImage = new Image("./poker-standard/B.png");
		
		}
	
	public ArrayList<Card> getDeck(){
		return deck;
	}
	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}
	public Image getBackOfCardImage() {
		return backOfCardImage;
	}
	
	public void setBackOfCardImage(Image backOfCardImage) {
		this.backOfCardImage=backOfCardImage;
	}
	
	public Card getThisCard() {
		return thisCard;
	}
	
	public void addToNewDeck() {
		deck.add(thisCard);
	}
	
	public Card dealTopCard() {
		if(deck.size()>0) {
			thisCard = deck.remove(0);
			return thisCard;
		} else {
			// todo
			return null;
		}
	}
	
	public int getDeckSize() {
		int size = deck.size();
		return size;
	}
	
	
	public void shuffle() { //new
		Collections.shuffle(deck);
	}
	
	public void empty() {    //new
		deck.removeAll(deck);
	}
	
}
