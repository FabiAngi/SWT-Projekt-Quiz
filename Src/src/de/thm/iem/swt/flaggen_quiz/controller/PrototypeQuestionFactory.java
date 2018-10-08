package de.thm.iem.swt.flaggen_quiz.controller;

import java.util.ArrayList;
import java.util.Collections;

import de.thm.iem.swt.flaggen_quiz.model.Answer;
import de.thm.iem.swt.flaggen_quiz.model.Country;
import de.thm.iem.swt.flaggen_quiz.model.CountryAnswer;
import de.thm.iem.swt.flaggen_quiz.model.CountryQuestion;

public class PrototypeQuestionFactory implements CountryQuestionFactory {
	
	private ArrayList<Country> countries;
	
	public PrototypeQuestionFactory() {
		countries = new ArrayList<Country>();
		countries.add(new Country("Kroatien", 2));
		countries.add(new Country("Ägypten", 3));
		countries.add(new Country("Thailand", 3));
		countries.add(new Country("Panama", 4));
		countries.add(new Country("Kiribati", 5));
		countries.add(new Country("Grönland", 3));
	}

	@Override
	public CountryQuestion build(int difficulty) {
		Collections.shuffle(countries);
		ArrayList<Answer> wrongAnswers = new ArrayList<Answer>();
		for (int i=0; i<3; i++) {
			wrongAnswers.add(new CountryAnswer(countries.get(i)));
		}
		return new CountryQuestion(countries.get(4), wrongAnswers);
	}
}
