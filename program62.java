class table{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("ENTER number to print table: ");
String s = br.readLine();
int num= Integer.parseInt(s);
System.out.println("Table of "+num+" is: ");
for(int i=1;i<11;i++){
System.out.println(num+" x "+i+" = "+num*i);
}
}}