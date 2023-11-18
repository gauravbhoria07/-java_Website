import java.io.*;

 class StringInputExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        String str = reader.readLine();
        System.out.println("You entered: " + str);
    }
}
