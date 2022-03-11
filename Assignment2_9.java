import java.util.*;
class Assignment2_9
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  double a=sc.nextDouble();
  double b=sc.nextDouble();
  double c=sc.nextDouble();
  double d=sc.nextDouble();
  double result=((a*b-b*b)/(c-d));
  System.out.println("Result is "+result);
 }
}