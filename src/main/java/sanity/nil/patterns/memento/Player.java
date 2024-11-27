package sanity.nil.patterns.memento;

public class Player {
    private int level;
    private int health;
    private int experience;

    public Player(int level, int health, int experience) {
        this.level = level;
        this.health = health;
        this.experience = experience;
    }

    public void play() {
        level++;
        health -= 10;
        experience += 50;
        System.out.println("Playing game... Level: " + level + ", Health: " + health + ", Experience: " + experience);
    }

    public record PlayerMemento(int level, int health, int experience) { }

    public PlayerMemento save() {
        System.out.println("Saving game state... Level: " + level + ", Health: " + health + ", Experience: " + experience);
        return new PlayerMemento(level, health, experience);
    }

    public void restore(PlayerMemento memento) {
        this.level = memento.level();
        this.health = memento.health();
        this.experience = memento.experience();
        System.out.println("Restored game state... Level: " + level + ", Health: " + health + ", Experience: " + experience);
    }
}
