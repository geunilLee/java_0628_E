package E1_�迭1_�˰���;

import java.util.Arrays;

public class �迭1_�˰���_��������_����3 {
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
		
		int room = 0;
		int room2 = 0;
		for(int i = 0; i<c.length; i++){
			c[i] = a[room];
			room+=1;
			i+=1;
			c[i] = b[room2];
			room2+=1;
		}
		System.out.println(Arrays.toString(c));
		System.out.println("----------------------------------------------------");
		
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		
		
		int idx = 0;
		for(int i = 0; i<e.length; i++) {
			e[i] = d[idx];
			idx += 1;
			f[i] = d[idx];
			idx += 1;// ������ߵǴ� ������ �������� ������Ű�� �й��ϴ� �迭�� ���������� �����Ͽ� �����ư��鼭
			//����ǰ� �Ѵ�
 		}
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
	}
}
