import java.util.*;
class Assignment2_13
{
 public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter width of retangle ");
  float l=sc.nextFloat();
  System.out.println("Enter height of retangle ");
  float b=sc.nextFloat();
  float area=(l*b);   
  float p=(2*(l+b));
  System.out.println("Area of rectangle is "+area);
  System.out.println("Perimeter of rectangle is "+p);
 }
}