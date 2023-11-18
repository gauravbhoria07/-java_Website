class swapping{
void swap(int a, int b){
int c= a;
a=b;
b=c;
System.out.println("Values after swapping: ");
System.out.println("num1= "+a+" , "+"num2= "+b);
}
public static void main(String st[]){
int num1=15;
int num2= 25;
System.out.println("Values before swapping: ");
System.out.println("num1= "+num1+" , "+"num2= "+num2);
swapping obj1= new swapping();
obj1.swap(num1,num2);
}}