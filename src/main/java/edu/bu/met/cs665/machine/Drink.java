package edu.bu.met.cs665.machine;

public class Drink {

	public final int WATER = 8; // 8 ounces of water for a cup
	
	private final int MAX_VALUE = 3; 
	private final double MAX_COST = 11; 

	private String name;
	private int cream;
	private int sugar;
	private double cost;
	
	/**
	 * @param name
	 * @param cream
	 * @param sugar
	 * @param cost
	 */
	public Drink(String name, int cream, int sugar, double cost) {
		this.name = name;
		this.cream = cream;
		this.sugar = sugar;
		this.cost = cost;
	}


	public String getName() {
		return name;
	}

	
	public int getCream() {
		return cream;
	}

	public int getSugar() {
		return sugar;
	}

	public double getCost() {
		return cost;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setCream(int cream) {
		if(cream <= MAX_VALUE) {
			this.cream = cream; 
			}
		else {			
			System.out.println("You need to watch your CREAM intake, you are limited to only 3 units");
		}
	}

	public void setSugar(int sugar) {	
		if(sugar <= MAX_VALUE) {
			this.sugar = sugar; 
			}
		else {			
			System.out.println("You need to watch your SUGAR intake, you are limited to only 3 units");

		}
	}

	public void setCost(double cost) {
		if(cost <= MAX_COST)
			this.cost = cost;
	}


	@Override
	public String toString() {
		return "Drink [WATER=" + WATER + ", MAX_VALUE=" + MAX_VALUE + ", MAX_COST=" + MAX_COST + ", name=" + name
				+ ", cream=" + cream + ", sugar=" + sugar + ", cost=" + cost + "]";
	}

}
