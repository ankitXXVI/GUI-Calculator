import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class GUICalculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btn_factorial;
	private JButton btn_sqrt;
	private JButton btn_reset;
	private JButton btn_backspace;
	private JButton btn_add;
	private JButton btn_substract;
	private JButton btn_multiply;
	private JButton btn_divide;
	private JButton btn_equals;
	private JButton btn_seven;
	private JButton btn_eight;
	private JButton btn_nine;
	private JButton btn_six;
	private JButton btn_five;
	private JButton btn_four;
	private JButton btn_three;
	private JButton btn_two;
	private JButton btn_one;
	private JButton btn_zero0;
	private JButton button;

	public static void main(String[] args) {
					GUICalculator window = new GUICalculator();
					window.frame.setVisible(true);
				}

	public GUICalculator() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(GUICalculator.class.getResource("/icon/Calculator (3).png")));
		frame.setTitle("Calculator - ankitXXVI");
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Arial", Font.BOLD, 20));
		textField.setEditable(false);
		textField.setBackground(SystemColor.activeCaption);
		textField.setBounds(10, 11, 314, 55);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("^");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(10, 77, 55, 55);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "^");
			}
		});
		
		btn_factorial = new JButton("n!");
		btn_factorial.setFont(new Font("Arial", Font.BOLD, 20));
		btn_factorial.setBounds(75, 77, 55, 55);
		frame.getContentPane().add(btn_factorial);
		btn_factorial.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "!");
			}
		});
		
		btn_sqrt = new JButton("\u221A");
		btn_sqrt.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_sqrt.setBounds(140, 77, 55, 55);
		frame.getContentPane().add(btn_sqrt);
		btn_sqrt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "\u221A");
			}
		});
		
		btn_reset = new JButton("C");
		btn_reset.setForeground(Color.RED);
		btn_reset.setFont(new Font("Arial", Font.BOLD, 20));
		btn_reset.setBounds(205, 77, 55, 55);
		frame.getContentPane().add(btn_reset);
		btn_reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		
		btn_backspace = new JButton("");
		btn_backspace.setSelectedIcon(new ImageIcon(GUICalculator.class.getResource("/icon/611672.png")));
		btn_backspace.setIcon(new ImageIcon(GUICalculator.class.getResource("/icon/61167.png")));
		btn_backspace.setFont(new Font("Arial", Font.BOLD, 10));
		btn_backspace.setBounds(269, 77, 55, 55);
		frame.getContentPane().add(btn_backspace);
		btn_backspace.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int length = textField.getText().length();
				int number = textField.getText().length() - 1;
				String store;
				if(length > 0) {
					StringBuilder back = new StringBuilder(textField.getText());
					back.deleteCharAt(number);
					store=back.toString();
					textField.setText(store);
				}
			}
		});
		
		btn_add = new JButton("+");
		btn_add.setFont(new Font("Arial", Font.BOLD, 20));
		btn_add.setBounds(269, 143, 55, 55);
		frame.getContentPane().add(btn_add);
		btn_add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "+");
			}
		});
		
		btn_substract = new JButton("-");
		btn_substract.setFont(new Font("Arial", Font.BOLD, 20));
		btn_substract.setBounds(269, 209, 55, 55);
		frame.getContentPane().add(btn_substract);
		btn_substract.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "-");
			}
		});
		
		btn_multiply = new JButton("*");
		btn_multiply.setFont(new Font("Arial", Font.BOLD, 20));
		btn_multiply.setBounds(269, 275, 55, 55);
		frame.getContentPane().add(btn_multiply);
		btn_multiply.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");
			}
		});
		
		btn_divide = new JButton("/");
		btn_divide.setFont(new Font("Arial", Font.BOLD, 20));
		btn_divide.setBounds(269, 341, 55, 55);
		frame.getContentPane().add(btn_divide);
		btn_divide.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "/");
			}
		});
		
		btn_equals = new JButton("=");
		btn_equals.setFont(new Font("Arial", Font.BOLD, 20));
		btn_equals.setBounds(269, 407, 55, 55);
		frame.getContentPane().add(btn_equals);
		btn_equals.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String fieldValue = textField.getText();
				if(fieldValue.indexOf("+") != -1) {
					String currentFieldValue = textField.getText();
					int operatorPos = currentFieldValue.indexOf("+");
					String variable1 = currentFieldValue.substring(0, operatorPos);
					String variable2 = currentFieldValue.substring((operatorPos + 1), currentFieldValue.length());
					double var1 = Double.parseDouble(variable1);
					double var2 = Double.parseDouble(variable2);
					double result = var1 + var2;
					textField.setText(String.valueOf(result));										
				}
				else if(fieldValue.indexOf("-") != -1) {
					String currentFieldValue = textField.getText();
					int operatorPos = currentFieldValue.indexOf("-");
					String variable1 = currentFieldValue.substring(0, operatorPos);
					String variable2 = currentFieldValue.substring((operatorPos + 1), currentFieldValue.length());
					double var1 = Double.parseDouble(variable1);
					double var2 = Double.parseDouble(variable2);
					double result = var1 - var2;
					textField.setText(String.valueOf(result));										
				}
				else if(fieldValue.indexOf("*") != -1) {
					String currentFieldValue = textField.getText();
					int operatorPos = currentFieldValue.indexOf("*");
					String variable1 = currentFieldValue.substring(0, operatorPos);
					String variable2 = currentFieldValue.substring((operatorPos + 1), currentFieldValue.length());
					double var1 = Double.parseDouble(variable1);
					double var2 = Double.parseDouble(variable2);
					double result = var1 * var2;
					textField.setText(String.valueOf(result));										
				}
				else if(fieldValue.indexOf("/") != -1) {
					String currentFieldValue = textField.getText();
					int operatorPos = currentFieldValue.indexOf("/");
					String variable1 = currentFieldValue.substring(0, operatorPos);
					String variable2 = currentFieldValue.substring((operatorPos + 1), currentFieldValue.length());
					double var1 = Double.parseDouble(variable1);
					double var2 = Double.parseDouble(variable2);
					double result = var1 / var2;
					textField.setText(String.valueOf(result));										
				}
				else if(fieldValue.indexOf("!") != -1) {
					String currentFieldValue = textField.getText();
					int operatorPos = currentFieldValue.indexOf("!");
					String variable1 = currentFieldValue.substring(0, operatorPos);
					int var1 = Integer.parseInt(variable1);
					int result = 1;
					while (result != 0) {
						result = result * var1;
						var1--;
						if (var1 == 0) {
							textField.setText(String.valueOf(result));
						}
					}									
				}
				else if(fieldValue.indexOf("^") != -1) {
					String currentFieldValue = textField.getText();
					int operatorPos = currentFieldValue.indexOf("^");
					String variable1 = currentFieldValue.substring(0, operatorPos);
					String variable2 = currentFieldValue.substring((operatorPos + 1), currentFieldValue.length());
					double var1 = Double.parseDouble(variable1);
					double var2 = Double.parseDouble(variable2);
					double result = 1;
					for(int i = 1; i <= var2; i++) {
						result = result * var1;
					}
					textField.setText(String.valueOf(result));										
				}
				else if(fieldValue.indexOf("\u221A") != -1) {
					String currentFieldValue = textField.getText();
					int operatorPos = currentFieldValue.indexOf("\u221A");
					String variable1 = currentFieldValue.substring((operatorPos + 1), currentFieldValue.length());
					double var1 = Double.parseDouble(variable1);
					double result = Math.sqrt(var1);
					textField.setText(String.valueOf(result));										
				}
			}
		});
		
		btn_seven = new JButton("7");
		btn_seven.setFont(new Font("Arial", Font.BOLD, 20));
		btn_seven.setBounds(10, 143, 77, 77);
		frame.getContentPane().add(btn_seven);
		btn_seven.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		
		btn_eight = new JButton("8");
		btn_eight.setFont(new Font("Arial", Font.BOLD, 20));
		btn_eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn_eight.setBounds(97, 143, 77, 77);
		frame.getContentPane().add(btn_eight);
		
		btn_nine = new JButton("9");
		btn_nine.setFont(new Font("Arial", Font.BOLD, 20));
		btn_nine.setBounds(183, 143, 77, 77);
		frame.getContentPane().add(btn_nine);
		btn_nine.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		
		btn_six = new JButton("6");
		btn_six.setFont(new Font("Arial", Font.BOLD, 20));
		btn_six.setBounds(183, 231, 77, 77);
		frame.getContentPane().add(btn_six);
		btn_six.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		
		btn_five = new JButton("5");
		btn_five.setFont(new Font("Arial", Font.BOLD, 20));
		btn_five.setBounds(97, 231, 77, 77);
		frame.getContentPane().add(btn_five);
		btn_five.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		
		btn_four = new JButton("4");
		btn_four.setFont(new Font("Arial", Font.BOLD, 20));
		btn_four.setBounds(10, 231, 77, 77);
		frame.getContentPane().add(btn_four);
		btn_four.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		
		btn_three = new JButton("3");
		btn_three.setFont(new Font("Arial", Font.BOLD, 20));
		btn_three.setBounds(183, 319, 77, 77);
		frame.getContentPane().add(btn_three);
		btn_three.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		
		btn_two = new JButton("2");
		btn_two.setFont(new Font("Arial", Font.BOLD, 20));
		btn_two.setBounds(97, 319, 77, 77);
		frame.getContentPane().add(btn_two);
		btn_two.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		
		btn_one = new JButton("1");
		btn_one.setFont(new Font("Arial", Font.BOLD, 20));
		btn_one.setBounds(10, 319, 77, 77);
		frame.getContentPane().add(btn_one);
		btn_one.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		
		btn_zero0 = new JButton("0");
		btn_zero0.setFont(new Font("Arial", Font.BOLD, 20));
		btn_zero0.setBounds(10, 407, 120, 53);
		btn_zero0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		frame.getContentPane().add(btn_zero0);
		
		button = new JButton(",");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		button.setFont(new Font("Arial", Font.BOLD, 20));
		button.setBounds(140, 407, 120, 53);
		frame.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(32, 34, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		frame.setBounds(100, 100, 350, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
