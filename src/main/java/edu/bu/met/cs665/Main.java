package edu.bu.met.cs665;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import edu.bu.met.cs665.machine.CoffeeMixer;
import edu.bu.met.cs665.machine.Drink;
import edu.bu.met.cs665.machine.TeaMixer;
import edu.bu.met.cs665.machine.TeaMixer.Tea;

/**
 * @author tim_abiok
 *
 */
public class Main {

	private static Logger logger = Logger.getLogger(Main.class);

	/**
	 * A main method to run examples.
	 *
	 * @param args not used
	 */
	public static void main(String[] args) {

		Drink mDrink;
		logger.setLevel(Level.ALL);

		CoffeeMixer coffeeMixer = new CoffeeMixer();
		TeaMixer teaMixer = new TeaMixer();
		mDrink = coffeeMixer.makeDrink(CoffeeMixer.Coffee.AMERICANO);
		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);
		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);
		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);
		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);

		if (logger.isDebugEnabled())
			logger.debug(mDrink.toString());

		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);
		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);

		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);
		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);

		coffeeMixer.calculateCost(mDrink);

		if (logger.isDebugEnabled())
			logger.debug(mDrink.toString());

		System.out.println("-----------------------------------TEA------------------------------");

		mDrink = teaMixer.makeDrink(Tea.BLACK);

		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);
		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);

		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);
		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);

		if (logger.isDebugEnabled())
			logger.debug(mDrink.toString());

		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);
		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);

		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);
		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);

		teaMixer.calculateCost(mDrink);

		if (logger.isDebugEnabled()) {
			logger.debug(mDrink.toString());
			logger.debug("exiting main()");
		}

	}

}
