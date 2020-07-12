package edu.bu.met.cs665.machine;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.bu.met.cs665.machine.CoffeeMixer.Coffee;

public class CoffeeMixerTest {
	
	@Test
	public void testMakeDrink() {

		try{
			CoffeeMixer coffeeMixer = new CoffeeMixer();	
			Drink drink = coffeeMixer.makeDrink(Coffee.LATTE_MACCHIATO);

			assertNotNull(coffeeMixer);//check if the object is != null
			//checks if the returned object is of class Expression
			assertEquals("LATTE_MACCHIATO", drink.getName().toString());
		}catch(Exception e){
			// let the test fail, if your function throws an Exception.
			fail("No Object Found");
		}
	}

	@Test
	public void testAddCondiments() {

		try{
			CoffeeMixer coffeeMixer = new CoffeeMixer();	
			Drink drink = coffeeMixer.makeDrink(Coffee.LATTE_MACCHIATO);
			coffeeMixer.addCondiments(drink, CoffeeMixer.Condiment.SUGAR);
			coffeeMixer.addCondiments(drink, CoffeeMixer.Condiment.SUGAR);

			coffeeMixer.addCondiments(drink, CoffeeMixer.Condiment.CREAM);
			coffeeMixer.addCondiments(drink, CoffeeMixer.Condiment.CREAM);


			assertNotNull(coffeeMixer);//check if the object is != null
			//checks if the returned object is of class Expression
			assertEquals(2, drink.getCream());
			assertEquals(2, drink.getSugar());


		}catch(Exception e){
			fail("No Object Found");
			// let the test fail, if your function throws an Exception.
		}
	}

	@Test
	public void testCalculateCost() {
		try{
			CoffeeMixer coffeeMixer = new CoffeeMixer();	
			Drink drink = coffeeMixer.makeDrink(Coffee.LATTE_MACCHIATO);

			coffeeMixer.addCondiments(drink, CoffeeMixer.Condiment.CREAM);
			coffeeMixer.addCondiments(drink, CoffeeMixer.Condiment.CREAM);
			coffeeMixer.addCondiments(drink, CoffeeMixer.Condiment.CREAM);

			assertNotNull(coffeeMixer);//check if the object is != null			
			coffeeMixer.calculateCost(drink);

			assertEquals(7.96, drink.getCost(), 0);

		}catch(Exception e){
			fail("No Object Found");
			// let the test fail, if your function throws an Exception.
		}	
	}

}
