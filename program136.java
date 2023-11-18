class rounddivision{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("enter number1: ");
String str= br.readLine();
float n1= Float.parseFloat(str);
System.out.print("enter number2: ");
String str1= br.readLine();
float n2= Float.parseFloat(str1);
float div= n1/n2;
System.out.println("division of two numbers is: "+ String.format("%.3f",div));
}}
