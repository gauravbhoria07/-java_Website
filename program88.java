class reversearray{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter size of array: "); 
String str= br.readLine();
int n = Integer.parseInt(str);
int arr1[];
arr1= new int[n];
for(int i=0; i<n;i++){
System.out.print("Enter value of "+i+" ");
String str1= br.readLine();
int x = Integer.parseInt(str1);
arr1[i]=x;
}

System.out.println("original array is: ");
for(int y: arr1){
System.out.print("\t"+y);}

System.out.println("\nreverse array is: ");
for(int y=n-1;y>=0;y--){
System.out.print("\t"+arr1[y]);}
}}