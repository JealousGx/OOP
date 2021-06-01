public class SmallestN {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");

        int smallestN = 0;

        while (smallestN * smallestN <= 12000) {
            while (smallestN * smallestN < 12000) {
                smallestN++;
            }
            System.out.println(smallestN);
        }
    }
}
