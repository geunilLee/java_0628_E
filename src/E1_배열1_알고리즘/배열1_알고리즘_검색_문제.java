package E1_�迭1_�˰���;

import java.util.Scanner;

public class �迭1_�˰���_�˻�_���� {
	
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
		
		int idx = 0;
		int idx2 = 0;
		int room = -1;
		System.out.println("�й��Է�");
		int sel = scan.nextInt();	
		for(int i = 0; i<array.length; i++) {
					
			if(array[i] == sel) {
				idx =i+1;
				room = i;
			}
		}
		System.out.println("�й� : "+array[room]+" "+ "���� : " + array[idx] );
		
		System.out.println("---------------------------------------------");
		System.out.println("�����Է�");
		int sel2 = scan.nextInt();
		for(int i = 0; i < array.length; i++) {
			if(array[i] == sel2) {
				idx2 = i-1;
				room = i;
			}
		}
		System.out.println("�й� : " + array[idx2]+" "+"���� : "+array[room] );
		
		
		
		
		
		
		
		
	}
}
