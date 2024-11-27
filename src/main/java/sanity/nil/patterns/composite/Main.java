package sanity.nil.patterns.composite;

public class Main {
    public static void main(String[] args) {
        CargoObject obj1 = new CargoObject("Metal plates", 250.5);
        CargoObject obj2 = new CargoObject("Metal signs", 200.2);
        CargoObject obj3 = new CargoObject("Copper pipes", 400.3);

        Container container1 = new Container(100);
        container1.addCargo(obj1);
        container1.addCargo(obj2);

        Container container2 = new Container(150);
        container2.addCargo(obj3);
        container2.addCargo(container1);

        System.out.println("Total weight of the whole cargo: " + container2.getWeight() + " kg");
    }
}
