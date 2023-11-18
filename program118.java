class fibonaci{
public static void main(String st[]) throws java.io.IOException{
fibonaci2 obj1= new fibonaci2();
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);

System.out.println("Enter Number1: ");
String str1= br.readLine();
int num1= Integer.parseInt(str1);

System.out.println("Enter Number2: ");
String str2= br.readLine();
int num2= Integer.parseInt(str2);

System.out.println("Enter Number Of Terms to print: ");
String str3= br.readLine();
int num3= Integer.parseInt(str3);

obj1.fibonacci(num1,num2,num3);
}}
class fibonaci2{
void fibonacci(int a, int b, int c){
System.out.print(a+","+b+",");
for(int i=2; i<c; i++){
int d= a+b;
System.out.print(d+",");
a=b; b=d;
}
}}