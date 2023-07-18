import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main extends JFrame {
    public Main() {
        setTitle("TextArea Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JTextArea ta = new JTextArea(5, 30);
        JSlider slider = new JSlider(0, 100, 0);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider temp = (JSlider) e.getSource();
                String text = ta.getText();
                if(text.length() <= temp.getValue())
                    slider.setValue(text.length());
                else ta.setText(text.substring(0, temp.getValue()));
            }
        });

        ta.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JTextArea temp = (JTextArea) e.getSource();
                String text = temp.getText();
                if(text.length() <= 100)
                    slider.setValue(text.length());
                else {
                    text = text.substring(0, 99);
                    ta.setText(text);
                }
            }
        });


        c.add(ta);
        c.add(slider);
        setSize(400, 200);
        setVisible(true);
    }


    public static void main(String[] args) {
       new Main();
    }
}