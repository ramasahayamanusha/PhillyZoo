package com.philly.zoo.wild.animal;

public class Fox extends WildAnimal{
	

	private String color;
	private int age;
	
	  
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	boolean isCunning(){
	return true;
	}

	@Override
	boolean isHarmfull() {
		return true;
	}

	@Override
	int getHight() {
		return 2;
	}

	public String getSound() {
		return "Howl";
	}

	public int getLegs() {
		return 4;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int i) {
		this.age=age;
	}
	

}
