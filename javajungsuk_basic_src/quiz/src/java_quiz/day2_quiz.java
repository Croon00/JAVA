package java_quiz;

public class day2_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		08. ������ ������� ���ǽ����� ǥ���϶�.
//
//		1. int �� ���� x �� 10���� ũ�� ���� ���� ��  true�� ���ǽ�
		int x = 20;
		if (x >=10) {
			System.out.println("true");
		}
		
//		2. char �� ���� ch �� �����̳� ��(\t)�� �ƴ� ��  true�� ���ǽ�
		char ch = ' ';
		if (ch==' ' || ch != '\t');
		
		
//		3. char  �� ���� ch �� 'x' �Ǵ� 'X' �� ��  true�� ���ǽ�
		char ch1 = 'x';
		if(ch1 == 'x' || ch1 == 'X');
//		4. char �� ���� ch �� ����(��0��~��9��)�� ��  true�� ���ǽ� true
		char ch2 = '8';
		if((int)ch2>=0 && (int)ch2<=9);
		
//		5. char �� ���� ch �� ������(�빮�� �Ǵ� �ҹ���) �� ��  true �� ���ǽ�
		
		
//		6. boolean �� ���� powerOn ��  false �� �� true �� ���ǽ�
		boolean powerOn = true;
		if(powerOn == false);
		
		
		
//		7. ���ڿ� �������� str �� "yes" �� �� true �� ���ǽ�
		
		String str = new String("yes");
		
		System.out.println(str.equals("yes"));
		
		
		
		
		  // 08. ������ ������� ���ǽ����� ǥ���϶�.
	      // p125 4-1

	      //      1. int �� ���� x �� 10 ���� ũ�� 20 ���� ���� ��  true�� ���ǽ�
	      //      2. char �� ���� ch �� �����̳� ��(\t)�� �ƴ� ��  true�� ���ǽ�
	      //      3. char  �� ���� ch �� 'x' �Ǵ� 'X' �� ��  true�� ���ǽ�
	      //      4. char �� ���� ch �� ����('0'~'9')�� ��  true�� ���ǽ� true
	      //      5. char �� ���� ch �� ������(�빮�� �Ǵ� �ҹ���) �� ��  true �� ���ǽ�
	      //      6. boolean �� ���� powerOn ��  false �� �� true �� ���ǽ�
	      //      7. ���ڿ� �������� str �� "yes" �� �� true �� ���ǽ�

	      //1. int �� ���� x �� 10 ���� ũ�� 20 ���� ���� ��  true�� ���ǽ�
	      int x = 100;
	      System.out.println((10 < x) && (x < 20));       

	      //2. char �� ���� ch �� �����̳� ��(\t)�� �ƴ� ��  true�� ���ǽ�
	      // \n , \t, \r
	      char ch1 = '\t';
	      System.out.println(!(ch1 == ' ' || ch1 =='\t'));    

	      //3. char  �� ���� ch �� 'x' �Ǵ� 'X' �� ��  true�� ���ǽ�
	      char ch2 = 'g';
	      System.out.println((ch2 == 'x') || (ch2 == 'X'));    

	      //4. char �� ���� ch �� ����('0'~'9')�� ��  true�� ���ǽ� true
	      char ch3 = '0';
	      System.out.println('0' <= ch3 && ch3 <='9');    

	      //5. char �� ���� ch �� ������(�빮�� �Ǵ� �ҹ���) �� ��  true �� ���ǽ�
	      char ch4 = '6';
	      System.out.println(('a' <= ch4 && ch4 <= 'z') || ('A' <= ch4 && ch4 <= 'Z')); 

	      //6. boolean �� ���� powerOn ��  false �� �� true �� ���ǽ�
	      boolean powerOn = false;
	      System.out.println(!powerOn); 

	      //7. ���ڿ� �������� str �� "yes" �� �� true �� ���ǽ�
	      //         String str = "yes";
	      String str = new String("yes");

	      System.out.println(str=="yes"); // false
	      System.out.println(str.equals("yes")); // true
	}

}















