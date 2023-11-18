class floattoint{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("enter decimal number: ");
String str= br.readLine();
float n1= Float.parseFloat(str);
int num1= (int) n1;
System.out.println("\nfloating number: "+n1);
System.out.println("integer number: "+num1);
}}