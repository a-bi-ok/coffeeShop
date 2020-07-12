package edu.bu.met.cs665;

import edu.bu.met.cs665.machine.CoffeeMixer;
import edu.bu.met.cs665.machine.Drink;
import edu.bu.met.cs665.machine.TeaMixer;
import edu.bu.met.cs665.machine.TeaMixer.Tea;



import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Main {




	private static Logger logger = Logger.getLogger(Main.class);


	/**
	 * A main method to run examples.
	 *
	 * @param args not used
	 */
	public static void main(String[] args) {

		Drink mDrink;

		// This configuration is for setting up the log4j properties file.
		// It is better to set this using java program arguments.
		//PropertyConfigurator.configure("log4j.properties");


		logger.setLevel(Level.ALL);

		System.out.println("------------------------------COFFEE-------------------------------");


		// Let us create an object of the Main class.
		//Main m = new Main();

		CoffeeMixer coffeeMixer = new CoffeeMixer();
		TeaMixer teaMixer = new TeaMixer();


		//NumberFormat df = new DecimalFormat("#0.00");     



		//    logger.trace("Trace Message!");
		//    logger.debug("Debug Message!");
		//    logger.info("Info Message!");
		//    logger.warn("Warn Message!");
		//    logger.error("Error Message!");
		//    logger.fatal("Fatal Message!");


		mDrink = coffeeMixer.makeDrink(CoffeeMixer.Coffee.AMERICANO);

		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);
		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);

		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);
		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);

		//coffeeMixer.calculateCost(mDrink);


		logger.debug(mDrink.toString());   

		//mDrink = coffeeMixer.makeDrink(CoffeeMixer.Coffee.ESPRESSO);

		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);
		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);

		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);
		coffeeMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);

		coffeeMixer.calculateCost(mDrink);


		logger.debug(mDrink.toString());

		System.out.println("--------------------------------------------------------------------\n");

		System.out.println("-----------------------------------TEA------------------------------\n");


		mDrink = teaMixer.makeDrink(Tea.BLACK);

		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);
		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);

		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);
		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.SUGAR);

		//coffeeMixer.calculateCost(mDrink);
		
		
		logger.debug(mDrink.toString());   

		//mDrink = coffeeMixer.makeDrink(CoffeeMixer.Coffee.ESPRESSO);

		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);
		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);

		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);
		teaMixer.addCondiments(mDrink, CoffeeMixer.Condiment.CREAM);

		teaMixer.calculateCost(mDrink);
		
		logger.debug(mDrink.toString());   




	}




}
