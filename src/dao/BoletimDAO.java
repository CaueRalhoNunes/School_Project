package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dto.BoletimDTO;

public class BoletimDAO {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<BoletimDTO> lista = new ArrayList<>();
	
	public void cadastrarArea(BoletimDTO objBoletimdto) {
		String sql = "insert into Boletim(bimestre, nota, fk_aluno, fk_disciplina) values(?,?,?,?)";
		conn = new ConnectionDAO().conectaBD();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, objBoletimdto.getBimestre());
			pstm.setInt(2, objBoletimdto.getNota());
			pstm.setInt(3, objBoletimdto.getFk_aluno());
			pstm.setInt(4, objBoletimdto.getFk_disciplina());
			
			pstm.execute();
			pstm.close();
			
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null, "BoletimDAO" + error);
		}
		
	}

}
