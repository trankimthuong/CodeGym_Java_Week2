package template_method_design;

public abstract class Meal {
    public final void doMeal(){
        prepareIngredients();
        cook();
        eat();
        cleanup();
    }

    public abstract void prepareIngredients();
    public abstract void cook();
    public void eat(){
        System.out.println("Mmm, that's good");
    }

    public abstract void cleanup();
}
