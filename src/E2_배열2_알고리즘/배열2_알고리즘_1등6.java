package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2_�˰���_1��6 {
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
		Scanner scan = new Scanner(System.in);
		
		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
		System.out.println("");
		int a = 0;
		int c = 0;
		int idx = 0;
		int room = -1;
		for(int i = 0; i<arr.length; i+=3) {
			 a = arr[i+1]+arr[i+2];			  
			if(c<a) {
				c = a;
				room = i;				
			}
			idx++;			
		}
		System.out.println("�й� : " + arr[room] + "(" + "1�� ���� ���� : " + arr[room+1] +")" + "(2�� ���� ���� : " + arr[room+2]+")");
		
		
		
		
		
		
	}

}
