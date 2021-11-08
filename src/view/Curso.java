package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;
import java.awt.List;
import java.awt.Choice;
import java.awt.Component;

public class Curso extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Curso frame = new Curso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Curso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 433);
		contentPane = new JPanel();
		contentPane.setRequestFocusEnabled(false);
		contentPane.setBackground(Color.DARK_GRAY);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("C\u00D3DIGO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		label.setBounds(17, 33, 56, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setOpaque(false);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		textField.setBounds(17, 47, 56, 20);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("NOME");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		label_1.setBounds(17, 93, 56, 14);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		textField_1.setBounds(17, 107, 182, 20);
		contentPane.add(textField_1);
		
		JLabel lblSemestres = new JLabel("SEMESTRES");
		lblSemestres.setForeground(Color.WHITE);
		lblSemestres.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblSemestres.setBounds(17, 153, 70, 14);
		contentPane.add(lblSemestres);
		
		textField_2 = new JTextField();
		textField_2.setOpaque(false);
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		textField_2.setBounds(17, 167, 60, 20);
		contentPane.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		comboBox.setBounds(17, 211, 129, 21);
		contentPane.add(comboBox);
	}
}
