import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.*;

public class Main extends JFrame {
    JRadioButton radioButton[] = new JRadioButton[2];
    ImageIcon imageIcons[] = {new ImageIcon("images/1.jpg"), new ImageIcon("images/2.jpg"), new ImageIcon("image/3.jpg")};
    JLabel imageLabel = new JLabel(imageIcons[0]);
    int selectIndex = 0;

    public Main() {
        setTitle("Image Gallery Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.setLayout(new FlowLayout());

        radioButton[0] = new JRadioButton("left");
        radioButton[0].setSelected(true);
        radioButton[1] = new JRadioButton("Right");

        top.add(radioButton[0]);
        top.add(radioButton[1]);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton[0]);
        group.add(radioButton[1]);

        c.add(top, BorderLayout.NORTH);
        c.add(imageLabel, BorderLayout.CENTER);

        imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(radioButton[0].isSelected()) {
                    selectIndex++;
                    if(selectIndex > 2)
                        selectIndex = 0;
                }
                else {
                    selectIndex--;
                    if(selectIndex < 0)
                        selectIndex = imageIcons.length - 1;
                }
                imageLabel.setIcon(imageIcons[selectIndex]);
            }
        });

        setSize(400, 200);
        setVisible(true);
    }


    public static void main(String[] args) {
       new Main();
    }
}