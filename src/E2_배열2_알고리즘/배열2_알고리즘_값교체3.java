package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2_�˰���_����ü3 {

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
		for(int i = 0; i<arr.length; i++) {
			System.out.print (arr[i] + " ");
		}
		System.out.println("�� �Է�");
		int idx3 = scan.nextInt();
		System.out.println("��2 �Է�");
		int idx4 = scan.nextInt();
		
		int room = -1;
		int room2 = -2;
		
		
		for(int a = 0;  a<arr.length; a++) {
			if(idx3 == arr[a]) {				
				room = a;
			}
			if(idx4 == arr[a]) {			
				room2= a;			
			}
		}
		temp = arr[room2];
		arr[room2] = arr[room];
		arr[room] = temp;
		
		System.out.println(Arrays.toString(arr));
		
		

		
	}

}
