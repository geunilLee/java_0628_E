package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2_�˰���_����ü4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = { 10, 20, 30, 40, 50 };

		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1  , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}

		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}
		
		System.out.println("�ε��� �Է�");
		int idx = scan.nextInt();
		System.out.println("�ε���2 �Է�");
		int idx2 = scan.nextInt();
		
		int temp = arr[idx];
		arr[idx] = arr[idx2];
		arr[idx2] = temp;
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("�� �Է�");
		int sel = scan.nextInt();
		System.out.println("��2 �Է�");
		int sel2 = scan.nextInt();
		int room = -1;
		int room2 = -2;
		for(int i = 0; i < arr.length; i ++) {
			if(sel == arr[i]) {
				room = i;
			}
			if(sel2 == arr[i]) {
				room2 = i;
			}
		}
		temp = arr[room];
		arr[room] = arr[room2];
		arr[room2] = temp;				
		System.out.println(Arrays.toString(arr));
		
	}

}
