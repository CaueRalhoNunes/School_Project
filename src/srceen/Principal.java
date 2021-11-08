package srceen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.ComponentOrientation;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 433);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnArea = new JButton("AREA");
		btnArea.setIcon(new ImageIcon(Principal.class.getResource("/image/folder_17px.png")));
		btnArea.setForeground(Color.WHITE);
		btnArea.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnArea.setBorderPainted(false);
		btnArea.setBorder(null);
		btnArea.setBackground(new Color(255, 51, 102));
		btnArea.setBounds(161, 75, 127, 23);
		contentPane.add(btnArea);
		
		JButton btnCurso = new JButton("CURSO");
		btnCurso.setIcon(new ImageIcon(Principal.class.getResource("/image/course_17px.png")));
		btnCurso.setForeground(Color.WHITE);
		btnCurso.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnCurso.setBorderPainted(false);
		btnCurso.setBorder(null);
		btnCurso.setBackground(new Color(255, 51, 102));
		btnCurso.setBounds(161, 109, 127, 23);
		contentPane.add(btnCurso);
		
		JButton btnTurma = new JButton("TURMA");
		btnTurma.setIcon(new ImageIcon(Principal.class.getResource("/image/crowd_18px.png")));
		btnTurma.setForeground(Color.WHITE);
		btnTurma.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnTurma.setBorderPainted(false);
		btnTurma.setBorder(null);
		btnTurma.setBackground(new Color(255, 51, 102));
		btnTurma.setBounds(161, 143, 127, 23);
		contentPane.add(btnTurma);
		
		JButton btnAluno = new JButton("ALUNO");
		btnAluno.setIcon(new ImageIcon(Principal.class.getResource("/image/student18px.png")));
		btnAluno.setForeground(Color.WHITE);
		btnAluno.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAluno.setBorderPainted(false);
		btnAluno.setBorder(null);
		btnAluno.setBackground(new Color(255, 51, 102));
		btnAluno.setBounds(161, 177, 127, 23);
		contentPane.add(btnAluno);
		
		JButton btnBoletim = new JButton("BOLETIM");
		btnBoletim.setIcon(new ImageIcon(Principal.class.getResource("/image/exam_18px.png")));
		btnBoletim.setForeground(Color.WHITE);
		btnBoletim.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnBoletim.setBorderPainted(false);
		btnBoletim.setBorder(null);
		btnBoletim.setBackground(new Color(255, 51, 102));
		btnBoletim.setBounds(161, 211, 127, 23);
		contentPane.add(btnBoletim);
		
		JButton btnPrfoessor = new JButton("PROFESSOR");
		btnPrfoessor.setIcon(new ImageIcon(Principal.class.getResource("/image/teacher_18px.png")));
		btnPrfoessor.setForeground(Color.WHITE);
		btnPrfoessor.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnPrfoessor.setBorderPainted(false);
		btnPrfoessor.setBorder(null);
		btnPrfoessor.setBackground(new Color(255, 51, 102));
		btnPrfoessor.setBounds(161, 245, 127, 23);
		contentPane.add(btnPrfoessor);
		
		JButton btnDisciplina = new JButton("DISCIPLINA");
		btnDisciplina.setIcon(new ImageIcon(Principal.class.getResource("/image/matter_18px.png")));
		btnDisciplina.setForeground(Color.WHITE);
		btnDisciplina.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnDisciplina.setBorderPainted(false);
		btnDisciplina.setBorder(null);
		btnDisciplina.setBackground(new Color(255, 51, 102));
		btnDisciplina.setBounds(161, 279, 127, 23);
		contentPane.add(btnDisciplina);
	}
}
