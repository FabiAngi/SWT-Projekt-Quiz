package de.thm.iem.swt.flaggen_quiz.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import de.thm.iem.swt.flaggen_quiz.model.Answer;
import de.thm.iem.swt.flaggen_quiz.model.CountryAnswer;
import de.thm.iem.swt.flaggen_quiz.model.CountryQuestion;
import de.thm.iem.swt.flaggen_quiz.view.GameView;
import de.thm.iem.swt.flaggen_quiz.view.View;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class GameController implements Controller {
	
	GameView view;
	PrototypeQuestionFactory qf = null;
	PrototypePictureServer ps = null;
	CountryQuestion currentQuestion;
	
	public GameController(PrototypeQuestionFactory qf) {
		this.qf = qf;
		ps = new PrototypePictureServer();
	}
	
	private void nextQuestion() {
		currentQuestion = qf.build(1);
		Map<String, Node> controls = view.getControls();
		ArrayList<Answer> answers = currentQuestion.getAnswers();
		((Button) controls.get("Answer A")).setText(((CountryAnswer) answers.get(0)).getCountryName());
		((Button) controls.get("Answer B")).setText(((CountryAnswer) answers.get(1)).getCountryName());
		((Button) controls.get("Answer C")).setText(((CountryAnswer) answers.get(2)).getCountryName());
		((Button) controls.get("Answer D")).setText(((CountryAnswer) answers.get(3)).getCountryName());
		try {
			((ImageView) controls.get("Question")).setImage(ps.getPicture(currentQuestion.getID()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void attatchToView(View view) throws IllegalStateException {
		if (this.view != null) {
			throw new IllegalStateException("Controller is already atatched to view - it cannot be attatched to a second view without detatching");
		}
		this.view = (GameView) view;
		Map<String, Node> controls = this.view.getControls();
		((Button) controls.get("Answer A")).setOnAction(new PickedAnswer(0,this));
		((Button) controls.get("Answer B")).setOnAction(new PickedAnswer(1,this));
		((Button) controls.get("Answer C")).setOnAction(new PickedAnswer(2,this));
		((Button) controls.get("Answer D")).setOnAction(new PickedAnswer(3,this));
		nextQuestion();
	}
	
	class PickedAnswer implements EventHandler<ActionEvent> {
		
		int nr;
		GameController context;
		
		private PickedAnswer(int nr, GameController context) {
			this.nr = nr;
			this.context = context;
		}
		
		@Override
		public void handle(ActionEvent event) {
			nextQuestion();
		}
	}

}
