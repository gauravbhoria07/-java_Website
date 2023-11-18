class dec{
void DecimalToBinary(int x){
String str= "";
while(x!=1){
int rem= x%2;
x=x/2;
str= str+" "+rem;}
str= str+" "+1;
System.out.println("Binary: "+str+" (!!!!!read from right side)");
}
 
public static void main(String st[]){
int num= 14;
dec obj= new dec();
System.out.println("Decimal: "+num);
obj.DecimalToBinary(num);
}}