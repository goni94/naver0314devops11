package data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Vector;

import data.dto.McmbDto;
import db.common.MySqlConnect;

public class McmbDao {
	MySqlConnect db=new MySqlConnect();
	
	public void insertMcmb(McmbDto dto)
	{
		String sql="""
				insert into musicmember (id,password,name,age,gender,birthday,
				number,email,addr,detailaddr,writeday)
				values (?,?,?,?,?,?,?,?,?,?,now())
				""";
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		System.out.println(dto.getName());
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getId());
			pstmt.setInt(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setInt(4, dto.getAge());
			pstmt.setString(5, dto.getGender());
			pstmt.setString(6, dto.getBirthday());
			pstmt.setInt(7, dto.getNumber());
			pstmt.setString(8, dto.getEmail());
			pstmt.setString(9, dto.getAddr());
			pstmt.setString(10, dto.getDetailaddr());
			
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public List<McmbDto> getAllMcmb()
	{
		List<McmbDto> list=new Vector<McmbDto>();
		String sql="select * from musicmember order by member";
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				McmbDto dto=new McmbDto();
				
				dto.setMember(rs.getInt("member"));
				dto.setId(rs.getString("id"));
				dto.setPassword(rs.getInt("password"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setGender(rs.getString("gender"));
				dto.setBirthday(rs.getString("birthday"));
				dto.setNumber(rs.getInt("number"));
				dto.setEmail(rs.getString("email"));
				dto.setAddr(rs.getString("addr"));
				dto.setDetailaddr(rs.getString("detailaddr"));
				dto.setWriteday(rs.getTimestamp("writeday"));
				
				list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		return list;
	}
	
	public McmbDto getData(int member)
	{
		McmbDto dto=new McmbDto();
		String sql="select * from musicmember where member=?";
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, member);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setMember(rs.getInt("member"));
				dto.setId(rs.getString("id"));
				dto.setPassword(rs.getInt("password"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setGender(rs.getString("gender"));
				dto.setBirthday(rs.getString("birthday"));
				dto.setNumber(rs.getInt("number"));
				dto.setEmail(rs.getString("email"));
				dto.setAddr(rs.getString("addr"));
				dto.setDetailaddr(rs.getString("detailaddr"));
				dto.setWriteday(rs.getTimestamp("writeday"));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		return dto;
	}
	
	public void deleteMcmb(int member)
	{
		String sql="""
				delete from musicmember where member=?
				""";
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, member);
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public void updateMcmb(McmbDto dto)
	{
		String sql="""
				update musicmember set id=?,password=?,name=?,age=?,gender=?,
				birthday=?,number=?,email=?,addr=?,detailaddr=? where member=?
				""";
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getId());
			pstmt.setInt(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setInt(4, dto.getAge());
			pstmt.setString(5, dto.getGender());
			pstmt.setString(6, dto.getBirthday());
			pstmt.setInt(7, dto.getNumber());
			pstmt.setString(8, dto.getEmail());
			pstmt.setString(9, dto.getAddr());
			pstmt.setString(10, dto.getDetailaddr());
			pstmt.setInt(11, dto.getMember());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
}


























