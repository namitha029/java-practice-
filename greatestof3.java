import java.util.*;
class greatestof3{
public static void main(String arg[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number");
  int num1=sc.nextInt();
  System.out.println("Enter second number");
  int num2=sc.nextInt();
  System.out.println("Enter third number");
  int num3=sc.nextInt();

if(num1>num2)
{
     if(num1>num3)
     {
        System.out.println(num1+"is the biggest");
     } 
     else
     {
        System.out.println(num3+"is the biggest");
     }

}
else
{
      if(num2>num3)
           {
                System.out.println(num2+"is the biggest");
           }
           else
           {
                System.out.println(num3+"is the biggest");

           }

}
}
}