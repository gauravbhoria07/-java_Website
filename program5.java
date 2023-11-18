class Average{
public static void main(String arg[]) throws java.io.IOException{
int avg=0;
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
for(int i=1; i<=5;i++){
System.out.print("Enter the value of number "+i+" ");
String str= br.readLine();
avg = avg+ Integer.parseInt(str);
}
System.out.println("Average of 5 numbers is: "+ (avg/5));
}}