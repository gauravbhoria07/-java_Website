class remove{

public static void main(String st[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.println("Enter String1: ");
String str1= br.readLine();
System.out.println("Enter char you want to remove: ");
String str2= br.readLine();
System.out.println("string after removing char  is:  "+ str1.replace(str2," "));
}}