        package �迭1_�׽�Ʈ����;

import java.util.Arrays;
import java.util.Random;

public class �迭1_�׽����� {
		/*
		 arr �����߿� �ϳ��� Ȧ���������� fasle ¦���� ������ true	 
		 */
	public static void main(String[] args) {
		Random ran = new Random();
		int arr1[] = new int [5];
		int n = 0;
		while(true) {
			boolean cheack = true;
			for(int i = 0; i<arr1.length; i++) {
				int r = ran.nextInt(9)+1;
				arr1[i] = r;
				if(arr1[i]%2 != 0) {
					cheack = false;
				}				
			}
			System.out.println(Arrays.toString(arr1));
			System.out.println(cheack);
			
			n+=1;
			if(n >= 100) {
				break;
			}
		}
	}

}
