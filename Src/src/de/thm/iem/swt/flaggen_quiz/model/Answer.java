package de.thm.iem.swt.flaggen_quiz.model;

public abstract class Answer {
	private int id;
	
	protected Answer(int id){
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
}
