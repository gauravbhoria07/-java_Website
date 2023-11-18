// Dog.java
 class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Max", "Golden Retriever");

        System.out.println("Dog 1: Name - " + dog1.name + ", Breed - " + dog1.breed);
        System.out.println("Dog 2: Name - " + dog2.name + ", Breed - " + dog2.breed);

        // Modify attributes using setter methods
        dog1.setName("Rocky");
        dog2.setBreed("German Shepherd");

        System.out.println("Updated Dog 1: Name - " + dog1.name + ", Breed - " + dog1.breed);
        System.out.println("Updated Dog 2: Name - " + dog2.name + ", Breed - " + dog2.breed);
    }
}
