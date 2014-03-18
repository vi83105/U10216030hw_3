import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class bmiGUI extends JFrame {
	// Create text fields for name,ages,height,weight,BMI
	private JTextField jtfName = new JTextField();
	private JTextField jtfAges = new JTextField();
	private JTextField jtfHeight = new JTextField();
	private JTextField jtfWeight = new JTextField();
	private JTextField jtfBMI = new JTextField();
	// Create a Compute BMI button
	private JButton jbtComputeBMI = new JButton("Compute BMI");
	
	public bmiGUI() {
		// Panel p1 to hold labels and text fields
		JPanel p1 = new JPanel(new GridLayout(6, 2));
		p1.add(new JLabel("Name"));
		p1.add(jtfName);
		p1.add(new JLabel("Ages"));
		p1.add(jtfAges);
		p1.add(new JLabel("Height"));
		p1.add(jtfHeight);
		p1.add(new JLabel("Weight"));
		p1.add(jtfWeight);
		p1.add(new JLabel("BMI"));
		p1.add(jtfBMI);
		p1.setBorder(new TitledBorder("Enter height,weight,BMI "));
		p1.add(jbtComputeBMI);
		jtfBMI.setEditable(false);
		jbtComputeBMI.addActionListener(new ButtonListener());
		// Add the panels to the frame
		add(p1, BorderLayout.CENTER);
	}

	/** Handle the Compute BMI button */
	class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			//Change the data type from String to double
			// Get values from text fields
			double height = Double.parseDouble(jtfHeight.getText());
			double weight = Double.parseDouble(jtfWeight.getText());
			Double.parseDouble(jtfWeight.getText());
			// Display BMI
			jtfBMI.setText(getBMI(weight, height) + "");
			
		}
//How to calculate BMI
		double getBMI(double weight, double height) {
			double bmi = weight / (height * height);
			return Math.round(bmi * 100) / 100.0;
		}
	}

	public static void main(String[] args) {
		bmiGUI frame = new bmiGUI();
		frame.setTitle("BMI");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set the frame size
		frame.setSize(400, 200);
		//set the frame visible
		frame.setVisible(true);
	}
}