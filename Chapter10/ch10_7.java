import java.awt.*;
import java.awt.event.*;
import java.security.Key;
import javax.swing.*;

public class Main extends JFrame {
    int size = 10;

    public Main() {
        setTitle("마우스 휠을 굴려 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        c.setBackground(Color.GRAY);

        JLabel label = new JLabel("Love Java");
        label.setFont(new Font("Arial", Font.PLAIN, size));

        label.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int n = e.getWheelRotation();
                if(n < 0) {
                    size -= 5;
                    label.setFont(new Font("Arial", Font.PLAIN, size));
                }

                else {
                    size += 5;
                    label.setFont(new Font("Arial", Font.PLAIN, size));
                }
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