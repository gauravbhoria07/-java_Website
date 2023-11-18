public class StringBufferInsert {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.insert(5, ", World!");

        System.out.println("Inserted String: " + buffer.toString());
    }
}
