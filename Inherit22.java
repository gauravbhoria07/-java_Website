// Bird.java
abstract class Bird {
    abstract void fly();
    abstract void makeSound();
}

// Eagle.java
class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle flying high");
    }

    @Override
    void makeSound() {
        System.out.println("Eagle screech");
    }
}

// Hawk.java
class Hawk extends Bird {
    @Override
    void fly() {
        System.out.println("Hawk flying gracefully");
    }

    @Override
    void makeSound() {
        System.out.println("Hawk scream");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.makeSound();

        Hawk hawk = new Hawk();
        hawk.fly();
        hawk.makeSound();
    }
}
