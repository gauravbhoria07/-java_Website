class oddnatural{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("ENTER terms to print odd natural numbers: ");
String s = br.readLine();
int num1= Integer.parseInt(s);
System.out.println("First "+num1+" odd natural numbers are: ");
for(int i=1; i<=num1;i++){
if(i%2!=0){
System.out.print("\t"+i);}
}}}