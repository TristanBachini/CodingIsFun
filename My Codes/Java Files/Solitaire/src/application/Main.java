package application;
	
import java.util.ArrayList;


import application.controller.MainController;
import application.controller.TableController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
	
	private Stage primaryStage;
	private Scene scene;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		Table();
	}
	
	public void newGame() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/Main.fxml"));
			AnchorPane main = (AnchorPane) loader.load();
			
			Scene scene = new Scene(main);

			primaryStage.setScene(scene);
			primaryStage.setTitle("Solitaire");
			primaryStage.show();
			
			
			MainController mainController = loader.getController();
			mainController.setMain(this);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void Table() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/Main.fxml"));
			AnchorPane MainFXML = (AnchorPane) loader.load();
			
			scene = new Scene(MainFXML);
			scene.getStylesheets().add("application/application.css");
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Solitaire");
			primaryStage.requestFocus();
			primaryStage.show();
			
			MainController main = loader.getController();
			main.setMain(this);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void HighScore(double points) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/Table.fxml"));
			AnchorPane HighScoreFXML = (AnchorPane) loader.load();
			
			Scene scene = new Scene(HighScoreFXML);
			Stage secondaryStage = new Stage();
			secondaryStage.setTitle("High Scores");
			secondaryStage.initModality(Modality.WINDOW_MODAL);
					
			secondaryStage.initOwner(primaryStage);
			secondaryStage.setScene(scene);
			secondaryStage.show();
					
			TableController highscore = loader.getController();
			highscore.setTable();
			highscore.add(points);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
