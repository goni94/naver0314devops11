package day0328;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex6_SwingCanvasRadio extends JFrame{
	
	final static String PHOTO1 = "C:\\Users\\user\\Desktop\\naver0314\\workall\\image\\연예인사진 (2)\\19.jpg"; //수지
	final static String PHOTO2 = "C:\\Users\\user\\Desktop\\naver0314\\workall\\image\\연예인사진 (2)\\18.jpg"; //신세경
	final static String PHOTO3 = "C:\\Users\\user\\Desktop\\naver0314\\workall\\image\\연예인사진 (2)\\15.jpg"; //설현
	final static String PHOTO4 = "C:\\Users\\user\\Desktop\\naver0314\\workall\\image\\연예인사진 (2)\\2.jpg"; //김우빈
	
	Color boxColor = new Color(67,196,207); //초기 박스 색상
	JRadioButton rbBOX1,rbBOX2,rbBOX3,rbBOX4;
	JRadioButton []rbPhoto = new JRadioButton[4];
	int phootoIndex = 1; //처음에 수지사진
	
	MyDraw draw = new MyDraw();
	
	public Ex6_SwingCanvasRadio(String title) {
		super(title);
		this.setLocation(100, 100); //시작위치
		this.setSize(400, 500); //창크기
//		this.getContentPane().setBackground(new Color(138, 199, 119)); //배경색 변경
//		this.getContentPane().setBackground(Color.black); //배경색 변경
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 종료
		this.initDesign(); //각종 컴포넌트 생성
		this.setVisible(true);
	}
	
	//캔바스 내부 클래스
	class MyDraw extends Canvas
	{
		public void paint(Graphics g) {
			super.paint(g);
			
			//채워진 박스 그리기
			g.setColor(boxColor);
			g.fillRect(30, 70, 320, 320);
			
			Image image = null;
			switch(phootoIndex)
			{
			case 1:
				image = new ImageIcon(PHOTO1).getImage();
				break;
			case 2:
				image = new ImageIcon(PHOTO2).getImage();
				break;
			case 3:
				image = new ImageIcon(PHOTO3).getImage();
				break;
			case 4:
				image = new ImageIcon(PHOTO4).getImage();
				break;
			}
			g.drawImage(image, 80, 100, 220, 260, this);
		}
	}
	
	public void initDesign()
	{
		this.add("Center",draw);
		//상단에 색상 라디오 버튼 추가
		JPanel pTop = new JPanel();
		ButtonGroup bg1 = new ButtonGroup();
		rbBOX1 = new JRadioButton("초록색");
		bg1.add(rbBOX1);
		pTop.add(rbBOX1);
		
		rbBOX2 = new JRadioButton("하늘색",true);
		bg1.add(rbBOX2);
		pTop.add(rbBOX2);
		
		rbBOX3 = new JRadioButton("분홍색");
		bg1.add(rbBOX3);
		pTop.add(rbBOX3);
		
		rbBOX4 = new JRadioButton("오렌지색",true);
		bg1.add(rbBOX4);
		pTop.add(rbBOX4);
		
		//rbBox1 에 대한 이벤트
		rbBOX1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boxColor = Color.green;
				draw.repaint();
			}
		});
		
		rbBOX2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boxColor = Color.cyan;
				draw.repaint();
			}
		});
		
		rbBOX3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boxColor = Color.pink;
				draw.repaint();
			}
		});
		
		rbBOX4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boxColor = Color.orange;
				draw.repaint();
			}
		});
		
		//프레임 상단에 Panel 추가
		this.add("North",pTop);
		
		//프레임의 하단에는 사진 선택하는 라디오 버튼 추가
		JPanel pBottom = new JPanel();
		ButtonGroup bg2 = new ButtonGroup();
		
		String []s = {"수지","신세경","설현","김우빈"};
		for(int i=0; i<rbPhoto.length; i++)
		{
			final int n = i+1;
			
			rbPhoto[i] = new JRadioButton(s[i], i==(phootoIndex-1)?true:false);
			//그룹변수에 추가
			bg2.add(rbPhoto[i]);
			//패널에도 추가
			pBottom.add(rbPhoto[i]);
			
			//이벤트
			rbPhoto[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//photoIndex = i+1;
					phootoIndex = n;
					draw.repaint(); //캔바스 내부클래스의 paint 메소드 강제 호출
				}
			});
		}
		
		this.add("South",pBottom);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex6_SwingCanvasRadio a = new Ex6_SwingCanvasRadio("캔바스2");
	}

}
