package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import dao.AreaDAO;
import dto.AreaDTO;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class Area extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNome;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Area frame = new Area();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Area() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 432);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setOpaque(false);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		textField.setBounds(10, 90, 56, 20);
		contentPane.add(textField);
		
		JLabel lblCdigo = new JLabel("C\u00D3DIGO");
		lblCdigo.setForeground(Color.WHITE);
		lblCdigo.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblCdigo.setBounds(10, 72, 56, 14);
		contentPane.add(lblCdigo);
		
		txtNome = new JTextField();
		txtNome.setOpaque(false);
		txtNome.setForeground(Color.WHITE);
		txtNome.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtNome.setColumns(10);
		txtNome.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txtNome.setBounds(10, 163, 182, 20);
		contentPane.add(txtNome);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNome.setBounds(10, 145, 56, 14);
		contentPane.add(lblNome);
		
		
		
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome;

				nome = txtNome.getText();


				AreaDTO objAreaDTO = new AreaDTO();
				objAreaDTO.setNome(nome);

				AreaDAO objAreaDAO = new AreaDAO();
				objAreaDAO.cadastrarArea(objAreaDTO);
					
			}
		
		
		
		});
		btnCadastrar.setIcon(new ImageIcon(Area.class.getResource("/image/email_send_17px.png")));
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnCadastrar.setBorderPainted(false);
		btnCadastrar.setBorder(null);
		btnCadastrar.setBackground(new Color(255, 51, 102));
		btnCadastrar.setBounds(10, 250, 127, 23);
		contentPane.add(btnCadastrar);
	}
}
