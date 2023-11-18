class reverseint{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("enter number1: ");
String str= br.readLine();
StringBuffer sb= new StringBuffer(str);
System.out.println("Integer after reversing   is:  "+ sb.reverse());
}}