import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main extends JFrame {
    public Main() {
        setTitle("Jslider Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 100, 200, 130);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JLabel label = new JLabel("130");
        label.setOpaque(true);
        label.setBackground(Color.GREEN);



        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider temp = (JSlider) e.getSource();
                label.setText(Integer.toString(temp.getValue()));
            }
        });

        c.add(slider);
        c.add(label);

        setSize(400, 200);
        setVisible(true);
    }


    public static void main(String[] args) {
       new Main();
    }
}