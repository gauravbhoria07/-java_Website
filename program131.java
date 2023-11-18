class gcdandlcm{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("enter number1: ");
String str= br.readLine();
int n1= Integer.parseInt(str);
System.out.print("enter number2: ");
String str1= br.readLine();
int n2= Integer.parseInt(str1);
int hcf=0;
int lcm=1;
for(int i=1; i<=n1 || i<=n2; i++){
if(n1%i==0 && n2%i==0){
hcf=i;}
}
for(int i=1; i<n1 && i<n2; i++){
if(n1%i==0 || n2%i==0){
lcm= lcm*i;}
}
System.out.println("\nGreatest Common divisor is: "+hcf);
System.out.println("\nleast Common multiplier is: "+lcm);
}}

