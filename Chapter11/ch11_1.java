import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        setTitle("CheckBox Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JCheckBox Enable = new JCheckBox("버튼 비활성화");
        JCheckBox Visible = new JCheckBox("버튼 감추기");
        JButton btn = new JButton("test button");

        c.add(Enable);
        c.add(Visible);
        c.add(btn);

        Enable.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED)
                    btn.setEnabled(false);
                else btn.setEnabled(true);
            }
        });

        Visible.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED)
                    btn.setVisible(false);
                else btn.setVisible(true);
            }
        });

        setSize(250, 150);
        setVisible(true);
    }


    public static void main(String[] args) {
       new Main();
    }
}