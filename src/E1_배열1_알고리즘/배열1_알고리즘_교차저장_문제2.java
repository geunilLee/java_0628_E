package E1_�迭1_�˰���;

import java.util.Arrays;

public class �迭1_�˰���_��������_����2 {

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
		
		int index = 0;
		int p = 0;
		int z = 1;
		for(int i = 0; i < a.length;i++) {
			c[index] = a[i];	
			index += 1;
			c[index] = b[i];
			index += 1;			
		}
		System.out.println(Arrays.toString(c));
		System.out.println("--------------------------------------------");
		int index2 = 0;
		for(int i = 0; i<a.length; i++) {
			e[i] = d[index2];
			index2 +=1;
			f[i] = d[index2];
			index2 +=1;			
		}
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
	}

}
