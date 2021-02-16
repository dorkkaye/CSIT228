import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class GUIDemo extends JFrame implements ActionListener{
	JPanel panel = new JPanel();

	JLabel lbl1 = new JLabel("Radius");
	JLabel lbl2 = new JLabel("Area");
	JLabel lbl3 = new JLabel("Circumference");

	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JTextField tf3 = new JTextField(10);

	JButton btn1 = new JButton("Compute");
	JButton btn2 = new JButton("Clear");

	public GUIDemo(){
		setTitle("CIRCLE");
		panel.setLayout(new GridLayout(4,2,10,7));
		panel.add(lbl1);panel.add(tf1);
		panel.add(btn1);panel.add(btn2);
		panel.add(lbl2);panel.add(tf2);
		panel.add(lbl3);panel.add(tf3);

		getContentPane().add(panel);
		setVisible(true);
		setResizable(false);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//adding actionlistener to the button
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource().equals(btn1)){
			DecimalFormat df = new DecimalFormat("#.##");
			double rad = Double.parseDouble(tf1.getText());

			double area = Math.PI * Math.pow(rad,2);
			double circ = 2* Math.PI *rad;

			tf2.setText(df.format(area));
			tf3.setText(df.format(circ));
		}
		if(ae.getSource().equals(btn2)){
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}

	public static void main(String[] args){
		new GUIDemo();
	}
}