package E1_�迭1_�˰���;

import java.util.Arrays;

public class �迭1_�˰���_��������_����4 {
	/*
	 * [����1] a�� ���� b�� ���� �����ư��鼭 c�� �����Ѵ�.
	 * [��] 
	 * 	c = {10,40,20,50,30,60}
	 * 
	 * 
	 * [����2] d�� ���� �����ư��鼭 e, f �� ���� ���� 
	 * [��]
	 * 	e = {10,30,50}
	 * 	f = {20,40,60};
	 * 
	 */
	public static void main(String[] args) {
	
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
			
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		
		int room = 0;
		for(int i = 0; i<a.length; i++) {
			c[room] = a[i];
			room++;
			c[room] = b[i];
			room++;
		}
		System.out.println(Arrays.toString(c));
		System.out.println("----------------------------------------------");
		int idx = 0;
		for(int i = 0; i<e.length; i++) {
			e[i] = d[idx];
			idx++;
			f[i] = d[idx];
			idx++;
		}
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
	}

}
