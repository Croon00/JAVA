package day4;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {

//07.  369����. 1~99������ ������ �Է¹ް� ������ 3, 6, 9 �� �ϳ��� �ִ� ���� 
//"�ڼ�¦"�� ����ϰ� �� �� �ִ� ���� "�ڼ�¦¦"�� ��µǵ��� ���α׷����Ͽ���. 
// ���� ���  �Էµ� ���� 13�� ��� "�ڼ�¦"��, 
// 36�� ��� "�ڼ�¦¦"�� ����ϸ� �ȴ�.
//
//[ ���� ��� ]  
//1~99 ������ ������ �Է��Ͻÿ�  >>  36
//�ڼ�¦¦
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1���� 99������ ���ڸ� �Է��Ͻÿ�.");
		int num = scanner.nextInt();
		
		if(1<=num && num<=99) {
			if(num<=10) {
				if(num/3 ==0 && num !=0) {
					System.out.println("�ڼ�¦");
				}
			}else if(num/10 == 3 || num/10 ==6 || num/10 == 9 ) {
				System.out.printf("�ڼ�¦");
				if(num%10 == 3 || num%10 ==6 || num%10 == 9) {
					System.out.printf("¦");
				}
			}else {
				System.out.println("3,6,9�� �ȵ���ִ�.");
			}
		}else {
			System.out.println("1���� 99������ ���� �Է��Ͻÿ�.");
		}

	}
//	 System.out.print("1~99 ������ ������ �Է��Ͻÿ�  >>  ");
//     Scanner scanner = new Scanner(System.in);
//
//     int num = scanner.nextInt();
//     int q, r; // 10~99 ���� �ڸ�, 10�� �ڸ� 
//     
//     if (num<10 && num%3==0 && num!=0) { // ���� �ڸ� 
//        System.out.println("\n�ڼ�¦");
//     } else if (num>=10){ 
//        // 10~99
//        q = num/10;  // 10�� �ڸ� 
//        r = num%10;  // 1�� �ڸ� 
//        System.out.printf("%d  %d  %d%n", num, q, r);
//        if ( q%3 == 0 &&  r%3 == 0 && q!=0 && r!=0) 
//              System.out.print("�ڼ�¦¦");
//        else if (q==3 || q==6 || q==9 || r==3 || r==6 || r==9) 
//           System.out.print("�ڼ�¦");
//     } 
//  System.out.println("\n====================");   

  

//}

}

