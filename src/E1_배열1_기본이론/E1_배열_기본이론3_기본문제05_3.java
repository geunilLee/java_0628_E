package E1_�迭1_�⺻�̷�;

import java.util.Random;

public class E1_�迭_�⺻�̷�3_�⺻����05_3 {
	/*
	 * [����]
	 *  array �迭�� 0~100������ ������ 5�� ������ ��簪�� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Random ran = new Random(); 

		int array[] = new int[5];// �����ϴ� ��δ� ��ټ����� �ϳ��߰� 0~4�� �� 
		
		for(int i = 0; i < 5; i++) {// i�� 0���� 5���� �ݺ��� i ����
			int r = ran.nextInt(101);//�ݺ����� ������ �������� 5�����
			array[i] = r;// r�� array[i]�� �����Է�
			System.out.println(array[i]);//�������ڸ� ����Ϸ��� array[i]�� ���
		}
		
	}
}
