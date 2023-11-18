// File: MyPackage/PublicClass1.java
package MyPackage;

public class PublicClass1 {
    public void display() {
        System.out.println("PublicClass1 in MyPackage");
    }
}

// File: MyPackage/PublicClass2.java
package MyPackage;

public class PublicClass2 {
    public void display() {
        System.out.println("PublicClass2 in MyPackage");
    }
}

// File: MyPackage/PublicClass3.java
package MyPackage;

public class PublicClass3 {
    public void display() {
        System.out.println("PublicClass3 in MyPackage");
    }
}

// File: MyPackage/PublicClass4.java
package MyPackage;

 class PublicClass4 {
    public void display() {
        System.out.println("PublicClass4 in MyPackage");
    }
}

// File: AnotherFile.java
import MyPackage.*;

 class Main {
    public static void main(String[] args) {
        PublicClass1 obj1 = new PublicClass1();
        PublicClass2 obj2 = new PublicClass2();
        PublicClass3 obj3 = new PublicClass3();
        PublicClass4 obj4 = new PublicClass4();

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}
