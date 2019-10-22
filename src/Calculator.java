import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstNum;
	double secondNum;
	String operator;
	double answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 481, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 10, 447, 69);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		/////////////////////////////Row 1///////////////////////////////////
		JButton btnBackSpace = new JButton("Backspace");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length() > 0) {
					StringBuilder b = new StringBuilder(textField.getText());
					b.deleteCharAt(textField.getText().length() - 1);
					textField.setText(b.toString());
				}
			}
		});
		btnBackSpace.setFont(new Font("Roboto", Font.PLAIN, 20));
		btnBackSpace.setBounds(10, 103, 220, 49);
		frame.getContentPane().add(btnBackSpace);
		
		JButton buttonClear = new JButton("C");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		buttonClear.setFont(new Font("Roboto", Font.PLAIN, 28));
		buttonClear.setBounds(240, 103, 105, 49);
		frame.getContentPane().add(buttonClear);
		
		JButton buttonDecimalPoint = new JButton(".");
		buttonDecimalPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonDecimalPoint.setFont(new Font("Roboto", Font.PLAIN, 39));
		buttonDecimalPoint.setBounds(240, 423, 105, 49);
		frame.getContentPane().add(buttonDecimalPoint);
		
		JButton buttonAdd = new JButton("+");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum += Double.parseDouble(textField.getText());
				textField.setText(null);
				operator = "+";
			}
		});
		buttonAdd.setFont(new Font("Roboto", Font.PLAIN, 28));
		buttonAdd.setBounds(352, 103, 105, 49);
		frame.getContentPane().add(buttonAdd);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		/////////////////////////Row 2/////////////////////////////////////////////
		button7.setFont(new Font("Roboto", Font.PLAIN, 28));
		button7.setBounds(10, 185, 105, 49);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		button8.setFont(new Font("Roboto", Font.PLAIN, 28));
		button8.setBounds(125, 185, 105, 49);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		button9.setFont(new Font("Roboto", Font.PLAIN, 28));
		button9.setBounds(240, 185, 105, 49);
		frame.getContentPane().add(button9);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum += Double.parseDouble(textField.getText());
				textField.setText(null);
				operator = "-";
			}
		});
		buttonMinus.setFont(new Font("Roboto", Font.PLAIN, 30));
		buttonMinus.setBounds(352, 185, 105, 49);
		frame.getContentPane().add(buttonMinus);
		
		////////////////////////////// Row 3 ///////////////////////////////////////
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		button4.setFont(new Font("Roboto", Font.PLAIN, 28));
		button4.setBounds(10, 268, 105, 49);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		button5.setFont(new Font("Roboto", Font.PLAIN, 28));
		button5.setBounds(125, 268, 105, 49);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		button6.setFont(new Font("Roboto", Font.PLAIN, 28));
		button6.setBounds(240, 268, 105, 49);
		frame.getContentPane().add(button6);
		
		JButton buttonMult = new JButton("*");
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum += Double.parseDouble(textField.getText());
				textField.setText(null);
				operator = "*";
			}
		});
		buttonMult.setFont(new Font("Roboto", Font.PLAIN, 29));
		buttonMult.setBounds(352, 268, 105, 49);
		frame.getContentPane().add(buttonMult);
		
		////////////////////////Row 4//////////////////////////////////
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		button1.setFont(new Font("Roboto", Font.PLAIN, 28));
		button1.setBounds(10, 345, 105, 49);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		button2.setFont(new Font("Roboto", Font.PLAIN, 28));
		button2.setBounds(125, 345, 105, 49);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		button3.setFont(new Font("Roboto", Font.PLAIN, 28));
		button3.setBounds(240, 345, 105, 49);
		frame.getContentPane().add(button3);
		
		JButton buttonDivide = new JButton("/");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum += Double.parseDouble(textField.getText());
				textField.setText(null);
				operator = "/";
			}
		});
		buttonDivide.setFont(new Font("Roboto", Font.PLAIN, 28));
		buttonDivide.setBounds(352, 345, 105, 49);
		frame.getContentPane().add(buttonDivide);
		
		////////////////////////////////////////Row 5///////////////////////////////////
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		button0.setFont(new Font("Roboto", Font.PLAIN, 28));
		button0.setBounds(10, 423, 220, 49);
		frame.getContentPane().add(button0);
		
		JButton buttonEquals = new JButton("=");
		buttonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(textField.getText());
				switch(operator) {
				case "+" :
					answer = firstNum + secondNum;
					textField.setText(Double.toString(answer));
					break;
				case "-" :
					answer = firstNum - secondNum;
					textField.setText(Double.toString(answer));
					break;
				case "*" :
					answer = firstNum * secondNum;
					textField.setText(Double.toString(answer));
					break;
				case "/" :
					if(secondNum == 0) {
						JOptionPane.showMessageDialog(null, "Please enter valid number");
					}
					answer = firstNum/secondNum;
					textField.setText(Double.toString(answer));
					break;
					
				}
			}
		});
		buttonEquals.setFont(new Font("Roboto", Font.PLAIN, 28));
		buttonEquals.setBounds(352, 423, 105, 49);
		frame.getContentPane().add(buttonEquals);
	}
}
