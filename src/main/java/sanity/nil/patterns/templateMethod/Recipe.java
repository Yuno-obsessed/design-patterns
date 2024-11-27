package sanity.nil.patterns.templateMethod;

public abstract class Recipe {

    public final void prepareRecipe() {
        prepareIngredients();
        cook();
        serve();
        if (needsSideDish()) {
            addSideDishes();
        }
        System.out.println("Recipe preparation completed.\n");
    }

    protected void prepareIngredients() {
        System.out.println("Preparing ingredients...");
    }

    protected abstract void cook();
    protected abstract void serve();

    protected boolean needsSideDish() {
        return false;
    }

    protected void addSideDishes() {
    }
}
