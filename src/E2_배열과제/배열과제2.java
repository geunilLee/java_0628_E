package E2_�迭����;

import java.util.Arrays;
import java.util.Random;

public class �迭����2 {

	public static void main(String[] args) {
		/*
		[����]
			5������ �迭�� (0~9)������ ���� 5���� �������� �����Ѵ�.
			�迭�� ������ ������ Ȧ���� ��Ƽ� �ϳ��� ���ڷ�ǥ���ҷ����Ѵ�. 
			�ϳ��� ���ڷ�ǥ�� �� �׼��� �ι踦 ���
		
		(����) 
			arr ==> { 1,4,5,4,0 } ==> ���� Ȧ���� ������ ����15 �������ϰ�, �ι��� 30�����
		[����]
			30
	*/
		int c = 0;
		int arr[] = {0, 0, 0 ,0 ,0 };
		Random ran = new Random();
		for(int i = 0; i<arr.length; i ++){
			int r = ran.nextInt(10);
			 arr[i] = r;
			if(arr[i]%2 == 1) {
				c = arr[i];
				System.out.println(c);
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
