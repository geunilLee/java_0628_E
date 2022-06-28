package 조별과제;

import java.util.Random;
import java.util.Scanner;

public class 조별과제2 {
	/*
	 살인사건의 범인을 잡는 게임이다.
	 범인은 매일밤 살인을 저지른다
	 탐정은 범인을 잡으면 게임은 끝난다.
	 범인을 잡는 방법은 증거물수집을해 범인을 잡을수있다.
	 범인을 잡지못하면 살인사건이 계속일어난다.
	 
	
	 
	 사건장소 : 지하창고,침실, 욕실, 옥상,  
	 */
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
	

		int 취조실 [] = new int[1];
		String [] 주민 = {"개발자", "미용사", "요리사","청소부","배우","선생님","운전기사", "사냥꾼"};
		String [] 장소 = {"지하창고","침실","욕실","옥상","주방","베란다","방1","방2"};

		System.out.println("비가 많이 내리던 어느 날 갑자기 밖에서 비명소리가 들렸다");
		int a = scan.nextInt();
		System.out.println("꺄아~~~~~~~~~~~~~");
		System.out.println("다음날 아침 밖을 나가보니 어느 집에 배우가 죽어있었다.");
		System.out.println("살인자를 찾기위해 마을에 유명한 탐정이 오게된다..");
		
		
			
			
		 
			//System.out.println(r);
			
			//System.out.println(r2);
			for(int i = 0; i < 주민.length; i++) {
				int r = ran.nextInt(7)+1;
				int r2 = ran.nextInt(7)+1;
				//if(i >= 0)
				//{
				if(장소[r] == 주민[r2]) {
					System.out.println(장소[r] + "에서 " + 주민[r2] + "가 죽은채로 발견되었다.");
					break;
					
				}
					
				//}
				
			}
			
	}

}
