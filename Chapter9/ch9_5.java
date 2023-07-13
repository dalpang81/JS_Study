import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
            Color.CYAN, Color.BLUE, Color.MAGENTA,
            Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY, Color.black,
            Color.ORANGE, Color.BLUE, Color.MAGENTA};

    public GridLayoutEx() {
        setTitle("4x4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4,4);

        Container c = getContentPane();
        c.setLayout(grid);

        for(int i = 0; i < 16; i++) {
            JLabel b = new JLabel(Integer.toString(i));
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
