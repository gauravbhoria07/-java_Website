class roundupfloat{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("enter number: ");
String str= br.readLine();
float num= Float.parseFloat(str);
System.out.print("Specified decimal places is: 3");
System.out.println("\nDecimal number is: "+String.format("%.3f", num));
}}