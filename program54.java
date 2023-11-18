class number{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("ENTER Number: ");
String s = br.readLine();
if(s.charAt(0)=='-'){
System.out.println("\n"+s+" is a negative number");
}
else{
System.out.println("\n"+s+" is a positive number");}
}}