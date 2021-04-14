package application.controller;

import java.util.Arrays;

import application.model.Player;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class TableController {
	@FXML
	AnchorPane tablePane;
	
	private ObservableList<Player> tableData;
	private TableView<Player> table;
	
	TableColumn <Player, String> nameColumn = new TableColumn<Player, String>("Name");
	TableColumn <Player, Double> scoreColumn = new TableColumn<Player, Double>("Score");
	
	public void setTable(){
		tableData = FXCollections.observableArrayList();
		table = new TableView<Player>();
	//	while()
		tableData.add(new Player("John", 100));
		tableData.add(new Player("Howard", 80));
		tableData.add(new Player("Juliet", 70));
		tableData.add(new Player("Lola", 50));
		tableData.add(new Player("Klaus", 40));
		tableData.add(new Player("Mona", 60));
		tableData.add(new Player("Gwen", 30));
		tableData.add(new Player("Polo", 20));
		tableData.add(new Player("Fritz", 10));
		
		Player student = new Player("Matthew", 90);
		tableData.add(student);		
		
		

		nameColumn.prefWidthProperty().bind(table.widthProperty().multiply(0.5));
		scoreColumn.prefWidthProperty().bind(table.widthProperty().multiply(0.49));
		
		nameColumn.setCellValueFactory(
                new PropertyValueFactory<Player, String>("name"));
		scoreColumn.setCellValueFactory(
                new PropertyValueFactory<Player, Double>("score"));
        table.getColumns().addAll(Arrays.asList(nameColumn, scoreColumn));

		table.setItems(tableData);
		
		scoreColumn.setSortType(TableColumn.SortType.DESCENDING);
		table.getSortOrder().add(scoreColumn);
		table.sort();

		
		AnchorPane.setTopAnchor(table, 0.0);
	    AnchorPane.setRightAnchor(table, 0.0);
	    AnchorPane.setBottomAnchor(table, 0.0);
	    AnchorPane.setLeftAnchor(table, 0.0);
		tablePane.getChildren().addAll(table);	
	}
	
	
	public void add(double points){
		
		tableData.get(0).setName("Player");
		tableData.get(0).setScore(points);
		
		scoreColumn.setSortType(TableColumn.SortType.DESCENDING);
		table.getSortOrder().add(scoreColumn);
		table.sort();
		
		
	}
}