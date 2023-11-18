class smallest{
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
if(num1<num2 && num1<num3){
System.out.println("Smallest number is: "+num1);}
else if(num2<num1 && num2<num3){
System.out.println("Smallest number is: "+num2);}
else{
System.out.println("Smallest number is: "+num3);}
}}