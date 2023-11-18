class reverseint{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter any number: ");
String str= br.readLine();
StringBuilder str1= new StringBuilder(str);
System.out.println("\nreversed integer is: "+str1.reverse());
}}