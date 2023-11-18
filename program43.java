class sumn{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("How many numbers: ");
String s = br.readLine();
int num= Integer.parseInt(s);
int sum=0;
for(int i=1; i<=num;i++){
System.out.print("\nEnter value of number "+i+" ");
String s1 = br.readLine();
int num1= Integer.parseInt(s1);
sum=sum+num1;
}
System.out.println("\nSum of given numbers is: "+ sum);}}