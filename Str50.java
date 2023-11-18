public class StringBufferFunctions {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Append
        stringBuffer.append(" World");
        System.out.println("After append: " + stringBuffer);

        // Insert
        stringBuffer.insert(5, ", Java");
        System.out.println("After insert: " + stringBuffer);

        // Delete
        stringBuffer.delete(5, 11);
        System.out.println("After delete: " + stringBuffer);

        // Replace
        stringBuffer.replace(0, 5, "Hi");
        System.out.println("After replace: " + stringBuffer);
    }
}
