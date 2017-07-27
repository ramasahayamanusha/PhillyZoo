package com.philly.zoo.wild.animal;

public class Elephant extends  WildAnimal {
	
	private String color;
	private int age;
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSound() {
		return "Trumpet";
	}

	public int getLegs() {
		return 4;
	}

	@Override
	boolean isHarmfull() {
		return false;
	}

	@Override
	int getHight() {
		return 8;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int i) {
		this.age=age;
		
	}
	
}

