class searcharray{
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
System.out.println("\nEnter element to search: ");
String str2= br.readLine();
int y = Integer.parseInt(str2);
int count=0;
for(int i=0;i<5;i++){
if(y==arr1[i]){
System.out.println(y+" element has found in array at position "+i);
count++;
break;}}
if(count==0){System.out.println(y+" element has not been found in array  ");}
}}