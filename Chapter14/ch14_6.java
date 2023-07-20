import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class Main extends JFrame {
    JButton btn = new JButton("Calculate");
    JLabel label = new JLabel("계산 결과 출력");

    Main() {
        setTitle("다이얼로그 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(btn);
        c.add(label);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog dialog = new MyDialog();
                dialog.setVisible(true);
            }
        });
        setSize(300, 300);
        setVisible(true);
    }

    class MyDialog extends JDialog {
        JTextField tf1 = new JTextField(10);
        JTextField tf2 = new JTextField(10);
        JButton addBtn = new JButton("Add");
        MyDialog() {
            setLayout(new FlowLayout());
            add(new JLabel("두 수를 더합니다"));
            add(tf1);
            add(tf2);
            add(addBtn);
            setSize(200, 200);
            setTitle("Calculation Dialog");
            addBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int result = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText());
                    label.setText(Integer.toString(result));
                    setVisible(true);
                }
            });
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}