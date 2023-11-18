class distance{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.println("ENTER Coordinates of first point: ");
System.out.print("ENTER x1: ");
String s = br.readLine();
int x1= Integer.parseInt(s);
System.out.print("\nENTER x2: ");
String s1 = br.readLine();
int x2= Integer.parseInt(s1);
System.out.println("\nENTER Coordinates of second point: ");
System.out.print("ENTER y1: ");
String s2 = br.readLine();
int y1= Integer.parseInt(s2);
System.out.print("\nENTER y2: ");
String s3 = br.readLine();
int y2= Integer.parseInt(s3);
int valx= (x2-x1) * (x2-x1);
int valy= (y2-y1) * (y2-y1);
double distance= Math.sqrt(valx + valy);
System.out.println("Distance between two points is: "+ distance);
}}
