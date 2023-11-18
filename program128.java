class number{
public static void main(String arg[]) throws java.io.IOException{

java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter any number: ");
String str= br.readLine();
int num= Integer.parseInt(str);
if(num%2==0){System.out.println("even number");}
else{System.out.println("odd number");}
}}