package E1_�迭1_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭1_�˰���_��������_����7 {
	/*
	 * 	[����]
	 *  �Ʒ��迭 a �� �ȿ� �ִ� ���� �ϳ� �Է¹޴´�.
	 *  b�迭�ȿ� ������ �Է��� ���� �����ϰ� �����Ѵ�.
	 *  
	 *  [��] 30 ==> b[] = {10,20,40,50,0};
	 *  
	 *  [����] 
	 *  �Ʒ� �迭 c�� ��ȣ�� ���� �ѽ��� �迭�̴�. 
	 *  ��ȣ�� �ϳ��� �Է¹ް� c�迭�� �ִ� ��ȣ�̸�, 
	 *  �׹�ȣ��  ���� �����ϰ� d�迭�� �����Ѵ�.
	 *  
	 *  [��] 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
	 *  
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
				
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		
		System.out.println("������ �� �Է�");
		int sel = scan.nextInt();
		
		int idx = 0;
		for(int i = 0; i<5; i++) {
			if(sel != a[i]) {
				b[idx] = a[i];
				idx ++;
			}
		}
		System.out.println(Arrays.toString(b));
		
		System.out.println("������ �й��Է�");
		int number = scan.nextInt();
		int room = 0;
		for(int i = 0; i<6; i+=2) {
			if(number != c[i]) {
				d[room] = c[i];
				room++;
				d[room] = c[i+1];
				room++;
							
			}
		}
		System.out.println(Arrays.toString(d));
		
		
		
	}

}
