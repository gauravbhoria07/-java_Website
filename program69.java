class concat{

public static void main(String st[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.println("Enter String1: ");
String str1= br.readLine();

System.out.println("Enter String2: ");
String str2= br.readLine();
str1= str1.concat(str2);
System.out.println("string after concatenation is: "+ str1);
}}
 
