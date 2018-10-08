package de.thm.iem.swt.flaggen_quiz.ui;

import javafx.stage.Stage;
import de.thm.iem.swt.flaggen_quiz.controller.GameController;
import de.thm.iem.swt.flaggen_quiz.controller.PrototypeQuestionFactory;
import de.thm.iem.swt.flaggen_quiz.view.GameView;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;

public class MainUI extends Application {
	
	private GameView gameScreen;
	private GameController gameControl;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		gameControl = new GameController(new PrototypeQuestionFactory());
		gameScreen = new GameView();
		gameControl.attatchToView(gameScreen);
		
		Group root =  new Group(gameScreen.getContent());
		Scene s = new Scene(root);
		primaryStage.setTitle("Quiz View");
		primaryStage.setScene(s); 
		primaryStage.sizeToScene(); 
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
