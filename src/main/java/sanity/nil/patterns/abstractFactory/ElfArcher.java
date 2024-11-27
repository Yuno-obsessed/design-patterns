package sanity.nil.patterns.abstractFactory;

public class ElfArcher implements Archer {

    private int arrows;

    @Override
    public void shoot() {
        arrows--;
        System.out.println("Let my arrow be deadly to all orcs!");
    }

    @Override
    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
}
