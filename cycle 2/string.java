import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        System.out.println("Enter The String");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
         System.out.println("Aparna Mohan");
        System.out.println("SJC22MCA-2013");
        System.out.println("12-4-2023");
        
        System.out.println(""); 
        System.out.println("Length of String = "+str1.length());
        System.out.println("Character at First position  = "+str1.charAt(1));
        System.out.println("String Contains 'Col' sequence :"+str1.contains("Col"));
        System.out.println("String ends with e : "+str1.endsWith("e"));
        System.out.println("Replace'col' with 'kol' : "+str1.replaceAll("Col","kol"));
        System.out.println("LOWERCASE : "+str1.toLowerCase());
        System.out.println("UPPERCASE : "+str1.toUpperCase());
}
}

