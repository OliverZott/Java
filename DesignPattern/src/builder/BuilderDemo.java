package builder;

public class BuilderDemo {
	
	public static void main(String[] args) {
		
		Meal chicken = new MealBuilder().prepareChickenMeal();
		
		Meal veggi = new MealBuilder().prepareVegMeal();
		
		veggi.showMenu();
		System.out.println("Whole menu costs: " + veggi.getCost());
		
	}

}
