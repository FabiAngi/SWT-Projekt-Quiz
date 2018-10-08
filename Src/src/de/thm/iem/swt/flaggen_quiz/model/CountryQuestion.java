package de.thm.iem.swt.flaggen_quiz.model;

import java.util.ArrayList;
import java.util.Collections;

public class CountryQuestion extends Question {

	public CountryQuestion(Country country, ArrayList<Answer> answers) {
		super(country.getID(), country.getDifficulty(), answers);
		answers.add(new CountryAnswer(country));
		Collections.shuffle(answers);
	}

}
