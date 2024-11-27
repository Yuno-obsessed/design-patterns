package sanity.nil.patterns.memento;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(1, 100, 0);
        GameStateManager gameStateManager = new GameStateManager();

        player.play();
        gameStateManager.saveState(player.save());

        player.play();
        gameStateManager.saveState(player.save());

        player.play();

        System.out.println("---- Restoring Previous States ----");
        player.restore(gameStateManager.restoreState());
        player.restore(gameStateManager.restoreState());
    }
}
