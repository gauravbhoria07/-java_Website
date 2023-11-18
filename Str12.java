public class StringToStringArray {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String[] strArray = str.split("\\s*,\\s*");

        System.out.println("String Array: " + Arrays.toString(strArray));
    }
}
