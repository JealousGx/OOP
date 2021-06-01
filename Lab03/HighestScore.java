import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);

        int highestScore = 0;
        String highestScoreName = "";
        System.out.print("Enter total number of students (0-30): ");
        int totalStudents = input.nextInt();

        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter student#" + (i + 1) + "'s name: ");
            String studentName = input.next();

            System.out.print("Enter " + studentName + "'s score: ");
            int studentScore = input.nextInt();

            if (studentScore > highestScore) {
                highestScore = studentScore;
                highestScoreName = studentName;
            }
            else
                continue;
        }
        System.out.println("Student with the highest score " + highestScore + " is: " + highestScoreName);
    }
}
