package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import java.util.*;
public class HistoryViewController {

	@FXML 
	VBox vbox;
	
	public void addChild(ArrayList<String> string, int checker) {
		for(int i = 0; i<checker;i++)
		{
			Label a = new Label(string.get(i));
			vbox.getChildren().add(a);
		}
	}
}
