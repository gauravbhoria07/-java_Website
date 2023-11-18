class factorial{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter any number: ");
String s = br.readLine();
int n= Integer.parseInt(s);
factorial obj1 = new factorial();
int b= obj1.factorial1(n);
System.out.print("factorial of "+n+" is "+b);
}
int factorial1(int x){
if(x==1){return 1;}
else{
x= factorial1(x-1) * x;
return x;}}}

