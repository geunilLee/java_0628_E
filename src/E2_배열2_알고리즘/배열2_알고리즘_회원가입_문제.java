package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2_�˰���_ȸ������_���� {
	/*
	 * [ȸ������] ���������� ����
	 */
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);	
		int[] arr = {0, 0, 0, 0, 0};
		
		boolean check [] = new boolean[arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			check [arr.length]= false;
		}
		
		
		int count = 0;
		int i = 0;
		while(true) {
			System.out.println("===[ȸ������]===");
			System.out.println(Arrays.toString(arr));
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3.����(�ε���)");
			System.out.println("4.����(��)");
			System.out.println("5.����");
			int sel = scan.nextInt();
			
			if(sel == 1) {				
				System.out.println("���̵��Է��Ͻÿ�");
				int id = scan.nextInt();				
					if(check [arr.length]== false) {
						arr[i] = id;
						check [i]= true;
						i++;
					}
				
				System.out.println(Arrays.toString(arr));				
			}
			else if(sel == 2) {
				
			}
			else if(sel == 3) {
				
			}
			else if(sel == 4) {
				
			}
			else if(sel == 5) {
				
			}
		}
		
		
	}
}