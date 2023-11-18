class trim{

public static void main(String st[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.println("Enter String1: ");
String str1= br.readLine();
System.out.println("Enter String2: ");
String str2= br.readLine();
System.out.println("String before triming is:  "+ str1+ str2);
System.out.println("String after triming is:  "+ str1.trim()+str2.trim());
}}