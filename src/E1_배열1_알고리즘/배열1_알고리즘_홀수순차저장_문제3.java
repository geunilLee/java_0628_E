package E1_�迭1_�˰���;

import java.util.Arrays;

public class �迭1_�˰���_Ȧ����������_����3 {
	/*
	 * [����1] ���� ����Ʈ�� �̿��ؼ� arr1 �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
	 * [��]   b = { 0, 49, 51, 0, 17 }
	 * 
	 * [����2] ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����
	 * [����] ��ġ�� �տ��� ���� �����Ѵ�. 
	 * [��]   c = { 49, 51, 17, 0, 0 }
	 */
		
	public static void main(String[] args) {
		int arr1[] = { 10, 49, 51, 36, 17 };	
		int b[] = { 0,0,0,0,0 };	
		int c[] = { 0,0,0,0,0 };
		
		
		for(int i = 0; i<5; i ++) {
			if(arr1[i]%2 == 1) {
				b[i] = arr1[i];
			}
		}
		System.out.println(Arrays.toString(b));
		System.out.println("----------------------------------------");
		
		int idx = 0;
		for(int i = 0; i<5; i++){
			if(arr1[i]%2 == 1) {
				c[idx] = arr1[i];
				idx++;
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
