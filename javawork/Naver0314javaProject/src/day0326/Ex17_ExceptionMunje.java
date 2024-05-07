package day0326;
/*
 * score.txt 를 읽어서 총갯수와 총점, 평균을 구하시오
 * 단, 점수에 문자가 있는 경우 갯수에서 제외하고 총점에서도 제외하고 결과 출력이 되도록 하기
 * 
 * 갯수 : 13개
 * 총점 : 990
 * 평균 : 78.99
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

public class Ex17_ExceptionMunje {
	static final String FILENAME = "C:\\Users\\user\\Desktop\\naver0314/score.txt";
	static int count = 0;
	static int sum = 0;
	static double avg = 0;
	static public void readScore()
	{
		BufferedReader br = null; // 파일내용을 불러옴
		FileReader fr = null; // 파일만 불러옴


		try {
			fr = new FileReader(FILENAME);
			System.out.println("** score 파일을 읽습니다 **");
			br = new BufferedReader(fr);

			while (true)
			{
				String line = br.readLine();
				if (line == null) // 읽을 데이타가 더이상 없을경우 while 종료
					break;

				try {
					int su = Integer.parseInt(line); // 문자를 숫자로 변환 // 문자일 경우 catch 이동
					System.out.println(su);
					count = count + 1;
					sum = sum + su;

				} catch (Exception e) {
					e.printStackTrace(); // 오류내용 출력
				}	
			}

			avg = (double)sum/count;
			
//			NumberFormat nf = NumberFormat.getInstance();
//			nf.setMaximumFractionDigits(2);
			
			System.out.println("=".repeat(30));
			System.out.println("총갯수: "+count);
			System.out.println("총점: "+sum);
//			System.out.printf("평균: "+nf.format(avg));
			System.out.printf("평균: %.1f",avg);
			System.out.println();
			System.out.println("=".repeat(30));

		} catch (FileNotFoundException e) {
			System.out.println("** score 파일이 없어요 **");
			// TODO: handle exception

		} catch (IOException e) {
			e.printStackTrace();

		} finally {

			try {
				br.close();
				fr.close();

			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readScore();

	}
}
