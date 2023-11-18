class sumarray{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter size of array: "); 
String str= br.readLine();
int n = Integer.parseInt(str);
int sum=0;
int arr1[];
arr1= new int[n];
for(int i=0; i<n;i++){
System.out.print("Enter value of "+i+" ");
String str1= br.readLine();
int x = Integer.parseInt(str1);
arr1[i]=x;
}
System.out.println("Entered array is: ");
for(int x : arr1){
System.out.print("\t"+x);
} 
System.out.print("\nSum of array is: ");
for(int x : arr1){
sum= sum+x;}
System.out.println(sum);
}}