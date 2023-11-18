class areaofprism{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Length: "); 
String str= br.readLine();
int l = Integer.parseInt(str);
System.out.print("Enter Height: "); 
String str1= br.readLine();
int h = Integer.parseInt(str1);
System.out.print("Enter Width: "); 
String str2= br.readLine();
int w = Integer.parseInt(str2);
int area= (2*l*w) + 2*(l+w)*h;
System.out.println("Area of Prism is: "+area+" sq.unit ");
}}