import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for table: ");
        int tableNum = input.nextInt();
        System.out.println(1 + " * " + tableNum + " = " + tableNum * 1);
        System.out.println(2 + " * " + tableNum + " = " + tableNum * 2);
        System.out.println(3 + " * " + tableNum + " = " + tableNum * 3);
        System.out.println(4 + " * " + tableNum + " = " + tableNum * 4);
        System.out.println(5 + " * " + tableNum + " = " + tableNum * 5);
        System.out.println(6 + " * " + tableNum + " = " + tableNum * 6);
        System.out.println(7 + " * " + tableNum + " = " + tableNum * 7);
        System.out.println(8 + " * " + tableNum + " = " + tableNum * 8);
        System.out.println(9 + " * " + tableNum + " = " + tableNum * 9);
        System.out.println(10 + " * " + tableNum + " = " + tableNum * 10);
    }
}
