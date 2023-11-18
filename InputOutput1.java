import java.io.*;

 class CharInputExample {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        System.out.println("Enter a character:");
        char c = (char) reader.read();
        System.out.println("You entered: " + c);
    }
}
