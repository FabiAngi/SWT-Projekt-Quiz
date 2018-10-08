package de.thm.iem.swt.flaggen_quiz.model;

public class Country {
	private static int count = 0;
	private String name;
	private int id;
	private int difficulty;
	
	public Country(String name, int difficulty) {
		this.name = name;
		this.id = count;
		count++;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}
	
	public int getDifficulty() {
		return difficulty;
	}
}