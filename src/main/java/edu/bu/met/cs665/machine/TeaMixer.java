package edu.bu.met.cs665.machine;



import edu.bu.met.cs665.machine.CoffeeMixer.Condiment;


public class TeaMixer {
	
	
	public static enum Tea {
		BLACK, GREEN, YELLOW }
		
	
	private Drink mDrink;
	private int count;
//	private double mCost;

	public Drink makeDrink(Tea tea) {
		
		mDrink = new Drink(tea.toString(),0, 0, 3.99);
		switch (tea) {
		case BLACK:

			System.out.println("Making your " + Tea.BLACK);
			break;

		case GREEN:
//			mDrink = new Drink(Coffee.AMERICANO.toString());
			System.out.println("Making your " + Tea.GREEN);
			break;

		case YELLOW:
//			mDrink = new Drink(Coffee.LATTE_MACCHIATO.toString());
			System.out.println("Making your " + Tea.YELLOW);
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
//		NumberFormat df = new DecimalFormat("#0.00");
			int countSugar = drink.getSugar(); 
			mCost += 0.99 * countSugar; //assuming a unit of sugar cost .99

			int countCream = drink.getCream();
			mCost += 0.99 * countCream;
			
			drink.setCost(mCost);
		return mCost;

	}

}
