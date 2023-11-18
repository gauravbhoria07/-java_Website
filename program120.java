class average3{
public static void main(String st[]) throws java.io.IOException{

java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);

System.out.println("Enter Number1: ");
String str1= br.readLine();
int num1= Integer.parseInt(str1);

System.out.println("Enter Number2: ");
String str2= br.readLine();
int num2= Integer.parseInt(str2);

System.out.println("Enter Number3: ");
String str3= br.readLine();
int num3= Integer.parseInt(str3);

System.out.println("Average of three numbers is: "+ ((num1+num2+num3)/3));
}}