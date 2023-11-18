class Ascarray{
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
System.out.println("\nArray after sorting in ascending order: ");
for(int i=0;i<5;i++){
for(int j=0;j<5-i-1;j++){
if(arr1[j]>arr1[j+1]){
int n= arr1[j];
arr1[j]=arr1[j+1];
arr1[j+1]= n;
}}}
for(int i=0;i<5;i++){
System.out.print("\t"+ arr1[i]);
}}}