/**
 * 
 */
package edu.bu.met.cs665.machine;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author tim_abiok
 *
 */
public class DrinkTest {

	/**
	 * Test method for {@link edu.bu.met.cs665.machine.Drink#getName()}.
	 */
	@Test
	public void testGetName() {

//		ESPRESSO, AMERICANO, LATTE_MACCHIATO
		Drink drink = new Drink("ESPRESSO", 3, 3, 5.99);
		assertEquals("ESPRESSO", drink.getName());
	}

	/**
	 * Test method for {@link edu.bu.met.cs665.machine.Drink#getCream()}.
	 */
	@Test
	public void testGetCream() {
		Drink drink = new Drink("ESPRESSO", 3, 3, 5.99);
		assertEquals(3, drink.getCream());
	}

	/**
	 * Test method for {@link edu.bu.met.cs665.machine.Drink#getSugar()}.
	 */
	@Test
	public void testGetSugar() {
		Drink drink = new Drink("ESPRESSO", 3, 3, 5.99);
		assertEquals(3, drink.getSugar());

	}

	/**
	 * Test method for {@link edu.bu.met.cs665.machine.Drink#getCost()}.
	 */
	@Test
	public void testGetCost() {
		Drink drink = new Drink("ESPRESSO", 3, 3, 5.99);
		assertEquals(5.99, drink.getCost(), 5.99 );

	}

	/**
	 * Test method for
	 * {@link edu.bu.met.cs665.machine.Drink#setName(java.lang.String)}.
	 */
	@Test
	public void testSetName() {
		Drink drink = new Drink("ESPRESSO", 3, 3, 5.99);
		drink.setName("AMERICANO");

		assertEquals("AMERICANO", drink.getName());

	}

	/**
	 * Test method for {@link edu.bu.met.cs665.machine.Drink#setCream(int)}.
	 */
	@Test
	public void testSetCream() {
		Drink drink = new Drink("ESPRESSO", 3, 3, 5.99);
		drink.setCream(4);

		// Cannot set more than 3 units of Cream
		assertEquals(3, drink.getCream());	
		
	}

	/**
	 * Test method for {@link edu.bu.met.cs665.machine.Drink#setSugar(int)}.
	 */
	@Test
	public void testSetSugar() {
		
		Drink drink = new Drink("ESPRESSO", 3, 3, 5.99);
		drink.setSugar(5);

		// Cannot set more than 3 units of Sugar
		assertEquals(3, drink.getSugar());

	}

	/**
	 * Test method for {@link edu.bu.met.cs665.machine.Drink#setCost(double)}.
	 */
	@Test
	public void testSetCost() {
		
		Drink drink = new Drink("ESPRESSO", 3, 3, 5.99);
		drink.setCost(30.00);

		// Cannot set more than 7.96 units in cost which is about the cost of 3 units of 
		assertEquals(5.99, drink.getCost(),30.00);
	}

}
