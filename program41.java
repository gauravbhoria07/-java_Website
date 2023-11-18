class Avgmarks{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("How many subjects: ");
String s = br.readLine();
int n= Integer.parseInt(s);
int sum=0;
for(int i=1; i<=n;i++){
System.out.print("Enter marks of subject  "+i+" ");
String s1 = br.readLine();
int m= Integer.parseInt(s1);
sum=sum+m;
}
System.out.print("\nAverage Marks of Student is: "+(sum/n));
}}