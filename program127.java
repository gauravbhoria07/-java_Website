class areaofpentagon{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Perimeter: "); 
String str= br.readLine();
int p = Integer.parseInt(str);
System.out.print("Enter Apothem: "); 
String str1= br.readLine();
int a = Integer.parseInt(str1);
float area= (p * a)/2;
System.out.println("Area of Pentagpn is: "+area+" unit sq.");
}}