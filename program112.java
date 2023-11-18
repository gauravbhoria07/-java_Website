class checkprime{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("enter any number: ");
String str= br.readLine();
int num= Integer.parseInt(str);
int count=0;
for(int i=2; i<=num/2;i++){
if(num%i==0){count++;}}
if(count==0 && num!=1){
System.out.println("\n"+num+" is a prime number");}
else{
System.out.println("\n"+num+" is not a prime number");}
}}