package E2_배열2_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2_알고리즘_영화예매 {

	/*
	 * # 영화관 좌석예매
	 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
	 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
	 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
	 * 4. 한 좌석당 예매 가격은 12000원이다.
	 * 5. 프로그램 종료 후, 해당 영화관의 총 금액을 출력한다.
	 * 예)
	 * seat = 0 0 0 0 0 0 0
	 * 
	 * 좌석선택 : 1
	 * seat = 0 1 0 0 0 0 0
	 * 
	 * 좌석선택 : 3
	 * seat = 0 1 0 1 0 0 0
	 * 
	 * 좌석선택 : 3
	 * seat = 0 1 0 1 0 0 0
	 * 이미 예매가 완료된 자리입니다.
	 * ----------------------
	 * 총금액 : 24000원
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int[] seat = new int[7];
		seat [0] = 1;
		seat [1] = 2;
		seat [2] = 3;
		seat [3] = 4;
		seat [4] = 5;
		seat [5] = 6;
		seat [6] = 7;
		int movie = 12000;
		int count = 0;
		int 카드 = 100000;
		int run = 1;		
		while(run == 1) {
			System.out.println("=메가 영화관=");				
			System.out.println("1.좌석예매");
			System.out.println("2.구매");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				for(int i = 0; i < 7; i++) {
					System.out.print(seat[i] + " ");
				}
				System.out.println();
				
				System.out.println("예매할 좌석을 입력하세요.");
				int sel2 = scan.nextInt();
				int max = 9;
				int room = -1;
				
				
				for(int i = 0; i < seat.length; i++) {
					if(sel2 == seat[i]) {
						seat[i] = max;
						room = i;
						count +=1;
						
					}
					else if(sel2 == max) {	
						System.out.println("이미 예매가 완료된 자리입니다.");					
					}
			}
			
			}else if(sel == 2) {
				     int 금액 = count*movie;
				     System.out.println("총금액 : " + 금액);
				     System.out.println("카드를 넣으시오.");
				     if(금액 > 카드){
				    	 System.out.println("잔액부족");
				     }
				     else {
				    	 System.out.println("잔액 : " + (카드 - 금액));
				     }
				System.out.println("구매완료.");
				break;
			}
		}
		System.out.println(Arrays.toString(seat));
		
	}

}