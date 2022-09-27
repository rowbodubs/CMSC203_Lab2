


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Label label;
	TextField textField;
	//  declare two HBoxes
	HBox hBox1;
	HBox hBox2;
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dataManager;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		button1 = new Button("Hello");
		button2 = new Button("Howdy");
		button3 = new Button("Chinese");
		button4 = new Button("Clear");
		button5 = new Button("Exit");
		label = new Label("Feedback:");
		textField = new TextField();
		hBox1 = new HBox();
		hBox2 = new HBox();
		//student Task #4:
		//  instantiate the DataManager instance
		dataManager = new DataManager();
		//  set margins and set alignment of the components
		Insets insets = new Insets(100,25,100,25);
		hBox1.setMargin(button1, insets);
		hBox1.setMargin(button2, insets);
		hBox1.setMargin(button3, insets);
		hBox1.setMargin(button4, insets);
		hBox1.setMargin(button5, insets);
		hBox1.setAlignment(Pos.CENTER);
		hBox2.setAlignment(Pos.CENTER);
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hBox2.getChildren().addAll(label,textField);
		//  add the buttons to the other HBox
		hBox1.getChildren().addAll(button1,button2,button3,button4,button5);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hBox1,hBox2);
		//  declare two HBoxes
		
		button1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				textField.setText(dataManager.getHello());
			}
		});
		button2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				textField.setText(dataManager.getHowdy());
			}
		});
		button3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				textField.setText(dataManager.getChinese());
			}
		});
		button4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				textField.setText("");
			}
		});
		button5.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Platform.exit();
				System.exit(0);
			}
		});
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler {
		//public void handle(ActionEvent event) {
			//System.out.print("Hello");
		//}
	}
}
	
