import java.util.*;
class Assignment2_11
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  final double pi=3.1416;
  System.out.println("Enter radius of circle ");
  double r=sc.nextFloat();
  double area=(pi*r*r);
  double p=(pi*2*r);
  System.out.println("Area of circle is "+area);
  System.out.println("Perimeter of circle is "+p);
 }
 


}
