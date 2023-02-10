import java.util.*;
import java.io.*;
class sumoffib
{
public static void main(String args[])
{
 
Scanner sc=new Scanner(System.in);
int sum=0;
System.out.println("enter the number");
int n=sc.nextInt();
int fib[]=new int[2 * n+1];
fib[0]=0;
fib[1]=1;
for(int i=2;i<=2*n;i++)
{
fib[i]=fib[i-1]+fib[i-2];

if (i%2==0)
{
sum+=fib[i];}
}
System.out.printf("sum of fib %d and %d",n,sum);
}
}