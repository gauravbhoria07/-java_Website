class palindrome{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter number: "); 
String str= br.readLine();
int num1 = Integer.parseInt(str);
int d= num1;
int num2=0; int mod;
while(d != 0){
mod= d%10;
num2= (num2*10)+mod;
d= d/10;}
if(num1 == num2){
System.out.println("This Number is palindrome ");}
else{System.out.println("This Number is not palindrome ");}
}
}