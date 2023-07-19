import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Main extends JFrame {
    Main() {
        setTitle("진동하는 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyThread th = new MyThread(this);
        th.start();
        setSize(500, 500);
        setVisible(true);
    }

    class MyThread extends Thread {
        JFrame frame;
        int x = 300;
        public MyThread(JFrame jf) {
            this.frame = jf;
        }

        public void run() {
            while(true) {
                if(x == 300) x += 3;
                else x -= 3;
                frame.setLocation(x, 500);
                try {
                    Thread.sleep(100);
                }catch(InterruptedException ex) {
                    return;
                }
            }
        }
    }
    static public void main(String[] args) {
        new Main();
    }
}
