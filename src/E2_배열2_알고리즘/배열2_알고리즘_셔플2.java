package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Random;

public class �迭2_�˰���_����2 {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60};
	
		//���� 	
		// 1) �ε��� 2���� ����(0~5)���� �����ϰ� �� �ε����� ���� ��ȯ
		// 2) �� 1���� 10 �� �ݺ��ϸ� ����  ��� 
		
		//��) 1 , 2 ==> {10,30,20,40,50,60};  // 20 �� 30�� ��ȯ��.
		
		//��) 4 , 1 ==> {10,50,20,40,30,60};  // 50 �� 30�� ��ȯ��.
		
		//��) 3 , 3 ==> {10,50,20,40,30,60}; // ������ �ƹ��ϵ��Ȼ����.
		
		Random ran = new Random();
		int g = 0;
		int h = 10;
		while(h>0) {
			for(int i = 0; i<arr.length; i++) {
				int r = ran.nextInt(6);
				int r2 = ran.nextInt(6);				
				g = arr[r];
				arr[r] = arr[r2];
				arr[r2] = g;
				System.out.print(r + " " + r2 + " : ");
				System.out.println(Arrays.toString(arr));
			}
			h--;						
		}
		
		
	}

}
