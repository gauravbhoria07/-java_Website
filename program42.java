class vowel{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter a string: ");
String s = br.readLine();
for(int i=0; i< s.length(); i++){
if( (s.charAt(i)=='a' || s.charAt(i)=='A') ||  (s.charAt(i)=='e' || s.charAt(i)=='E') || (s.charAt(i)=='i' || s.charAt(i)=='I')
 || (s.charAt(i)=='o' ||s.charAt(i)== 'O') || (s.charAt(i)=='u' || s.charAt(i)=='U') ){
System.out.println("\n"+s.charAt(i)+ " is vowel");}
else{
System.out.println("\n"+s.charAt(i)+ "  is consonant");}
}
}}