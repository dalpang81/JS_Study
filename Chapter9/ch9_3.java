import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1, 10);

        Container c = getContentPane();
        c.setLayout(grid);
        for(int i = 0; i < 10; i++) {
            c.add(new JButton(Integer.toString(i)));
        }

        setSize(800, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
