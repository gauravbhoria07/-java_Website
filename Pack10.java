// File: MyPackage/PublicPublicClass.java
package MyPackage;

public class PublicPublicClass {
    public int publicVar = 30;

    public void publicMethod() {
        System.out.println("Public Method in MyPackage");
    }
}

// File: AnotherFile.java
public class Main {
    public static void main(String[] args) {
        MyPackage.PublicPublicClass obj = new MyPackage.PublicPublicClass();

        // Accessing public variables and methods
        System.out.println("Public Variable: " + obj.publicVar);
        obj.publicMethod();
    }
}
