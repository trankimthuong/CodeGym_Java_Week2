package template_method_design;

public class HamburgerMeal extends Meal{
    @Override
    public void prepareIngredients() {
        System.out.println("Getting burgers, buns, and french fries");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burgers on grill and fries in oven");
    }

    @Override
    public void cleanup() {
        System.out.println("Throwing away paper plates");
    }
}
