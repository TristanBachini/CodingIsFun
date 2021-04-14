package application.model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class Player {
	private final SimpleStringProperty name;
	private final SimpleDoubleProperty score;

	public Player(String name, double score){
		this.name = new SimpleStringProperty(name);
		this.score = new SimpleDoubleProperty(score);
	}

	//getter for name
	public String getName() {
		return name.get();
	}

	//getter for score
	public Double getScore() {
		return score.get();
	}
	
	//setter for name
	public void setName(String name){
		this.name.set(name);
	}
	
	//getter for score
	public void setScore(Double score){
		this.score.set(score);
	}
}
