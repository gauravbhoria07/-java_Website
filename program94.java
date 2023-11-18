class minarray{
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
int key= arr1[0]; 
int key1= arr1[0]; int index=0;
for(int i=1;i<5;i++){
if(key>arr1[i]){
key= arr1[i];}
}

for(int i=1;i<5;i++){
if(key==arr1[i]){
index=i;
break;}
}
for(int i=1;i<5;i++){
if(i!=index){
if(key1>arr1[i]){
key1= arr1[i];}
}}
System.out.println("Second Minimum number in array is: "+key1);
}}