class commonarray{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter size of array1: "); 
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


System.out.print("Enter size of array2: "); 
String str2= br.readLine();
int n1 = Integer.parseInt(str2);
int arr2[];
arr2= new int[n1];
for(int i=0; i<n1;i++){
System.out.print("Enter value of "+i+" ");
String str3= br.readLine();
int x = Integer.parseInt(str3);
arr2[i]=x;
}

System.out.println("original array1 is: ");
for(int y: arr1){
System.out.print("\t"+y);}
System.out.println("\noriginal array2 is: ");
for(int z: arr2){
System.out.print("\t"+z);}
System.out.println("\ncommon element between 2 array is: ");
if(n>=n1){
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(arr1[i]==arr2[j]){
System.out.print("\t"+arr1[i]);}
}}}
else{
for(int i=0;i<n1;i++){
for(int j=0;j<n1;j++){
if(arr1[i]==arr2[i]){
System.out.print("\t"+arr1[i]);}}}
}}}
