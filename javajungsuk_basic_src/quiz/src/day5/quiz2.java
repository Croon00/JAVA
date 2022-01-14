package day5;

public class quiz2 {

	public static void main(String[] args) {
//		Math.random()을 이용하여 50~99 사이의 난수 정수로 구성된 
//		배열을 생성하고 출력하도록 프로그래밍하여라.
//		( 배열 길이는 7로 한다)
//
//		[ 실행 결과 ] 
//		numArray[0] = ?
//		numArray[1] = ?
//		...
//		numArray[6] = ?
		
		int numArray[] = new int[7];
		
		for (int i=0; i<=numArray.length-1; i++) {
			numArray[i] = (int)(Math.random()*99+50);
			
			System.out.println("numArray[" +i+ "]=" + numArray[i]);
		}
		
		
		   /*
		      // (int)(Math.random()*(최대값)+1 
		      // min ~ max
		      // (int)(Math.random()*(최대값-최소값+1))+최소값
//		      int[] numArray = new int[100];
		      int[] numArray = new int[7];
		      for (int i = 0; i < numArray.length; i++) {
		         numArray[i] = (int)(Math.random()*(99-50+1))+50;
		      }
		      System.out.println(Arrays.toString(numArray));
		      
		      for (int i = 0; i < numArray.length; i++) {
		         System.out.println("numArray[" + i + "] = " + numArray[i]);
		      }

		      */
	}

}
