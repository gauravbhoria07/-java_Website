class swaparray{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter size of array: "); 
String str= br.readLine();
int n = Integer.parseInt(str);
int arr1[];
int arr2[];
arr1= new int[n];
arr2= new int[n];
for(int i=0; i<n;i++){
System.out.print("Enter value of "+i);
String str1= br.readLine();
int x = Integer.parseInt(str1);
arr1[i]=x;
}
System.out.print("Entered array is: ");
for(int i=0; i<n;i++){
System.out.print("\t"+arr1[i]);
} 
System.out.println("\narray after swapping is: ");
arr2[0]= arr1[n-1]; 
arr2[n-1]= arr1[0];
for(int i=1; i<n-1;i++){
arr2[i]= arr1[i];}
for(int i=0; i<n;i++){
System.out.print("\t"+arr2[i]);
} 
}}