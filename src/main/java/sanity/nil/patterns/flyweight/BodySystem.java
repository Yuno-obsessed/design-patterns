package sanity.nil.patterns.flyweight;

public class BodySystem {

    public static void main(String[] args) {
        CellFactory factory = new CellFactory();

        Cell redBloodCell = factory.getCell("Red Blood Cell", "Carry oxygen");
        Cell whiteBloodCell = factory.getCell("White Blood Cell", "Fight infections");
        Cell neuron = factory.getCell("Neuron", "Transmit signals");

        redBloodCell.performFunction("Heart");
        whiteBloodCell.performFunction("Lungs");
        neuron.performFunction("Brain");

        redBloodCell.performFunction("Liver");
        whiteBloodCell.performFunction("Kidney");
    }
}
