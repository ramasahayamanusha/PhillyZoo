package com.philly.zoo.domestic.animal;

public class Goat extends DomesticAnimal{
	

	private String color;
	private int age;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	int getHeight() {
		return 2;
	}

	public String getSound() {
		return "mea mea";
	}

	public int getLegs() {
		return 4;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age=age;
	}
	
    
}
