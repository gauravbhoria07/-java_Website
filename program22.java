class countevenodd{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter size of array: "); 
String str= br.readLine();
int n = Integer.parseInt(str);
int even=0; int odd=0;
int arr1[];
arr1= new int[n];
for(int i=0; i<n;i++){
System.out.print("Enter value of "+i);
String str1= br.readLine();
int x = Integer.parseInt(str1);
arr1[i]=x;
}
System.out.print("Entered array is: ");
for(int i=0; i<n;i++){
System.out.print("\t"+arr1[i]);
} 
for(int i=0; i<n;i++){
if(arr1[i]%2 == 0){even++;}
else{odd++;}}
System.out.println("\n Even numbers= "+even);
System.out.println("\n Odd numbers= "+odd);
}}
