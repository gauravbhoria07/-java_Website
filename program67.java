class grade{
void grades(int x){
if(x>=90){
System.out.println("Grade A+");}
else if((x<90) && (x>=80)){
System.out.println("Grade A");}
else if((x<80) && (x>=70)){
System.out.println("Grade B");}
else if((x<70) && (x>=60)){
System.out.println("Grade C");}
else if((x<60) && (x>=50)){
System.out.println("Grade D");}
else{
System.out.println("Grade E");}
}


public static void main(String st[]) throws java.io.IOException{
System.out.print("Enter your percentage: ");
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br = new java.io.BufferedReader(isr);
String str= br.readLine();
int a= Integer.parseInt(str);
grade obj= new grade();
obj.grades(a);
}}