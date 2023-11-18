class leap{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("ENTER a Year: ");
String s = br.readLine();
int year= Integer.parseInt(s);
if(year%4==0){
System.out.println(year+" is a leap year");
}
else{
System.out.println(year+" is not a leap year");}
}}