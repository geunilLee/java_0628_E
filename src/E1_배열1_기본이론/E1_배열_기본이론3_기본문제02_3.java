package E1_�迭1_�⺻�̷�;

public class E1_�迭_�⺻�̷�3_�⺻����02_3 {
	/*
	 * 	array = {10,20,30,40,50};
	 * 
		[����1] 4�� ����� ����Ѵ�.
		[��] 20 40
		
		[����2] 4�� ����� ���� ����Ѵ�.
		[��] 60
		
		[����3] 4�� ����� ������ ����Ѵ�.
		[��] 2
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
		System.out.println("4�ǹ�� �� : " + a);
		System.out.println("4�� ������� : "+count );
		
	}

}
