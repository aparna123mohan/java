public class product
{
int pcode;
int price;

String pname;

   void getdata(int p1,String p2,int p3)
   {
      
      pcode = p1;
      pname = p2;
      price = p3;
      
   }
 public static void main(String[]args)
 
   {
 System.out.println("Name : APARNA MOHAN");
 System.out.println("Reg no : SJC 22MCA-2013");
 System.out.println("Course code : 20MCA132");
 System.out.println("Date : 24/3/2023");
 int smallest;
 
 product ob1 = new product();
 product ob2 = new product();
 product ob3 = new product();
 
  ob1.getdata(3243,"Dell inspiron",57000);
  ob2.getdata(3654,"Lenova",33000);
  ob3.getdata(3875,"asus",90000);
  
 if(ob1.price<ob2.price)
 {
 if(ob3.price<ob1.price)
 {
 smallest = ob3.price;
 }
 else
 {
 smallest = ob1.price;
 }
 }
 else
 {
 if (ob2.price<ob3.price)
 {
 smallest = ob2.price;
 }
 
 else
 {
 
 smallest = ob3.price;
 }
 }
 
 System.out.println(smallest+"is the cheapest.");
 }
 }
