package E1_�迭1_�⺻�̷�;

public class E1_�迭_�⺻�̷�3_�⺻����02_2 {
	/*
	 * 	array = {10,20,30,40,50};
	 * 
		[����1] 4�� ����� ����Ѵ�.
		[��] 20 40
		
		[����2] 4�� ����� ���� ����Ѵ�.
		[��] 60
		
		[����3] 4�� ����� ������ ����Ѵ�.
		[��] 2
	 */
	public static void main(String[] args) {
		
		int array []= new int[5];
		
		array [0] = 10;
		array [1] = 20;
		array [2] = 30;
		array [3] = 40;
		array [4] = 50;
		
		int a = 0;
		int i = 0;
		int count = 0;
		while(i<5) {// i�� 5�̸��ϵ��� �ݺ��� 						
				if(array [i]%4 == 0) {// �迭�߾� 4�ǹ����� ���ǹ�
					System.out.println("4�� ��� : " + array[i]);
					a += array[i];// 4�ǹ���� ��
					count += 1;//4�� ��� ���� ī��Ʈ
				}		
			i+=1;		
		}
		System.out.println("������ �� : " + a);
		System.out.println("4�ǹ�� ���� : " + count);
	}
}
