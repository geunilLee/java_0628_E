package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����02_3 {
	/*
	 * 	 array = { 87, 11, 45, 98, 23 };
	  
		 [����1] �ε����� �Է¹޾� ���� ���
		 [����1] �ε��� �Է� : 1 ���� : 11��
	
		 [����2] ������ �Է¹޾� �ε��� ���
		 [����2] ���� �Է� : 11 �ε��� : 1
	 */
	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		int[] array = { 87, 11, 45, 98, 23 };
		
		System.out.println("�ε��� �Է�");
		int index = scan.nextInt();
		
		System.out.println(array[index]);// �ε��� �Է½� �ش� �ε����� ����Ǿ� �ִ� ���� ��µȴ�
		
		

		System.out.println("�����Է�");
		int score = scan.nextInt();
		
		int room = -1;	// ������ִ� ���� �̿��� ���� �Է½� -1 ���	
		for(int i = 0; i < 5; i++){// �ݺ��� index == 5 
			
			if(score == array[i]) {
				room = i;
			}
		}
		System.out.println(room);

	}

}