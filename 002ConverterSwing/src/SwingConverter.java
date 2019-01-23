import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class SwingConverter implements ActionListener{
	
	private JPanel inputPanel = initInputPanel();
	private JTextField inputText;
	private JTextArea resultArea;
	private JButton enterButton;
	private double radius, surfArea, volume;
	
	
	
	
	
	public SwingConverter() {
		JFrame myWindow = new JFrame("Base Converter - Created by Nicholas Schroeder");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.add(inputPanel);
		myWindow.setSize(1000, 900);
		myWindow.setVisible(true);
		
		
		
	} //end of SwingConverter
	
	
	
	
	private JPanel initInputPanel() {
		JPanel panel = new JPanel();
		
		panel.setPreferredSize(new java.awt.Dimension(1000, 900));
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		JLabel header = new JLabel("Base Converter");
		header.setBounds(450, 10, 220, 30);
		header.setForeground(Color.BLUE);
		panel.add(header);
		
		JLabel label = new JLabel("Enter a base-10 number: ");
		label.setBounds(250, 50, 220, 30);
		label.setForeground(Color.BLUE);
		panel.add(label);
		
		JTextField text;
		text = inputText = new JTextField();
		text.setBounds(430, 50, 100, 30);
		panel.add(text);
		
		JButton button = new JButton("Enter");
		button.setActionCommand("Enter");
		button.setBounds(540, 50, 80, 30);
		button.addActionListener(this);
		panel.add(button);
		// save to the class variable, to be used in the other methods
		enterButton = button;
		
		button = new JButton("Reset");
		button.setActionCommand("Reset");
		button.setBounds(630, 50, 80, 30);
		button.addActionListener(this);
		panel.add(button);
		
		resultArea = new JTextArea();
		resultArea.setBounds(250, 120, 500, 300);
		resultArea.setEditable(false);
		resultArea.setBackground(Color.CYAN);
		panel.add(resultArea);
		/*
		
		JLabel sLabel = new JLabel("Sphere");
		sLabel.setBounds(450, 500, 220, 30);
		sLabel.setForeground(Color.BLUE);
		JLabel radiusLabel = new JLabel("Enter the radius: ");
		radiusLabel.setBounds(250, 550, 220, 30); 
		radiusLabel.setForeground(Color.BLUE);
		panel.add(sLabel);
		panel.add(radiusLabel);
		
		JTextField radius = new JTextField();
		radius.setBounds(300, 550, 100, 30);
		panel.add(radius);
		
		*/
		
		
		
		
		
		
		
		return panel;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		//SwingConverter baseConverter = new SwingConverter();
		new SwingConverter();
		
	}




	@Override
	public void actionPerformed(ActionEvent ev) {
		String command = ev.getActionCommand();
		if (command.equals("Enter")) {
			showResult();
		}
		else if (command.equals("Reset")) {
			doReset();
		}
		
	} // end of actionPerformed




	private void doReset() {
		inputText.setText("");
		resultArea.setText("");
		inputText.setEnabled(true);
		enterButton.setEnabled(true);
		inputText.requestFocus();
		
	}




	private void showResult() {
		String hexUpperCase;
		inputText.setEnabled(false);
		enterButton.setEnabled(false);
		
		Integer n = getInputNumber();
		if (n == null) {
			resultArea.append("Invalid number !");
			return;
		}
		
	 // end of showResult
	
	int baseTenNumber = n.intValue(); 
	resultArea.append("base ten = " + baseTenNumber + "\n");
	resultArea.append("binary = " + Integer.toString(baseTenNumber, 2) + "\n");
	resultArea.append("octal = " + Integer.toString(baseTenNumber, 8) + "\n");
	resultArea.append("hexadecimal = " + Integer.toString(baseTenNumber, 16) + "\n");
	
	hexUpperCase = Integer.toString(baseTenNumber, 16).toUpperCase();
	resultArea.append("hexadecimal = " + hexUpperCase + "\n");

	}


	private Integer getInputNumber() {
		try {
			Integer n = Integer.parseInt(inputText.getText());
			return n;
		} catch (Exception e) {
			// invalid number entry, traps error, go again, return null to prevent crash
			return null;
		}
		
	}
	
	

	

		
		
		
		private void calcSurfArea() {
			
			radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the sphere: "));
			surfArea = 4 * Math.PI * Math.pow(radius, 2.0);
			JOptionPane.showMessageDialog(null, "The surface area of the sphere = " + surfArea);
			
		} // end of calcSurfArea
		
		public void calcVolume() {
			
			volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3.0);
			JOptionPane.showMessageDialog(null,"The volume of the sphere = " + volume);
			
			
			
		} // end of calcVolume
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
}
