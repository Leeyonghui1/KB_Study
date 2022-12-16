package practice1;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import java.sql.Statement;

public class MemberDAO {
	
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private PreparedStatement pstmt = null;
	
	// Servers -> context.xml를 이용한 DB연결
	private DataSource ds = null;
	public MemberDAO()
	{
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	
	public int memberInsert(MemberDTO m)
	{
		int result = -1;
		conn = null;
		pstmt = null;
		
		try {
			// conn = DriverManager.getConnection(url, uid, upw);
			conn = ds.getConnection();
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
			// conn = DriverManager.getConnection(url, uid, upw);
			conn = ds.getConnection();
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
			//conn = DriverManager.getConnection(url, uid, upw);
			conn = ds.getConnection();
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
	
	public int memberModify(MemberDTO m)
	{
		int result = -1;
		conn = null;
		pstmt = null;
		
		try {
			// conn = DriverManager.getConnection(url, uid, upw);
			conn = ds.getConnection();
			String query = "update memberDTO set name=?, gender=? where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getGender());
			pstmt.setString(3, m.getId());
			result = pstmt.executeUpdate(); // 쿼리 수행성공여부
		} catch (Exception e) {
			e.printStackTrace();
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


	public int memberUpdate(MemberDTO m) 
	{
		int result = -1;
		conn = null;
		pstmt = null;
		
		try {
			conn = ds.getConnection();
			String query = "update memberDTO set name=?, gender=? where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getGender());
			pstmt.setString(3, m.getId());
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
	
}
