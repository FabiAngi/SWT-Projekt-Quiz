package de.thm.iem.swt.flaggen_quiz.view;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class GameView implements View {
	
	ImageView question;
	Button answerA;
	Button answerB;
	Button answerC;
	Button answerD;
	Node content;

	public GameView() {
		question = new ImageView();
		question.setFitHeight(100);
		question.setFitWidth(100);
		question.setPreserveRatio(true);
		answerA = new Button();
		answerB = new Button();
		answerC = new Button();
		answerD = new Button();
		HBox answerRow1 = new HBox(20, answerA, answerC);
		HBox answerRow2 = new HBox(20, answerB, answerD);
		content = new VBox(10, question, answerRow1, answerRow2);
	}
	
	@Override
	public Node getContent() {
		return content;
	}
	
	@Override
	public Map<String,Node> getControls() {
		Map<String, Node> result = new HashMap<String, Node>();
		result.put("Answer A", answerA);
		result.put("Answer B", answerB);
		result.put("Answer C", answerC);
		result.put("Answer D", answerD);
		result.put("Question", question);
		return result;
	}

}
