package sanity.nil.patterns.abstractFactory;

public class ElfSwordsman implements Swordsman {

    private int sharpness;

    @Override
    public void strike() {
        sharpness--;
        System.out.println("I fight for the light!");
    }

    @Override
    public int getSharpness() {
        return sharpness;
    }

    public void setSharpness(int sharpness) {
        this.sharpness = sharpness;
    }
}
