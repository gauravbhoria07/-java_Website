// Person.java
public class Person {
    private String name;
    private int age;
    private String country;

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        Person person = new Person("John", 25, "USA");

        // Using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());

        // Using setter methods
        person.setAge(26);
        person.setCountry("Canada");

        System.out.println("Updated Age: " + person.getAge());
        System.out.println("Updated Country: " + person.getCountry());
    }
}
