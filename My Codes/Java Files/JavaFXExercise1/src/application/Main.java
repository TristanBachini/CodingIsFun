package application;
	

import java.util.*;

import application.controller.HistoryViewController;
import application.controller.MainViewController;
import application.controller.TrigoHistoryViewController;
import application.controller.TrigoViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	private Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		arithmetic();
	}
	
	public void arithmetic() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/MainView.fxml"));
			AnchorPane mainViewFXML = (AnchorPane) loader.load();
			
			Scene scene = new Scene(mainViewFXML);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Arithmetic Calculator");
			primaryStage.show();
			
			MainViewController mainViewController = loader.getController();
			mainViewController.setMain(this);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void history(ArrayList<String> string, int checker) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/HistoryView.fxml"));
			AnchorPane HistoryViewFXML = (AnchorPane) loader.load();
			
			Scene scene = new Scene(HistoryViewFXML);
			Stage secondaryStage = new Stage();
			secondaryStage.setTitle("Arithmetic History");
			secondaryStage.initModality(Modality.WINDOW_MODAL);
			
			
			secondaryStage.initOwner(primaryStage);
			secondaryStage.setScene(scene);
			secondaryStage.show();
			
			
			
			HistoryViewController historyViewController = loader.getController();
			historyViewController.addChild(string, checker);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void trigoHistory(ArrayList<String> string, int checker) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/TrigoHistoryView.fxml"));
			AnchorPane TrigoHistoryViewFXML = (AnchorPane) loader.load();
			
			Scene scene = new Scene(TrigoHistoryViewFXML);
			Stage secondaryStage = new Stage();
			secondaryStage.initModality(Modality.WINDOW_MODAL);
			
			
			secondaryStage.initOwner(primaryStage);
			secondaryStage.setScene(scene);
			secondaryStage.setTitle("Trigonometric History");
			secondaryStage.show();
			
			
			TrigoHistoryViewController trigoHistoryViewController = loader.getController();
			trigoHistoryViewController.addChild(string, checker);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void trigo() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/TrigoView.fxml"));
			AnchorPane trigoViewFXML = (AnchorPane) loader.load();
			
			Scene scene = new Scene(trigoViewFXML);

			primaryStage.setScene(scene);
			primaryStage.setTitle("Trigonometric Calculator");
			primaryStage.show();
			
			TrigoViewController trigoViewController = loader.getController();
			trigoViewController.setMain(this);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	

}
