class surofcuboid{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Length: "); 
String str= br.readLine();
int l = Integer.parseInt(str);
System.out.print("Enter Height: "); 
String str1= br.readLine();
int h = Integer.parseInt(str1);
System.out.print("Enter Breath: "); 
String str2= br.readLine();
int b = Integer.parseInt(str2);
int area= 2*((l*b)+ (b*h)+ (h*l));
System.out.println("Surface Area of Cuboid is: "+area );
}}