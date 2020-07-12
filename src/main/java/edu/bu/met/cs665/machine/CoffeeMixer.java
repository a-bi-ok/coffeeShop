package edu.bu.met.cs665.machine;


public class CoffeeMixer {

	public static enum Coffee {
		ESPRESSO, AMERICANO, LATTE_MACCHIATO
	}

	public static enum Condiment {
		SUGAR, CREAM
	}

	private Drink mDrink;
//	private double mCost;
	private int count;

	public Drink makeDrink(Coffee coffee) {

		mDrink = new Drink(coffee.toString(), 0, 0, 4.99);

		switch (coffee) {
		case ESPRESSO:
			System.out.println("Making your " + Coffee.ESPRESSO);
			break;

		case AMERICANO:
			System.out.println("Making your " + Coffee.AMERICANO);
			break;

		case LATTE_MACCHIATO:
			System.out.println("Making your " + Coffee.LATTE_MACCHIATO);
			break;

		default:
			// code block
		}
		return mDrink;
	}

	public Drink addCondiments(Drink drink, Condiment condiment) {

		switch (condiment) {
		case SUGAR:
			count = drink.getSugar();
			count += 1;
			drink.setSugar(count);

			System.out.println(
					"Added " + drink.getSugar() + " unit(s) of SUGAR");

			break;

		case CREAM:
			count = drink.getCream();

			count += 1;
			drink.setCream(count);

			System.out.println(
					"Added " + drink.getCream() + " unit(s) of CREAM");
			break;
		default:
			// code block
		}
		return drink;
	}

	public double calculateCost(Drink drink) {
		double mCost = drink.getCost();
		//NumberFormat df = new DecimalFormat("#0.00");
			int countSugar = drink.getSugar(); 
			mCost += 0.99 * countSugar; //assuming a unit of sugar cost .99

			int countCream = drink.getCream();
			mCost += 0.99 * countCream;
			
			
			drink.setCost(mCost);
		return mCost;

	}

}