package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����02_9 {
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
		System.out.println("��ȣ �Է��Ͻÿ�.");
		int idx = scan.nextInt();
		System.out.println(array[idx]);
		
		System.out.println("-------------------");
		System.out.println("���� �Է��Ͻÿ�.");
		int score = scan.nextInt();
		int room = -1;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == score) {// ����87�Է½� �ε����� 0 ������ �Է��ϸ� �й��̳��;�������
				//87�϶� �й��� room�� �������� room�� ���
				room = i;
			}
		}
		System.out.println(room);
		

	}

}
