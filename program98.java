class cyclicallyrotation{
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

System.out.println("original array1 is: ");
for(int y: arr1){
System.out.print("\t"+y);}
int j=0;
int arr2[];
arr2= new int[n];
arr2[j]=arr1[n-1];
j++;
for(int i=0; i<n-1;i++){
arr2[j]=arr1[i];
j++;
}

System.out.println("\n array after cyclically rotation by one is: ");
for(int y: arr2){
System.out.print("\t"+y);}

}}
