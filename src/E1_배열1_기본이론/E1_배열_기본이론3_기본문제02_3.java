package E1_배열1_기본이론;

public class E1_배열_기본이론3_기본문제02_3 {
	/*
	 * 	array = {10,20,30,40,50};
	 * 
		[문제1] 4의 배수만 출력한다.
		[예] 20 40
		
		[문제2] 4의 배수의 합을 출력한다.
		[예] 60
		
		[문제3] 4의 배수의 개수를 출력한다.
		[예] 2
	 */
	public static void main(String[] args) {

		int[] array = {10,20,30,40,50};
		int a = 0;
		int count = 0;
		for(int i = 0; i <array.length; i++) {
			if(array[i]%4 == 0) {
				System.out.print (array[i]+" ");
					a += array[i];
					count +=1;
					System.out.println();
				
			}
		}
		System.out.println("4의배수 합 : " + a);
		System.out.println("4의 배수갯수 : "+count );
		
	}

}
