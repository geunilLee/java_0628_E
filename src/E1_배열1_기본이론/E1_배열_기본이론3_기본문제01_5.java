package E1_�迭1_�⺻�̷�;

public class E1_�迭_�⺻�̷�3_�⺻����01_5 {
	/*
	 * 
		 [����1] 10���� 50���� array �迭�� ������ �迭���� ��簪�� ����Ѵ�.
		 [��] 10 20 30 40 50
	
		 [����2] array �迭���� ��簪�� ����Ѵ�.
		 [��] 150
	 */
	public static void main(String[] args) {
		
		int array[] = new int [5];
		array[0] = 10;// array 0�� �濡 ���� 10�� �Է�
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		int index = 0;
		int a = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("�ε��� : " +index+"��" +"  "+ array[i]);
			a += array[i];
			index+=1;
		}
		System.out.println("��簪 : " + a);
	}

}
