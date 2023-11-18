class countvowel{
public static void main(String st[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
int vowel=0;
System.out.println("Enter any string: ");
String str1= br.readLine();
System.out.println("Entered string is: "+str1);
for(int i=0; i<str1.length(); i++){
if((str1.charAt(i) == 'a') || (str1.charAt(i) == 'A') || (str1.charAt(i) == 'i') || (str1.charAt(i) == 'I') || 
(str1.charAt(i) == 'o') || (str1.charAt(i) == 'O') || (str1.charAt(i) == 'u') || (str1.charAt(i) == 'U') || (str1.charAt(i) == 'e') || (str1.charAt(i) == 'E'))
{vowel++;}}
System.out.println("Number of vowels in string is: "+vowel);
}}