package sanity.nil.patterns.templateMethod;

public class PastaRecipe extends Recipe {
    @Override
    protected void cook() {
        System.out.println("Cooking pasta by boiling and adding sauce.");
    }

    @Override
    protected void serve() {
        System.out.println("Serving pasta in a bowl with Parmesan cheese.");
    }

    @Override
    protected boolean needsSideDish() {
        return true;
    }

    @Override
    protected void addSideDishes() {
        System.out.println("Adding garlic bread as a side dish.");
    }
}
