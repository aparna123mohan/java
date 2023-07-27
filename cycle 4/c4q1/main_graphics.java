import package_graphics.*;
import java.util.*;

public class main_graphics 
{

public static void main(String []args)
{

System.out.println("Name : APARNA MOHAN");
        System.out.println("Reg no : SJC 22MCA-2013");
        System.out.println("Course code : 20MCA132");
        System.out.println("Date : 23/6/2023");

package_graphics testObj = new package_graphics();

int l,h,r,a,c,d;

Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the length for rectangle");
	l=s.nextInt();
	System.out.println("Enter the breadth for rectangle");
	h=s.nextInt();
	System.out.println("Enter the radius of circle");
	r=s.nextInt();
	System.out.println("Enter the side for Square");
	a=s.nextInt();
	System.out.println("Enter the breadth for triangle");
	c=s.nextInt();
	System.out.println("Enter the height for triangle");
	d=s.nextInt();
	
	System.out.println(" Area of rectangle= "+testObj.recArea(l,h));
	System.out.println(" Area of circle= "+testObj.cirArea(r));
	System.out.println(" Area of square= "+testObj.squArea(a));
	System.out.println(" Area of triangle= "+testObj.triArea(c,d));

}
}
