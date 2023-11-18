class areaofrectangle{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Length: "); 
String str= br.readLine();
int l = Integer.parseInt(str);
System.out.print("Enter Breath: "); 
String str1= br.readLine();
int b = Integer.parseInt(str1);
int area= l*b;
System.out.println("Area of Circle is: "+area+" sq.unit ");
}}