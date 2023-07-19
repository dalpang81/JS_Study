import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Main extends JFrame {
    Main() {
        setTitle("디지탈 시기ㅖ 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.add(new MyLabel());
        setSize(400, 300);
        setVisible(true);
    }

    class MyLabel extends JLabel implements Runnable {
        Thread timerThread;
        MyLabel() {
            setText(makeClockText());
            setFont(new Font("Gothic", Font.PLAIN, 70));
            setHorizontalAlignment(JLabel.CENTER);
            timerThread = new Thread(MyLabel.this);
            timerThread.start();
        }

        String makeClockText() {
            Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int min = c.get(Calendar.MINUTE);
            int second = c.get(Calendar.SECOND);

            String clockText = Integer.toString(hour);
            clockText = clockText.concat(":");
            clockText = clockText.concat(Integer.toString(min));
            clockText = clockText.concat(":");
            clockText = clockText.concat(Integer.toString(second));
            return clockText;
        }

        public void run() {
            while(true) {
                try {
                    Thread.sleep(1000);
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
                finally {
                    setText(makeClockText());
                }
            }
        }
    }
    static public void main(String[] args) {
        new Main();
    }
}
