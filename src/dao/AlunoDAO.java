package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dto.AlunoDTO;

public class AlunoDAO {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	List<AlunoDTO> lista = new ArrayList<>();
	
	public void cadastrarArea(AlunoDTO objAlunodto) {
		String sql = "insert into Aluno(nome, cpf, dt_nascimento, fk_turma) values(?,?,?,?)";
		conn = new ConnectionDAO().conectaBD();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objAlunodto.getNome());
			pstm.setString(2, objAlunodto.getCpf());
			pstm.setString(3, objAlunodto.getDt_nascimento());
			pstm.setInt(4, objAlunodto.getFk_turma());
			
			pstm.execute();
			pstm.close();
			
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null, "AlunoDAO" + error);
		}
		
	}

}
