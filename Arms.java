import java.util.*;
class Arms
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int r;
  int temp=n;
  int res=0; 
 while(n>0)
  { 
   r=n%10; 
   res=res+(r*r*r);
   n=n/10; 
  }
 if(temp==res)
  System.out.println("Armstrong number");
 else
  System.out.println("Not a armstrong number"); 
 }



}