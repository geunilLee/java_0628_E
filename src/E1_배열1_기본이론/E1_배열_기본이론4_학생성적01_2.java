package E1_�迭1_�⺻�̷�;

import java.util.Random;

public class E1_�迭_�⺻�̷�4_�л�����01_2 {
	/*
		 [����1] array �迭�� 1~100�� ������ ���� ������ 5�� �����ϰ� ���
		 ��)    87, 11, 92, 14, 47
		
		 [����2] �������� ������ ��� ���
		 ��)    ����(251) ���(50.2)
		
		 [����3] ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		 ��)   2��
	 */
	public static void main(String[] args) {
		Random ran = new Random(); 
		int[] array = new int[5];
		int a = 0;
		int count = 0;
		for(int i = 0; i<5; i++) {
			array[i] = ran.nextInt(101);		
				a += array[i];
				if(array[i] >= 60) {
					System.out.println(array[i]);
					System.out.println("�հ�");
					count+=1;
				}
				else {
					System.out.println(array[i]);
					System.out.println("���հ�");
				}
		}
		System.out.println("���� : " + a);
		System.out.println("��� : " + a/5.0);
		System.out.println("�հ��� �� : " + count);


	}

}
