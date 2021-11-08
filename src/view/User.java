package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import dao.UserDAO;

import dto.UserDTO;

import srceen.Principal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

@SuppressWarnings("unused")
public class User extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JLabel lblSenha;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 433);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		txtUser = new JTextField();
		txtUser.setHorizontalAlignment(SwingConstants.CENTER);
		txtUser.setOpaque(false);
		txtUser.setForeground(Color.WHITE);
		txtUser.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtUser.setColumns(10);
		txtUser.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txtUser.setBounds(103, 100, 222, 20);
		contentPane.add(txtUser);
		
		JLabel lblUser = new JLabel("USU\u00C1RIO");
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblUser.setBounds(188, 83, 56, 14);
		contentPane.add(lblUser);
		
		txtPass = new JPasswordField();
		txtPass.setHorizontalAlignment(SwingConstants.CENTER);
		txtPass.setOpaque(false);
		txtPass.setForeground(Color.WHITE);
		txtPass.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtPass.setColumns(10);
		txtPass.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txtPass.setBounds(103, 192, 222, 20);
		contentPane.add(txtPass);
		
		lblSenha = new JLabel("SENHA");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblSenha.setBounds(194, 176, 45, 14);
		contentPane.add(lblSenha);
		
		JButton btnLog = new JButton("LOGAR");
		btnLog.setIcon(new ImageIcon(User.class.getResource("/image/login_17px.png")));
		btnLog.setForeground(Color.WHITE);
		btnLog.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnLog.setBorderPainted(false);
		btnLog.setBorder(null);
		btnLog.setBackground(new Color(255, 51, 102));
		btnLog.setBounds(151, 270, 127, 23);
		contentPane.add(btnLog);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Logar();
			}

			@SuppressWarnings("deprecation")
			private void Logar() {
				try {
					String nome, senha;

					nome = txtUser.getText();
					senha = txtPass.getText();

					UserDTO objuserdto = new UserDTO();
					objuserdto.setNome(nome);
					objuserdto.setSenha(senha);

					UserDAO objuserdao = new UserDAO();
					ResultSet rsuserdao = objuserdao.userAutentication(objuserdto);

					if (rsuserdao.next()) {
						// FUNCIONOU
						Principal objprincipal = new Principal();
						objprincipal.setVisible(true);

						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos");
						// NÃO FUNCIONOU
					}

				} catch (SQLException error) {
					JOptionPane.showMessageDialog(null, "FRMUSUARIO" + error);
				}
				
			}
		});
		
		}}