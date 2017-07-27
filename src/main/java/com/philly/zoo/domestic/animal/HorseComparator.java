package com.philly.zoo.domestic.animal;

import java.util.Comparator;

public class HorseComparator implements Comparator<Horse>{

	public int compare(Horse horse1, Horse horse2) {
		return (horse1.getAge()-horse2.getAge());
	}
	
	

}
