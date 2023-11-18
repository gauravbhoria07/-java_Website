class areaofparelgm{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Base: "); 
String str= br.readLine();
int b = Integer.parseInt(str);
System.out.print("Enter Height: "); 
String str1= br.readLine();
int h = Integer.parseInt(str1);
int area= b*h;
System.out.println("Area of Parallelogram is: "+area+" sq.unit ");
}}