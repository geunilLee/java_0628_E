package ��������;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �������� {
	/*
	 ���λ���� ������ ��� �����̴�.
	 ������ ���Ϲ� ������ ��������
	 Ž���� ������ ������ ������ ������.
	 ������ ��� ����� ���Ź��������� ������ �������ִ�.
	 ������ �������ϸ� ���λ���� ����Ͼ��.
	 
	
	 
	 ������ : ����â��,ħ��, ���, ����,  
	 */
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
	
		String ���� = "������";
		int ������ [] = new int[1];
		String [] �ֹ� = {"������", "�̿��", "�丮��","û�Һ�","���","�������", "��ɲ�"};
		String [] ��� = {"����â��","ħ��","���","����","�ֹ�","������","��1","��2"};
//		String [] ���� = {"����","������","����"};
		int arr[] = new int[5];

		System.out.println("�� ���� ������ ��� �� ���ڱ� �ۿ��� ���Ҹ��� ��ȴ�");
		int a = scan.nextInt();
		System.out.println("����~~~~~~~~~~~~~");
		System.out.println("������ ��ħ ���� �������� ��� ���� ��찡 �׾��־���.");
		System.out.println("�����ڸ� ã������ ������ ������ Ž���� ���Եȴ�..");
		int turn = 0;
		int total = 0;
		while(true) {
			int r1 = ran.nextInt(7)+1; 
//			System.out.println(r1);
			int r2 = ran.nextInt(6)+1;
//			System.out.println(r2);
			if(turn % 2 == 0) {
				for(int i = 0; i < �ֹ�.length; i++) {	
					System.out.println(���[r1] + "���� " + �ֹ�[r2] + "�� ����ä�� �߰ߵǾ���.");
					���[r1] = "��������";
					�ֹ�[r2] = "���";
					turn += 1;
					break;
				}
			}else if(turn % 2 == 1){
				boolean[] check = new boolean[5];
				int r = ran.nextInt(4);
				System.out.println(r);
				for(int i = 0; i < 5; i++) {
					if(check[r] == false) {
						arr[i] = r;
						check[r] = true;
						total += arr[i];
						turn += 1;
						i++;
					}
				}
			}
			if(total >= 5) {
				System.out.println("ã��");
				break;
			}
		}
			
//		System.out.println(Arrays.toString(�ֹ�));
//		System.out.println(Arrays.toString(���));
	}

}
