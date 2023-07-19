import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    ImageIcon img = new ImageIcon("images/1.jpg");
    Image nImg = img.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    ImageIcon rImg = new ImageIcon(nImg);

    MyThread th;
    class MyThread extends Thread {
        int x, y;
        JLabel label = new JLabel(rImg);
        MyThread(Container c, MouseEvent e) {
            x = e.getX();
            y = e.getY();
            label.setLocation(x, y);
            label.setSize(30, 30);
            c.add(label);
            repaint();
        }

        public void run() {
            while(true) {
                try {
                    y -= 5;
                    label.setLocation(x, y);
                    if(label.getY() + label.getHeight() < 0) {
                        return;
                    }
                    repaint();
                    Thread.sleep(200);
                } catch(InterruptedException e) {
                    return;
                }
            }
        }
    }

    Main() {
        setTitle("버블 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                th = new MyThread(c, e);
                th.start();
            }
        });
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}