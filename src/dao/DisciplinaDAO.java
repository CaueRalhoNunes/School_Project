package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dto.DisciplinaDTO;

public class DisciplinaDAO {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<DisciplinaDTO> lista = new ArrayList<>();
	
	public void cadastrarArea(DisciplinaDTO objdisciplinadto) {
		String sql = "insert into disciplina(nome, abreviacao) values(?,?)";
		conn = new ConnectionDAO().conectaBD();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objdisciplinadto.getNome());
			pstm.setString(2, objdisciplinadto.getAbreviacao());
			
			pstm.execute();
			pstm.close();
			
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null, "DisciplinaDAO" + error);
		}
		
	}

}
