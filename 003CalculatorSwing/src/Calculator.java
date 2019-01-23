import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

		public class Calculator implements ActionListener {
			
			JFrame frame;
			JTextField textField;
			JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,dec,badd,bsub,
			bmul,bdiv,beq,bckr,bksp,bsqr,bcbe,bsqt,blog, bclr;
			double firstNumber, result, secondNumber;
			int operator;
			
			
			
			public Calculator() {
				frame = new JFrame("Calculator created by Nic Schroeder");
				frame.setLayout(null);
				
				textField = new JTextField();
				textField.setBounds(40,40,410,30);
				frame.add(textField);
				

				
				
				
				b1 = new JButton("1");
				b1.setBounds(40,240,50,40);
				frame.add(b1);
				
				b2 = new JButton("2");
				b2.setBounds(110,240,50,40);
				frame.add(b2);
				
				b3 = new JButton("3");
				b3.setBounds(180,240,50,40);
				frame.add(b3);
				
				b4 = new JButton("4");
				b4.setBounds(40,170,50,40);
				frame.add(b4);

				b5 = new JButton("5");
				b5.setBounds(110,170,50,40);
				frame.add(b5);
				
				b6 = new JButton("6");
				b6.setBounds(180,170,50,40);
				frame.add(b6);
				
				b7 = new JButton("7");
				b7.setBounds(40,100,50,40);
				frame.add(b7);

				b8 = new JButton("8");
				b8.setBounds(110,100,50,40);
				frame.add(b8);
				
				b9 = new JButton("9");
				b9.setBounds(180,100,50,40);
				frame.add(b9);
				
				
				bdiv = new JButton("/");
				bdiv.setBounds(250,100,50,40);
				frame.add(bdiv);
				
				bmul = new JButton("*");
				bmul.setBounds(250,170,50,40);
				frame.add(bmul);
				
				badd = new JButton("+");
				badd.setBounds(250,310,50,40);
				frame.add(badd);

				bsub = new JButton("-");
				bsub.setBounds(250,240,50,40);
				frame.add(bsub);
				
				beq = new JButton("=");
				beq.setBounds(40,310,50,40);
				frame.add(beq);

				b0 = new JButton("0");
				b0.setBounds(110,310,50,40);
				frame.add(b0);
				
				dec = new JButton(".");
				dec.setBounds(180,310,50,40);
				frame.add(dec);
				
				bclr = new JButton("Clear");
				bclr.setBounds(40,380,120,40);
				frame.add(bclr);
				
				bksp = new JButton("Backspace");
				bksp.setBounds(180,380,120,40);
				frame.add(bksp);
				
				bsqr = new JButton("Square");
				bsqr.setBounds(320,100,120,40);
				frame.add(bsqr);
				
				blog = new JButton("Log");
				blog.setBounds(320,170,120,40);
				frame.add(blog);
				frame.setSize(800, 600);
				frame.setVisible(true);
				
				
			
				
				

				b1.addActionListener(this);
				b2.addActionListener(this);
				b3.addActionListener(this);
				b4.addActionListener(this);
				b5.addActionListener(this);
				b6.addActionListener(this);
				b7.addActionListener(this);
				b8.addActionListener(this);
				b9.addActionListener(this);
				b0.addActionListener(this);
				bclr.addActionListener(this);
				badd.addActionListener(this);
				bsub.addActionListener(this);
				bmul.addActionListener(this);
				bdiv.addActionListener(this);
				beq.addActionListener(this);
				bksp.addActionListener(this);
				
			}
			
			
		@Override	
		
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1)
					textField.setText(textField.getText().concat("1"));
				if(e.getSource() == b2)
					textField.setText(textField.getText().concat("2"));
				if(e.getSource() == b3)
					textField.setText(textField.getText().concat("3"));
				if(e.getSource() == b4)
					textField.setText(textField.getText().concat("4"));
				if(e.getSource() == b5)
					textField.setText(textField.getText().concat("5"));
				if(e.getSource() == b6)
					textField.setText(textField.getText().concat("6"));
				if(e.getSource() == b7)
					textField.setText(textField.getText().concat("7"));
				if(e.getSource() == b8)
					textField.setText(textField.getText().concat("8"));
				if(e.getSource() == b9)
					textField.setText(textField.getText().concat("9"));
				if(e.getSource() == b0)
					textField.setText(textField.getText().concat("0"));
				if(e.getSource() == bclr)
					textField.setText("");
				
				if(e.getSource() == badd){
					firstNumber = Double.parseDouble(textField.getText());
					operator = 1;
					textField.setText("");
					}
				if(e.getSource() == bdiv){
					firstNumber = Double.parseDouble(textField.getText());
					operator = 4;
					textField.setText("");
					}
				if(e.getSource() == bmul){
					firstNumber = Double.parseDouble(textField.getText());
					operator = 3;
					textField.setText("");
					}
				if(e.getSource() == bsub){
					firstNumber = Double.parseDouble(textField.getText());
					operator = 2;
					textField.setText("");
					}
				if(e.getSource() == bksp) {
					//s is the text field
					String s = textField.getText();
					//clear field
					textField.setText("");
					//for every character in s minus one
					for (int i=0; i<s.length() - 1; i++)
						//add character from s into text field
						textField.setText(textField.getText()+s.charAt(i));
				}
				
				
				
				
				
				
				
				if(e.getSource() == beq) {
					secondNumber = Double.parseDouble(textField.getText());
					
					switch(operator) {
						case 1:
							result = firstNumber + secondNumber;
							break;
						case 2:
							result = firstNumber - secondNumber;
							break;
						case 3:
							result = firstNumber * secondNumber;
							break;
						case 4:
							result = firstNumber / secondNumber;
							break;
								
							default: result = 0.0;
					}
				
					textField.setText(""+result);
					
			
				}
				
					
	
		
		}
		}
		 // end of Calculator class
	

