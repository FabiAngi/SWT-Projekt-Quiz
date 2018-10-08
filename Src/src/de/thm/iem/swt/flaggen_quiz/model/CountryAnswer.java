package de.thm.iem.swt.flaggen_quiz.model;

public class CountryAnswer extends Answer {

	private String countryName;
	
	public CountryAnswer(Country country) {
		super(country.getID());
		this.countryName = country.getName();
	}
	
	public String getCountryName() {
		return countryName;
	}

}
