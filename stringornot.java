import java.util.*;
class stringornot{
public static void main(String[] args){
Scanner s1=new Scanner(System.in);
System.out.println("Enter a string:");
String ch=s1.nextLine();
Scanner s2=new Scanner(System.in);
System.out.println("Enter a character:");
char f=s2.next().charAt(0);
int a=ch.length();
for(int i=0;i<a;i++){
if((ch.charAt(i) == f)){
System.out.println("f is found in string:"+i+1);
}
else{
System.out.println("not found");
}
}
}
}