import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Main extends JFrame {
    Main() {
        setTitle("진동하는 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        MyThread th = new MyThread();
        c.add(th);
        setSize(500, 500);
        setVisible(true);
    }

    class MyThread extends JLabel implements Runnable {
        int x = 250;
        public MyThread() {
            setText("진동 레이블");
            setLocation(250, 200);
            setFont(new Font("Gothic", Font.PLAIN, 30));
            Thread th = new Thread(this);
            th.start();
        }

        public void run() {
            while(true) {
                if(x == 250) x += 3;
                else x -= 3;
                this.setLocation(x, 200);
                try {
                    Thread.sleep(100);
                }
                catch(InterruptedException e) {
                    return;
                }
            }
        }
    }

    static public void main(String[] args) {
        new Main();
    }
}
