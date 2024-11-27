package sanity.nil.patterns.composite;

public class CargoObject implements Cargo {

    private String name;
    private double weight;

    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }


    public CargoObject(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
