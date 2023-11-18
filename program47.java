class compoundint{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("ENTER Principal Amount: ");
String s = br.readLine();
int p= Integer.parseInt(s);
System.out.print("\nENTER Rate: ");
String s1 = br.readLine();
int r= Integer.parseInt(s1);
System.out.print("\nENTER Number of months to pay: ");
String s2 = br.readLine();
float n= Float.parseFloat(s2);
System.out.print("\nENTER Total number of year: ");
String s3 = br.readLine();
float t= Float.parseFloat(s3);
t=t*12;
n= t/n;
float y= 1+r/100;
String.format("%.7f", y);
double x= Math.pow(y,n);
String.format("%.7f", x);
double ci= p *x;

System.out.println("\nCOMPOUND INTEREST IS: "+String.format("%.7f", ci));
}}
