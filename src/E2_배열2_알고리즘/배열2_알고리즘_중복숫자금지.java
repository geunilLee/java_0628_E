package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Random;

public class �迭2_�˰���_�ߺ����ڱ��� {

	/*
	 * [����]
	 * 
	 *  [�ߺ����� ����]
	 * 1. 0~4 ������ ���ڸ� arr1�迭�� �����Ѵ�.
	 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
	 * ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
	 * 
	 * [��]
	 * �������� : 1
	 * check = {false, true, false, false, false}
	 * arr1   = {1, 0, 0, 0, 0}
	 * �������� : 3
	 * check = {false, true, false, true, false}
	 * arr1   = {1, 3, 0, 0, 0}
	 * �������� : 2
	 * check = {false, true, true, true, false}
	 * arr1   = {1, 3, 2, 0, 0}
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		boolean[] check = new boolean[5];
		int[] arr1 = new int[5];	
		
		int i = 0;
		while(true) {
			int r = ran.nextInt(arr1.length);
			if(check[r] == false ) {
				check[r] = true;
				arr1[i] = r;
				i+=1;
			}
			if(i == arr1.length) {
				break;
			}
			
			
			
			
		}
		
		System.out.println(Arrays.toString(arr1));

	}

}
