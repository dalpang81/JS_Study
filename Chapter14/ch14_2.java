import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.*;

public class Main extends JFrame {
    JLabel label = new JLabel();
    public Main() {
        setTitle("메뉴로 배경 이미지 로딩하기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createMenu();
        setSize(300, 200);
        getContentPane().add(label);
        setVisible(true);
    }

    void createMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu fileMenu = new JMenu("파일");
        JMenuItem fileItem = new JMenuItem("열기");
        fileItem.addActionListener(new MyFileActionListener());
        fileMenu.add(fileItem);
        mb.add(fileMenu);
        setJMenuBar(mb);
    }

    class MyFileActionListener implements ActionListener {
        private JFileChooser chooser;
        MyFileActionListener() {
            chooser = new JFileChooser();
        }
        public void actionPerformed(ActionEvent e) {
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
            chooser.setFileFilter(filter);
            int ret = chooser.showOpenDialog(null);
            if(ret != JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String filePath = chooser.getSelectedFile().getPath();
            label.setIcon(new ImageIcon(filePath));
            System.out.println(getWidth() + " " + getHeight());
            pack();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}