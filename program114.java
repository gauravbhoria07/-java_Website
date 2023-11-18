class countnumbers{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
int n2=0;
int positive=0; int negative=0; int zero=0;
do{
System.out.print("enter number: ");
String str= br.readLine();
int n1= Integer.parseInt(str);
if(n1>0){positive++;}
else if(n1<0){negative++;}
else{zero++;}
System.out.println("\nDo you want to enter again? [1.yes/ 2.No]");
String str1= br.readLine();
n2= Integer.parseInt(str1);}
while(n2==1);
System.out.println("count of eneterd numbers is:\n positive=  "+positive+" \n negative= "+negative+"\n zero= "+zero);
}}
