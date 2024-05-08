package data.dto;

import java.sql.Date;

public class SongDto {
	private int songnum;
	private String genre;
	private String songname;
	private String singer;
	private String songdate;
	private String album;
	private String url;
	
	public int getSongnum() {
		return songnum;
	}
	public void setSongnum(int songnum) {
		this.songnum = songnum;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getSongdate() {
		return songdate;
	}
	public void setSongdate(String songdate) {
		this.songdate = songdate;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
