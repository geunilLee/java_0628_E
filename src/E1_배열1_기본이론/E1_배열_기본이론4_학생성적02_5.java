package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����02_5 {
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
		
		
		
		int i = 0;
		while(i <100) {
			
			
				System.out.println("�ε��� �Է�");
				 int index = scan.nextInt();
				System.out.println(array [i]);
	
			
		
				System.out.println("�����Է�");
				int sel = scan.nextInt();
				if( sel == array [i]) {
					System.out.println(array[index]);
				}
			i+=1;
		}
		

	}

}
