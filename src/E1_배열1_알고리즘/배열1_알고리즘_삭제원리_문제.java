package E1_�迭1_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭1_�˰���_��������_���� {
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
		
		System.out.println("���� �Է��Ͻÿ�.");
		int sel = scan.nextInt();
		int room = 0;
		for(int i = 0; i<a.length; i++) {
			if(sel != a[i]) {// �����ϸ鼭 �ε����� Ȯ���ϴ� ���� �ΰ��� �ݺ������� 
				// �ƴϸ� �迭 b�� ���� �������ϰ� ������ 0���� �Ѿ���Ѵ�.
				b[room] = a[i];
				room += 1; 
			}
		}
		System.out.println(Arrays.toString(b));
		
		System.out.println("------------------------------------------");
		
		
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		
		System.out.println("��ȣ�Է�");
		 int sel2 = scan.nextInt();
		 
		int room2 = 0;
		for(int i = 0; i<c.length; i+=2) {
			if(sel2 != c[i]) {
				d[room2] = c[i];
				room2 += 1;
				d[room2] = c[i+1];
				room2 += 1;
			}
		}
		System.out.println(Arrays.toString(d));
		
	}
}