

/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
implementing the event handling mechanism with addActionListener( ).*/


package Swings;


		
		import javax.swing.*;
		import java.awt.event.*;

		public class ImageButtonExample {

		    JLabel label;

		    ImageButtonExample() {

		        JFrame frame = new JFrame("Image Button Example");

		        label = new JLabel();
		        label.setBounds(50, 200, 400, 30);

		        // Images
		        ImageIcon digitalIcon = new ImageIcon("src/Swings/digital.png");
		        ImageIcon hourglassIcon = new ImageIcon("src/Swings/hour.png");

		        // Buttons
		        JButton digitalBtn = new JButton(digitalIcon);
		        JButton hourglassBtn = new JButton(hourglassIcon);

		        digitalBtn.setBounds(50, 50, 150, 100);
		        hourglassBtn.setBounds(210, 50, 150, 100);

		        // Action for Digital Clock
		        digitalBtn.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                label.setText("Digital Clock is pressed");
		            }
		        });

		        // Action for Hour Glass
		        hourglassBtn.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                label.setText("Hour Glass is pressed");
		            }
		        });

		        // Add components
		        frame.add(digitalBtn);
		        frame.add(hourglassBtn);
		        frame.add(label);

		        frame.setSize(450, 300);
		        frame.setLayout(null);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setVisible(true);
		    }

		    public static void main(String[] args) {
		        new ImageButtonExample();
		    }
		}

	


