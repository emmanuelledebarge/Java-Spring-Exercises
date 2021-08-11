package com.story.models;

public class Structure {
	public Structure(String name, String animal, String years) {
		this.name = name;
		this.animal = animal;
		this.years = years;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	String name;
	String animal;
	String years;
}
