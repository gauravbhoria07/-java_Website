class marks{
public static void main(String s[])throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);

int sum=0;
System.out.println("How many subjects? ");
String str1= br.readLine();
int sub = Integer.parseInt(str1);
for(int i=1; i<=sub;i++){
System.out.println("Enter the marks of subject "+i);
String str2= br.readLine();
int n = Integer.parseInt(str2);
sum= sum+n;
}
System.out.println("Total marks obtained in "+sub+" subjects is: "+sum);
int total= sub*100;
int percent= (sum*100)/total;
System.out.println("Percentage obtained in "+sub+" subjects is: "+percent+"%");
}}