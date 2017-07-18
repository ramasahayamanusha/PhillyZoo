package com.philly.zoo.wild.animal;

public class Tiger extends WildAnimal{

	@Override
	boolean isHarmfull() {
		return true;
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

}
