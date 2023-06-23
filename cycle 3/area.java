import java.util.Scanner;

public class area {
      
      public static void main(String[] args){
      int s,sa,l,b,ra,cl,cb,ch,ca;
      Scanner sc= new Scanner(System.in);
      
      System.out.println("Name : APARNA MOHAN");
        System.out.println("Reg no : SJC 22MCA-2013");
        System.out.println("Course code : 20MCA132");
        System.out.println("Date : 5/6/2023");

      System.out.println("Enter side of square : ");
      s=sc.nextInt();
      sa=Square(s);
      
      System.out.println("Enter length,breadth of rectangle : ");
      l=sc.nextInt();
      b=sc.nextInt();
      ra=Square(l,b);

      System.out.println("Enter length,breadth,height of cuboid : ");
      cl=sc.nextInt();
      cb=sc.nextInt();
      ch=sc.nextInt();
      ca=Square(cl,cb,ch);
      
      System.out.println("Area of square ->"+sa);
      System.out.println("Area of rectangle ->"+ra);
      System.out.println("Area of cuboid ->"+ca);
      }

public static int Square(int x)
{
      int a;
      a=x*x;
      return a;
      }
      
public static int Square(int x,int y)
{

      int a;
      a=x*y;
      return a;
      }
 
 public static int Square(int x,int y,int z)
{

      int a;
      a=2*(x*y)+2*(x*z)+2*(y*z);
      return a;
      } 
      }    
      
