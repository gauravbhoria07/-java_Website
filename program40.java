class surofcube{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Side: "); 
String str= br.readLine();
int s = Integer.parseInt(str);
int area= 6 * s*s;
System.out.println("Surface Area of Cube is: "+area );
}}