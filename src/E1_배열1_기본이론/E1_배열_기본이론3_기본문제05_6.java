package E1_�迭1_�⺻�̷�;

import java.util.Arrays;
import java.util.Random;

public class E1_�迭_�⺻�̷�3_�⺻����05_6 {
	/*
	 * [����]
	 *  array �迭�� 0~100������ ������ 5�� ������ ��簪�� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Random ran = new Random();

		int array[] = new int[5];
		
		for(int i = 0; i< array.length; i++) {
			int r = ran.nextInt(101);
			array [i] = r;   
		}
		System.out.println(Arrays.toString(array));
		
		
	}

}