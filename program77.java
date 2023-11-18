class index{

public static void main(String st[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.println("Enter String1: ");
String str1= br.readLine();
System.out.println("Character at index 5 is:  "+ str1.charAt(5));
}}