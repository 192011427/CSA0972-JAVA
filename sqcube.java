import java.util.Scanner;
class sqcube {
public static void main(String[] args)
{
try
{
Scanner input=new Scanner(System.in);
System.out.print("Enter the number: ");
float n=input.nextFloat();
System.out.println("square: "+(n*n));
System.out.println("cube: "+(n*n*n));
}
catch(Exception e)
{
System.out.println(" enter valid");
}
}}