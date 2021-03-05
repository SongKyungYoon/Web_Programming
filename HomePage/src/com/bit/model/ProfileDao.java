package com.bit.model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sun.java2d.pipe.AATextRenderer;

public class ProfileDao {
	
	String driver ="org.mariadb.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/lmsdb";
	String user = "scott";
	String password = "tiger";
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public ProfileDao() {
		
	}
	
	public void inputData(String name, String birthday, String phoneNumber, String id, String pw, String position) throws SQLException {
		
		String sql = "insert into profile values(?,?,?,?,?,?)";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			pstmt.setString(3, pw);
			pstmt.setString(4, phoneNumber);
			pstmt.setString(5, birthday);
			pstmt.setString(6, position);
			pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	public NamePwPositionDto idInformation(String id){
	
		String sql = "select NAME, PW, POSITION from profile where ID= '"+id+"'";
		NamePwPositionDto dto = new NamePwPositionDto();
		try {
			Class.forName(driver);
			conn= DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dto.setName(rs.getString("NAME"));
				dto.setPw(rs.getString("PW"));
				dto.setPosition(rs.getString("POSITION"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
				try {
					if(rs != null)rs.close();
					if(pstmt != null)pstmt.close();
					if(conn != null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return dto;
	}
	
}
