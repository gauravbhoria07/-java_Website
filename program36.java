class volofcuboid{
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
int volume= l*b*h;
System.out.println("volume of Cuboid is: "+volume );
}}