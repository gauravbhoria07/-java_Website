class armstrong{
public static void main(String s[]){
int sum=0;
System.out.println("Armstrong number between 1 and 600 are: ");
for(int i=1; i<=600; i++){
int x,y;
x=i;
while(x != 0){
y= x % 10;
sum= sum + (y * y * y);
x= x/10; }
if(sum==i){
System.out.print("\t"+i);}
sum=0;} }}