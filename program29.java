class areaoftriangle{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Base: "); 
String str= br.readLine();
int b = Integer.parseInt(str);
System.out.print("Enter Height: "); 
String str1= br.readLine();
int h = Integer.parseInt(str1);
float area= (b*h)/2;
System.out.println("Area of triangle is: "+area+" sq.unit ");
}}