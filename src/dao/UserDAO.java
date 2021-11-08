package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dto.UserDTO;

public class UserDAO {
	Connection conn;
	
	public ResultSet userAutentication(UserDTO objuserdto) {
		conn = new ConnectionDAO().conectaBD();
		
		try {
			String sql = "Select * from usuario where nome = ? and senha = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, objuserdto.getNome());
			pstm.setString(2, objuserdto.getSenha());
			
			ResultSet rs = pstm.executeQuery();
			return rs;
			
		} catch (SQLException error) {
			JOptionPane.showMessageDialog(null, "UserDAO" + error);
			return null;
		}
		
	}

}
