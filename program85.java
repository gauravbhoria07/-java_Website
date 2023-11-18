class findvalarray{
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
int count=0;
System.out.println("Entered array element to find : ");
String str2= br.readLine();
int num1 = Integer.parseInt(str2);
for(int i =0; i<n;i++){
count++;
if(arr1[i]==num1){
System.out.print("\n The given element exist in the array");
break;}
else{
if(count==n){System.out.print("\n The given element does not exist in the array");}
}
} 
}}