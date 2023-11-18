class prime{
public static void main(String st[]){
int sum= 0;
for(int number=1; number<=100; number++){
int count=0;
for(int i=2; i<=number/2;i++){
if(number%i==0){count++;break;}}
if(count==0 && number!=1){
sum= sum+number;}}
System.out.println("Sum of first 100 prime numbers is: "+sum);}}