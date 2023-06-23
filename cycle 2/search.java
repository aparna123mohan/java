import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        int i,j,x=0;
        boolean state = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("APARNA MOHAN");
        System.out.println("SJC22MCA-2013");
        System.out.println("12-4-2023");
        System.out.println(""); 
        System.out.println("Enter the number of elemets in array");
        int num=sc.nextInt();
        String word[]=new String[num];
        sc.nextLine();
        for( i=0;i<num;i++){
        System.out.println("\nEnter a Word\n");
        word[i]=sc.nextLine();
        }
        System.out.println("Enter the element to Search");
        String search = sc.nextLine();
        for( i=0;i<num;i++){
            if(word[i].equals(search)){
                 x = i;
                state = true;
            }
            }
            if(state){
        System.out.println("Element found at  position = "+x);
            }
            else{
        System.out.println("Element found not found");

            }
    }
    
}


