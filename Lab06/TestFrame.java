import javax.swing.*;
public class TestFrame {
  public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("Author: JealousGx");
        System.out.println("------------------");
        JFrame frame1 = new JFrame();
        frame1.setTitle("Window 1");
        frame1.setSize(250, 200);
        frame1.setLocation(200, 100);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

        JFrame frame2 = new JFrame();
        frame2.setTitle("Window 2");
        frame2.setSize(250, 200);
        frame2.setLocation(410, 100);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
    }
}
