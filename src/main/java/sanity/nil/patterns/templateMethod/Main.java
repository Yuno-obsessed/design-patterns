package sanity.nil.patterns.templateMethod;

public class Main {
    public static void main(String[] args) {
        Recipe pastaRecipe = new PastaRecipe();
        System.out.println("Preparing Pasta Recipe:");
        pastaRecipe.prepareRecipe();

        Recipe pizzaRecipe = new PizzaRecipe();
        System.out.println("Preparing Pizza Recipe:");
        pizzaRecipe.prepareRecipe();

        Recipe cakeRecipe = new CakeRecipe();
        System.out.println("Preparing Cake Recipe:");
        cakeRecipe.prepareRecipe();
    }
}
