class indexarray{
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
System.out.println("Entered array element to find index: ");
String str2= br.readLine();
int num1 = Integer.parseInt(str2);
for(int i =0; i<n;i++){
if(arr1[i]==num1){
System.out.print("\n Index of given element is: "+i);}
} 
}}