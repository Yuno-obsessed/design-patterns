package sanity.nil.patterns.memento;

import java.util.Stack;

public class GameStateManager {
    private Stack<Player.PlayerMemento> savedStates = new Stack<>();

    public void saveState(Player.PlayerMemento memento) {
        savedStates.push(memento);
    }

    public Player.PlayerMemento restoreState() {
        if (savedStates.isEmpty()) {
            System.out.println("No saved states available.");
            return null;
        }
        return savedStates.pop();
    }
}
