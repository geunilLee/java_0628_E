package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����03_1 {
		/*
		 *   numberList = { 1001, 1002, 1003, 1004, 1005 };
			 scoreList = { 87, 11, 45, 98, 23 };
			 [����] �й��� �Է¹޾� ���� ���
			 [����] �й� �Է� : 1003 ���� : 45��
		 */
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
			int[] scoreList = { 87, 11, 45, 98, 23 };
			int room = -1;
			int i = 0;
			while(true) {
				
				System.out.println("�й��Է��Ͻÿ�.");
				int sel = scan.nextInt();
				
				if(sel == -1000) {
					System.out.println("����");
					break;
				}
				else if(numberList[i] == sel) {// �й��� �Է°��� ������ �׶� ���ھ� ����Ʈ�� �ε��� i ���� �����ε��� i���� �� ����������
				//���ھ�� ������ �й��� �Է°��̰����� �й��� �Է��Ͽ� ������ ��������ϸ� ���������� ����Ҽ��ִ�
					
					room = i;
					System.out.println("���� : " +  scoreList[room]);
					if(i == 4) {
						
						i = 0;
				}				
				i+=1;
			}
			


		}
	}
}
