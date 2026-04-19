/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/

package Swings;


	
import java.awt.Color;
import javax.swing.*;

public class TabbedColorExample {

    JFrame f;

    TabbedColorExample(){

        f=new JFrame();

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();

        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        JTabbedPane tp=new JTabbedPane();

        tp.add("CYAN",p1);
        tp.add("MAGENTA",p2);
        tp.add("YELLOW",p3);

        tp.addChangeListener(e -> {
            int index = tp.getSelectedIndex();
            String title = tp.getTitleAt(index);
            System.out.println(title);
        });

        f.add(tp);
        f.setSize(400,400);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedColorExample();
    }
}