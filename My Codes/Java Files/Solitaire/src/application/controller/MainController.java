package application.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Point2D;

import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Card;
import application.DeckOfCards;
import application.Main;


import java.net.URL;

import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class MainController implements Initializable {
	private Main main;
	public void setMain(Main main) {
		this.main = main;
	}
	
	double score = 0;		
		
	@FXML
	ImageView H, C, D, S;
	
	static int hCounter = 1, cCounter = 1, dCounter = 1, sCounter = 1, count, diMagamet=0;
	int hSize = 1, cSize = 1, dSize = 1, sSize = 1;
	private Card minus100 = null;
	
	@FXML
	Label Score, inGameScore;

	@FXML
	private Button NextCardButton, newGame;
	
	int vbox2Counter=1,vbox3Counter=2,vbox4Counter=3,vbox5Counter=4,vbox6Counter=5,vbox7Counter =6;
	int deckCurrSize=24, v1CurrSize=1, v2CurrSize=2, v3CurrSize=3, v4CurrSize=4, v5CurrSize=5, v6CurrSize=6, v7CurrSize=7;
	
	@FXML
	private ImageView ActiveCardImageView, ActiveCardImageViewCopy;
	
	private ImageView ActiveCardImageViewCopy1 = new ImageView(), ActiveCardImageViewCopy2= new ImageView(),ActiveCardImageViewCopy3= new ImageView(),
			ActiveCardImageViewCopy4= new ImageView(), ActiveCardImageViewCopy5 = new ImageView(),ActiveCardImageViewCopy6= new ImageView(),
			ActiveCardImageViewCopy7= new ImageView(),ActiveCardImageViewCopy8= new ImageView(),ActiveCardImageViewCopy9= new ImageView(),
			ActiveCardImageViewCopy10= new ImageView(),ActiveCardImageViewCopy11= new ImageView(),ActiveCardImageViewCopy12= new ImageView(),
			ActiveCardImageViewCopy13= new ImageView(),ActiveCardImageViewCopy14= new ImageView(), ActiveCardImageViewCopy15= new ImageView(),
			ActiveCardImageViewCopy16= new ImageView(),ActiveCardImageViewCopy17= new ImageView(),ActiveCardImageViewCopy18= new ImageView(),
			ActiveCardImageViewCopy19= new ImageView(),ActiveCardImageViewCopy20= new ImageView(),ActiveCardImageViewCopy21= new ImageView(),
			ActiveCardImageViewCopy22= new ImageView(), ActiveCardImageViewCopy23= new ImageView(),ActiveCardImageViewCopy24= new ImageView(),
		    ActiveCardImageViewCopy25= new ImageView(),ActiveCardImageViewCopy26= new ImageView(),ActiveCardImageViewCopy27= new ImageView(),
		    ActiveCardImageViewCopy28= new ImageView();
	
	@FXML
	private VBox vBox1, vBox2, vBox3, vBox4, vBox5, vBox6, vBox7;

	ImageView iv;
	
	Image SImage = new Image("./poker-standard/FS.PNG");
	Image CImage = new Image("./poker-standard/FC.PNG");
	Image DImage = new Image("./poker-standard/FD.PNG");
	Image HImage = new Image("./poker-standard/FH.PNG");
	
	String str;
	
	private DeckOfCards deck; //added newDeck
	
	private boolean dropStatus, activeCardIsNull = true, foundationBool;
	
	private ArrayList <Card> firstVbox= new ArrayList<Card>(10),secondVbox= new ArrayList<Card>(10),
			thirdVbox = new ArrayList<Card>(10),fourthVbox = new ArrayList<Card>(10),fifthVbox = new ArrayList<Card>(10),
			sixthVbox= new ArrayList<Card>(10),seventhVbox = new ArrayList <Card>(10);
	
	public void initialize(URL location, ResourceBundle resources) {
		inGameScore.setText("0");
		deck = new DeckOfCards();
		deck.shuffle();
		
		foundation();
		
		if (this.ActiveCardImageView != null)
        {
			
			wasteCards(ActiveCardImageView); //Drag Detected method for ActiveCardImageView
			
			setupGestureSource(ActiveCardImageViewCopy1); setupGestureSource(ActiveCardImageViewCopy2); setupGestureSource(ActiveCardImageViewCopy3);
			setupGestureSource(ActiveCardImageViewCopy4); setupGestureSource(ActiveCardImageViewCopy5); setupGestureSource(ActiveCardImageViewCopy6);
			setupGestureSource(ActiveCardImageViewCopy7); setupGestureSource(ActiveCardImageViewCopy8); setupGestureSource(ActiveCardImageViewCopy9);
			setupGestureSource(ActiveCardImageViewCopy10); setupGestureSource(ActiveCardImageViewCopy11); setupGestureSource(ActiveCardImageViewCopy12);
			setupGestureSource(ActiveCardImageViewCopy13); setupGestureSource(ActiveCardImageViewCopy14); setupGestureSource(ActiveCardImageViewCopy15);
			setupGestureSource(ActiveCardImageViewCopy16); setupGestureSource(ActiveCardImageViewCopy17); setupGestureSource(ActiveCardImageViewCopy18);
			setupGestureSource(ActiveCardImageViewCopy19); setupGestureSource(ActiveCardImageViewCopy20); setupGestureSource(ActiveCardImageViewCopy21);
			setupGestureSource(ActiveCardImageViewCopy22); setupGestureSource(ActiveCardImageViewCopy23); setupGestureSource(ActiveCardImageViewCopy24);
			setupGestureSource(ActiveCardImageViewCopy25); setupGestureSource(ActiveCardImageViewCopy26); setupGestureSource(ActiveCardImageViewCopy27);
			setupGestureSource(ActiveCardImageViewCopy28);
			
			setupGestureTarget(vBox1);
			setupGestureTarget(vBox2);
			setupGestureTarget(vBox3);
			setupGestureTarget(vBox4);
			setupGestureTarget(vBox5);
			setupGestureTarget(vBox6);
			setupGestureTarget(vBox7);
			
			setCards(); //initializes cards at the start of the game
        }
		
	}
	
	public void wasteCards(ImageView ActiveCardImageView) {
		ActiveCardImageView.setOnDragDetected(new EventHandler <MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event)
            {
            	/* allow any transfer mode */
                Dragboard db = ActiveCardImageView.startDragAndDrop(TransferMode.MOVE);
                 
                /* put an image on dragboard */
                ClipboardContent content = new ClipboardContent();
                 
                Image sourceImage = ActiveCardImageView.getImage();
                ImageView img = new ImageView();
                img.setImage(ActiveCardImageView.getImage());
                img.setId(ActiveCardImageView.getId());
                img.setFitWidth(50);
                img.setFitHeight(67);
                content.putImage(sourceImage);
                db.setContent(content);

                iv = img ;
                                
                event.consume();
            }
        });
	}
	
	public void setCards() {
		for(int i = 0; i<1;i++) {
			firstVbox.add(deck.dealTopCard());
			ActiveCardImageViewCopy1.setImage(new Image("/poker-standard/B.png"));
			ActiveCardImageViewCopy1.setFitWidth(50);
			ActiveCardImageViewCopy1.setFitHeight(67);
			vBox1.getChildren().add(ActiveCardImageViewCopy1);
			Image image1 = ((ImageView)vBox1.getChildren().get(0)).getImage();
			for (int l = 0; l < image1.getWidth(); l++)
			{
			  for (int j = 0; j < image1.getHeight(); j++)
			  {
				  if (image1.getPixelReader().getArgb(l, j) == deck.getBackOfCardImage().getPixelReader().getArgb(l, j)) {
					  ActiveCardImageViewCopy1.setImage(firstVbox.get(0).getImage());
					  ActiveCardImageViewCopy1.setId(firstVbox.get(0).getFileName());
				  }
			  }
			}
			firstVbox.remove(0);
		}
		ActiveCardImageView.setImage(null);
		for(int i = 0;i<2;i++) {
			secondVbox.add(deck.dealTopCard());
		}
		ActiveCardImageViewCopy2.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy2.setFitWidth(50);
		ActiveCardImageViewCopy2.setFitHeight(67);
		vBox2.getChildren().add(ActiveCardImageViewCopy2);
		ActiveCardImageViewCopy3.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy3.setFitWidth(50);
		ActiveCardImageViewCopy3.setFitHeight(67);
		vBox2.getChildren().add(ActiveCardImageViewCopy3);
		Image image2 = ((ImageView)vBox2.getChildren().get(0)).getImage();
		for (int l = 0; l < image2.getWidth(); l++)
		{
		  for (int j = 0; j < image2.getHeight(); j++)
		  {
			  if (image2.getPixelReader().getArgb(l, j) == deck.getBackOfCardImage().getPixelReader().getArgb(l, j)) {
				  ActiveCardImageViewCopy3.setImage(secondVbox.get(0).getImage());
				  ActiveCardImageViewCopy3.setId(secondVbox.get(0).getFileName());
			  }
		  }
		}
		secondVbox.remove(0);
		ActiveCardImageView.setImage(null);
		for(int i = 0;i<3;i++) {
			thirdVbox.add(deck.dealTopCard());
		}
		ActiveCardImageViewCopy4.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy4.setFitWidth(50);
		ActiveCardImageViewCopy4.setFitHeight(67);
		vBox3.getChildren().add(ActiveCardImageViewCopy4);
		ActiveCardImageViewCopy5.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy5.setFitWidth(50);
		ActiveCardImageViewCopy5.setFitHeight(67);
		vBox3.getChildren().add(ActiveCardImageViewCopy5);
		ActiveCardImageViewCopy6.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy6.setFitWidth(50);
		ActiveCardImageViewCopy6.setFitHeight(67);
		vBox3.getChildren().add(ActiveCardImageViewCopy6);
		Image image3 = ((ImageView)vBox3.getChildren().get(0)).getImage();
		for (int l = 0; l < image3.getWidth(); l++)
		{
		  for (int j = 0; j < image3.getHeight(); j++)
		  {
			  if (image3.getPixelReader().getArgb(l, j) == deck.getBackOfCardImage().getPixelReader().getArgb(l, j)) {
				  ActiveCardImageViewCopy6.setImage(thirdVbox.get(0).getImage());
				  ActiveCardImageViewCopy6.setId(thirdVbox.get(0).getFileName());
			  }
		  }
		}
		thirdVbox.remove(0);
		ActiveCardImageView.setImage(null);
		for(int i = 0;i<4;i++) {
			fourthVbox.add(deck.dealTopCard());
		}
		ActiveCardImageViewCopy7.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy7.setFitWidth(50);
		ActiveCardImageViewCopy7.setFitHeight(67);
		vBox4.getChildren().add(ActiveCardImageViewCopy7);
		ActiveCardImageViewCopy8.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy8.setFitWidth(50);
		ActiveCardImageViewCopy8.setFitHeight(67);
		vBox4.getChildren().add(ActiveCardImageViewCopy8);
		ActiveCardImageViewCopy9.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy9.setFitWidth(50);
		ActiveCardImageViewCopy9.setFitHeight(67);
		vBox4.getChildren().add(ActiveCardImageViewCopy9);
		ActiveCardImageViewCopy10.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy10.setFitWidth(50);
		ActiveCardImageViewCopy10.setFitHeight(67);
		vBox4.getChildren().add(ActiveCardImageViewCopy10);
		Image image4 = ((ImageView)vBox4.getChildren().get(0)).getImage();
		for (int l = 0; l < image4.getWidth(); l++)
		{
		  for (int j = 0; j < image4.getHeight(); j++)
		  {
			  if (image4.getPixelReader().getArgb(l, j) == deck.getBackOfCardImage().getPixelReader().getArgb(l, j)) {
				  ActiveCardImageViewCopy10.setImage(fourthVbox.get(0).getImage());
				  ActiveCardImageViewCopy10.setId(fourthVbox.get(0).getFileName());
			  }
		  }
		}
		fourthVbox.remove(0);
		ActiveCardImageView.setImage(null);
		for(int i = 0;i<5;i++) {
			fifthVbox.add(deck.dealTopCard());
		}
		ActiveCardImageViewCopy11.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy11.setFitWidth(50);
		ActiveCardImageViewCopy11.setFitHeight(67);
		vBox5.getChildren().add(ActiveCardImageViewCopy11);
		ActiveCardImageViewCopy12.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy12.setFitWidth(50);
		ActiveCardImageViewCopy12.setFitHeight(67);
		vBox5.getChildren().add(ActiveCardImageViewCopy12);
		ActiveCardImageViewCopy13.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy13.setFitWidth(50);
		ActiveCardImageViewCopy13.setFitHeight(67);
		vBox5.getChildren().add(ActiveCardImageViewCopy13);
		ActiveCardImageViewCopy14.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy14.setFitWidth(50);
		ActiveCardImageViewCopy14.setFitHeight(67);
		vBox5.getChildren().add(ActiveCardImageViewCopy14);
		ActiveCardImageViewCopy15.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy15.setFitWidth(50);
		ActiveCardImageViewCopy15.setFitHeight(67);
		vBox5.getChildren().add(ActiveCardImageViewCopy15);
		Image image5 = ((ImageView)vBox5.getChildren().get(0)).getImage();
		for (int l = 0; l < image5.getWidth(); l++)
		{
		  for (int j = 0; j < image5.getHeight(); j++)
		  {
			  if (image5.getPixelReader().getArgb(l, j) == deck.getBackOfCardImage().getPixelReader().getArgb(l, j)) {
				  ActiveCardImageViewCopy15.setImage(fifthVbox.get(0).getImage());
				  ActiveCardImageViewCopy15.setId(fifthVbox.get(0).getFileName());
			  }
		  }
		}
		fifthVbox.remove(0);
		ActiveCardImageView.setImage(null);
		for(int i = 0;i<6;i++) {
			sixthVbox.add(deck.dealTopCard());
		}
		ActiveCardImageViewCopy16.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy16.setFitWidth(50);
		ActiveCardImageViewCopy16.setFitHeight(67);
		vBox6.getChildren().add(ActiveCardImageViewCopy16);
		ActiveCardImageViewCopy17.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy17.setFitWidth(50);
		ActiveCardImageViewCopy17.setFitHeight(67);
		vBox6.getChildren().add(ActiveCardImageViewCopy17);
		ActiveCardImageViewCopy18.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy18.setFitWidth(50);
		ActiveCardImageViewCopy18.setFitHeight(67);
		vBox6.getChildren().add(ActiveCardImageViewCopy18);
		ActiveCardImageViewCopy19.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy19.setFitWidth(50);
		ActiveCardImageViewCopy19.setFitHeight(67);
		vBox6.getChildren().add(ActiveCardImageViewCopy19);
		ActiveCardImageViewCopy20.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy20.setFitWidth(50);
		ActiveCardImageViewCopy20.setFitHeight(67);
		vBox6.getChildren().add(ActiveCardImageViewCopy20);
		ActiveCardImageViewCopy21.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy21.setFitWidth(50);
		ActiveCardImageViewCopy21.setFitHeight(67);
		vBox6.getChildren().add(ActiveCardImageViewCopy21);
		Image image6 = ((ImageView)vBox6.getChildren().get(0)).getImage();
		for (int l = 0; l < image6.getWidth(); l++)
		{
		  for (int j = 0; j < image6.getHeight(); j++)
		  {
			  if (image6.getPixelReader().getArgb(l, j) == deck.getBackOfCardImage().getPixelReader().getArgb(l, j)) {
				  ActiveCardImageViewCopy21.setImage(sixthVbox.get(0).getImage());
				  ActiveCardImageViewCopy21.setId(sixthVbox.get(0).getFileName());
			  }
		  }
		}
		sixthVbox.remove(0);
		ActiveCardImageView.setImage(null);
		for(int i = 0;i<7;i++) {
			seventhVbox.add(deck.dealTopCard());
		}
		ActiveCardImageViewCopy22.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy22.setFitWidth(50);
		ActiveCardImageViewCopy22.setFitHeight(67);
		vBox7.getChildren().add(ActiveCardImageViewCopy22);
		ActiveCardImageViewCopy23.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy23.setFitWidth(50);
		ActiveCardImageViewCopy23.setFitHeight(67);
		vBox7.getChildren().add(ActiveCardImageViewCopy23);
		ActiveCardImageViewCopy24.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy24.setFitWidth(50);
		ActiveCardImageViewCopy24.setFitHeight(67);
		vBox7.getChildren().add(ActiveCardImageViewCopy24);
		ActiveCardImageViewCopy25.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy25.setFitWidth(50);
		ActiveCardImageViewCopy25.setFitHeight(67);
		vBox7.getChildren().add(ActiveCardImageViewCopy25);
		ActiveCardImageViewCopy26.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy26.setFitWidth(50);
		ActiveCardImageViewCopy26.setFitHeight(67);
		vBox7.getChildren().add(ActiveCardImageViewCopy26);
		ActiveCardImageViewCopy27.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy27.setFitWidth(50);
		ActiveCardImageViewCopy27.setFitHeight(67);
		vBox7.getChildren().add(ActiveCardImageViewCopy27);
		ActiveCardImageViewCopy28.setImage(new Image("/poker-standard/B.png"));
		ActiveCardImageViewCopy28.setFitWidth(50);
		ActiveCardImageViewCopy28.setFitHeight(67);
		vBox7.getChildren().add(ActiveCardImageViewCopy28);
		Image image7 = ((ImageView)vBox7.getChildren().get(0)).getImage();
		for (int l = 0; l < image7.getWidth(); l++)
		{
		  for (int j = 0; j < image7.getHeight(); j++)
		  {
			  if (image7.getPixelReader().getArgb(l, j) == deck.getBackOfCardImage().getPixelReader().getArgb(l, j)) {
				  ActiveCardImageViewCopy28.setImage(seventhVbox.get(0).getImage());
				  ActiveCardImageViewCopy28.setId(seventhVbox.get(0).getFileName());
			  }
		  }
		}
		seventhVbox.remove(0);
		ActiveCardImageView.setImage(null);
		
	}
	
	@FXML
	public void newGame() {
		main.newGame();
	}
	
	@FXML
	public void nextCard() {
		if(minus100!=null) {
			for(int i =0;i<vBox1.getChildren().size();i++) {
				if(vBox1.getChildren().get(i).getId()==minus100.getFileName()) {
					diMagamet = 0;
				}
			}
			for(int i =0;i<vBox2.getChildren().size();i++) {
				if(vBox2.getChildren().get(i).getId()==minus100.getFileName()) {
					diMagamet = 0;
				}
			}
			for(int i =0;i<vBox3.getChildren().size();i++) {
				if(vBox3.getChildren().get(i).getId()==minus100.getFileName()) {
					diMagamet = 0;
				}
			}
			for(int i =0;i<vBox4.getChildren().size();i++) {
				if(vBox4.getChildren().get(i).getId()==minus100.getFileName()) {
					diMagamet = 0;
				}
			}
			for(int i =0;i<vBox5.getChildren().size();i++) {
				if(vBox5.getChildren().get(i).getId()==minus100.getFileName()) {
					diMagamet = 0;
				}
			}
			for(int i =0;i<vBox6.getChildren().size();i++) {
				if(vBox6.getChildren().get(i).getId()==minus100.getFileName()) {
					diMagamet = 0;
				}
			}
			for(int i =0;i<vBox7.getChildren().size();i++) {
				if(vBox7.getChildren().get(i).getId()==minus100.getFileName()) {
					diMagamet = 0;
				}
			}
		}
		if(activeCardIsNull==false) {
			deck.addToNewDeck();
			if(diMagamet==0) {
				minus100=deck.getThisCard();
				System.out.println(minus100.getFileName());
				diMagamet=1;
			}
		}
		ActiveCardImageView.setImage(deck.dealTopCard().getImage());
		if(deck.getThisCard()==minus100) {
			score-=100;
			if(score<0) {
				score=0;
			}
		}
		
		ActiveCardImageView.setId(deck.getThisCard().getFileName());
//		int vBoxsize1 = vBox1.getChildren().size();
//		int vBoxsize2 = vBox2.getChildren().size();
//		int vBoxsize3 = vBox3.getChildren().size();
//		int vBoxsize4 = vBox4.getChildren().size();
//		int vBoxsize5 = vBox5.getChildren().size();
//		int vBoxsize6 = vBox6.getChildren().size();
//		int vBoxsize7 = vBox7.getChildren().size();
//		for(int i = 0; i<vBoxsize1;i++) {
//			System.out.println(vBox1.getChildren().get(i).getId());
//		}
//		for(int i = 0; i<vBoxsize2;i++) {
//			System.out.println(vBox2.getChildren().get(i).getId());
//		}
//		for(int i = 0; i<vBoxsize3;i++) {
//			System.out.println(vBox3.getChildren().get(i).getId());
//		}
//		for(int i = 0; i<vBoxsize4;i++) {
//			System.out.println(vBox4.getChildren().get(i).getId());
//		}
//		for(int i = 0; i<vBoxsize5;i++) {
//			System.out.println(vBox5.getChildren().get(i).getId());
//		}
//		for(int i = 0; i<vBoxsize6;i++) {
//			System.out.println(vBox6.getChildren().get(i).getId());
//		}
//		for(int i = 0; i<vBoxsize7;i++) {
//			System.out.println(vBox7.getChildren().get(i).getId());
//		}
		activeCardIsNull = false;
		inGameScore.setText(Double.toString(score));
	}

	public void exit()
	{
		System.exit(0);
	}

	public void highscore() {
		
		main.HighScore(score);
		
	}
	void setUpVBoxSource(VBox vbox, ImageView source) {
		vbox.setOnDragDetected(new EventHandler <MouseEvent>() {

	           @Override
	           public void handle(MouseEvent event) {
	        	   
	               /* allow any transfer mode */
	               Dragboard db = source.startDragAndDrop(TransferMode.MOVE);
	                
	               /* put an image on dragboard */
	               ClipboardContent content = new ClipboardContent();
	                
	               Image sourceImage = source.getImage();
	               content.putImage(sourceImage);
	               db.setContent(content);

	               iv = source;
	                               
	               event.consume();
	           }
	       });
	}
	
	void setupGestureSource(ImageView source){
        
        source.setOnDragDetected(new EventHandler <MouseEvent>() {

           @Override
           public void handle(MouseEvent event) {

               /* allow any transfer mode */
               Dragboard db = source.startDragAndDrop(TransferMode.MOVE);
                
               /* put an image on dragboard */
               ClipboardContent content = new ClipboardContent();
                
               Image sourceImage = source.getImage();
               content.putImage(sourceImage);
               db.setContent(content);

               iv = source;
                               
               event.consume();
           }
       });
            source.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent e) {
                    source.setCursor(Cursor.HAND);
                }
            });
    }
    
    void setupGestureTarget(final VBox targetBox){
         
        targetBox.setOnDragOver(new EventHandler <DragEvent>() {
            @Override
            public void handle(DragEvent event) {
            	
                Dragboard db = event.getDragboard();
                 
                if(db.hasImage()){
                    event.acceptTransferModes(TransferMode.MOVE);
                }
                 
                event.consume();
            }
        });
 
        targetBox.setOnDragDropped(new EventHandler <DragEvent>(){
            @Override
            public void handle(DragEvent event) {
            	System.out.println("Dropped.");
            	
            	Parent parent = iv.getParent();
//            	System.out.println(parent);
            	
                Dragboard db = event.getDragboard();
                
            	ActiveCardImageView.setImage(null);
            	activeCardIsNull = true;
                if(db.hasImage()){
 
                    iv.setImage(db.getImage());
 
                    targetBox.getChildren().remove(iv);

                    setupGestureSource(iv);
                    targetBox.getChildren().add(iv);
                    checkIfTurnedOver();
                    checkCards(targetBox);
                    event.setDropCompleted(dropStatus);
                    checkIfTurnedOver();
                    System.out.println(dropStatus);
                    if (dropStatus == false){
                    	targetBox.getChildren().remove(iv);
//                    	System.out.println(iv.getId());
                    	if (parent == null)
                    	{
                    		ActiveCardImageView.setImage(iv.getImage());
                    		activeCardIsNull = false;
                    	}
//                    	System.out.println(((VBox) event.getSource()));
                    	
                    	((VBox) event.getSource()).getChildren().remove(iv);
                    	((VBox) parent).getChildren().add(iv);
                    	checkIfTurnedOver();
                    }
                }else{ 
                    event.setDropCompleted(false);
                    checkIfTurnedOver();
                }
            event.consume();
            }
        });
         
    }
    
	public void checkIfTurnedOver() {
		int sentinel = 0;

		if(vBox2.getChildren().size()>0) {
			int vBoxSize = vBox2.getChildren().size();
			Image image2 = ((ImageView)vBox2.getChildren().get(vBoxSize-1)).getImage();
			for (int l = 0; l < image2.getWidth(); l++)
			{
			  for (int j = 0; j < image2.getHeight(); j++)
			  {
				  if (image2.getPixelReader().getArgb(l, j) == deck.getBackOfCardImage().getPixelReader().getArgb(l, j)) {
					  if(l==image2.getWidth()-1&&j==image2.getHeight()-1) {
						  sentinel =1;
					  }
					  if(vBoxSize==1&&vbox2Counter==1) {
						  ActiveCardImageViewCopy2.setImage(secondVbox.get(0).getImage());
						  ActiveCardImageViewCopy2.setId(secondVbox.get(0).getFileName());
						  secondVbox.remove(0);
						  vbox2Counter-=1;
						  score += 5;
					  }
				  }
			  }
			}
			
		}
		sentinel = 0;
		if(vBox3.getChildren().size()>0) {
			int vBoxSize = vBox3.getChildren().size();
			Image image3 = ((ImageView)vBox3.getChildren().get(vBoxSize-1)).getImage();
			for (int l = 0; l < image3.getWidth(); l++)
			{
			  for (int j = 0; j < image3.getHeight(); j++)
			  {
				  if (image3.getPixelReader().getArgb(l, j) == deck.getBackOfCardImage().getPixelReader().getArgb(l, j)) {
					  if(l==image3.getWidth()-1&&j==image3.getHeight()-1) {
						  sentinel =1;
					  }
					  if(vBoxSize==1&&vbox3Counter==1) {
						  ActiveCardImageViewCopy4.setImage(thirdVbox.get(0).getImage());
						  ActiveCardImageViewCopy4.setId(thirdVbox.get(0).getFileName());
						  thirdVbox.remove(0);
						  vbox3Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==2&&vbox3Counter==2) {
						  ActiveCardImageViewCopy5.setImage(thirdVbox.get(0).getImage());
						  ActiveCardImageViewCopy5.setId(thirdVbox.get(0).getFileName());
						  thirdVbox.remove(0);
						  vbox3Counter-=1;
						  score += 5;
					  }
				  }
			  }
			}
		}
		
		sentinel = 0;
		if(vBox4.getChildren().size()>0) {
			int vBoxSize = vBox4.getChildren().size();
			Image image4 = ((ImageView)vBox4.getChildren().get(vBoxSize-1)).getImage();
			for (int l = 0; l < image4.getWidth(); l++)
			{
			  for (int j = 0; j < image4.getHeight(); j++)
			  {
				  if (image4.getPixelReader().getArgb(l, j) == deck.getBackOfCardImage().getPixelReader().getArgb(l, j)) {
					  if(l==image4.getWidth()-1&&j==image4.getHeight()-1) {
						  sentinel =1;
					  }
					  if(vBoxSize==1&&vbox4Counter==1) {
						  ActiveCardImageViewCopy7.setImage(fourthVbox.get(0).getImage());
						  ActiveCardImageViewCopy7.setId(fourthVbox.get(0).getFileName());
						  fourthVbox.remove(0);
						  vbox4Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==2&&vbox4Counter==2) {
						  ActiveCardImageViewCopy8.setImage(fourthVbox.get(0).getImage());
						  ActiveCardImageViewCopy8.setId(fourthVbox.get(0).getFileName());
						  fourthVbox.remove(0);
						  vbox4Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==3&&vbox4Counter==3) {
						  ActiveCardImageViewCopy9.setImage(fourthVbox.get(0).getImage());
						  ActiveCardImageViewCopy9.setId(fourthVbox.get(0).getFileName());
						  fourthVbox.remove(0);
						  vbox4Counter-=1;
						  score += 5;
					  }
				  }
			  }
			}
		}
		
		sentinel =0;
		if(vBox5.getChildren().size()>0) {
			int vBoxSize = vBox5.getChildren().size();
			Image image5 = ((ImageView)vBox5.getChildren().get(vBoxSize-1)).getImage();
			for (int l = 0; l < image5.getWidth(); l++)
			{
			  for (int j = 0; j < image5.getHeight(); j++)
			  {
				  if (image5.getPixelReader().getArgb(l, j) == deck.getBackOfCardImage().getPixelReader().getArgb(l, j)) {
					  if(l==image5.getWidth()-1&&j==image5.getHeight()-1) {
						  sentinel =1;
					  }
					  if(vBoxSize==1&&vbox5Counter==1) {
						  ActiveCardImageViewCopy11.setImage(fifthVbox.get(0).getImage());
						  ActiveCardImageViewCopy11.setId(fifthVbox.get(0).getFileName());
						  fifthVbox.remove(0);
						  vbox5Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==2&&vbox5Counter==2) {
						  ActiveCardImageViewCopy12.setImage(fifthVbox.get(0).getImage());
						  ActiveCardImageViewCopy12.setId(fifthVbox.get(0).getFileName());
						  fifthVbox.remove(0);
						  vbox5Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==3&&vbox5Counter==3) {
						  ActiveCardImageViewCopy13.setImage(fifthVbox.get(0).getImage());
						  ActiveCardImageViewCopy13.setId(fifthVbox.get(0).getFileName());
						  fifthVbox.remove(0);
						  vbox5Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==4&&vbox5Counter==4) {
						  ActiveCardImageViewCopy14.setImage(fifthVbox.get(0).getImage());
						  ActiveCardImageViewCopy14.setId(fifthVbox.get(0).getFileName());
						  fifthVbox.remove(0);
						  vbox5Counter-=1;
						  score += 5;
					  }
				  }
			  }
			}
		}
		
		sentinel=0;
		
		if(vBox6.getChildren().size()>0) {
			int vBoxSize = vBox6.getChildren().size();
			Image image6 = ((ImageView)vBox6.getChildren().get(vBoxSize-1)).getImage();
			for (int l = 0; l < image6.getWidth(); l++)
			{
			  for (int j = 0; j < image6.getHeight(); j++)
			  {
				  if (image6.getPixelReader().getArgb(l, j) == deck.getBackOfCardImage().getPixelReader().getArgb(l, j)) {
					  if(l==image6.getWidth()-1&&j==image6.getHeight()-1) {
						  sentinel =1;
					  }
					  if(vBoxSize==1&&vbox6Counter==1) {
						  ActiveCardImageViewCopy16.setImage(sixthVbox.get(0).getImage());
						  ActiveCardImageViewCopy16.setId(sixthVbox.get(0).getFileName());
						  sixthVbox.remove(0);
						  vbox6Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==2&&vbox6Counter==2) {
						  ActiveCardImageViewCopy17.setImage(sixthVbox.get(0).getImage());
						  ActiveCardImageViewCopy17.setId(sixthVbox.get(0).getFileName());
						  sixthVbox.remove(0);
						  vbox6Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==3&&vbox6Counter==3) {
						  ActiveCardImageViewCopy18.setImage(sixthVbox.get(0).getImage());
						  ActiveCardImageViewCopy18.setId(sixthVbox.get(0).getFileName());
						  sixthVbox.remove(0);
						  vbox6Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==4&&vbox6Counter==4) {
						  ActiveCardImageViewCopy19.setImage(sixthVbox.get(0).getImage());
						  ActiveCardImageViewCopy19.setId(sixthVbox.get(0).getFileName());
						  sixthVbox.remove(0);
						  vbox6Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==5&&vbox6Counter==5) {
						  ActiveCardImageViewCopy20.setImage(sixthVbox.get(0).getImage());
						  ActiveCardImageViewCopy20.setId(sixthVbox.get(0).getFileName());
						  sixthVbox.remove(0);
						  vbox6Counter-=1;
						  score += 5;
					  }
				  }
			  }
			}
		}
		
		sentinel=0;
		if(vBox7.getChildren().size()>0) {
			int vBoxSize = vBox7.getChildren().size();
			Image image7 = ((ImageView)vBox7.getChildren().get(vBoxSize-1)).getImage();
			for (int l = 0; l < image7.getWidth(); l++)
			{
				int counter = 0;
			  for (int j = 0; j < image7.getHeight(); j++)
			  {
				  if (image7.getPixelReader().getArgb(l, j) == deck.getBackOfCardImage().getPixelReader().getArgb(l, j)) {
					  counter +=1;
					  if(l==image7.getWidth()-1&&j==image7.getHeight()-1) {
						  sentinel =1;
					  }
					  if(vBoxSize==1&&vbox7Counter==1) {
						  ActiveCardImageViewCopy22.setImage(seventhVbox.get(0).getImage());
						  ActiveCardImageViewCopy22.setId(seventhVbox.get(0).getFileName());
						  seventhVbox.remove(0);
						  vbox7Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==2&&vbox7Counter==2) {
						  ActiveCardImageViewCopy23.setImage(seventhVbox.get(0).getImage());
						  ActiveCardImageViewCopy23.setId(seventhVbox.get(0).getFileName());
						  seventhVbox.remove(0);
						  vbox7Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==3&&vbox7Counter==3) {
						  ActiveCardImageViewCopy24.setImage(seventhVbox.get(0).getImage());
						  ActiveCardImageViewCopy24.setId(seventhVbox.get(0).getFileName());
						  seventhVbox.remove(0);
						  vbox7Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==4&&vbox7Counter==4) {
						  ActiveCardImageViewCopy25.setImage(seventhVbox.get(0).getImage());
						  ActiveCardImageViewCopy25.setId(seventhVbox.get(0).getFileName());
						  seventhVbox.remove(0);
						  vbox7Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==5&&vbox7Counter==5) {
						  ActiveCardImageViewCopy26.setImage(seventhVbox.get(0).getImage());
						  ActiveCardImageViewCopy26.setId(seventhVbox.get(0).getFileName());
						  seventhVbox.remove(0);
						  vbox7Counter-=1;
						  score += 5;
					  }
					  if(vBoxSize==6&&vbox7Counter==6) {
						  ActiveCardImageViewCopy27.setImage(seventhVbox.get(0).getImage());
						  ActiveCardImageViewCopy27.setId(seventhVbox.get(0).getFileName());
						  seventhVbox.remove(0);
						  vbox7Counter-=1;
						  score += 5;
					  }
				  }
			  }
			  
			}
		}
		
		sentinel=0;
		updateScore();
		inGameScore.setText(scoreToString(score));
	}
	
	public void checkCards(VBox vbox) {
		String draggedCardId = vbox.getChildren().get(vbox.getChildren().size() - 1).getId();
		String upperCardId = vbox.getChildren().get(vbox.getChildren().size() - 2).getId();
		
		upperCardId = switchCase(upperCardId);
		draggedCardId = switchCase(draggedCardId);
		
		dropStatus = ifElse(draggedCardId, upperCardId);
	}

	public String switchCase(String draggedCardId) {
		switch (draggedCardId)
		{
			case "AH":
			case "AD":
				draggedCardId = "RAce";
				break;
			case "AC":
			case "AS":
				draggedCardId = "BAce";
				break;
			case "2H":
			case "2D":
				draggedCardId = "R2";
				break;
			case "2C":
			case "2S":
				draggedCardId = "B2";
				break;
			case "3H":
			case "3D":
				draggedCardId = "R3";
				break;
			case "3C":
			case "3S":
				draggedCardId = "B3";
				break;
			case "4H":
			case "4D":
				draggedCardId = "R4";
				break;
			case "4C":
			case "4S":
				draggedCardId = "B4";
				break;
			case "5H":
			case "5D":
				draggedCardId = "R5";
				break;
			case "5C":
			case "5S":
				draggedCardId = "B5";
				break;
			case "6H":
			case "6D":
				draggedCardId = "R6";
				break;
			case "6C":
			case "6S":
				draggedCardId = "B6";
				break;
			case "7H":
			case "7D":
				draggedCardId = "R7";
				break;
			case "7C":
			case "7S":
				draggedCardId = "B7";
				break;
			case "8H":
			case "8D":
				draggedCardId = "R8";
				break;
			case "8C":
			case "8S":
				draggedCardId = "B8";
				break;
			case "9H":
			case "9D":
				draggedCardId = "R9";
				break;
			case "9C":
			case "9S":
				draggedCardId = "B9";
				break;
			case "TH":
			case "TD":
				draggedCardId = "RT";
				break;
			case "TC":
			case "TS":
				draggedCardId = "BT";
				break;
			case "JH":
			case "JD":
				draggedCardId = "RJ";
				break;
			case "JC":
			case "JS":
				draggedCardId = "BJ";
				break;
			case "QH":
			case "QD":
				draggedCardId = "RQ";
				break;
			case "QC":
			case "QS":
				draggedCardId = "BQ";
				break;
			case "KH":
			case "KD":
				draggedCardId = "RK";
				break;
			case "KC":
			case "KS":
				draggedCardId = "BK";
				break;
		}
		return draggedCardId;
	}

	public boolean ifElse(String draggedCardId, String upperCardId) {
		dropStatus = false;
		if ((draggedCardId == "BAce" && upperCardId == "R2"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "RAce" && upperCardId == "B2"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "B2" && upperCardId == "R3"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "R2" && upperCardId == "B3"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "B3" && upperCardId == "R4"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "R3" && upperCardId == "B4"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "B4" && upperCardId == "R5"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "R4" && upperCardId == "B5"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "B5" && upperCardId == "R6"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "R5" && upperCardId == "B6"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "B6" && upperCardId == "R7"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "R6" && upperCardId == "B7"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "B7" && upperCardId == "R8"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "R7" && upperCardId == "B8"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "B8" && upperCardId == "R9"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "R8" && upperCardId == "B9"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "B9" && upperCardId == "RT"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "R9" && upperCardId == "BT"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "BT" && upperCardId == "RJ"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "RT" && upperCardId == "BJ"))
		{
			dropStatus = true;
			return dropStatus;
		}
		else if ((draggedCardId == "BJ" && upperCardId == "RQ"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "RJ" && upperCardId == "BQ"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "BQ" && upperCardId == "RK"))
		{
			dropStatus = true;
		}
		else if ((draggedCardId == "RQ" && upperCardId == "BK"))
		{
			dropStatus = true;
		}
		else {
			dropStatus = false;
		}
		return dropStatus;
	}

	public void foundation() {
		S.setImage(SImage);
		H.setImage(HImage);
		C.setImage(CImage);
		D.setImage(DImage);
		S.setStyle("-fx-opacity: 0.5");
		H.setStyle("-fx-opacity: 0.5");
		C.setStyle("-fx-opacity: 0.5");
		D.setStyle("-fx-opacity: 0.5");
		
		foundationTarget(S, sCounter);
		foundationTarget(H, hCounter);
		foundationTarget(C, cCounter);
		foundationTarget(D, dCounter);
		
//		System.out.println(sCounter);
//		System.out.println(hCounter);
//		System.out.println(cCounter);
//		System.out.println(dCounter);
	}
	
	public void foundationTarget(ImageView img, int counter) {
		img.setOnDragOver(new EventHandler <DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                 
                if(db.hasImage()){
                    event.acceptTransferModes(TransferMode.MOVE);
                }
                System.out.println("Drag over.");
                 
                event.consume();
            }
        });
		img.setOnDragDropped(new EventHandler <DragEvent>(){
            @Override
            public void handle(DragEvent event) {
            	System.out.println("Dropped.");
            	            	
                Dragboard db = event.getDragboard();
//                
//                if(db.hasImage()){
 
                	img.setImage(null);
                	
                	img.setImage(iv.getImage());
                	
                	foundationSwitchCase(img, counter);
                	System.out.println("Foundation bool: " + foundationBool);
                	
//                	if (foundationBool == true) {
                    	ActiveCardImageView.setImage(null);
                    	activeCardIsNull = true;
                    	iv.setImage(db.getImage());
                        img.setStyle("-fx-opacity: 1");
                        img.setImage(iv.getImage());
                        
//                      System.out.println(iv.getParent());
                        ((VBox) iv.getParent()).getChildren().remove(iv);
                        checkIfTurnedOver();
                        
                        event.setDropCompleted(foundationBool);
//                	}
//                    else if (foundationBool == false){
//                    	//babaguhin pa to
//                    	if (img.getId().compareTo("S") == 0)
//                    	{
//                    		img.setImage(SImage);
//                    	}
//                    	if (img.getId().compareTo("D") == 0)
//                    	{
//                    		img.setImage(DImage);
//                    	}
//                    	if (img.getId().compareTo("H") == 0)
//                    	{
//                    		img.setImage(HImage);
//                    	}
//                    	if (img.getId().compareTo("C") == 0)
//                    	{
//                    		img.setImage(CImage);
//                    	}
//                    	((VBox) iv.getParent()).getChildren().add(iv);
//                    }
               
//                }else{ 
//                    event.setDropCompleted(false);
//                }
            	
//                System.out.println(iv.getParent());
                ((VBox) iv.getParent()).getChildren().remove(iv);
                System.out.println("ID: " + img.getId());

                System.out.println(foundationBool);
                System.out.println("S: " + sCounter);
                System.out.println("D: "  + dCounter);
                System.out.println("C: " + cCounter);
                System.out.println("H: " + hCounter);
                
                event.consume();
            }
	 });
		//mali din 
//		wasteCards(img);
	}

	public String foundationSwitchCase(ImageView img, int counter) {
//		foundationBool = foundationifElse(str, counter);
        System.out.println("S: " + sCounter);
        System.out.println("D: "  + dCounter);
        System.out.println("C: " + cCounter);
        System.out.println("H: " + hCounter);
//      foundationBool = foundationifElse(str, counter);
//		System.out.println(img.getId());
//		str = "A" + img.getId();
		switch (sCounter)
		{
			case 1: 
				str = "A" + img.getId();
				break;
			case 2: 
				str = "2" + img.getId();
				break;
			case 3:
				str = "3"+ img.getId();
				break;
			case 4:
				str = "4"+ img.getId();
				break;
			case 5:
				str = "5"+ img.getId();
				break;
			case 6:
				str = "6"+ img.getId();
				break;
			case 7:
				str = "7"+ img.getId();
				break;
			case 8:
				str = "8"+ img.getId();
				break;
			case 9:
				str = "9"+ img.getId();
				break;
			case 10:
				str = "T"+ img.getId();
				break;
			case 11:
				str = "J"+ img.getId();
				break;
			case 12:
				str = "Q"+ img.getId();
				break;
			case 13:
				str = "K"+ img.getId();
				break;
		}
		
		switch (hCounter)
		{
			case 1: 
				str = "A" + img.getId();
				break;
			case 2: 
				str = "2" + img.getId();
				break;
			case 3:
				str = "3"+ img.getId();
				break;
			case 4:
				str = "4"+ img.getId();
				break;
			case 5:
				str = "5"+ img.getId();
				break;
			case 6:
				str = "6"+ img.getId();
				break;
			case 7:
				str = "7"+ img.getId();
				break;
			case 8:
				str = "8"+ img.getId();
				break;
			case 9:
				str = "9"+ img.getId();
				break;
			case 10:
				str = "T"+ img.getId();
				break;
			case 11:
				str = "J"+ img.getId();
				break;
			case 12:
				str = "Q"+ img.getId();
				break;
			case 13:
				str = "K"+ img.getId();
				break;
		}
		
		switch (dCounter)
		{
			case 1: 
				str = "A" + img.getId();
				break;
			case 2: 
				str = "2" + img.getId();
				break;
			case 3:
				str = "3"+ img.getId();
				break;
			case 4:
				str = "4"+ img.getId();
				break;
			case 5:
				str = "5"+ img.getId();
				break;
			case 6:
				str = "6"+ img.getId();
				break;
			case 7:
				str = "7"+ img.getId();
				break;
			case 8:
				str = "8"+ img.getId();
				break;
			case 9:
				str = "9"+ img.getId();
				break;
			case 10:
				str = "T"+ img.getId();
				break;
			case 11:
				str = "J"+ img.getId();
				break;
			case 12:
				str = "Q"+ img.getId();
				break;
			case 13:
				str = "K"+ img.getId();
				break;
		}
		
		switch (cCounter)
		{
			case 1: 
				str = "A" + img.getId();
				break;
			case 2: 
				str = "2" + img.getId();
				break;
			case 3:
				str = "3"+ img.getId();
				break;
			case 4:
				str = "4"+ img.getId();
				break;
			case 5:
				str = "5"+ img.getId();
				break;
			case 6:
				str = "6"+ img.getId();
				break;
			case 7:
				str = "7"+ img.getId();
				break;
			case 8:
				str = "8"+ img.getId();
				break;
			case 9:
				str = "9"+ img.getId();
				break;
			case 10:
				str = "T"+ img.getId();
				break;
			case 11:
				str = "J"+ img.getId();
				break;
			case 12:
				str = "Q"+ img.getId();
				break;
			case 13:
				str = "K"+ img.getId();
				break;
		}
		foundationBool = foundationifElse(str, counter);
//		System.out.println(count);
	return str;
	}
	
	public boolean foundationifElse(String str, int counter) {
		System.out.println("Str: " + str);
		System.out.println(iv.getId());
		if (str.compareTo(iv.getId()) == 0)
		{
			foundationBool = true;
			if (Character.compare(str.charAt(1), 'S') == 0)
			{
				sCounter+=1;
				score = score + 10;
				
			}
			else if (Character.compare(str.charAt(1), 'C') == 0)
			{
				cCounter+=1;
				score = score + 10;
				

			}
			else if (Character.compare(str.charAt(1), 'D') == 0)
			{
				dCounter+=1;
				score = score + 10;
			

			}
			else if (Character.compare(str.charAt(1), 'H') == 0)
			{
				hCounter+=1;
				score = score + 10;
				

			}
		}
		else {foundationBool = false;}
		inGameScore.setText(Double.toString(score));
		return foundationBool;
	}
	
	public boolean wasteToTableau() {
		if((deck.getDeckSize() < deckCurrSize) && (vBox1.getChildren().size() > v1CurrSize)){
			deckCurrSize = deck.getDeckSize();
			v1CurrSize = vBox1.getChildren().size();
			return true;
		}
		else if((deck.getDeckSize() < deckCurrSize) && (vBox2.getChildren().size() > v2CurrSize)){
			deckCurrSize = deck.getDeckSize();
			v2CurrSize = vBox2.getChildren().size();
			return true;
		}
		else if((deck.getDeckSize() < deckCurrSize) && (vBox3.getChildren().size() > v3CurrSize)){
			deckCurrSize = deck.getDeckSize();
			v3CurrSize = vBox3.getChildren().size();
			return true;
		}
		else if((deck.getDeckSize() < deckCurrSize) && (vBox4.getChildren().size() > v4CurrSize)){
			deckCurrSize = deck.getDeckSize();
			v4CurrSize = vBox4.getChildren().size();
			return true;
		}
		else if((deck.getDeckSize() < deckCurrSize) && (vBox5.getChildren().size() > v5CurrSize)){
			deckCurrSize = deck.getDeckSize();
			v5CurrSize = vBox5.getChildren().size();
			return true;
		}
		else if((deck.getDeckSize() < deckCurrSize) && (vBox6.getChildren().size() > v6CurrSize)){
			deckCurrSize = deck.getDeckSize();
			v6CurrSize = vBox6.getChildren().size();
			return true;
		}
		else if((deck.getDeckSize() < deckCurrSize) && (vBox7.getChildren().size() > v7CurrSize)){
			deckCurrSize = deck.getDeckSize();
			v7CurrSize = vBox7.getChildren().size();
			return true;
		}else return false;
	}

	public boolean wasteToFoundation() {
			if((deck.getDeckSize() < deckCurrSize) && (hCounter > hSize)) {
				deckCurrSize = deck.getDeckSize();
				hSize = hCounter;
				return true;
			}
			else if((deck.getDeckSize() < deckCurrSize) && (cCounter > cSize)) {
				deckCurrSize = deck.getDeckSize();
				cSize = cCounter;
				return true;
			}
			else if((deck.getDeckSize() < deckCurrSize) && (dCounter > dSize)) {
				deckCurrSize = deck.getDeckSize();
				dSize = dCounter;
				return true;
			}
			else if((deck.getDeckSize() < deckCurrSize) && (sCounter > sSize)) {
				deckCurrSize = deck.getDeckSize();
				sSize = sCounter;
				return true;
			}
			else return false;
		}
		
	public boolean tableauToFoundation() {
			if(vBox1.getChildren().size() < v1CurrSize) {
				if(hCounter > hSize) {
					v1CurrSize = vBox1.getChildren().size();
					hSize = hCounter;
					return true;
				}else if(cCounter > cSize) {
					v1CurrSize = vBox1.getChildren().size();
					cSize = cCounter;
					return true;
				}else if(dCounter > dSize) {
					v1CurrSize = vBox1.getChildren().size();
					dSize = dCounter;
					return true;
				}else if(sCounter > sSize) {
					v1CurrSize = vBox1.getChildren().size();
					sSize = sCounter;
					return true;
				}else return false;
			}
			else if(vBox2.getChildren().size() < v2CurrSize) {
				if(hCounter > hSize) {
					v2CurrSize = vBox2.getChildren().size();
					hSize = hCounter;
					return true;
				}else if(cCounter > cSize) {
					v2CurrSize = vBox2.getChildren().size();
					cSize = cCounter;
					return true;
				}else if(dCounter > dSize) {
					v2CurrSize = vBox2.getChildren().size();
					dSize = dCounter;
					return true;
				}else if(sCounter > sSize) {
					v2CurrSize = vBox2.getChildren().size();
					sSize = sCounter;
					return true;
				}else return false;
			}
			else if(vBox3.getChildren().size() < v3CurrSize) {
				if(hCounter > hSize) {
					v3CurrSize = vBox3.getChildren().size();
					hSize = hCounter;
					return true;
				}else if(cCounter > cSize) {
					v3CurrSize = vBox3.getChildren().size();
					cSize = cCounter;
					return true;
				}else if(dCounter > dSize) {
					v3CurrSize = vBox3.getChildren().size();
					dSize = dCounter;
					return true;
				}else if(sCounter > sSize) {
					v3CurrSize = vBox3.getChildren().size();
					sSize = sCounter;
					return true;
				}else return false;
			}
			
			else if(vBox4.getChildren().size() < v4CurrSize) {
				if(hCounter > hSize) {
					v4CurrSize = vBox4.getChildren().size();
					hSize = hCounter;
					return true;
				}else if(cCounter > cSize) {
					v4CurrSize = vBox4.getChildren().size();
					cSize = cCounter;
					return true;
				}else if(dCounter > dSize) {
					v4CurrSize = vBox4.getChildren().size();
					dSize = dCounter;
					return true;
				}else if(sCounter > sSize) {
					v4CurrSize = vBox4.getChildren().size();
					sSize = sCounter;
					return true;
				}else return false;
			}
			
			else if(vBox5.getChildren().size() < v5CurrSize) {
				if(hCounter > hSize) {
					v5CurrSize = vBox5.getChildren().size();
					hSize = hCounter;
					return true;
				}else if(cCounter > cSize) {
					v5CurrSize = vBox5.getChildren().size();
					cSize = cCounter;
					return true;
				}else if(dCounter > dSize) {
					v5CurrSize = vBox5.getChildren().size();
					dSize = dCounter;
					return true;
				}else if(sCounter > sSize) {
					v5CurrSize = vBox5.getChildren().size();
					sSize = sCounter;
					return true;
				}else return false;
			}
			
			else if(vBox6.getChildren().size() < v6CurrSize) {
				if(hCounter > hSize) {
					v6CurrSize = vBox6.getChildren().size();
					hSize = hCounter;
					return true;
				}else if(cCounter > cSize) {
					v6CurrSize = vBox6.getChildren().size();
					cSize = cCounter;
					return true;
				}else if(dCounter > dSize) {
					v6CurrSize = vBox6.getChildren().size();
					dSize = dCounter;
					return true;
				}else if(sCounter > sSize) {
					v6CurrSize = vBox6.getChildren().size();
					sSize = sCounter;
					return true;
				}else return false;
			}
			
			else if(vBox7.getChildren().size() < v7CurrSize) {
				if(hCounter > hSize) {
					v7CurrSize = vBox7.getChildren().size();
					hSize = hCounter;
					return true;
				}else if(cCounter > cSize) {
					v7CurrSize = vBox7.getChildren().size();
					cSize = cCounter;
					return true;
				}else if(dCounter > dSize) {
					v7CurrSize = vBox7.getChildren().size();
					dSize = dCounter;
					return true;
				}else if(sCounter > sSize) {
					v7CurrSize = vBox7.getChildren().size();
					sSize = sCounter;
					return true;
				}else return false;
			}
			else return false;
			
		}
		
		public double updateScore() {
			if(wasteToTableau()==true) {
				score += 5;
			}
//			else if(wasteToFoundation()==true) {
//				score += 10;
//			}
//			else if(tableauToFoundation()==true) {
//				score += 10;
//			}
			return score;
		}
		
		public String scoreToString(double score) {
			String displayScore = Double.toString(score);
			return displayScore;
		}
}