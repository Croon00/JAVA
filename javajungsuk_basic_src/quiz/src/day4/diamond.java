package day4;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /*
	       * 
	14. �ݺ����� �̿��Ͽ� ������ ���� ��µǵ��� ���α׷��� �Ͽ���. 

	[ ���� ��� ]

	          *
	         ***
	        *****
	       *******
	        *****
	         ***
	          *





	       */
	      // ��� 
	      int lineCount = 7;  //�ٸ� Ȧ�� ���� �־����
	      int spaceCount = lineCount/2 +1;
	      int starCount = 1;

	      for(int i = 0; i<lineCount; i++) {
	         // �Ƕ�̵� 
	         for(int j = 0; j<spaceCount; j++) {
	            System.out.print(' ');
	         }
	         for(int j=0; j<starCount; j++) {
	            System.out.print('*');
	         }
	         for(int j = 0; j<spaceCount; j++) {
	            System.out.print(' ');
	         }

	         // �Ƕ�̵�
	         if(i < lineCount/2) {
	            spaceCount-=1;
	            starCount+=2;
	         }
	         // ���Ƕ�̵� 
	         else {
	            spaceCount+=1;
	            starCount-=2;
	         }
	         System.out.println();
	      }


	}

}
