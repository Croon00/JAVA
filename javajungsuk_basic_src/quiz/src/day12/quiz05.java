package day12;

import java.util.Scanner;

public class quiz05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String Id = "smhyun128";
		String Pw = "smj0494";
		
		System.out.println("���̵� �Է��Ͻÿ�:");
		String id = scanner.next();
		System.out.println("��й�ȣ�� �Է��Ͻÿ�");
		String pw = scanner.next();
		
		try {

			
			if (Id != id) {
				throw new Exception("���̵� �������� ����");
			}
			if (Pw != pw) {
				throw new Exception("��й�ȣ�� ���� ����");
			}
		} catch (Exception e) {
			 System.out.println("���� �޽��� : " + e.getMessage());		}
	}

}
