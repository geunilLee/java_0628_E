package ��������;

import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;

public class ��������4 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String ȹ������ǰ[] = {"x", "x", "x","x","x","x", "x"};
		String ����ǰ[] = { "����", "������", "����", "���� ��� ü����", "��������", "�����", "��å" };
		String ���� = "������";
		String[] �ֹ� = { "������", "�̿��", "�丮��", "û�Һ�", "���", "�������", "������" };
		String [] ������ = {"x", "x", "x","x","x","x", "x"};
		String [] Ư������ = {"@�л��ϱ���@", "@�⼮��@", "�кθ� ��󿬶���","���⹮��","����������Ʈ","������", "����"};
		int Ư������ǰī��Ʈ = -1;
		boolean[] check = new boolean[7];
		int idx = 0;
		int trun = 1;
		int ���� = 5;
		while (trun == 1) {
			
			System.out.println("[1.�������湮]");
			int sel = scan.nextInt();

			if (sel == 1) {
				int r = ran.nextInt(7);
				if (check[r] == false) {
					check[r] = true;
					ȹ������ǰ[idx] = ����ǰ[r];
					idx++;
					Ư������ǰī��Ʈ += 1;
					System.out.println("����ǰ ȹ��");
					System.out.println(Arrays.toString(ȹ������ǰ));

				}			
				System.out.println(idx);
				System.out.println("Ư�� ī��Ʈ : " + Ư������ǰī��Ʈ);
				if (Ư������ǰī��Ʈ == 3) {
					Ư������ǰī��Ʈ = 0;
					for(int i = 0; i<����ǰ.length; i ++) {
						ȹ������ǰ[idx] = Ư������[i];
						idx++;
					}					
					System.out.println("����ǰ �������� ���������� ȹ�� @����ǰȹ��@");
					System.out.println("[1.Ȯ���غ���]");
					int ����Ȯ�� = scan.nextInt();
					if (����Ȯ�� == 1) {
						System.out.println("6�� 17�� ��������");
						System.out.println("�޾Ҿ��� 100�¾Ƽ� ������ ������ ��¥�� �����⸦ ���̴ּ� �ʹ� JMT");
					}
					
				}
			}
			System.out.println("[1.�ϳѱ��] [2.�˰��ϱ�]");
			int sel3 = scan.nextInt();
			if (sel3 == 1) {
				trun = -1;
			}
			else if (sel3 == 2) {
				System.out.println("���������Է�");
				String sel5 = scan.next();
				if (sel5.equals(����)) {
					System.out.println("�˰ż���");
					break;
				} 
				else {
					����--;
					System.out.println("�˰Ž���");
					System.out.println("���� : " + ����);
					System.out.println("���� ���ΰ˰� ��ȸ : " + ���� + "ȸ");
				}
				if (���� <= 0) {
					System.out.println("Ž���� ���ش��߽��ϴ�");
					System.out.println("����� ����");
					break;
				}
			}

			System.out.println("���̵Ǿ����ϴ�.");

			int run = 1;

			while (trun == -1) {

				System.out.println("������ �ι� ����");
				System.out.println(Arrays.toString(�ֹ�));
				String name = scan.next();
				int bb  = ������.length-1;
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
