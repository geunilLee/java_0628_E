package E1_�迭1_�⺻�̷�;

import java.util.Arrays;
import java.util.Random;

public class E1_�迭_�⺻�̷�4_�л�����01_4 {
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
		
		double av = 0;
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			int r = ran.nextInt(101);
			array[i] = r;
			total += array[i];
			av = total/array.length;
		}
		System.out.println("���� : " + total);
		System.out.println("��� : " + av);
		System.out.println(Arrays.toString(array));
		


	}

}
