import java.awt.*;
import java.awt.event.*;
import java.security.Key;
import javax.swing.*;

public class Main extends JFrame {
    int size = 10;

    public Main() {
        setTitle("+, - 키로 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.GRAY);

        JLabel label = new JLabel("Love Java");
        label.setFont(new Font("Arial", Font.PLAIN, size));
        c.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ADD || e.getKeyCode() == KeyEvent.VK_EQUALS) {
                    size += 5;
                    label.setFont(new Font("Arial", Font.PLAIN, size));
                }

                else if(e.getKeyCode() == KeyEvent.VK_MINUS) {
                    size -= 5;
                    label.setFont(new Font("Arial", Font.PLAIN, size));
                }

            }
        });

        c.add(label);
        c.setFocusable(true);
        c.requestFocus();
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}