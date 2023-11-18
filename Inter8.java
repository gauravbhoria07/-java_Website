// Playable.java
public interface Playable {
    void play();
}

// Football.java
public class Football implements Playable {
    @Override
    public void play() {
        // implementation for playing football
    }
}

// Volleyball.java
public class Volleyball implements Playable {
    @Override
    public void play() {
        // implementation for playing volleyball
    }
}

// Basketball.java
public class Basketball implements Playable {
    @Override
    public void play() {
        // implementation for playing basketball
    }
}
