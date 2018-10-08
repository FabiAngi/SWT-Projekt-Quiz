package de.thm.iem.swt.flaggen_quiz.model;

import java.util.ArrayList;

public abstract class Question {
	
	private int id;
	private int difficulty;
	private ArrayList<Answer> answers;
	
	protected Question(int id, int difficulty, ArrayList<Answer> answers) {
		this.difficulty = difficulty;
		this.answers = answers;
		this.id = id;
	}
	
	public int getDifficulty() {
		return difficulty;
	}
	
	public ArrayList<Answer> getAnswers() {
		return answers;
	}
	
	public int getID() {
		return id;
	}
	
	public boolean isCorrect(Answer answer) {
		return (this.getID() == answer.getID());
	}
}
