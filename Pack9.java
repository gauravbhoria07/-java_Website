// File: c4/sample/NestedPackageClass.java
package c4.sample;

public class NestedPackageClass {
    protected int protectedVar = 20;

    protected void protectedMethod() {
        System.out.println("Protected Method in c4.sample");
    }
}

// File: AnotherFile.java
public class Main {
    public static void main(String[] args) {
        c4.sample.NestedPackageClass obj = new c4.sample.NestedPackageClass();

        // Accessing protected variables and methods in a nested package
        System.out.println("Protected Variable: " + obj.protectedVar);
        obj.protectedMethod();
    }
}
