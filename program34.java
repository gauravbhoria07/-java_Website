class volofsphere{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Radius: "); 
String str= br.readLine();
int r = Integer.parseInt(str);
float pi= 3.14f;
float volume= (4*pi*r*r*r)/3;
System.out.println("volume of Sphere is: "+volume );
}}