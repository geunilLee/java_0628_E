package 조별과제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 조별과제3 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String 획득증거품[] = {"x", "x", "x","x","x","x", "x"};
		String 증거품[] = { "연필", "에어팟", "반지", "@학생일기장@", "땀에 찌든 체육복","맛집체크리스트", "헨드폰"};
		String 범인 = "선생님";
		String [] 주민 = {"개발자", "미용사", "요리사","청소부","배우","운전기사", "선생님"};
		String [] 피해자 = {"x", "x", "x","x","x","x", "x"};
		int 특별증거품 = 0;
		boolean[] check = new boolean[7];
		int idx = 0;
		int trun = 1;
		int 생명 = 5;

		while (trun == 1) {
			if (특별증거품 == 3) {
				System.out.println("증거품 수집원료 결정적증거 획득 @증거품획득@");
				System.out.println("[1.확인해보기]");
				int  증거확인 = scan.nextInt();
				if(증거확인 == 1) {
					System.out.println("6월 17일 날씨맑음");
					System.out.println("받았쓰기 100맞아서 오늘은 엄마가 간짜장 곱베기를 사주셨다 너무 JMT");
				}				
				획득증거품[idx] = "@학생일기장@";
			}
			System.out.println("[1.사건현장방문]");
			int sel = scan.nextInt();

			if (sel == 1) {
				int r = ran.nextInt(7);
				if (check[r] == false) {
					check[r] = true;
					획득증거품[idx] = 증거품[r];
					idx++;
					System.out.println("증거품 획득");
					System.out.println(Arrays.toString(획득증거품));
				} else if (check[r] == true) {
					System.out.println("현장방문실패");
					System.out.println(Arrays.toString(획득증거품));
					continue;
				}
			}
			System.out.println("[1.증거품확인][2.next]");
			int sel2 = scan.nextInt();
			if (sel2 == 1) {
				System.out.println(Arrays.toString(획득증거품));
			}
			System.out.println("[1.턴넘기기] [2.검거하기]");
			int sel3 = scan.nextInt();
			if (sel3 == 1) {				
				trun = -1;
			}
			else if(sel3 == 2){
				System.out.println("범인직업입력");
				String sel5 = scan.next(); 
					if(sel5.equals(범인)) {
						System.out.println("검거성공");
						break;
					}else {
						생명--;
						System.out.println("검거실패");						
						System.out.println("생명 : " + 생명);
						System.out.println("남은 범인검거 기회 : " +생명+"회");	
						trun = -1;
					}
					if(생명 <= 0 ) {
						System.out.println("탐정이 살해당했습니다");
						System.out.println("뒷통수 조심");
						break;
					}
			}			
	
			System.out.println("밤이되었습니다.");
			while (trun == -1) {
				System.out.println("살해할 인물 지정");
				System.out.println(Arrays.toString(주민));
				String name = scan.next();
				int bb  = 6;
				for(int i = 0; i < 피해자.length-1; i++) {	
					피해자[bb] = 피해자[bb-1];
					bb -= 1;
				}
				피해자[0] = name;
				break;
			}
			System.out.println("이번 피해자");
			System.out.println(Arrays.toString(피해자));
			trun = 1;		
		}
	}
}
