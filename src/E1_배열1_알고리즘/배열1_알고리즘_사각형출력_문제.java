package E1_�迭1_�˰���;

public class �迭1_�˰���_�簢�����_���� {
	/*	
	 * [����] b �迭�� �Ʒ��Ͱ��� �簢�������������Ѵ�.
	 * [��Ʈ] 3ĭ���� ���� �ٲ��ش�.

	   1 2 3
	   4 5 6
	   7 8 9  

	 */
	
	public static void main(String[] args) {
		
		int b [] = {1,2,3,4,5,6,7,8,9};	
		int idx = 1;
		int idx2 = 2;
		
		for(int i = 0; i<b.length; i+=3) {
			System.out.println(b[i]+ " " +b[i+idx] + " " + b[i+idx2]);
		}
	}
}
