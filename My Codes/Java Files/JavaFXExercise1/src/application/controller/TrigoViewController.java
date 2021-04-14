package application.controller;

import java.util.ArrayList;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TrigoViewController {
	ArrayList<String> trigoHistoryList = new ArrayList<String>();
	int checker = 0;
	private Main main;
	
	public void setMain(Main main) {
		this.main = main;
	}

	@FXML
	TextField input;
	
	@FXML
	Label label;
	
	public void sin() {
		try {
			StringBuilder theString = new StringBuilder();
			double num1 = Double.parseDouble(input.getText());
			theString.append("sin "+ String.valueOf(num1)+" = ");
			num1 = Math.sin(num1);
			theString.append(String.valueOf(num1));
			String finalString = theString.toString();
			trigoHistoryList.add(finalString);
			checker+=1;
			String string;
			string = String.valueOf(num1);
			label.setText(string);
			
		} catch(NumberFormatException e) {
			label.setText("Numbers Only.");
		}
		
		
	}
	
	public void cos() {
		try {
			StringBuilder theString = new StringBuilder();
			double num1 = Double.parseDouble(input.getText());
			theString.append("cos "+ String.valueOf(num1)+" = ");
			num1 = Math.cos(num1);
			theString.append(String.valueOf(num1));
			String finalString = theString.toString();
			trigoHistoryList.add(finalString);
			checker+=1;
			String string;
			string = String.valueOf(num1);
			label.setText(string);
			
		} catch(NumberFormatException e) {
			label.setText("Numbers Only.");
		}

	}
	
	public void tan() {
		try {
			StringBuilder theString = new StringBuilder();
			double num1 = Double.parseDouble(input.getText());
			theString.append("tan "+ String.valueOf(num1)+" = ");
			num1 = Math.tan(num1);
			theString.append(String.valueOf(num1));
			String finalString = theString.toString();
			trigoHistoryList.add(finalString);
			checker+=1;
			String string;
			string = String.valueOf(num1);
			label.setText(string);
		} catch(NumberFormatException e) {
			label.setText("Numbers Only.");
		}

	}

	public void asin() {
		try {
			StringBuilder theString = new StringBuilder();
			double num1 = Double.parseDouble(input.getText());
			theString.append("arcsin "+ String.valueOf(num1)+" = ");
			num1 = Math.asin(num1);
			theString.append(String.valueOf(num1));
			String finalString = theString.toString();
			trigoHistoryList.add(finalString);
			checker+=1;
			String string;
			string = String.valueOf(num1);
			label.setText(string);
		} catch(NumberFormatException e) {
			label.setText("Numbers Only.");
		}

	}
	
	public void openTrigoHistory() {
		main.trigoHistory(trigoHistoryList, checker);
	}
	public void backToArith() {
		main.arithmetic();
	}
	public void acos() {
		try {
			StringBuilder theString = new StringBuilder();
			double num1 = Double.parseDouble(input.getText());
			theString.append("arccos "+ String.valueOf(num1)+" = ");
			num1 = Math.acos(num1);
			theString.append(String.valueOf(num1));
			String finalString = theString.toString();
			trigoHistoryList.add(finalString);
			checker+=1;
			String string;
			string = String.valueOf(num1);
			label.setText(string);
		}catch(NumberFormatException e) {
			label.setText("Numbers Only.");
		}

	}
	
	public void atan() {
		try {
			StringBuilder theString = new StringBuilder();
			double num1 = Double.parseDouble(input.getText());
			theString.append("arctan "+ String.valueOf(num1)+" = ");
			num1 = Math.atan(num1);
			theString.append(String.valueOf(num1));
			String finalString = theString.toString();
			trigoHistoryList.add(finalString);
			checker+=1;
			String string;
			string = String.valueOf(num1);
			label.setText(string);
		} catch(NumberFormatException e) {
			label.setText("Numbers Only.");
		}

	}
}
