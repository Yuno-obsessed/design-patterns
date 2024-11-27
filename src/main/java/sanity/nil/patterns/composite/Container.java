package sanity.nil.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Container implements Cargo {

    private double ownWeight;
    private List<Cargo> cargos = new ArrayList<>();

    @Override
    public double getWeight() {
        return ownWeight + cargos.stream()
                .mapToDouble(Cargo::getWeight)
                .sum();
    }

    public void addCargo(Cargo cargo) {
        cargos.add(cargo);
    }

    public void removeCargo(Cargo cargo) {
        cargos.remove(cargo);
    }

    public Container(double ownWeight) {
        this.ownWeight = ownWeight;
    }
}
