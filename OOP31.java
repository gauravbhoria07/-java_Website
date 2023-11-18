// Car.java
public class Car {
    private String companyName;
    private String modelName;
    private int year;
    private double mileage;

    public Car(String companyName, String modelName, int year, double mileage) {
        this.companyName = companyName;
        this.modelName = modelName;
        this.year = year;
        this.mileage = mileage;
    }

    // Getter methods
    public String getCompanyName() {
        return companyName;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYear() {
        return year;
    }

    // Getter method for mileage (no setter for mileage to make it read-only)
    public double getMileage() {
        return mileage;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 30.5);

        // Using getter methods
        System.out.println("Company Name: " + car.getCompanyName());
        System.out.println("Model Name: " + car.getModelName());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage() + " mpg");
    }
}
