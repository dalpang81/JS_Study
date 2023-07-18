import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main extends JFrame {
    public Main() {
        setTitle("JSlider Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JSlider slider = new JSlider(1, 100, 50);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);

        JLabel label = new JLabel("I Love Java");
        label.setFont(new Font("Arial", Font.PLAIN, 50));


        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int size = slider.getValue();
                label.setFont(new Font("Arial", Font.PLAIN, size));
            }
        });

        c.add(slider, BorderLayout.NORTH);
        c.add(label, BorderLayout.CENTER);
        setSize(400, 200);
        setVisible(true);
    }


    public static void main(String[] args) {
       new Main();
    }
}