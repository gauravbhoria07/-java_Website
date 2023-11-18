class removehtmltag{

public static void main(String st[]) {
String str= "<body><p><b>this is first string</b></p></body>";
System.out.println(" original string is: "+ str);
str= str.replaceAll("\\<.*?\\>", "");
System.out.println("string after removing htmltags  is:  "+ str);
}}