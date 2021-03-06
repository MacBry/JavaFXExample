package com.mac.bry.fx;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstWindow extends Application {

	public static void main(String[] args) {
		Application.launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		StackPane pane = new StackPane();
		Label label = new Label("First Window");
		Scene scene = new Scene(pane,300,300);
		pane.getChildren().add(label);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
