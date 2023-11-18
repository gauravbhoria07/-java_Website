public class StringBufferAppend {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World!");

        System.out.println("Appended String: " + buffer.toString());
    }
}
