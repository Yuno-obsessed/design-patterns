package sanity.nil.patterns.abstractFactory;

public class Main {

    public static void main(String[] args) {
        ElfFactory elfFactory = new ElfFactory();
        elfFactory.createArcher().shoot();
        elfFactory.createArcher().shoot();
        elfFactory.createSwordsman().strike();
        elfFactory.createSwordsman().strike();

        OrcFactory orcFactory = new OrcFactory();
        orcFactory.createArcher().shoot();
        orcFactory.createArcher().shoot();
        orcFactory.createSwordsman().strike();
        orcFactory.createSwordsman().strike();
    }
}
