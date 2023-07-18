import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        setTitle("마우스 올리기 내리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel label = new JLabel("사랑해");
        label.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JLabel temp = (JLabel) e.getSource();
                temp.setText("Love Java");
            }

            public void mouseExited(MouseEvent e) {
                JLabel temp = (JLabel)e.getSource();
                temp.setText("사랑해");
            }
        });


        label.setSize(50, 20);
        label.setLocation(30, 30);
        c.add(label);

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}