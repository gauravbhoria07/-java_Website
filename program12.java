class count{
void count1(String s){
int letter=0; int space=0; int num=0; int other=0;
for(int i=0; i< s.length(); i++){
if(Character.isLetter(s.charAt(i))){
letter++;}
else if(Character.isDigit(s.charAt(i))){
num++;}
else if(Character.isSpaceChar(s.charAt(i))){
space++;}
else{other++;}}
System.out.println("String Entered is: "+s);
System.out.println("Total Letters is: "+letter);
System.out.println("Total Numbers is: "+num);
System.out.println("Total Space is: "+space);
System.out.println("Other Characters is: "+other);
}

public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Any String: "); 
String str= br.readLine();
count obj= new count();
obj.count1(str);
}}