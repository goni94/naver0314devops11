package data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import data.dto.SongDto;
import db.common.MySqlConnect;

public class SongDao {
	MySqlConnect db=new MySqlConnect();
	
//	public void insertsongDto(SongDto dto)
//	{
//		String sql="""
//				insert into song (songname,singer,genre,album,songdate,lyrics)
//				values (?,?,?,?,?,?)
//				""";
//		Connection conn=db.getConnection();
//		PreparedStatement pstmt=null;
//		
//		try {
//			pstmt=conn.prepareStatement(sql);
//			
//			pstmt.setString(1, dto.getSongname());
//			pstmt.setString(2, dto.getSinger());
//			pstmt.setString(3, dto.getGenre());
//			pstmt.setString(4, dto.getAlbum());
//			pstmt.setInt(5, dto.getSongdate());
//			pstmt.setString(6, dto.getLyrics());
//			
//			pstmt.execute();
//			
//		} catch (SQLException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally {
//			db.dbClose(pstmt, conn);
//		}
//	}
//	
//	public SongDto getData(int songnum)
//	{
//		SongDto dto=new SongDto();
//		String sql="select * from song where songnum=?";
//		Connection conn=db.getConnection();
//		PreparedStatement pstmt=null;
//		ResultSet rs=null;
//		
//		try {
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setInt(1, songnum);
//			rs=pstmt.executeQuery();
//			
//			if(rs.next()) {
//				dto.setSongnum(rs.getInt("songnum"));
//				dto.setSongname(rs.getString("songname"));
//				dto.setSinger(rs.getString("singer"));
//				dto.setGenre(rs.getString("genre"));
//				dto.setAlbum(rs.getString("album"));
//				dto.setSongdate(rs.getInt("songdate"));
//				dto.setLyrics(rs.getString("lyrics"));
//			}
//			
//		} catch (SQLException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally {
//			db.dbClose(rs, pstmt, conn);
//		}
//		return dto;
//	}
	
	public SongDto searchData(String singer) {
		SongDto dto = new SongDto();
		System.out.println(singer);
		String sql = """
				select * from song where singer=?
				""";
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, singer);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setSongnum(rs.getInt("songnum"));
				dto.setSongname(rs.getString("songname"));
				dto.setSinger(rs.getString("singer"));
				dto.setGenre(rs.getString("genre"));
				dto.setAlbum(rs.getString("album"));
				dto.setSongdate(rs.getString("songdate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			db.dbClose(rs, pstmt, conn);
		}
		return dto;
	}
}





























