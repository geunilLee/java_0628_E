package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����02_8 {
	/*
	 * array = { 87, 11, 45, 98, 23 };
	 * 
	 * [����1] �ε����� �Է¹޾� ���� ��� [����1] �ε��� �Է� : 1 ���� : 11��
	 * 
	 * [����2] ������ �Է¹޾� �ε��� ��� [����2] ���� �Է� : 11 �ε��� : 1
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] array = { 87, 11, 45, 98, 23 };

		while (true) {
			System.out.println("�ε��� �Է�");
			int index = scan.nextInt();

			System.out.println(array[index]);

			System.out.println("�����Է�");
			int score = scan.nextInt();
			int room = -1;
			for (int i = 0; i < 5; i++) {
				if (array[i] == score) {
					room = i;
				}
			}
			System.out.println(room);

		}
	}

}
