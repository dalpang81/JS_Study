import java.awt.*;
import java.awt.event.*;
import java.security.Key;
import javax.swing.*;

public class Main extends JFrame {
    int size = 10;

    public Main() {
        setTitle("클릭 연습 용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        JLabel label = new JLabel("C");
        label.setSize(10, 10);
        label.setLocation(100, 100);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                label.setLocation((int)Math.random()* 500, (int)Math.random() * 500);
            }
        });



        c.add(label);
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}