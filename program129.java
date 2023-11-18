class palindrome{
public static void main(String st[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.println("Enter any number: ");
String str1= br.readLine();
int num1= Integer.parseInt(str1);
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