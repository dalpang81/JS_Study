import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        setTitle("JTextField and JComboBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JTextField textField = new JTextField(15);
        JComboBox<String> strCombo = new JComboBox<>();

        c.add(textField);
        c.add(strCombo);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField)e.getSource();
                strCombo.addItem(t.getText());
                t.setText("");
            }
        });

        setSize(300, 200);
        setVisible(true);
    }


    public static void main(String[] args) {
       new Main();
    }
}