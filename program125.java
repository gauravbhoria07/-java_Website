class leapyear{
public static void main(String st[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.println("Enter any year: ");
String str1= br.readLine();
int year= Integer.parseInt(str1);
if(year%4==0){
System.out.println(year+" is a leap year");}
else{System.out.println(year+" is  not a leap year");}