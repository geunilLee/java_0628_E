package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����02_7 {
	/*
	 * 	 array = { 87, 11, 45, 98, 23 };
	  
		 [����1] �ε����� �Է¹޾� ���� ���
		 [����1] �ε��� �Է� : 1 ���� : 11��
	
		 [����2] ������ �Է¹޾� �ε��� ���
		 [����2] ���� �Է� : 11 �ε��� : 1
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = { 87, 11, 45, 98, 23 };
		
		while(true) {
			for(int i = 0; i < 5; i++) {
				System.out.println("�ε����� �Է��Ͻÿ�.");
				int index = scan.nextInt();
				System.out.println(array[index]);			
			}
			for(int i = 0; i < 5; i++) {
				int room = -1;// �Է°��� ������ ���������� -1 ����̵Ǵ� ����
				System.out.println("���� �Է��Ͻÿ�.");
				int score = scan.nextInt();
				if(array[i] == score) {// ������ �Է°��̶� ������ i  �� ���̵ȴ� 
					room = i;
					System.out.println(room);
					
				}			
			}
			
		}
	}

}
