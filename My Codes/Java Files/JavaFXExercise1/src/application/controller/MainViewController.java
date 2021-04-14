package application.controller;

import java.util.ArrayList;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class MainViewController {
	ArrayList<String> historyList = new ArrayList<String>() ;
	int checker = 0;
	@FXML
	private TextField input1;
	@FXML
	private TextField input2;
	@FXML
	Label label;
	private Main main;
	@FXML
	Button closeButton;
	
	
	public void setMain(Main main) {
		this.main = main;
	}


	@FXML
	public void multiply() {
		try {
			StringBuilder theString = new StringBuilder();
			double num1 = Double.parseDouble(input1.getText());
			double num2 = Double.parseDouble(input2.getText());
			String firstNum = String.valueOf(num1);
			theString.append(firstNum);
			theString.append(" * ");
			String secondNum = String.valueOf(num2);
			theString.append(secondNum);
			theString.append(" = ");
			String thirdNum = String.valueOf(num1*num2);
			theString.append(thirdNum);
			String finalString = theString.toString();
			historyList.add(finalString);
			checker+=1;
			String string;
			string = String.valueOf(num1*num2);
			label.setText(string);
		} catch(NumberFormatException e) {
			label.setText("Numbers Only.");
		}
	}
	
	public void openHistory() {
		main.history(historyList, checker);
	}
	public void openTrigonometric() {
		main.trigo();
	}
	
	@FXML
	public void subtract() {
		try {
		StringBuilder theString = new StringBuilder();
		double num1 = Double.parseDouble(input1.getText());
		double num2 = Double.parseDouble(input2.getText());
		String firstNum = String.valueOf(num1);
		theString.append(firstNum);
		theString.append(" - ");
		String secondNum = String.valueOf(num2);
		theString.append(secondNum);
		theString.append(" = ");
		String thirdNum = String.valueOf(num1-num2);
		theString.append(thirdNum);
		String finalString = theString.toString();
		historyList.add(finalString);
		checker+=1;
		String string;
		string = String.valueOf(num1-num2);
		label.setText(string);
		} catch(NumberFormatException e) {
			label.setText("Numbers Only.");
		}
	}
	
	@FXML
	public void add() {
		try {
			StringBuilder theString = new StringBuilder();
			double num1 = Double.parseDouble(input1.getText());
			double num2 = Double.parseDouble(input2.getText());
			String firstNum = String.valueOf(num1);
			theString.append(firstNum);
			theString.append(" + ");
			String secondNum = String.valueOf(num2);
			theString.append(secondNum);
			theString.append(" = ");
			String thirdNum = String.valueOf(num1+num2);
			theString.append(thirdNum);
			String finalString = theString.toString();
			historyList.add(finalString);
			checker+=1;
			String string;
			string = String.valueOf(num1+num2);
			label.setText(string);
		} catch(NumberFormatException e) {
			label.setText("Numbers Only.");
		}
	}
	
	@FXML
	public void divide() {
		try {
			StringBuilder theString = new StringBuilder();
			double num1 = Double.parseDouble(input1.getText());
			double num2 = Double.parseDouble(input2.getText());
			String firstNum = String.valueOf(num1);
			theString.append(firstNum);
			theString.append(" / ");
			String secondNum = String.valueOf(num2);
			theString.append(secondNum);
			theString.append(" = ");
			String thirdNum = String.valueOf(num1/num2);
			theString.append(thirdNum);
			String finalString = theString.toString();
			historyList.add(finalString);
			checker+=1;
			String string;
			string = String.valueOf(num1/num2);
			label.setText(string);
		} catch(NumberFormatException e) {
			label.setText("Numbers Only.");
		}
	}
	
	
	

}
