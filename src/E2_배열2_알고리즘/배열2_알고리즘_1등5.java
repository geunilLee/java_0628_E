package E2_�迭2_�˰���;
public class �迭2_�˰���_1��5 {
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
		int a = 0;
		int room = -1;
		for(int i = 0; i<arr.length; i+=3) {
			int c = 0;
			
			int dix = i+1;
			c += arr[dix];
			c += arr[dix+1];
			if(a<c) {
				a = c;
				room = i;
			}
		}
		System.out.println("��������ū �й� : " + arr[room]);
		System.out.println("1������ : " + arr[room+1]);
		System.out.println("2������ : " + arr[room+2]);
		
		
		
		
	}
}
