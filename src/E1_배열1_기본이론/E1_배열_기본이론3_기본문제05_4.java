package E1_배열1_기본이론;

import java.util.Random;

public class E1_배열_기본이론3_기본문제05_4 {

	public static void main(String[] args) {
		Random ran = new Random(); 

		int array[] = new int[5]; 
		
		for(int i = 0; i < 5; i++) {
			int r = ran.nextInt(101)+1;
			array[i] = r;
			System.out.println(array[i]);
		
		}

	}
}
