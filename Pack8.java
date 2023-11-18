// File: MyPackage/PublicProtectedClass.java
package MyPackage;

public class PublicProtectedClass {
    protected int protectedVar = 10;

    protected void protectedMethod() {
        System.out.println("Protected Method in MyPackage");
    }
}

// File: AnotherFile.java
public class Main {
    public static void main(String[] args) {
        MyPackage.PublicProtectedClass obj = new MyPackage.PublicProtectedClass();

        // Accessing protected variables and methods
        System.out.println("Protected Variable: " + obj.protectedVar);
        obj.protectedMethod();
    }
}
