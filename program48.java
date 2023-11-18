class battingavg{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("ENTER TOTAL NUMBER OF RUNS: ");
String s = br.readLine();
int runs= Integer.parseInt(s);
System.out.print("\nENTER TOTAL NUMBER OF DISMISSALS: ");
String s1 = br.readLine();
int dis= Integer.parseInt(s1);
float battingavg= runs/dis;
System.out.println("BATTING AVERAGE IS: "+ battingavg);
}}
