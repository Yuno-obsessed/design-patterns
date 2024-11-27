package sanity.nil.patterns.templateMethod;

public class CakeRecipe extends Recipe {
    @Override
    protected void cook() {
        System.out.println("Baking cake in the oven at 350°F for 30 minutes.");
    }

    @Override
    protected void serve() {
        System.out.println("Serving cake with a dollop of whipped cream.");
    }
}
