class transposematrix{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);

int arr1[][];
arr1= new int[3][3];
int arr2[][];
arr2= new int[3][3];
for(int i=0; i<3;i++){
for(int j=0; j<3;j++){
System.out.print("Enter value at "+i+j+" ");
String str1= br.readLine();
int x = Integer.parseInt(str1);
arr1[i][j]=x;
}}
System.out.println("\nEntered array is: ");
for(int i=0; i<3;i++){
for(int j=0; j<3;j++){
System.out.print("\t"+arr1[i][j]);}
System.out.print("\n");}
System.out.println("\nTranspose array is: ");
for(int i=0; i<3;i++){
for(int j=0; j<3;j++){
arr2[i][j]= arr1[j][i];}}
for(int i=0; i<3;i++){
for(int j=0; j<3;j++){
System.out.print("\t"+arr2[i][j]);}
System.out.print("\n");}
}}