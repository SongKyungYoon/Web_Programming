package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SeongJeogDao {

	String driver = "org.mariadb.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/lmsdb";
	String user = "scott";
	String password = "tiger";

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public SeongJeogDao() {
	}

	public SeongJeogDto outputData(String id, String name) {

		SeongJeogDto dto = new SeongJeogDto();
		String sql = "SELECT NAME ,gradelist.`group`,java,gradelist.`database`,framework FROM gradelist "
				+ "WHERE NAME=\'"+name+"\' AND id=\'"+id+"\'";
//		String sql = "SELECT NAME ,gradelist.`group`,java,gradelist.`database`,framework FROM gradelist "
//				+ "WHERE NAME=? AND id=?";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
//			pstmt.setNString(1, id);
//			pstmt.setNString(2, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto.setName(rs.getString("NAME"));
				dto.setGroup(rs.getString("group"));
				dto.setJava(rs.getInt("java"));
				dto.setDatabase(rs.getInt("database"));
				dto.setFramework(rs.getInt("framework"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

}
