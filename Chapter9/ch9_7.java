import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    String[] str = {"CE", "계산", "+", "-", "x", "/"};

    public Calculator() {
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel north_panel = new JPanel();
        JPanel center_panel = new JPanel();
        JPanel south_panel = new JPanel();

        north_panel.setBackground(Color.GRAY);
        JLabel n_label = new JLabel("수식입력");
        JTextField textField = new JTextField(20);
        north_panel.add(n_label);
        north_panel.add(textField);

        center_panel.setBackground(Color.WHITE);
        center_panel.setLayout(new GridLayout(4, 4, 2, 2));
        for(int i = 0; i < 16; i++) {
            JButton button = new JButton();
            if(i < 10)
                button.setText(i + "");
            else
                button.setText(str[i - 10]);

            if(i > 11)
                button.setBackground(Color.cyan);

            center_panel.add(button);
        }

        south_panel.setBackground(Color.yellow);
        JLabel s_label = new JLabel("수식입력");
        JTextField s_textField = new JTextField(20);
        south_panel.add(s_label);
        south_panel.add(s_textField);

        c.add(north_panel, BorderLayout.NORTH);
        c.add(center_panel, BorderLayout.CENTER);
        c.add(south_panel, BorderLayout.SOUTH);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
