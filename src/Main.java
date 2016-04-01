import com.sun.javafx.geom.Rectangle;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Main extends Application{
	Stage window;
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Dulce Tapioca");
		

	
	
	
	//Top Menu
	HBox topMenu = new HBox();
	Label label1 = new Label("What would you like today?");
		label1.setPadding(new Insets(30, 30, 30, 30));
		label1.setStyle("-fx-font: 35 arial; -fx-base: #FFC524");
	topMenu.getChildren().addAll(label1);
	
	
	//Bottom Menu
	HBox bottomMenu = new HBox();
	bottomMenu.setPadding(new Insets(30, 30, 30, 30));
	bottomMenu.setSpacing(30);
	Button ButtonA = new Button("Go Back");
		ButtonA.setStyle("-fx-font: 35 arial; -fx-base: #FFC524");
	Button ButtonB = new Button("Cancel Order");
		ButtonB.setStyle("-fx-font: 35 arial; -fx-base: #FFC524");
	Button ButtonC = new Button("Continue");
		ButtonC.setStyle("-fx-font: 35 arial; -fx-base: #7CD674");
	bottomMenu.getChildren().addAll(ButtonA, ButtonB, ButtonC);
		
	//Right Menu
	Image disImg = new Image("tapioca.png");
	VBox rightMenu = new VBox();
	rightMenu.setPadding(new Insets(50, 40, 30, 30));
	rightMenu.setSpacing(20);
	ImageView iv = new ImageView();
	iv.setImage(disImg);
	rightMenu.getChildren().add(iv);

	

	
	//Scene 2 Center Menu
	VBox centerMenu = new VBox();
	centerMenu.setPadding(new Insets(50, 40, 30, 30));
	centerMenu.setSpacing(20);
	Button ButtonD = new Button("Smoothie");
		ButtonD.setStyle("-fx-font: 30 arial; -fx-base: #FFC524");
	Button ButtonE = new Button("Tea");
		ButtonE.setStyle("-fx-font: 30 arial; -fx-base: #FFC524");
	Button ButtonF = new Button("Coffee");
		ButtonF.setStyle("-fx-font: 30 arial; -fx-base: #FFC524");
	Button ButtonG = new Button("Frio");
		ButtonG.setStyle("-fx-font: 30 arial; -fx-base: #FFC524");
	Button ButtonH = new Button("Milk Tea");
		ButtonH.setStyle("-fx-font: 30 arial; -fx-base: #FFC524");
	centerMenu.getChildren().addAll(ButtonD, ButtonE, ButtonF, ButtonG, ButtonH);
		
	
	//Second Page	
	BorderPane bordPane = new BorderPane();
	bordPane.setStyle("-fx-background-color: #B09268");
	bordPane.setTop(topMenu);
	bordPane.setBottom(bottomMenu);
	bordPane.setCenter(centerMenu);
	bordPane.setRight(rightMenu);
	AnchorPane Anchor = new AnchorPane();
	
	
	
	Scene first = new Scene(Anchor, 1360, 900);
	Scene scene1 = new Scene(bordPane,1360,900);
	window.setScene(scene1);
	window.show();	
	}
}