package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2_�˰���_��ȭ���� {

	/*
	 * # ��ȭ�� �¼�����
	 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
	 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
	 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
	 * 4. �� �¼��� ���� ������ 12000���̴�.
	 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� �ݾ��� ����Ѵ�.
	 * ��)
	 * seat = 0 0 0 0 0 0 0
	 * 
	 * �¼����� : 1
	 * seat = 0 1 0 0 0 0 0
	 * 
	 * �¼����� : 3
	 * seat = 0 1 0 1 0 0 0
	 * 
	 * �¼����� : 3
	 * seat = 0 1 0 1 0 0 0
	 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
	 * ----------------------
	 * �ѱݾ� : 24000��
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int[] seat = new int[7];
		seat [0] = 1;
		seat [1] = 2;
		seat [2] = 3;
		seat [3] = 4;
		seat [4] = 5;
		seat [5] = 6;
		seat [6] = 7;
		int movie = 12000;
		int count = 0;
		int ī�� = 100000;
		int run = 1;		
		while(run == 1) {
			System.out.println("=�ް� ��ȭ��=");				
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				for(int i = 0; i < 7; i++) {
					System.out.print(seat[i] + " ");
				}
				System.out.println();
				
				System.out.println("������ �¼��� �Է��ϼ���.");
				int sel2 = scan.nextInt();
				int max = 9;
				int room = -1;
				
				
				for(int i = 0; i < seat.length; i++) {
					if(sel2 == seat[i]) {
						seat[i] = max;
						room = i;
						count +=1;
						
					}
					else if(sel2 == max) {	
						System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");					
					}
			}
			
			}else if(sel == 2) {
				     int �ݾ� = count*movie;
				     System.out.println("�ѱݾ� : " + �ݾ�);
				     System.out.println("ī�带 �����ÿ�.");
				     if(�ݾ� > ī��){
				    	 System.out.println("�ܾ׺���");
				     }
				     else {
				    	 System.out.println("�ܾ� : " + (ī�� - �ݾ�));
				     }
				System.out.println("���ſϷ�.");
				break;
			}
		}
		System.out.println(Arrays.toString(seat));
		
	}

}