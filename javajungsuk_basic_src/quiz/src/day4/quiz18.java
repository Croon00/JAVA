package day4;

import java.util.Scanner;

public class quiz18 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		18.  51~100 ������ ������ �� ������ ���� ������ �̿��Ͽ� ������ ��  
//		���ڸ� �Է��Ͽ� ������ ���� ���ߵ��� ���α׷��� �Ͽ���. 
//
//		[ ���� ��� ]
//
//		 51�� 100������ ������ �Է��ϼ���. >>  77
//		�� ���� ���� �ٽ� �õ��غ�����.
//		 51�� 100������ ������ �Է��ϼ���. >>  60
//		�� ū ���� �ٽ� �õ��غ�����.
//		 51�� 100������ ������ �Է��ϼ���. >>  67
//		�� ū ���� �ٽ� �õ��غ�����.
//		 51�� 100������ ������ �Է��ϼ���. >>  70
//		�� ū ���� �ٽ� �õ��غ�����.
//		51�� 100������ ������ �Է��ϼ���. >>  75
//		�����Դϴ�.

		Scanner scanner = new Scanner(System.in);
		
		int num2 = (int)(Math.random()*100+51);
		int num3 = 1;
		
		while(num3 == 1) {
			System.out.println("���ڸ� �Է��Ͻÿ�");
			int num = scanner.nextInt();
			if(num2>num) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
			else if(num2<num) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			}
			else if(num2 == num) {
				System.out.println("�����Դϴ�.");
				break;
			}
		}
	

	}

}
