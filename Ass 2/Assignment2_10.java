import java.util.*;
class Assignment2_10
{
 public static void main(String args[])
 {  
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a");
   double a=sc.nextDouble();
   System.out.println("Enter b");
   int b=sc.nextInt();
   System.out.println("Enter c");
   double c=sc.nextDouble();
   System.out.println("Enter d");
   int d=sc.nextInt();
   System.out.println("Enter e");
   int e=sc.nextInt();
   System.out.println("Enter f");
   int f=sc.nextInt();
   System.out.println("Enter g");
   int g=sc.nextInt();
   System.out.println("Enter h");
   int h=sc.nextInt();

   double result=a*(b-(c/d)+(c/e)-(c/f)+(c/g)-(c/h));
   System.out.println("Reault is "+result);
 }


}