class areaofcircle{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Radius: "); 
String str= br.readLine();
int r = Integer.parseInt(str);
float pi=3.14f;
float area= pi * r*r;
System.out.println("Area of Circle is: "+area+" unit sq.");
}}