import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        setTitle("Left 키로 문자열 교체");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.GRAY);

        JLabel label = new JLabel("Love Java");
        c.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_LEFT) {
                    String text = label.getText();
                    if(text.equals("Love Java"))
                        label.setText("avaJ evoL");
                    else
                        label.setText("Love Java");
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