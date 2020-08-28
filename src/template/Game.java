package template;

public abstract class Game {
    void initialize() {
        System.out.println("game initialize:");
    }

    abstract void start();

    abstract void playing();

    abstract void end();

    public final void play() {
        initialize();
        start();
        playing();
        end();
    }
}

