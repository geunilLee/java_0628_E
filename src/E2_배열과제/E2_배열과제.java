package E2_�迭����;

import java.util.Arrays;
import java.util.Random;

public class E2_�迭���� {

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
	*/	Random ran = new Random();
		int arr[] = new int[5];
		int a [] = new int[5];
		int count = 0;
		
		int b = 0;
		int room = 0;
		 for(int i = 0; i<arr.length; i++) {
			 int r = ran.nextInt(10);
			 arr[i] = r;
			
			 if(arr[i]%2 == 1) {
				 System.out.print (arr[i] + " ");
				 count +=1;
				 a[room] = arr[i];
				 room+=1;				 
			 }
			 
		 }
		 System.out.println(Arrays.toString(arr));
		 System.out.println(Arrays.toString(a));
		 for(int i = 0; i<a.length; i++) {	
			 
		 }
	}

}
