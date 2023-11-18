class Add{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter number1: "); 
String str= br.readLine();
int num1 = Integer.parseInt(str);
System.out.print("Enter number2: "); 
String str1= br.readLine();
int num2 = Integer.parseInt(str1);
for(int i=0; i<num2; i++){
num1++;}
System.out.print("Sum of given two numbers is: "+num1);}}