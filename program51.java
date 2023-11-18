class power{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("ENTER any number: ");
String s = br.readLine();
int x= Integer.parseInt(s);
System.out.print("ENTER power: ");
String s1 = br.readLine();
int p= Integer.parseInt(s1);
System.out.println("power of "+x+" is: "+ (Math.pow(x,p)));
}}
