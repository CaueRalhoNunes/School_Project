package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dto.TurmaDTO;

public class TurmaDAO {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<TurmaDTO> lista = new ArrayList<>();
	
	public void cadastrarArea(TurmaDTO objTurmadto) {
		String sql = "insert into Turma(nome, qtd_alunos, fk_curso) values(?,?,?)";
		conn = new ConnectionDAO().conectaBD();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objTurmadto.getNome());
			pstm.setInt(2, objTurmadto.getQtd_alunos());
			pstm.setInt(3, objTurmadto.getFk_curso());
			
			pstm.execute();
			pstm.close();
			
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null, "TurmaDAO" + error);
		}
		
	}

}
