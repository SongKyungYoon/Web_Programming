package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NoticeBoardDao {

		String driver ="org.mariadb.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/lmsdb";
		String user = "scott";
		String password = "tiger";
		
		Connection conn;
		PreparedStatement pstmt;
		ResultSet rs;
		
		public NoticeBoardDao() {

		}
		
		public void inputData(String writer,String id,String title,String date,String text) {
			
			String sql = "insert into noticeboard (NUM,WRITER,ID,TITLE,CONTENT,DATE) values (NEXTVAL(num_seq),?,?,?,?,?)";
			
			try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, user, password);
					pstmt= conn.prepareStatement(sql);
					pstmt.setNString(1, writer);
					pstmt.setNString(2, id);
					pstmt.setNString(3, title);
					pstmt.setNString(4, text);
					pstmt.setNString(5, date);
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
