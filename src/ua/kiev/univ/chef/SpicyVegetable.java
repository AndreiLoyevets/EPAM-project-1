package ua.kiev.univ.chef;

/**
 * Spicy vegetables (Пряные)
 * @version 1.0 3 Oct 2013
 * @author Andrei Loyevets
 */
public class SpicyVegetable extends Vegetable{
	
	public SpicyVegetable(String name, double calories) {
		super(name, calories);
		setCategory("Spicy vegetables");
	}
	
	public SpicyVegetable(String name, double calories, double weight) {
		super(name, calories, weight);
		setCategory("Spicy vegetables");
	}
}
