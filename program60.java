class cube{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("ENTER Number to print cube: ");
String s = br.readLine();
int num1= Integer.parseInt(s);
System.out.print("\nENTER Number upto which cube  to print: ");
String s1 = br.readLine();
int num2= Integer.parseInt(s1);
while(num1<=num2){
int cube=num1*num1*num1;
if(cube<=num2){
System.out.println(cube);}
num1=cube;}
}}
