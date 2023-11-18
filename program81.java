class countlines{
public static void main(String st[]){
String str= "this is first line\nthis is second line\nthis is third line\nthis is fourth line\n";
int count= str.split("[\n]").length;
System.out.println("Entered string is: "+str);
System.out.println("Total number of lines are: "+count);
}}