package E2_배열2_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2_알고리즘_회원가입_문제 {
	/*
	 * [회원가입] 동영상으로 설명
	 */
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);	
		int[] arr = {0, 0, 0, 0, 0};
		
		boolean check [] = new boolean[arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			check [arr.length]= false;
		}
		
		
		int count = 0;
		int i = 0;
		while(true) {
			System.out.println("===[회원가입]===");
			System.out.println(Arrays.toString(arr));
			System.out.println("1.추가");
			System.out.println("2.수정");
			System.out.println("3.삭제(인덱스)");
			System.out.println("4.삭제(값)");
			System.out.println("5.삽입");
			int sel = scan.nextInt();
			
			if(sel == 1) {				
				System.out.println("아이디입력하시오");
				int id = scan.nextInt();				
					if(check [arr.length]== false) {
						arr[i] = id;
						check [i]= true;
						i++;
					}
				
				System.out.println(Arrays.toString(arr));				
			}
			else if(sel == 2) {
				
			}
			else if(sel == 3) {
				
			}
			else if(sel == 4) {
				
			}
			else if(sel == 5) {
				
			}
		}
		
		
	}
}