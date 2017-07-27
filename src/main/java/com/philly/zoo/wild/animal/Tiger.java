package com.philly.zoo.wild.animal;

public class Tiger extends WildAnimal{

	private String color;
	private int age;
	
	@Override
	boolean isHarmfull() {
		return true;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	int getHight() {
		return 4;
	}

	public String getSound() {
		return "Roar";
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
