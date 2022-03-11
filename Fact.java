import java.util.*;
class Fact
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number");
 int n=sc.nextInt();
 int fact=1;
 for(int i=1;i<=n;i++)
 {
     fact=i*fact;   
 }
 System.out.println("factorial of number is "+fact);
 
 }




}