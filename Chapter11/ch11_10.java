import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.*;

public class Main extends JFrame {
    int count = 0;
    public Main() {
        setTitle("Ten 레이블 클릭");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel[] labels = new JLabel[10];
        JPanel panel = new JPanel();

        panel.setLayout(null);

        for(int i = 0; i < labels.length; i++)
        {
            int x = (int)(Math.random() * 300);
            int y = (int)(Math.random() * 300);

            labels[i] = new JLabel();
            labels[i].setText(Integer.toString(i));
            labels[i].setSize(15, 15);
            labels[i].setLocation(x, y);
            labels[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    JLabel temp = new JLabel();
                    temp = (JLabel) e.getSource();
                    if(Integer.parseInt(temp.getText()) <= Integer.parseInt(labels[count].getText())) {
                        temp.setVisible(false);
                        count++;
                        if(Integer.parseInt(temp.getText()) == 9) {
                            for(int i = 0; i < labels.length; i++) {
                                int x = (int)(Math.random() * 300);
                                int y = (int)(Math.random() * 300);
                                labels[i].setLocation(x, y);
                                labels[i].setVisible(true);
                            }
                        }
                    }
                }
            });
            labels[i].setForeground(Color.MAGENTA);
            panel.add(labels[i]);
        }

        this.add(panel);

        setSize(350, 350);
        setVisible(true);
    }



    public static void main(String[] args) {
       new Main();
    }
}