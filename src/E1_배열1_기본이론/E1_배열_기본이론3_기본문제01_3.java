
package E1_�迭1_�⺻�̷�;

public class E1_�迭_�⺻�̷�3_�⺻����01_3 {
	/*
	 * 
		 [����1] 10���� 50���� array �迭�� ������ �迭���� ��簪�� ����Ѵ�.
		 [��] 10 20 30 40 50
	
		 [����2] array �迭���� ��簪�� ����Ѵ�.
		 [��] 150
	 */
	public static void main(String[] args) {
		int[] array = null;// ��δ� 0
		array = new int[5];// 5���� �������� �� �⺻���� 0		
		array[0] = 10; // ������ ������ ���� ���� 
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		int a= 0;
		for(int i = 0; i< 5; i++) {// ���ư���Ƚ���� 5�̻��̸� ���� ������ ����
			//���߶�  0 1 2 3 4 index i�� 0���� �����ؾߵǴ� ����
			//���߶�  1 2 3 4 5 i 5 �̸� ���ϰ��Ǹ� �ȵǴ�����
			a += array[i];
			
		}
		System.out.println("�� : " + a);
	}
	
	
	
	
	
	
}