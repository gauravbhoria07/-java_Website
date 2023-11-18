class CGPA{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("ENTER YOUR CGPA: ");
String s = br.readLine();
int cgpa= Integer.parseInt(s);
System.out.println("\nYOUR PERCENTAGE IS: "+ cgpa*9.5);