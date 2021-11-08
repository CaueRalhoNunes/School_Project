package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import dto.ProfessorDTO;

public class ProfessorDAO {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<ProfessorDTO> lista = new ArrayList<>();
	
	public void cadastrarArea(ProfessorDTO objprofessordto) {
		String sql = "insert into professor(nome, cpf, carteira_trabalho, fk_area) values(?,?,?,?)";
		conn = new ConnectionDAO().conectaBD();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objprofessordto.getNome());
			pstm.setString(2, objprofessordto.getCpf());
			pstm.setString(3, objprofessordto.getCarteira_trabalho());
			pstm.setInt(4, objprofessordto.getFk_area());
			
			pstm.execute();
			pstm.close();
			
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null, "ProfessorDAO" + error);
		}
		
	}

}
