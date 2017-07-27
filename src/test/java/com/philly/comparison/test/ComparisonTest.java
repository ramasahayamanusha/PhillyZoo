package com.philly.comparison.test;

import org.junit.Assert;
import org.junit.Test;

import com.philly.zoo.domestic.animal.Horse;
import com.philly.zoo.domestic.animal.HorseComparator;
public class ComparisonTest {
	
	@Test
	public void testGetHorseColor(){
		
		Horse horse1=new Horse();
		horse1.setColor("white");
		
		Horse horse2=new Horse();
		horse2.setColor("white");
		Assert.assertEquals(true, horse1.equals(horse2));
	}
	
		
		//System.out.println(horse1.equals(horse2));
		
		@Test
		
		public void testGetHorsecolorFalse(){
			
		
		Horse horse1=new Horse();
		horse1.setColor("brown");
		
		Horse horse2= new Horse();
		horse2.setColor("white");
		Assert.assertEquals(false, horse1.equals(horse2));
	}
		@Test
		public void testgetAge(){
			
			Horse horse1=new Horse();
			horse1.setAge(10);
			
			Horse horse2=new Horse();
			horse2.setAge(15);
			
			HorseComparator horseComparator = new HorseComparator();
			String size =horseComparator.compare(horse1, horse2)>0?"BIG":"SMALL";
			Assert.assertEquals("SMALL",size);
			
//			if(horseComparator.compare(horse1, horse2)>0){
//				System.out.println("Big");
//			}else {
//				System.out.println("small");
//			}
//			
			
		}
	
}
