import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        setTitle("드래깅동안 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.GREEN);

        c.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Container contentPane = (Container)e.getSource();
                contentPane.setBackground(Color.YELLOW);
            }


        });

        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                Container contentPane = (Container)e.getSource();
                contentPane.setBackground(Color.GREEN);
            }
        });

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}