class addarray{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.println("enter values of array1: ");
int arr1[][];
arr1= new int[2][2];
for(int i=0; i<2;i++){
for(int j=0; j<2;j++){
System.out.print("Enter value of "+i+j+" ");
String str1= br.readLine();
int x = Integer.parseInt(str1);
arr1[i][j]=x;
}}
System.out.println("\nenter values of array2: ");
int arr2[][];
arr2= new int[2][2];
for(int i=0; i<2;i++){
for(int j=0; j<2;j++){
System.out.print("Enter value of "+i+j+" ");
String str2= br.readLine();
int y = Integer.parseInt(str2);
arr2[i][j]=y;
}}
System.out.println("\noriginal array1: ");
for(int i=0; i<2;i++){
for(int j=0; j<2;j++){
System.out.print("\t"+arr1[i][j]);}
System.out.print("\n");}
System.out.println("\noriginal array2: ");
for(int i=0; i<2;i++){
for(int j=0; j<2;j++){
System.out.print("\t"+arr2[i][j]);}
System.out.print("\n");}
System.out.println("\nAddition of array is: ");
int arr3[][];
arr3= new int[2][2];
for(int i=0; i<2;i++){
for(int j=0; j<2;j++){

arr3[i][j]= arr1[i][j] + arr2[i][j];}
}
for(int i=0; i<2;i++){
for(int j=0; j<2;j++){
System.out.print("\t"+arr3[i][j]);}
System.out.print("\n");}
}}