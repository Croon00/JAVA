package day12;

import java.util.Scanner;

public class quiz03 {
	public static void main(String[] args) {
		
		int y = (int)(Math.random()*100 +1);
		Scanner scanner = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.println("1�� 100 ������ ���� �Է��Ͻÿ�");
				int x = scanner.nextInt();
				if(y > x) {
					System.out.println("�� ū���� �Է��Ͻÿ�");
				}
				else if(y < x) {
					System.out.println("�� ���� ���� �Է��Ͻÿ�");
				}
				else if(y == x) {
					System.out.println("������ϴ�.");
					break;
				}
			}
			
			
		} catch (Exception e) {
		System.out.println("���ڸ� �Է��Ͻÿ�");
		}
	}

}
