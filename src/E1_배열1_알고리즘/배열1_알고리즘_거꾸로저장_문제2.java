package E1_�迭1_�˰���;

import java.util.Arrays;

public class �迭1_�˰���_�Ųٷ�����_����2 {
	/*
	 * a = { 1,2,3,4,5 };
	 * 
	 * [����] a �迭�� ���� b �迭�� �ϳ��� �����ϴµ� ������ �Ųٷ� ���� 
	 * [��]   b = {5,4,3,2,1};
	 */
	
	public static void main(String[] args) {
		
		int a[] = { 1,2,3,4,5 };
		int b[] = { 0,0,0,0,0 };
		
		int idx = 4;
		for(int i = 0; i < a.length; i++) {
			b[idx] = a[i];
			idx-=1;
		}
		System.out.println(Arrays.toString(b));
	}
}
