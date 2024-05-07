package day0408;	//day0408 생성되었다

import java.awt.Color;	//색을 가져온다
import java.awt.event.ActionEvent;	//액션이벤트를 가져온다
import java.awt.event.ActionListener;	//액션리스너를 가져온다
import java.awt.event.ItemEvent;	//아이템이벤트를 가져온다
import java.awt.event.ItemListener;	//아이템리스너를 가져온다
import java.sql.Connection;	//커넥션을 가져온다
import java.sql.PreparedStatement;	//프리페어드스테이트먼트를 가져온다(높은 효율성으로 반복적으로 실행하기위해 사용됨)
import java.sql.ResultSet;	//리설트셋을 가져온다
import java.sql.SQLException;	//sql익셉션을 가져온다
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import db.common.DbConnect;

// private class Ex2_DbSawon extends JFrame //제이프레임을 상속받는다 비공개된 디비사원 클래스에
// public, private : 접근지정자
// 접근지정자 class class명 // 클래스 선언
// 접근지정자 class class명 extends 부모class명 // 상속받는 클래스 선언
// class도 자료형이다
	public class Ex2_DBSawon extends JFrame{	//공공의 class Ex2_DBSawon 확장하다 JFrame //공공의 db사원 클래스를 JFrame에 확장한다  //JFrame을 상속받는다
	DbConnect db=new DbConnect();	// 디비커넥트 디비 는 뉴 디비커넥트(); // new: 객체할당(생성)
	JTextField tfName,tfScore;	//제이텍스트필드 자료형으로 tfname,tfscore 변수명을 선언한다
	JComboBox<String> cbGender,cbBuseo,cbSearchBuseo; //jcombobox<string> 자료형으로 cbgender,cbbuseo,cbsearchbuseo 변수명을 선언한다 //jcombobox<string>는 클래스명 <자료형>
	JRadioButton []rb	//jradiobotton[] 자료형으로 변수명rb를 선언한다
	=new JRadioButton[3];	//jradiobutton[3] 객체할당한다
	JButton btnAdd,btnDel;	//jbutton 자료형으로 변수명 btnadd,btndel를 선언한다
	DefaultTableModel tableModel;	//defaulttabelmodel 자료형으로 변수명 tablemodel을 선언한다
	JTable table; // 자료형 jtable, 변수명 table //JTable table; : 변수

	int buseoIndex=1;//부서전체		//int자료형으로 변수명 buseoindex를 선언한다 //상수1를 buseoindex에 대입한다
	int genderIndex=1;//성별전체	

	public Ex2_DBSawon(String title) {	// 클래스안에 있고 클래스명이랑 같으면 생성자 
		// TODO Auto-generated constructor stub
		super(title);	//super(부모): jframe , 부모의 생성자 호출
		this.setLocation(100, 100);//시작위치		//this: 자신		// 자신의 메소드를 호출합니다 그메소드는 시작위치를 설정하는 메소드입니다
		this.setSize(500, 400);//창크기			// 자신의 메소드를 호출합니다 그메소드는 창크기를 설정하는 메소드 입니다
		this.getContentPane().	//자신의 메소드를 호출합니다 contentpane을 가져옵니다
		setBackground(new Color(93, 199, 187));//배경색 변경	//배경색을 설정합니다
		//this.getContentPane().setBackground(Color.yellow);//배경색 변경
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 종료
		this.initDesign();//각종 컴포넌트 생성
		//전체 데이타 출력
		this.writeSawon();
		this.setVisible(true);
	}

	public void writeSawon() //메소드 //접근지정자 반환타입 메소드명(파라미터 있을수도 없을수도 있다)
	{
		Connection conn=db.getConnection(); //connect 자료형을 변수명 conn으로 선언한다 // db.getconnetion()이라는 메소드를 호출해서 connection을 가져온다음 대입한다
		PreparedStatement pstmt=null; // preparedstatement 자료형을 변수명 pstmt으로 선언한다// 빈값을 대입한다
		ResultSet rs=null; //resultset 자료형을 변수명 rs로 선언한다 // null값을 대입한다
		String sql="";	// string 자료형을 변수명 sql로 선언한다 // ""에 대입한다
		if(genderIndex==1 && buseoIndex==1)//둘다 전체인경우
			sql="select * from sawon order by num";
		else if(genderIndex!=1 && buseoIndex==1)//성별은 선택,부서는 전체
			sql="select * from sawon where gender=? order by num";
		else if(genderIndex==1 && buseoIndex!=1)//성별은 전체 부서는 선택
			sql="select * from sawon where buseo=? order by num";
		else //부서,성별 모두 선택한경우
			sql="select * from sawon where buseo=? and gender=? order by num";

		try {
			pstmt=conn.prepareStatement(sql);
			//바인딩
			if(genderIndex!=1 || buseoIndex==1)
				pstmt.setString(1, genderIndex==2?"남자":genderIndex==3?"여자":"");
			else if(genderIndex==1 && buseoIndex!=1)
				pstmt.setString(1, buseoIndex==2?"홍보부":buseoIndex==3?"교육부":buseoIndex==4?"인사부":"");
			else if(genderIndex!=1 && buseoIndex!=1) {
				pstmt.setString(1, buseoIndex==2?"홍보부":buseoIndex==3?"교육부":buseoIndex==4?"인사부":"");
				pstmt.setString(2, genderIndex==2?"남자":genderIndex==3?"여자":"");
			}

			//실행
			rs=pstmt.executeQuery();
			//처음 시작시 데이타 삭제후 추가
			tableModel.setRowCount(0);
			while(rs.next())
			{
				Vector<String> data=new Vector<>();
				data.add(rs.getString("num"));
				data.add(rs.getString("name"));
				data.add(rs.getString("score"));
				data.add(rs.getString("gender"));
				data.add(rs.getString("buseo"));

				//행추가
				tableModel.addRow(data);				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn, rs);
		}

	}
	public void initDesign()
	{
		JPanel p1=new JPanel();
		p1.add(new JLabel("이름")); //p1변수명에 add메소드를 호출한다 파라미터 jlabel을 객체할당한다
		tfName=new JTextField(4);
		p1.add(tfName);

		p1.add(new JLabel("점수"));
		tfScore=new JTextField(4);
		p1.add(tfScore);

		String []g= {"남자","여자"};
		cbGender=new JComboBox<String>(g);

		p1.add(new JLabel("성별"));
		p1.add(cbGender);

		String []b= {"홍보부","인사부","교육부"};
		cbBuseo=new JComboBox<String>(b);

		p1.add(new JLabel("부서"));
		p1.add(cbBuseo);

		this.add("North",p1);
		//////////////////////////////////
		/// 중간은 테이블 ////////////////////
		String []title= {"시퀀스","사원명","점수","성별","부서명"};
		tableModel=new DefaultTableModel(title, 0);
		table=new JTable(tableModel);
		this.add("Center",new JScrollPane(table));

		///////////////////////////////////
		JPanel p2=new JPanel();
		btnAdd=new JButton("추가");
		btnDel=new JButton("삭제");
		p2.add(btnAdd);
		p2.add(btnDel);

		String []b2= {"전체부서","홍보부","교육부","인사부"};
		cbSearchBuseo=new JComboBox<String>(b2);
		p2.add(cbSearchBuseo);

		//RadioButton
		ButtonGroup bg=new ButtonGroup();
		String []g2= {"전체","남자","여자"};
		for(int i=0;i<rb.length;i++)
		{
			rb[i]=new JRadioButton(g2[i], i==0?true:false); //변수명 rb에 배열i번째 값을 가져온다 //제이라디오버튼을(변수명 g2를 배열i번째 값을 가져온다, i는0랑 같으면 true이거나 false이다) 객체할당한다
															// 제이라디오버튼을 변수명 배열i번째 rb에 대입한다
			bg.add(rb[i]);
			p2.add(rb[i]);

			final int idx=i;
			//라디오버튼 이벤트
			rb[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					genderIndex=idx+1;
					writeSawon();
				}
			});
		}

		this.add("South",p2);

		//부서검색 이벤트
		cbSearchBuseo.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				buseoIndex=cbSearchBuseo.getSelectedIndex()+1;
				writeSawon();
			}
		});

		//추가버튼 이벤트
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//입력안했을경우 이벤트 종료
				if(tfName.getText().length()==0)
					return;
				if(tfScore.getText().length()==0)
					return;				

				//입력값을 db 에 insert
				Connection conn=db.getConnection();
				PreparedStatement pstmt=null;
				String sql="insert into sawon values (null,?,?,?,?)";

				try {
					pstmt=conn.prepareStatement(sql);
					//? 갯수만큼 바인딩
					pstmt.setString(1, tfName.getText());
					pstmt.setInt(2, Integer.parseInt(tfScore.getText()));
					pstmt.setString(3, cbGender.getSelectedItem().toString());
					pstmt.setString(4, cbBuseo.getSelectedItem().toString());

					//실행
					pstmt.execute();
					//입력값 초기화
					tfName.setText("");
					tfScore.setText("");
					cbGender.setSelectedIndex(0);
					cbBuseo.setSelectedIndex(0);

					//다시 출력
					writeSawon();				

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally {
					db.dbClose(pstmt, conn);
				}
			}
		});

		//삭제 이벤트
		btnDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//테이블의 선택한 행번호 row를 얻는다
				int row=table.getSelectedRow();
				//row가 -1이면 경고메세지후 이벤트 종료
				if(row==-1) {
					JOptionPane.showMessageDialog(Ex2_DBSawon.this, "삭제할 행을 선택해주세요");
					return;
				}
				//row행의 0번열에 있는 시퀀스값을 얻는다 getValueAt
				String num=table.getValueAt(row, 0).toString();

				//그 시퀀스에 해당하는 db데이타를 삭제하는 sql문 작성
				String sql="delete from sawon where num=?";

				//Connection,PreparedStatement 생성후 sql 문 실행
				Connection conn=db.getConnection();
				PreparedStatement pstmt=null;

				try {
					pstmt=conn.prepareStatement(sql);
					pstmt.setString(1, num);
					pstmt.execute();//db 에서 삭제

					//db 다시 불러오기
					writeSawon();				

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally {
					db.dbClose(pstmt, conn);
				}
			}
		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2_DBSawon a=new Ex2_DBSawon("사원관리");
	}

}