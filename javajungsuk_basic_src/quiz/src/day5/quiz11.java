package day5;

import java.util.Arrays;

public class quiz11 {

	public static void main(String[] args) {

//11. 1�� 9������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ����ϴ� ���α׷��� 
//�ۼ��Ͽ���. 
//
//[ ���� ��� ] 
//    ???

		   int[] ballArr = {1,2,3,4,5,6,7,8,9};
		      int[] ball3 = new int[3];
		      
		      // ballArr . �迭 �� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�
		      for(int i=0; i< ballArr.length;i++) {
		         int j = (int)(Math.random() * ballArr.length);
		         // �� ��ü 
		         int tmp = 0;
		         tmp = ballArr[i];
		         ballArr[i] = ballArr[j];
		         ballArr[j] = tmp;
		      }
		      // �迭 ���� 
		      // �迭1���� �迭2�� �����ε���~�������ε���-1 ���� 
		      // System.arraycopy(�迭1, �����ε���, �迭2, �����ε���, �������ε���);
		      
		      System.arraycopy(ballArr,0, ball3,0,3);
		      System.out.println(Arrays.toString(ballArr));
		      System.out.println(Arrays.toString(ball3));
		      
		      for(int i=0;i<ball3.length;i++) {
		         System.out.print(ball3[i]);
		      }
		      System.out.println();
		      
		      for(int i=0;i<3;i++) {
		         System.out.print(ballArr[i]);
		      }

	}

}
