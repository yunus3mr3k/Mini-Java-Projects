package Calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField input;
	private double answer, number;
	private int operation;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void addInput(String string) {
		input.setText(input.getText() + string);
	}

	public void calculate() {
		switch (operation) {

		case 1:
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(input.getText());
			if (Double.parseDouble(input.getText()) == 0) {
				input.setText("Tanımsız");
				break;
			}
			input.setText(Double.toString(answer));
			break;
		}
	}

	public Calculator() {
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi");
		setResizable(false);
		setFont(new Font("Dialog", Font.BOLD, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel screen = new JPanel();
		screen.setBackground(Color.LIGHT_GRAY);
		screen.setBounds(10, 11, 350, 60);
		contentPane.add(screen);
		screen.setLayout(null);

		input = new JTextField();
		input.setBackground(Color.LIGHT_GRAY);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 12));
		input.setBounds(0, 21, 350, 39);
		screen.add(input);
		input.setColumns(10);

		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 12));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(0, 0, 350, 14);
		screen.add(lbl);

		JPanel control = new JPanel();
		control.setBackground(Color.DARK_GRAY);
		control.setBounds(10, 83, 350, 367);
		contentPane.add(control);
		control.setLayout(new GridLayout(4, 4, 10, 10));

		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.setBackground(Color.WHITE);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_7.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.setBackground(Color.WHITE);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_8.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setBackground(Color.WHITE);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_9.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("+");
		btnNewButton_10.setBackground(Color.WHITE);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				lbl.setText(number + " + ");

			}
		});
		btnNewButton_10.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_10);

		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_6.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_6);

		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.setBackground(Color.WHITE);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				lbl.setText(number + " - ");
			}
		});
		btnNewButton_11.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_11);

		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_3);

		JButton btnNewButton_12 = new JButton("x");
		btnNewButton_12.setBackground(Color.WHITE);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				lbl.setText(number + " X ");
			}
		});
		btnNewButton_12.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_12);

		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.setBackground(Color.WHITE);
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_0.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_0);

		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.setBackground(Color.WHITE);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText("");
			}
		});
		btnNewButton_14.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_14);

		JButton btnNewButton_c = new JButton("C");
		btnNewButton_c.setBackground(Color.WHITE);
		btnNewButton_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnNewButton_c.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_c);

		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.setBackground(Color.WHITE);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				lbl.setText(number + " / ");
			}
		});
		btnNewButton_13.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		control.add(btnNewButton_13);
	}
}
