package E2_�迭2_�˰���;
public class �迭2_�˰���_1��4 {
	/*
	 * [����]
	 * 
	 * [1��]
	 *   �Ʒ� �����ʹ� �л���ȣ1��, ����2���� �Ѽ�Ʈ�̴�. 		
		 ��ȣ�� 1001���ͽ����̰� , ������ 0~100 �̴�. 
		 ��) 1001 , 20, 30 ==> 1001�� 1������ 20��, 2������ 30��
		 		 
		
		 1���� ��ȣ ����Ѵ�. 
		 ������ �������� �����ΰ���Ѵ�. 
	 */
	public static void main(String[] args) {
		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
		
		
		int b = 0;
		int  room = -1;
		for(int i = 0; i<arr.length; i+=3 ) {
			int a = 0;
			
			int idx = i+1;
			a = arr[idx] + arr[idx+1];
			if(b<a) {
				b = a;
				room = i;
			}
		}
		System.out.println("�й� : " + arr[room]+" "+"1������ : " + arr[room+1] +" " + "2������ : " + arr[room+2]);
		
		
	}
}
