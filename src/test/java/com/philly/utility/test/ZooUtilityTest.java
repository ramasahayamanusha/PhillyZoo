package com.philly.utility.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.philly.zoo.Animal;
import com.philly.zoo.domestic.animal.Goat;
import com.philly.zoo.domestic.animal.Horse;
import com.philly.zoo.utility.ZooUtility;
import com.philly.zoo.wild.animal.Elephant;
import com.philly.zoo.wild.animal.Fox;
import com.philly.zoo.wild.animal.Tiger;

public class ZooUtilityTest {
	
	@Test
	public void testGetWildAnimals(){
		
		List<Animal> animals = new ArrayList<Animal>();
		
		Elephant elephant = new Elephant();
		Tiger tiger = new Tiger();
		Horse horse = new Horse();
		Fox fox = new Fox();
		
		animals.add(elephant);
		animals.add(tiger);
		animals.add(horse);
		animals.add(fox);
		
		ZooUtility utility = new ZooUtility();
		List<Animal> wildAnimals =utility.getWildAnimals(animals);
		Assert.assertEquals(3, wildAnimals.size());
	}
	@Test
	public void testGetDomesticAnimal(){
		
		List<Animal> animal = new ArrayList<Animal>();
		Goat goat=new Goat();
		Horse horse= new Horse();
		Elephant elephant = new Elephant();
		Tiger tiger = new Tiger();
		
		animal.add(goat);
		animal.add(horse);
		 
		ZooUtility utility = new ZooUtility();
		List<Animal> domesticAnimal =utility.getDomesticAnimal(animal);
		Assert.assertEquals(3, domesticAnimal.size());
		
	}
	
	 

}
