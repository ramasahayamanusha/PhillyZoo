package com.philly.zoo.domestic.animal;

public class Horse extends DomesticAnimal {
	

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
		return 6;
	}

	public String getSound() {
		return "nai nai";
	}

	public int getLegs() {
		return 4;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Horse other = (Horse) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age=age;
		
	}

	
	
	

}
