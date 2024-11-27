package sanity.nil.patterns.abstractFactory;

public class OrcArcher implements Archer {

    private int arrows;

    @Override
    public void shoot() {
        arrows--;
        System.out.println("I shoot this arrow for Mordor!");
    }

    @Override
    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
}
