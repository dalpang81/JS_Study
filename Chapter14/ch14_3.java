import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    public Main() {
        setTitle("툴바 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        JToolBar tBar = new JToolBar();
        JButton btn = new JButton("종료");
        btn.addActionListener(new CloseActionListener());
        tBar.add(btn);
        c.add(tBar, BorderLayout.NORTH);
        setSize(400, 400);
        setVisible(true);
    }

    class CloseActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int result = JOptionPane.showConfirmDialog(null, "정말 종료하시겠습니까", "옵션팬", JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.CLOSED_OPTION)
                return;
            else if (result == JOptionPane.YES_OPTION)
                System.exit(0);
            else
                return;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}