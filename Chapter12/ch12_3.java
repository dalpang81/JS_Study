import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private ImageIcon appleIcon = new ImageIcon("images/1.jpg");
    private JLabel appleLabel = new JLabel(appleIcon);

    public Main() {
        setTitle("이미지 레이블 드래깅 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        appleLabel.setLocation(50, 50);
        appleLabel.setSize(appleIcon.getIconWidth(), appleIcon.getIconHeight());
        c.add(appleLabel);

        appleLabel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Point p = e.getPoint();
                appleLabel.setLocation(p);
            }
        });

        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}