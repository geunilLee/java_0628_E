package E1_�迭1_�˰���;

import java.util.Scanner;

public class �迭1_�˰���_�˻�_����2 {
	
	/*
	 *  array = {1001, 20, 1002, 45, 1003, 54};
	 *  
	 *  �й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
	 *  [����] �й��� �Է��ϸ� ���� ����Ѵ�.
	 *  [��] 1001==>20 , 1003 ==> 54
	 *  
	 *  [����] ������ �Է��ϸ� �й� ����Ѵ�. 
	 *  [��] 20 ==> 1001 , 45 ==> 1002
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int array[] = {1001, 20, 1002, 45, 1003, 54};
		System.out.println("�й��Է�");
		int number = scan.nextInt();
		int idx = 1;
		int room = -1;
		for(int i = 0; i< array.length; i++) {
			if(number == array[i]) {
				room = i;
			}			
		}
		System.out.println("�й� : " + array[room] +"  " + "���� : " + array[room+idx]);
		
		System.out.println("------------------------------------------------");
		System.out.println("�����Է�");
		int score = scan.nextInt();
		room = -1;
		for(int i = 0; i<array.length; i++) {
			if(array[i] == score) {
				room = i-1; 
			}
		}
		System.out.println("�й� : " + array[room]);
		
				
	}

}
