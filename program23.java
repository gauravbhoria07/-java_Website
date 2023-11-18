class squareroot{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter any number: "); 
String str= br.readLine();
int n = Integer.parseInt(str);
double num = Math.sqrt(n);
System.out.print("Square Root of the number is: "+ num);
}}