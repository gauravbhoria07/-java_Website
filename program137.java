class romantoint{
public static void main(String arg[]) throws java.io.IOException{

java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter the Roman number: ");
String str= br.readLine();
int num=0;
for(int i=0; i<str.length(); i++){
if(str.charAt(i)=='x' || str.charAt(i)=='X'){
num= num+10;}
else if(str.charAt(i)=='i' || str.charAt(i)=='I'){
num= num+1;}
else if(str.charAt(i)=='v' || str.charAt(i)=='V'){
num= num+5;}
else if(str.charAt(i)=='l' || str.charAt(i)=='L'){
num= num+50;}
else if(str.charAt(i)=='c' || str.charAt(i)=='C'){
num= num+100;}
else if(str.charAt(i)=='d' || str.charAt(i)=='D'){
num= num+500;}
else if(str.charAt(i)=='m' || str.charAt(i)=='M'){
num= num+1000;}
else{
System.out.println("invalid roman number");}}
System.out.println("Roman number is: "+ str);
System.out.println("integer number is: "+ num);
}}