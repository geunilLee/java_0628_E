package E1_�迭1_�⺻�̷�;

import java.util.Random;

public class E1_�迭_�⺻�̷�4_�л�����01_3 {
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
	int total = 0;
	int count = 0;
	
	double �л��� = 5.0;
	
	
	for(int i = 0; i < �л���; i++) {
		int r = ran.nextInt(101)+1;
		array [i] = r;
		total += r;
		System.out.print (array[i] + "  ");
		if(array[i] >= 60) {
			count += 1;
		}
	}
	System.out.println();
	System.out.println("���� : " + total);
	double avg = total/�л���;
	System.out.println("��� : " + avg);
	System.out.println("�հ��� �л��� : " + count);

}

}
