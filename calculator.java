package practice;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends Frame{
	
	
	calculator() {
			Frame frame = new Frame("Calculator");
			Label label = new Label();
			label.setText("Welcome Back.Add two numbers");
			label.setBounds(20, 40, 100, 30);
			label.setBackground(Color.CYAN);
			frame.add(label);

			Label lblFirstNumber = new Label("First Number");
			lblFirstNumber.setBounds(20, 75, 100, 30);
			frame.add(lblFirstNumber);

			TextField tfFirstNumber = new TextField();
			tfFirstNumber.setBounds(125, 75, 100, 30);
			frame.add(tfFirstNumber);

			Label lblSecondNumber = new Label("First Number");
			lblSecondNumber.setBounds(20, 110, 100, 30);
			frame.add(lblSecondNumber);

			TextField tfSecondNumber = new TextField();
			tfSecondNumber.setBounds(125, 110, 100, 30);
			frame.add(tfSecondNumber);

			Button btnReset = new Button("Reset");
			btnReset.setBounds(20, 150, 90, 30);
			frame.add(btnReset);

			Button btn2 = new Button("Calculate");
			btn2.setBounds(125, 150, 90, 30);
			frame.add(btn2);

			Label lbl = new Label("Here is the result:");
			lbl.setBounds(20, 185, 200, 20);
			frame.add(lbl);

			Label result = new Label("0");
			result.setBounds(20, 200, 200, 20);
			frame.add(result);

			btn2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String num1 = tfFirstNumber.getText();
					String num2 = tfSecondNumber.getText();

					System.out.println(num1);
					System.out.println(num2);

					int a = Integer.parseInt(num1);
					int b = Integer.parseInt(num2);

					int sum = a + b;

					String myResult = String.valueOf(sum);
					result.setText(myResult);

				}
			});

			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfFirstNumber.setText("");
					tfSecondNumber.setText("");
				}
			});

			frame.setLayout(null);
			frame.setSize(300, 300);
			frame.setVisible(true);
			TextField txt = new TextField();

		}

		public static void main(String[] args) {
			new calculator();
		}

	}



