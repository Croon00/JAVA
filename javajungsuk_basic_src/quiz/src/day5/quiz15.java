package day5;

import java.util.Scanner;

public class quiz15 {

	public static void main(String[] args) {
		
		int score [];
//		15. �л����� �� �л����� ������ �Է¹޾� ��� ������ ���ϴ� ���α׷��� �ۼ��Ͽ���. 
//
//		[ ���� ��� ]
//
//		1. �л���    2. ���� �Է�    3. ���� ����Ʈ     4. ���       5. ����
//		============================================
//		���� > 1
//		�л��� >  3
//
//
//		1. �л���    2. ���� �Է�    3. ���� ����Ʈ     4. ���       5. ����
//		============================================
//		���� > 2
//		�л� ����1 >  85
//		�л� ����2 >  56
//		�л� ����3 >  34
//
//
//		1. �л���    2. ���� �Է�    3. ���� ����Ʈ     4. ���       5. ����
//		============================================
//		���� > 3
//		�л� ����1 =  85
//		�л� ����2 =  56
//		�л� ����3 =  34
//
//
//
//		1. �л���    2. ���� �Է�    3. ���� ����Ʈ     4. ���       5. ����
//		============================================
//		���� > 4
//		��� =   ?
//
//
//		1. �л���    2. ���� �Է�    3. ���� ����Ʈ     4. ���       5. ����
//		============================================
//		���� > 5
//		���α׷��� ����Ǿ����ϴ�. 

		   int choice, numOfStudent;
		      Scanner scanner = new Scanner(System.in);
		      // null�� �����ϸ� ���� ���� 
		      int[] score = null;
		      int sum = 0;
		      
		      do {
		         // �޴� ��� 
		         System.out.println("1. �л���    2. ���� �Է�    3. ���� ����Ʈ       4. ���       5. ����");
		         System.out.println("==============================================================");
		         System.out.print("���� > ");
		         
		         choice = scanner.nextInt();
		         
		         if (choice == 1) {
		            System.out.print("�л��� >  ");
		            numOfStudent = scanner.nextInt();
		            // �迭 ���� 
		            score = new int[numOfStudent];
		         }
		         else if (choice == 2) {
		            for (int i = 0; i < score.length; i++) {
		               System.out.print("�л� ����" + (i+1) + " > "); 
		               score[i] = scanner.nextInt();
		            }
		         }
		         else if (choice == 3) {
		            for (int i = 0; i < score.length; i++) {
		               System.out.println("�л� ����" + (i+1) + " = " + score[i]); 
		            }   
		         }
		         else if (choice == 4) {
		            sum = 0;
		            for (int i = 0; i < score.length; i++) {
		               sum += score[i];
		            }   
		            System.out.println("��� =   " + (sum/(double)score.length)); 
		         }      
		         
		         else if (choice == 5) {
		            System.out.println("���α׷��� ����Ǿ����ϴ�.");
		            break;
		         }
		      
		      
		      } while(true);
		      

	}

}
