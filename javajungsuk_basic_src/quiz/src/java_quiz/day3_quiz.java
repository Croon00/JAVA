package java_quiz;

import java.util.Scanner;

public class day3_quiz {

	public static void main(String[] args) {
//		01.  ���� ������� ��°���� ������ �� ���� ���α׷����Ͽ� ����� Ȯ���Ͽ���. 
//		( ������ �ִ� ������ ��� ���� ǥ�� )
//
		
		Scanner scanner = new Scanner(System.in);
//
		int x = 2;
		int y = 5;
		char c = 'A'; 
//
		System.out.println(y >= 5 || x < 0 && x > 2);   //true
		System.out.println(y += 10 - x++);  // 13
		System.out.println(x+=2); // 5
		System.out.println( !('A' <= c && c <='Z') ); // false
		// int ������ �ڷ����� ������ ������ �ϸ� int ������ �ڵ���ȯ
		System.out.println('C'-c); // 2
		System.out.println('5'-'0'); // 5
		System.out.println(c+1); // 66
		System.out.println(++c); // B
		System.out.println(c++); // B
		System.out.println(c); // C
//
		
		
		
		
//
//		02. ���������� ������ �����ϰ� ���� �ڸ� ���ϸ� ������ ����ϵ��� ���α׷����Ͽ���.
//
//		[ ���� ��� ]
//		 555 => 500 
//		 239 => 200
//
		int num1 = 555;
		int num2 = 239;
		int num3 = Math.round(num1/100)*100;
		int num4 = Math.round(num2/100)*100;
		System.out.println(num1+ "=>"+ num3 );
		System.out.println(num2+ "=>"+ num4 );

		
//
//
//		03. �ٱ��Ͽ��� 10���� ����� ���� �� �ִ�. n���� ����� �ִٸ� ��� �ٱ��ϰ� �ʿ����� 
//		���α׷����Ͽ���. (���� ������ �̿�)
//
//		[ ���� ��� ]
//		����� ��    :  88��
//		�ٱ����� �� :    9��
//
//
	    System.out.println("����� ������ �Է��Ͽ���");
		int apple = scanner.nextInt();
		int basket = apple/10 +1;
		System.out.println("����� �� : "+apple);
		System.out.println("�ٱ����� �� :" +basket);
		
				
				
				
//
//
//		04. ���ڸ� �Է��Ͽ� ���, 0, ���� �޼����� ����ϵ��� ���α׷����Ͽ���. 
//		(���� ������ �̿�)
//
	  
		
		
				
				
//
//
//		05.  ȭ��(Fahrenheit) �µ��� ����(Celcius) �µ��� ��ȯ�ǵ��� ���α׷��� �Ͽ���. 
//		(ȭ�� �µ��� ���� �µ��� �����ϴ� ������ ���ͳ��� �̿��Ѵ�. )
//
//		[ ���� ��� ]
//
//		ȭ��(Fahrenheit) : 77 �� 
//		����(Celcius)  : 25.0 �� 
//
		System.out.println("ȭ�� �µ��� �Է��Ͻÿ�.");
		double Fahrenheit = scanner.nextInt();
		double Celcius = Fahrenheit*1.8 +32;
		System.out.println("ȭ��(Fahrenheit) : "+Fahrenheit+"��" );
		System.out.println("����(Celcius) : "+Celcius+"��" );
		
		
//
//		06.  ��� ����� �����Ͽ� �ֹ� �޴��� ���� ������ ��µǵ��� ���α׷��� �Ͽ��� 
//		(��� 8000��,  Į���� 6000��,  �ո��� 5000��) 
//
//		  [ ���� ��� ] 
//
//		  ���  X  ?  =  ?
//		  Į����  X  ?  =  ?
//		  �ո���  X  ?  =  ?
//		============
//		  ���� :  ? 
//
		System.out.println("��� �ֹ� ��");
		int xx1 = scanner.nextInt();
		System.out.println("Į���� �ֹ� ��");
		int xx2 = scanner.nextInt();
		System.out.println("�ո��� �ֹ� ��");
		int xx3 = scanner.nextInt();
		
		int donkas = 8000*xx1;
		int kalguks = 6000*xx2;
		int kingmandu = 5000*xx3;
		int sum = donkas + kalguks + kingmandu;
		
		System.out.println("��� X" +xx1+ donkas);
		System.out.println("Į���� X"+xx2+ kalguks);
		System.out.println("�ո��� X"+xx3+ kingmandu);
		System.out.println("===========================");
		System.out.println("���� : " + sum);
		
		
//
//		07.  �Է� ����Ÿ�� �������� ���ڰ� �ƴ��� ��µǵ��� ���α׷��� �Ͽ���. 
//		( ���ǿ�����, Scanner, charAt(0)) 
//
		System.out.println("�Է��Ͻÿ�"););
		String data = scanner.next();
		
		char ch = data.charAt(0);
		
		System.out.println(('0' <= ch && ch <='9')? "�����̴�":"���ڰ� �ƴϴ�");

//
//
//		08. ������ ������� ���ǽ����� ǥ���϶�.
//
//		1. int �� ���� x �� 10 ���� ũ�� 20 ���� ���� ��  true�� ���ǽ�
//		2. char �� ���� ch �� �����̳� ��(\t)�� �ƴ� ��  true�� ���ǽ�
//		3. char  �� ���� ch �� 'x' �Ǵ� 'X' �� ��  true�� ���ǽ�
//		4. char �� ���� ch �� ����(��0��~��9��)�� ��  true�� ���ǽ� true
//		5. char �� ���� ch �� ������(�빮�� �Ǵ� �ҹ���) �� ��  true �� ���ǽ�
//		6. boolean �� ���� powerOn ��  false �� �� true �� ���ǽ�
//		7. ���ڿ� �������� str �� "yes" �� �� true �� ���ǽ�
//
		
		
		
		
		
//
//
//		09. 534 �ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ���� ������ �ٶ� 
//		�л� �� �� ����  ���� �� �ְ� ���������� ��� ������ ���α׷����Ͽ���. 
//
//		  [ ���� ��� ] 
//		  
//		  �л� �� ���� �� �ִ� ���� ����  ? �� �Դϴ�.   
//		  ���� ���� ����  ? �� �Դϴ�.    
//
		
		
		
		
//
//		10. �Է� ���� ���ڰ� 2�� ��� �Ǵ� 3�� ��������� 6�� ����� �ƴ� ��� 
//		     "Hello world!!!" �� ��µǵ��� ���α׷��� �Ͽ���. 
//		(���� ������ �̿�)
//
//		[ ���� ��� ] 
//
//		  ���� �Է�  >>  33
//
//		  Hello world!!!
//
		
		
		
//
//
//		11. 2�ڸ��� ����(10~99����)�� �Է¹ް�, 10�� �ڸ��� 1�� �ڸ��� ������ 
//		     �Ǻ��Ͽ� ��µǵ��� ���α׷��� �Ͽ���.
//		(���� ������ �̿�)
//
//
		
		int a1 = scanner.nextInt();
		 if (a1>=10 && a1<=99) {
			 
		 }
		
		
		
//		  [ ���� ��� ] 
//		   
//		  2�ڸ� ���� �Է�(10~99) >>	  78
//
//		  ��� => ���� �ʴ�. 
//
		
		
		
		
		
//
//		12. ������ �� ���� �׼��� �Է¹޾� ���� ����, �� ����, õ ����, 500¥�� ����, 100��¥�� ����, 50��¥�� ����, 10��¥�� ����, 1��¥�� ���� �� �� ���� ��ȯ�Ǵ��� ���α׷��� �Ͽ���.
//
//		[ ���� ��� ] 
//
//		�ݾ��� �Է��Ͻÿ� >> 65376
//
//		�������� 1 ��
//		������ 1 ��
//		õ���� 5 ��
//		��� 3 ��
//		���ʿ� 1 ��
//		�ʿ� 2 ��
//		�Ͽ� 6 ��
//
		
		
		
//
//
//		13. ��ȭ�� �Է¹޾� �޷��� �ٲپ� ��µǵ��� ���α׷��� �Ͽ���.
//		( ȯ�� $1=1100������ ����.  �Ҽ��� ó���� 3��° �ڸ����� �ݿø�)
//
//		[ ���� ��� ] 
//
//		��ȭ�� �Է��ϼ���(���� ��) >> 3300
//
//		3300���� $3.00 �Դϴ�.
//
		 System.out.println("��ȭ�� �Է��Ͻÿ�.");
		 double won = scanner.nextDouble();
		 double dollar = Math.round(won/100)*100.00;
		 
		 System.out.println(won+"����  $"+dollar+"�Դϴ�.");
		 
		 
//
//		14.  �ﰢ���� ���� ���̸� ��Ÿ���� ������ 3�� �Է¹ް� 
//		  �� 3���� ���� �ﰢ���� ���� �� �ִ��� ���α׷����Ͽ���. 
//		 ( �ﰢ���� �Ƿ��� �κ��� ���� �ٸ� �� ���� �պ��� Ŀ�� �Ѵ�. )
//		(���� ������ �̿�)
//
//
		 System.out.println("���� ���̸� �Է��Ͻÿ�.");
		 int byn1 = scanner.nextInt();
		 int byn2 = scanner.nextInt();
		 int byn3 = scanner.nextInt();
		 
		 String ch1;
		 ch1 = (byn1+byn2>byn3 || byn1+byn3>byn2 || byn2+ byn3 > byn1) ?"�ﰢ���� �˴ϴ�.":"�ﰢ���� �ȵ˴ϴ�.";
		 
		 
		 
		 
//		[ ���� ��� ] 
//
//		���� ����1 >> 4
//		���� ����2 >> 3
//		���� ����3 >> 5
//
//		�ﰢ���� �˴ϴ�.

	}

}
