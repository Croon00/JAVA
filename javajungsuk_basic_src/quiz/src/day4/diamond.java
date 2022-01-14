package day4;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /*
	       * 
	14. 반복문을 이용하여 다음과 같이 출력되도록 프로그래밍 하여라. 

	[ 실행 결과 ]

	          *
	         ***
	        *****
	       *******
	        *****
	         ***
	          *





	       */
	      // 행수 
	      int lineCount = 7;  //다른 홀수 값을 넣어보세요
	      int spaceCount = lineCount/2 +1;
	      int starCount = 1;

	      for(int i = 0; i<lineCount; i++) {
	         // 피라미드 
	         for(int j = 0; j<spaceCount; j++) {
	            System.out.print(' ');
	         }
	         for(int j=0; j<starCount; j++) {
	            System.out.print('*');
	         }
	         for(int j = 0; j<spaceCount; j++) {
	            System.out.print(' ');
	         }

	         // 피라미드
	         if(i < lineCount/2) {
	            spaceCount-=1;
	            starCount+=2;
	         }
	         // 역피라미드 
	         else {
	            spaceCount+=1;
	            starCount-=2;
	         }
	         System.out.println();
	      }


	}

}
