package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����02_1 {
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
		
		for(int i = 0; i < 5; i++){
			System.out.println("�ε��� ��ȣ : "+ i +"�� �л� : " + array[i]+"��");
		}
		
		while(true) {
			int sel = scan.nextInt();			
			for(int i = 0; i < 5; i++) {
				if(sel == i) {
					System.out.println(i + "���л� ���� : "+ array[i]);
				}
				else if(sel == array[i]) {
					System.out.println(array[i] + "����  " +i+ "�� �л��� �����̴�");				
				}
		}
			
		}
		
		

	}

}