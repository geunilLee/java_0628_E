package E2_�迭2_�˰���;

import java.util.Arrays;

public class �迭2_�˰���_����ü {
	
	// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
			// �� 1) �ε���1 �Է� : 1  , �ε���2 �Է� : 3
			// {10, 40, 30, 20, 50}

			// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
			// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
			// {10, 20, 30, 40, 50}

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };		
		int i1 = 1;
		int i2 = 3;
		int temp = array[i1];// �켱 �ε��� 1�� ���� ������ ���� ����
		array[i1] = array[i2];// �ε��� 1�� ���� �ε��� 3�� ���� 40���� ���� ����
		array[i2] = temp;// �̶� ������ 20������ �ε��� 3(40)�� 20���� ���� 
		System.out.println(Arrays.toString(array));// ����� �迭 ���(���ϰ� array ���)
		
		int a = 40;
		int b = 20;
		for(int i = 0; i < array.length; i++) {
			if(a == array[i]) {
				i1 = i;// �̶� a ���� 40 �ݺ������� 40�� ã�´� �̶� i�� i1�� ����
			}
			if(b == array[i]) {
				i2 = i;// �̶� b���� 20 �ݺ������� 20�� ã�´� �̶� i�� i2�� ����
			}
		}
		temp = array[i1];//�̶� array[i1] == 40 ������ 40���� ����
		array[i1] = array[i2];//array[i2](20)�� array[i1](40)���κ��� ==> array[i1] == 40
		array[i2] = temp;//array[i1] == 40�� ����Ǿ��ִ� ������ array[i2]�� ���� ==> array[i2] == 20
		System.out.println(Arrays.toString(array));
		
		
	}

}
