package ��������;

import java.util.Random;
import java.util.Scanner;

public class ��������2 {
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
		
	

		int ������ [] = new int[1];
		String [] �ֹ� = {"������", "�̿��", "�丮��","û�Һ�","���","������","�������", "��ɲ�"};
		String [] ��� = {"����â��","ħ��","���","����","�ֹ�","������","��1","��2"};

		System.out.println("�� ���� ������ ��� �� ���ڱ� �ۿ��� ���Ҹ��� ��ȴ�");
		int a = scan.nextInt();
		System.out.println("����~~~~~~~~~~~~~");
		System.out.println("������ ��ħ ���� �������� ��� ���� ��찡 �׾��־���.");
		System.out.println("�����ڸ� ã������ ������ ������ Ž���� ���Եȴ�..");
		
		
			
			
		 
			//System.out.println(r);
			
			//System.out.println(r2);
			for(int i = 0; i < �ֹ�.length; i++) {
				int r = ran.nextInt(7)+1;
				int r2 = ran.nextInt(7)+1;
				//if(i >= 0)
				//{
				if(���[r] == �ֹ�[r2]) {
					System.out.println(���[r] + "���� " + �ֹ�[r2] + "�� ����ä�� �߰ߵǾ���.");
					break;
					
				}
					
				//}
				
			}
			
	}

}
