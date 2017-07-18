package com.philly.zoo.utility;

import java.util.ArrayList;
import java.util.List;

import com.philly.zoo.Animal;
import com.philly.zoo.domestic.animal.DomesticAnimal;
import com.philly.zoo.wild.animal.WildAnimal;

public class ZooUtility {
	
	public List<Animal> getWildAnimals(List<Animal> animals){
		List<Animal> wildAnimals = new ArrayList<Animal>();
		for(Animal a : animals){
			if(a instanceof WildAnimal){
				wildAnimals.add(a);
			}
		}
		
		return wildAnimals;
	}
	
	
	public List<Animal> getDomesticAnimal(List<Animal> animals){
		List<Animal> domesticAnimal = new ArrayList<Animal>();
		for(Animal b : animals){
			if(b instanceof DomesticAnimal){
				domesticAnimal.add(b);
			}
		}
		return domesticAnimal;
			
	}	
	

}
		
