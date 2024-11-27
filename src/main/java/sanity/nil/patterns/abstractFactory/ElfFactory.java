package sanity.nil.patterns.abstractFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ElfFactory implements AbstractCharacterFactory {

    private Queue<Integer> swords = new LinkedList<>(List.of(100,90,80,70,60,50,50));
    private Integer arrows = 1000;
    private static int MAX_ARROWS = 15;

    @Override
    public Archer createArcher() {
        ElfArcher archer = new ElfArcher();
        archer.setArrows(arrows < MAX_ARROWS ? arrows : MAX_ARROWS);
        arrows -= archer.getArrows();
        return archer;
    }

    @Override
    public Swordsman createSwordsman() {
        ElfSwordsman swordsman = new ElfSwordsman();
        swordsman.setSharpness(swords.poll());
        return swordsman;
    }
}
