class sumofdigit{
public static void main(String st[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
int sum=0;
System.out.println("Enter any number: ");
String str1= br.readLine();
int num= Integer.parseInt(str1);
while(num!=0){
int mod= num%10;
num= num/10;
sum= sum+mod;
}
System.out.println("Sum of digits of number is: "+sum);
}}