class areaofrhombus{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Diagonal1: "); 
String str= br.readLine();
int d1 = Integer.parseInt(str);
System.out.print("Enter Diagonal1: "); 
String str1= br.readLine();
int d2 = Integer.parseInt(str1);
int area= (d1*d2)/2;
System.out.println("Area of Rhombus is: "+area+" sq.unit ");
}}