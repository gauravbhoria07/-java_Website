class countnotes{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter amount: "); 
String str= br.readLine();
int amt = Integer.parseInt(str);

int r500=0; int r100=0; int r50=0; int r10=0; int r5=0; int r20=0; 
System.out.println("Number of notes are: ");
while(amt>=500){
r500= amt/500;
amt= amt%500;
System.out.println("500: "+r500);}

while(amt>=100){
r100= amt/100;
amt= amt%100;
System.out.println("100: "+r100);}

while(amt>=50){
r500= amt/50;
amt= amt%50;
System.out.println("50: "+r50);}

while(amt>=20){
r500= amt/20;
amt= amt%20;
System.out.println("20: "+r20);}

while(amt>=10){
r500= amt/10;
amt= amt%10;
System.out.println("10: "+r10);}

while(amt>=5){
r500= amt/5;
amt= amt%5;
System.out.println("5: "+r5);}
}}