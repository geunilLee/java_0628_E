package ��������;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ��������3 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String ȹ������ǰ[] = {"x", "x", "x","x","x","x", "x"};
		String ����ǰ[] = { "����", "������", "����", "@�л��ϱ���@", "���� ��� ü����","����üũ����Ʈ", "�����"};
		String ���� = "������";
		String [] �ֹ� = {"������", "�̿��", "�丮��","û�Һ�","���","�������", "������"};
		String [] ������ = {"x", "x", "x","x","x","x", "x"};
		int Ư������ǰ = 0;
		boolean[] check = new boolean[7];
		int idx = 0;
		int trun = 1;
		int ���� = 5;

		while (trun == 1) {
			if (Ư������ǰ == 3) {
				System.out.println("����ǰ �������� ���������� ȹ�� @����ǰȹ��@");
				System.out.println("[1.Ȯ���غ���]");
				int  ����Ȯ�� = scan.nextInt();
				if(����Ȯ�� == 1) {
					System.out.println("6�� 17�� ��������");
					System.out.println("�޾Ҿ��� 100�¾Ƽ� ������ ������ ��¥�� �����⸦ ���̴ּ� �ʹ� JMT");
				}				
				ȹ������ǰ[idx] = "@�л��ϱ���@";
			}
			System.out.println("[1.�������湮]");
			int sel = scan.nextInt();

			if (sel == 1) {
				int r = ran.nextInt(7);
				if (check[r] == false) {
					check[r] = true;
					ȹ������ǰ[idx] = ����ǰ[r];
					idx++;
					System.out.println("����ǰ ȹ��");
					System.out.println(Arrays.toString(ȹ������ǰ));
				} else if (check[r] == true) {
					System.out.println("����湮����");
					System.out.println(Arrays.toString(ȹ������ǰ));
					continue;
				}
			}
			System.out.println("[1.����ǰȮ��][2.next]");
			int sel2 = scan.nextInt();
			if (sel2 == 1) {
				System.out.println(Arrays.toString(ȹ������ǰ));
			}
			System.out.println("[1.�ϳѱ��] [2.�˰��ϱ�]");
			int sel3 = scan.nextInt();
			if (sel3 == 1) {				
				trun = -1;
			}
			else if(sel3 == 2){
				System.out.println("���������Է�");
				String sel5 = scan.next(); 
					if(sel5.equals(����)) {
						System.out.println("�˰ż���");
						break;
					}else {
						����--;
						System.out.println("�˰Ž���");						
						System.out.println("���� : " + ����);
						System.out.println("���� ���ΰ˰� ��ȸ : " +����+"ȸ");	
						trun = -1;
					}
					if(���� <= 0 ) {
						System.out.println("Ž���� ���ش��߽��ϴ�");
						System.out.println("����� ����");
						break;
					}
			}			
	
			System.out.println("���̵Ǿ����ϴ�.");
			while (trun == -1) {
				System.out.println("������ �ι� ����");
				System.out.println(Arrays.toString(�ֹ�));
				String name = scan.next();
				int bb  = 6;
				for(int i = 0; i < ������.length-1; i++) {	
					������[bb] = ������[bb-1];
					bb -= 1;
				}
				������[0] = name;
				break;
			}
			System.out.println("�̹� ������");
			System.out.println(Arrays.toString(������));
			trun = 1;		
		}
	}
}
