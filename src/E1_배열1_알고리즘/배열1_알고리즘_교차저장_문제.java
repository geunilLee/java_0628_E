package E1_�迭1_�˰���;

import java.util.Arrays;

public class �迭1_�˰���_��������_���� {
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
		int room = 1;
		int z = 0;
		int g = 0;
		for(int i = 0; i<c.length; i++) {
			if(room == 1) {
				c[i] = a[z];
				room = -1;				
				z++;
			}			
			else if(room == -1) {
				c[i] = b[g];
				room = 1;				
				g++;
			}
		}
		System.out.println(Arrays.toString(c));
		
		System.out.println("-------------------------");
		int trun = -2;
		int m = 0;
		int n = 0;
		for(int i = 0; i<d.length; i++) {
			if(trun == -2) {
				e[m] = d[i];
				trun = 2;
				m++;
			}
			else if(trun == 2) {
				f[n] = d[i];
				trun = -2;
				n++;
			}
			
		}
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
	}
}