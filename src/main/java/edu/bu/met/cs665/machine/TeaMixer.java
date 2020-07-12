package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.machine.CoffeeMixer.Condiment;

/**
 * @author tim_abiok
 *
 */
public class TeaMixer {

	public static enum Tea {
		BLACK, GREEN, YELLOW
	}

	private Drink mDrink;
	private int count;

	/*
	 * returns a Drink Object with a coffee input choice
	 */

	public Drink makeDrink(Tea tea) {

		mDrink = new Drink(tea.toString(), 0, 0, 3.99);
		switch (tea) {
		case BLACK:

			System.out.println("Making your " + Tea.BLACK);
			break;

		case GREEN:
			System.out.println("Making your " + Tea.GREEN);
			break;

		case YELLOW:
			System.out.println("Making your " + Tea.YELLOW);
			break;

		default:
			// code block
		}
		return mDrink;
	}

	/*
	 * returns a Drink object with added condiment selected, increases count of
	 * condiment in object to max value
	 */

	public Drink addCondiments(Drink drink, Condiment condiment) {

		switch (condiment) {
		case SUGAR:
			count = drink.getSugar();
			count += 1;
			drink.setSugar(count);

			System.out.println("Added " + drink.getSugar() + " unit(s) of SUGAR");
			break;

		case CREAM:
			count = drink.getCream();

			count += 1;
			drink.setCream(count);

			System.out.println("Added " + drink.getCream() + " unit(s) of CREAM");
			break;
		default:
			// code block
		}
		return drink;
	}

	/*
	 * returns total cost of drink after all user input is completed
	 */
	public double calculateCost(Drink drink) {
		double mCost = drink.getCost();
		int countSugar = drink.getSugar();
		mCost += 0.99 * countSugar; // assuming a unit of sugar cost .99

		int countCream = drink.getCream();
		mCost += 0.99 * countCream;

		drink.setCost(mCost);
		return mCost;

	}

}
