import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Main extends JFrame {
    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.MAGENTA);
            int x = (int)(Math.random() * 180);
            int y = (int)(Math.random() * 180);
            g.drawOval(x, y, 50, 50);
        }
    }

    class MyThread extends Thread {
        MyPanel panel;
        public MyThread(MyPanel p) {
            panel = p;
        }
        public void run() {
            for(;;) {
                try {
                    sleep(400);
                    panel.repaint();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    Main() {
        MyPanel panel = new MyPanel();
        MyThread th = new MyThread(panel);
        setTitle("원을 0.5초 간격으로 이동하는 frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        panel.setLayout(null);
        panel.setOpaque(true);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                th.start();
            }
        });
        setVisible(true);
        setSize(300, 300);
    }
    static public void main(String[] args) {
        new Main();
    }
}
