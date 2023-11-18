class roundedfloat{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("enter decimal number: ");
String str= br.readLine();
float n1= Float.parseFloat(str);
System.out.println("Rounded float number is: "+ Math.round(n1));
}}