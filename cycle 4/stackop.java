import java.util.Scanner;
public class Stackop {
    int top=-1,ch,item,i;
    int a[] = new int[10];
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      Stackop  obj = new Stackop ();
        obj.stack();
        }

    public void stack(){
    System.out.println("Name : APARNA MOHAN");
        System.out.println("Reg no : SJC 22MCA-2013");
        System.out.println("Course code : 20MCA132");
        System.out.println("Date : 27/6/2023");
     System.out.println("Enter the size of the array:");
            int N=sc.nextInt();
    
        while(ch<3) {
           
            System.out.println("Choose : ");
            System.out.println("\n 1.push \n 2.pop \n 3.exit \n");
            System.out.println("\n Enter your choice:");
            ch=sc.nextInt();
        switch(ch){
        case 1:
            System.out.println("Enter the element to be inserted:");
            item=sc.nextInt();
            if(top==N-1) {
                System.out.println("stack overflow!");
            }
            else {
                top++;
                a[top]=item;
            }
            break;
        case 2:
            if(top==-1) {
                System.out.println("stack is empty");
            }
            else {
                item=a[top];
                top--;
                System.out.println("deleted element is:" +item);
            }
            break;
        case 3 : break;
        default : System.out.println("\n Invalid choice");
        }
        if(top < 0){
        System.out.println("\n stack is empty");
           }
        else{
        System.out.println("\n stack is \n");
        for(i=top;i>=0;i--){
        System.out.println(a[i]);
                }
          }
        }
    }
}
