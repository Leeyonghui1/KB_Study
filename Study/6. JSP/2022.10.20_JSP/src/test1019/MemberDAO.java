package test1019;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.Statement;

public class MemberDAO {
	private String url = "jdbc:mysql://localhost:3306/jspdb?"+
						 "useUnicode=true&characterEncoding=utf8&"+
						 "serverTimezone=UTC";
	private String uid = "root";
	private String upw = "1234";
	
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private PreparedStatement pstmt = null;
	
	public MemberDAO()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //jar에 있는 db 연결 소스를 참조하는 것
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	
	public int memberInsert(MemberDTO m)
	{
		int result = -1;
		conn = null;
		pstmt = null;
		
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			String query = "insert into memberDTO values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getId());
			pstmt.setString(3, m.getPw());
			pstmt.setString(4, m.getGender());
			result = pstmt.executeUpdate(); // 쿼리 수행성공여부
		} catch (Exception e) {
			
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	public ArrayList<MemberDTO> memberSelect()
	{
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		conn = null;
		stmt = null;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from memberdto");
			while(rs.next())
			{
				MemberDTO dto = new MemberDTO();
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setGender(rs.getString("gender"));
				dtos.add(dto);
			}
		} catch (Exception e) {
			// 혹시 모를 에러 출력
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return dtos;
	}
	
	// memberdto 테이블의 값 하나를 가지고 옴
	public MemberDTO checkMember(MemberDTO m)
	{
		MemberDTO dto = new MemberDTO();
		conn = null;
		pstmt = null;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			String query = "select * from memberdto where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getId());
			rs = pstmt.executeQuery();
			rs.next();
			dto.setName(rs.getString("name"));
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("pw"));
			dto.setGender(rs.getString("gender"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}
	
}
