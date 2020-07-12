package edu.bu.met.cs665.machine;

import static org.junit.Assert.*;

import org.junit.Test;
import edu.bu.met.cs665.machine.TeaMixer.Tea;

public class TeaMixerTest {

	@Test
	public void testMakeDrink() {

		try{
			TeaMixer teaMixer = new TeaMixer();	
			Drink drink = teaMixer.makeDrink(Tea.BLACK);

			assertNotNull(teaMixer);//check if the object is != null
			//checks if the returned object is of class Expression
			assertEquals("BLACK", drink.getName().toString());
		}catch(Exception e){
			// let the test fail, if your function throws an Exception.
			fail("No Object Found");
		}
	}

	@Test
	public void testAddCondiments() {

		try{
			TeaMixer teaMixer = new TeaMixer();	
			Drink drink = teaMixer.makeDrink(Tea.BLACK);
			teaMixer.addCondiments(drink, CoffeeMixer.Condiment.SUGAR);
			teaMixer.addCondiments(drink, CoffeeMixer.Condiment.SUGAR);

			teaMixer.addCondiments(drink, CoffeeMixer.Condiment.CREAM);
			teaMixer.addCondiments(drink, CoffeeMixer.Condiment.CREAM);
			teaMixer.addCondiments(drink, CoffeeMixer.Condiment.CREAM);


			assertNotNull(teaMixer);//check if the object is != null
			//checks if the returned object is of class Expression
			assertEquals(3, drink.getCream());
			assertEquals(2, drink.getSugar());

		}catch(Exception e){
			fail("No Object Found");
			// let the test fail, if your function throws an Exception.
		}
	}

	@Test
	public void testCalculateCost() {
		try{
			TeaMixer teaMixer = new TeaMixer();	
			Drink drink = teaMixer.makeDrink(Tea.BLACK);

			teaMixer.addCondiments(drink, CoffeeMixer.Condiment.CREAM);
			teaMixer.addCondiments(drink, CoffeeMixer.Condiment.CREAM);
			teaMixer.addCondiments(drink, CoffeeMixer.Condiment.CREAM);

			assertNotNull(teaMixer);//check if the object is != null			
			teaMixer.calculateCost(drink);

			assertEquals(6.96, drink.getCost(), 0);

		}catch(Exception e){
			fail("No Object Found");
			// let the test fail, if your function throws an Exception.
		}	
	}
	
	
//	  @Test
//	  public void testMain() {
//
//	    String[] args = {"one", "two", "three"};
//	    Main.main(args);
//	  }

}
