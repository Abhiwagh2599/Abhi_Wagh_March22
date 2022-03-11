import java.util.*;
class DectoBin
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int r;
  String a="";  
  while(n>0)
  {r=n%8;
   a=a+r;  
   n=n/8;
  }
  System.out.println();   
 }

}