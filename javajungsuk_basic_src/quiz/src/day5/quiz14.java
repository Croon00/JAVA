package day5;

import java.util.Scanner;

public class quiz14 {

	public static void main(String[] args) {

//14. �ܾ��� ���� ��ġ�� �������� ��� �����ְ� ������ ���縵�� �Է��Ͽ� �ܾ ���ߴ� 
//���α׷��� �ۼ��Ͽ���. 
//
//String[] words = { "television", "computer", "mouse", "phone" };
//
//
//[ ���� ��� ] 
//Q1. lvtsieeoin �� ������ �Է��ϼ��� >> television
//�¾ҽ��ϴ�.
//
//Q2. otepcumr �� ������ �Է��ϼ��� >> computer 
//�¾ҽ��ϴ�.
//
//Q3. usemo �� ������ �Է��ϼ���  >> asdf
//Ʋ�Ƚ��ϴ�.
//
//Q4. ohpne �� ������ �Է��ϼ��� >> phone
//�¾ҽ��ϴ�.

		
		String[] words = {"television", "computer", "mouse","phone"};
		Scanner scanner = new Scanner(System.in);
		String answer = null;
		String word_sample = null;
		
		for(int i = 0; i<words.length; i++) {
			//String char[]�� ��ȯ ������ ���� �迭�� ���� �ؼ� ��ȯ���־�� ��
			// words[i]�� �� �ϳ����� �޾��ش�. words[i]�� ���ڿ��̱� ������ �ȵȴ�.
			char [] question = words[i].toCharArray();
			
			for(int j = 0; j<question.length; j++) {
	 			int idx = (int)(Math.random()* question.length);
	 			char temp = question[1];
	 			question[i] = question[idx];
	 			question[idx] = temp;
			}
			//���ڿ� ==> ���� �迭�� �ٲ���
			// word_sample = new String(question);
			word_sample = String.valueOf(question);
			
			System.out.println()
			
			String answer = scanner.nextLine();
			
			
			
			   //      14. �ܾ��� ���� ��ġ�� �������� ��� �����ְ� ������ ���縵�� �Է��Ͽ� �ܾ ���ߴ� 
		      //      ���α׷��� �ۼ��Ͽ���. 
		      //
		      //      String[] words = { "television", "computer", "mouse", "phone" };
		      //
		      //
		      //      [ ���� ��� ] 
		      //      Q1. lvtsieeoin �� ������ �Է��ϼ��� >> television
		      //      �¾ҽ��ϴ�.
		      //
		      //      Q2. otepcumr �� ������ �Է��ϼ��� >> computer 
		      //      �¾ҽ��ϴ�.
		      //
		      //      Q3. usemo �� ������ �Է��ϼ���  >> asdf
		      //      Ʋ�Ƚ��ϴ�.
		      //
		      //      Q4. ohpne �� ������ �Է��ϼ��� >> phone
		      //      �¾ҽ��ϴ�.
		      
		      /*
		       * ���ܾ� ���ڿ� �迭 
		       * �� ���ܾ� ���ڿ� ���� : ���ڿ� => ���ڹ迭 => �����ڼ���
		       * ����ܾ� ǥ���ϱ� : ���ڹ迭 -> ���ڿ�
		       * �Է� ����Ÿ�� ���� ���ܾ �´��� ��  equals() 
		       * �񱳿� ���� �޼��� ��� 
		       * */


		      
//		      String[] words = { "television", "computer", "mouse", "phone" };
//		      Scanner scanner = new Scanner(System.in);
//		      String answer = null; 
//		      String word_sample = null; // ���ܾ ���� ���ڿ� 
//		      
//		      for(int i=0;i<words.length;i++) {
//		         // �� ���ܾ�ڿ� => ���� �迭 
//		         // String char[]�� ��ȯ
//		         // ���ڿ�.toCharArray() : ���ڿ� => ���� �迭 
//		         char[] question = words[i].toCharArray(); 
//		         
//		         // ���ڼ��� 
//		         for(int j=0;j<question.length;j++) {
//		            int idx = (int)(Math.random() * question.length);
//		            char tmp = question[i];
//		            question[i] = question[idx];
//		            question[idx] = tmp;
//		         }
//		         
////		         System.out.println(Arrays.toString(question));
//		         // [i, e, i, t, v, l, s, o, e, n]
//		         
//		         // ���ڹ迭 => ���ڿ� 
//		         // new String(���ڹ迭) 
//		         // String.valueOf(���ڹ迭)
////		         word_sample = new String(question);
//		         word_sample = String.valueOf(question);
//		         // ���� ��� 
//		         System.out.printf("Q %d. %s �� ������ �Է��ϼ���...", i+1, word_sample);
//		         
//		         answer = scanner.nextLine();
//		         // System.out.println(answer + " " + words[i]);
//		         
//		         // �Է� ����Ÿ = ���� 
//		         if (words[i].equals(answer)) 
//		            System.out.println("�¾ҽ��ϴ�");
//		         else 
//		            System.out.println("Ʋ�Ƚ��ϴ�");
//		      }   


		}
		

	}

}
