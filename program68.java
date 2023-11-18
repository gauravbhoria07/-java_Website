class cal{


void opr(int x, int y ,char s){
switch(s){
case '+':
System.out.println("Sum of two numbers is:" );
System.out.println(x + y);
break;
case '-':
System.out.println("Difference of two numbers is:" );
System.out.println(x - y);
break;
case '*':
System.out.println("Multiplication of two numbers is:" );
System.out.println(x * y);
break;
case '/':
System.out.println("Division of two numbers is:" );
System.out.println(x / y);
break;
default:
System.out.println("Error!!!! Wrong input");
}}


public static void main(String st[]) throws java.io.IOException{
cal obj= new cal();
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);

System.out.println("Enter Number1: ");
String str1= br.readLine();
int num1= Integer.parseInt(str1);

System.out.println("Enter Number2: ");
String str2= br.readLine();
int num2= Integer.parseInt(str2);

System.out.println("Enter operation(+,-,/,*): ");
String str3= br.readLine();
char c = str3.charAt(0);

obj.opr(num1,num2,c);
}}