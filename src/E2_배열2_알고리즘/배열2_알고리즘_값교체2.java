package E2_�迭2_�˰���;

import java.util.Arrays;

public class �迭2_�˰���_����ü2 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };

		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1  , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}

		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}

		int i1 = 1;
		int i2 = 3;
		int temp = array[i1];
		array[i1] = array[i2];
		array[i2] = temp;
		System.out.println(Arrays.toString(array));
		
		int a = 40;
		int b = 20;
		
		for(int i = 0; i < array.length; i++) {
			if(a == array[i]) {
				i1 = i;
			}
			if(b == array[i]) {
				i2 = i;
			}
			
		}
		temp = array[i2];// ���� 20�� ���� 
		array[i2] = array[i1];// 40��ġ�� in 3 => in 1
		array[i1] = temp;// 40�� 20���� ����
		System.out.println(Arrays.toString(array));
		
	}

}
