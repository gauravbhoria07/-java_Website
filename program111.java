class sum{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);

int arr1[];
arr1= new int[5];
for(int i=0; i<5;i++){
System.out.print("Enter value of "+i+" ");
String str1= br.readLine();
int x = Integer.parseInt(str1);
arr1[i]=x;
}
int even=0; int odd=0;
for(int i=0;i<5;i++){
if(arr1[i]%2==0){even= even+arr1[i];}
else{odd=odd+arr1[i];}
}
System.out.println("Sum of even numbers is: "+even);
System.out.println("Sum of odd numbers is: "+odd);
}}