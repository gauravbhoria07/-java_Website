class electricitybill{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter Total Units Consumed: ");
String s = br.readLine();
int total_units= Integer.parseInt(s);
for(int i =0;i<3;i++){
if(total_units == 0){break;}
else{
total_units= total_units-50;}
}
float a= 50*1.5f; float b= 50*2.5f; float c= 50*4.5f; 
float d= total_units*5.5f;
System.out.println("\n..........YOUR ELECTRICITY BILL IS.........");
System.out.println("UNITS  RATE  AMOUNT");
System.out.println("...................................");
System.out.println("50 x 1.5 = "+a);
System.out.println("50 x 2.5 = "+b);
System.out.println("50 x 4.5 = "+c);
System.out.println(total_units+" x 5.5 = "+d);
System.out.println("...................................");
System.out.println("TOTAL AMOUNT TO BE PAID IS: "+(a+b+c+d));
System.out.println("...................................");
}}
