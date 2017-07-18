package com.philly.zoo.wild.animal;

public class Elephant extends  WildAnimal {

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
	
}

