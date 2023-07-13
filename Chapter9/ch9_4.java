import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
            Color.CYAN, Color.BLUE, Color.MAGENTA,
            Color.GRAY, Color.PINK, Color.LIGHT_GRAY};

    public GridLayoutEx() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1, 10);

        Container c = getContentPane();
        c.setLayout(grid);
        for(int i = 0; i < 10; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setOpaque(true);
            b.setBackground(col[i]);
            c.add(b);
        }

        setSize(600, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
