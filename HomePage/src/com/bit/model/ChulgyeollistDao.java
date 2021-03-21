package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ChulgyeollistDao {

	String driver ="org.mariadb.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/lmsdb";
	String user = "scott";
	String password = "tiger";
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public ChulgyeollistDao() {
		
	}
	
	public void inputData(String id,String date, String time, String status) {
		
		String sql = "insert into chulgyeollist (ID,DATE,TIME,Status) values (?,?,?,?)";
		
		try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
				pstmt= conn.prepareStatement(sql);
				pstmt.setNString(1, id);
				pstmt.setNString(2, date);
				pstmt.setNString(3, time);
				pstmt.setNString(4, status);
				pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
	
}
