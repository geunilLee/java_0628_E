package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����05_1 {

	/*
	 *  
	 *  numberList = {1001, 1002, 1003, 1004, 1005};
	 *	scoreList  = {  87,   11,   45,   98,   23};
	 * 
	 *  [����] �й��� �Է¹޾� ���� ����Ѵ�. 
		 		��, �����й� �Է� �� ����ó�� �Ͻÿ�.
		 ��)
		 �й� �Է� : 1002		���� : 11��
		 �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�. 
	 */	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList  = {  87,   11,   45,   98,   23};
		
		
		int run = 1;
		while(run == 1) {
			System.out.println("�й��Է�");
			int sel = scan.nextInt();
			int room = -1;
			if(sel == -1000) {
				System.out.println("����");
				run = 0;
				break;			
			}
				
			
			for(int i = 0; i < 5; i++) {
				if(numberList[i] == sel) {
					
					room = i;
				}				
			}
			if(room == -1) {
				System.out.println("�ش��й��� ���������ʽ��ϴ�.");
			}
			else {
				System.out.println("�й� : " + numberList[room]);
				System.out.println("���� : " + scoreList[room]);
			}
				
		
		
		}
		
	}

}
