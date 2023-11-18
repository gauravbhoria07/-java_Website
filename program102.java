class sortname{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);

String arr1[];
arr1= new String[5];
for(int i=0; i<5;i++){
System.out.print("Enter name at "+i+" ");
arr1[i]= br.readLine();
}
System.out.println("\nArray after sorting in alphabetical order: ");
for(int i=0;i<5;i++){
for(int j=0;j<5-i-1;j++){
if(arr1[j].compareTo(arr1[j+1]) > 0){
String n= arr1[j];
arr1[j]=arr1[j+1];
arr1[j+1]= n;
}}}
for(int i=0;i<5;i++){
System.out.print("\t"+ arr1[i]);
}}}