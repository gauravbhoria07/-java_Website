class surofcylinder{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Radius: "); 
String str= br.readLine();
int r = Integer.parseInt(str);
System.out.print("Enter Height: "); 
String str1= br.readLine();
int h = Integer.parseInt(str1);
float pi=3.14f;
float area= (2*(pi*r*h))+ (2*pi*r*r);
System.out.println("Surface Area of Cylinder is: "+area );
}}