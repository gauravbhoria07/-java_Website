class digitsum{
void sumofdigit(int a){
int sum=0;
while(a!=0){
int mod = a%10;
a= a/10;
sum= sum+mod;}
System.out.println("sum of digits is: "+ sum);
}

public static void main(String st[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Any number: "); 
String str= br.readLine();
int num1 = Integer.parseInt(str);
digitsum obj1= new digitsum();
obj1.sumofdigit(num1);
}}