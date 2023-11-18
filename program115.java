class largeandsmall{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
int n2=0; int j=0; int count=0;
int arr1[];
arr1= new int[10];
do{
count++;
System.out.print("enter number: ");
String str= br.readLine();
int n1= Integer.parseInt(str);
arr1[j]=n1;
j++;
System.out.println("\nDo you want to enter again? [1.yes/ 2.No]");
String str1= br.readLine();
n2= Integer.parseInt(str1);}
while(n2==1);
int key= arr1[0];
for(int i=1;i<count;i++){
if(key<arr1[i]){
key= arr1[i];}
}
System.out.println("Maximum number in array is: "+key);
int key1= arr1[0];
for(int i=1;i<count;i++){
if(key1>arr1[i]){
key1= arr1[i];}
}
System.out.println("Minimum number in array is: "+key1);
}}
