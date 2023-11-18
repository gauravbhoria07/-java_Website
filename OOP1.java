// Person.java
 class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Alice", 30);

        System.out.println("Person 1: Name - " + person1.name + ", Age - " + person1.age);
        System.out.println("Person 2: Name - " + person2.name + ", Age - " + person2.age);
    }
}
