package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dto.AreaDTO;

public class AreaDAO {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<AreaDTO> lista = new ArrayList<>();
	
	public void cadastrarArea(AreaDTO objareadto) {
		String sql = "insert into area(nome) values(?)";
		conn = new ConnectionDAO().conectaBD();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objareadto.getNome());
			
			pstm.execute();
			pstm.close();
			
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null, "AreaDAO" + error);
		}
		
	}

}
