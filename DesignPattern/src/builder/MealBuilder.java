package builder;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new Coke());
		meal.addItem(new VegBurger());
		return meal;
	}
	
	
	public Meal prepareChickenMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
	
}
