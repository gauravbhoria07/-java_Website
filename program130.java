class prime{
public static void main(String st[]){
System.out.println("Prime numbers between 1 to 20 is: ");
for(int number=1; number<=20; number++){
int count=0;
for(int i=2; i<=number/2;i++){
if(number%i==0){count++;break;}}
if(count==0 && number!=1){
System.out.print("\t"+number);}}
}}