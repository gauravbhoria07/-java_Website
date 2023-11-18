class countword{
public static void main(String st[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
int word=1;
System.out.println("Enter any string: ");
String str1= br.readLine();
System.out.println("Entered string is: "+str1);
for(int i=0; i<str1.length(); i++){
if((str1.charAt(i) == ' ') && (str1.charAt(i+1)!= ' ')){word++;}}
System.out.println("Number of words in string is: "+word);
}}