package de.thm.iem.swt.flaggen_quiz.controller;

import de.thm.iem.swt.flaggen_quiz.model.CountryQuestion;

public interface CountryQuestionFactory{
	
	public CountryQuestion build(int difficulty);

}
