import java.util.*;
class alphaorder{
public static void main(String[] args){
Scanner s1=new Scanner(System.in);
System.out.println("Enter a string:");
String a=s1.nextLine();
int b=a.length();
for(int i=b-1;i>=0;i--){
System.out.println(a.charAt(i));
}
System.out.println();
}
}