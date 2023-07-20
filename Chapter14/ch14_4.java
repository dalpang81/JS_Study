import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    public Main() {
        setTitle("숫자가 아닌 키가 입력되는 경우 경고창 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        JToolBar tBar = new JToolBar();
        JTextField textField = new JTextField();
        textField.addKeyListener(new MyKeyAdapter());
        tBar.add(textField);
        c.add(tBar, BorderLayout.SOUTH);
        setSize(400, 400);
        setVisible(true);
    }

    class MyKeyAdapter extends KeyAdapter {
        public void keyTyped(KeyEvent e) {
            char key = e.getKeyChar();
            if(!Character.isDigit(key)) {
                e.consume();
                JOptionPane.showMessageDialog(null, key + "는 숫자 키가 아닙니다. 숫자를 입력하세요.", "경고", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}