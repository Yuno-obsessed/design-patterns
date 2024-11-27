package sanity.nil.patterns.abstractFactory;

public class OrcSwordsman implements Swordsman {

    private int sharpness;

    @Override
    public void strike() {
        sharpness--;
        System.out.println("Taste Mordor's steel!");
    }

    @Override
    public int getSharpness() {
        return sharpness;
    }

    public void setSharpness(int sharpness) {
        this.sharpness = sharpness;
    }

}
