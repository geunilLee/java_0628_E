package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2_�˰���_����ü5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };

		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1  , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}

		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}
		System.out.println("��ü�� �ε����Է�");
		int sel3 = scan.nextInt();
		System.out.println("��ü�� �ε���2�Է�");
		int sel4 = scan.nextInt();
		
		int b = 0;
		int c = 0;
		int f = 0;
		int g = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(sel3 == i) {
				c = i;
			}
			if(sel4 == i) {
				b = i;
			}			
		}
		f = arr[c];
		arr[c] = arr[b];
		arr[b] = f;
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("��ü�� ���Է�");
		int sel = scan.nextInt();
		System.out.println("��ü�� ��2�Է�");
		int sel2 = scan.nextInt();
		
		int idx = 0;
		int room = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(sel == arr[i]) {
				room = i;				
			}
			if(sel2 == arr[i]) {
				idx = i;				
			}			
		}
		g = arr[idx];
		arr[idx] = arr[room];
		arr[room] = g;
		System.out.println(Arrays.toString(arr));
		
		
	}

}
