class num{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Any Number: "); 
String str= br.readLine();
int n= Integer.parseInt(str);
System.out.println("value is: "+ (n+n*n+n*n*n));}}