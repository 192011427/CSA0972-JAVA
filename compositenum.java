import java.util.*;
import java.util.Scanner;
class compositenum {
public static void main(String[] args)
{
try
{
Scanner input=new Scanner(System.in); 
System.out.print("Enter the number a:");
int a=input.nextInt();
System.out.print("Enter the number b:"); 
int b=input.nextInt(); 
for(int i=a+1;i<b;i++) 
{     
int c=0;     
for(int j=1;j<b;j++)     
{         
if(i%j==0)             
c++;     
}     
if(c>2)         
System.out.print(i+" "); 
}
}
catch(Exception e)
{
System.out.println(" enter valid");
}
}}