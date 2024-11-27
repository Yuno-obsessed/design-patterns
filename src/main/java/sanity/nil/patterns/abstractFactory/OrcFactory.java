package sanity.nil.patterns.abstractFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OrcFactory implements AbstractCharacterFactory {

    private Queue<Integer> swords = new LinkedList<>(List.of(70,60,50,50,50,50,40,30,30,30,30));
    private Integer arrows = 500;
    private static int MAX_ARROWS = 8;

    @Override
    public Archer createArcher() {
        OrcArcher archer = new OrcArcher();
        archer.setArrows(arrows < MAX_ARROWS ? arrows : MAX_ARROWS);
        arrows -= archer.getArrows();
        return archer;
    }

    @Override
    public Swordsman createSwordsman() {
        OrcSwordsman swordsman = new OrcSwordsman();
        swordsman.setSharpness(swords.poll());
        return swordsman;
    }
}
