import java.util.Scanner;

public class CheckCNIC {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("---------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter CNIC (DDDDD-DDDDDDD-D): ");
        String cnic = (String)(input.nextLine());

        if (cnic.charAt(5) == '-' && cnic.charAt(13) == '-')
                System.out.println(cnic + " is correct.");
        else 
                System.out.println("Invalid CNIC Input...");
        
    }
}
