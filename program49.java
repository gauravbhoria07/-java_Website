class commission{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("ENTER Commission Percentage: ");
String s = br.readLine();
int comm= Integer.parseInt(s);
System.out.print("\nENTER Amount: ");
String s1 = br.readLine();
int amt= Integer.parseInt(s1);
System.out.println("\nCOMMISSION FOR GIVEN AMOUNT IS: "+ ((amt*comm)/100)+" Rs.");
}}