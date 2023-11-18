class segregationofarray{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter size of array: "); 
String str= br.readLine();
int n = Integer.parseInt(str);
int arr1[];
arr1= new int[n];
for(int i=0; i<n;i++){
System.out.print("Enter value of "+i+" in 0 and 1 only ");
String str1= br.readLine();
int x = Integer.parseInt(str1);
arr1[i]=x;
}
int count=0;
System.out.println("original array1 is: ");
for(int y: arr1){
System.out.print("\t"+y);}

for(int i=0; i<n;i++){
if(arr1[i]==0){count++;}
}
for(int i=0; i<count;i++){
arr1[i]=0;}
for(int i=count; i<n;i++){
arr1[i]=1;}
System.out.println("\n array after segregation is: ");
for(int y: arr1){
System.out.print("\t"+y);}

}}
