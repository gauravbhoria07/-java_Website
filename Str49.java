public class StringBufferReverse {
    public static String reverseStringBuffer(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String inputStr = "Reverse with StringBuffer";
        String result = reverseStringBuffer(inputStr);
        System.out.println("String after reversing with StringBuffer: " + result);
    }
}
