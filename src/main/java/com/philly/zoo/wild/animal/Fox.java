package com.philly.zoo.wild.animal;

public class Fox extends WildAnimal{
	  
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
	

}
