class bin{
void BinaryToDecimal(int x){
int count=0; double dec=0;
while(x!=0){
double rem= x%10;
x=x/10;
double a= Math.pow(2,count);
dec= rem * a + dec;
count++;}
System.out.println("Decimal: "+dec);
}
 
public static void main(String st[]){
int num= 1110;
bin obj= new bin();
System.out.println("Binary: "+num);
obj.BinaryToDecimal(num);
}}