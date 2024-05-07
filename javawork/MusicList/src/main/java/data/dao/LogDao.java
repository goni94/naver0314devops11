package data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import data.dto.McmbDto;
import db.common.MySqlConnect;

public class LogDao {
	MySqlConnect db=new MySqlConnect();

	public boolean loginCheck(String id, int password) {
		McmbDto dto = new McmbDto();
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean check = true;
		System.out.println(id);
		System.out.println(password);
		String sql = "select member from musicmember where id=? and password=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setInt(2, password);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setMember(rs.getInt("member"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		if(dto.getMember() == 0) {
		    check = false;
		}
		return check;
	}
}
