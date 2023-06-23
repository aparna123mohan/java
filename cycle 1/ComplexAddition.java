import java.util.Scanner;

public class ComplexAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = input.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = input.nextDouble();
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = input.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = input.nextDouble();

        double realResult = real1 + real2;
        double imaginaryResult = imaginary1 + imaginary2;
        
        System.out.println("Name : APARNA MOHAN");
        System.out.println("Reg no : SJC 22MCA-2013");
        System.out.println("Course code : 20MCA132");
        System.out.println("Date : 24/3/2023");
        
        System.out.println("The sum of the two complex numbers is: " + realResult + " + " + imaginaryResult + "i");
    }
}
