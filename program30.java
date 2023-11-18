class areaofequitriangle{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Side: "); 
String str= br.readLine();
int s = Integer.parseInt(str);
double area= (Math.sqrt(3)*s*s)/4;
System.out.println("Area of Equilateral triangle is: "+area+" sq.unit ");
}}