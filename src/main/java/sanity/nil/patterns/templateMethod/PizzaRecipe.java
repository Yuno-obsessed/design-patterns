package sanity.nil.patterns.templateMethod;

public class PizzaRecipe extends Recipe {
    @Override
    protected void cook() {
        System.out.println("Baking pizza in the oven.");
    }

    @Override
    protected void serve() {
        System.out.println("Serving pizza on a wooden tray.");
    }
}