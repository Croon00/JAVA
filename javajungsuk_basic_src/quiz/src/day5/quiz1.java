package day5;

public class quiz1 {

	public static void main(String[] args) {
//		01. 3의 배수로 구성된 배열을 생성하고 출력하도록 프로그래밍하여라.
//		( 배열 길이는 10으로 한다)
//
//		[ 실행 결과 ] 
//		numArray[0] = 3
//		numArray[1] = 6
//		...
//		numArray[9] = 30

		int numArray[] = new int[10];
		for(int i = 1; i<=numArray.length-1; i++) {
			int j = 3*i;
			numArray[i] = j;
			
			
			System.out.println("numArray[" +i+ "]=" + numArray[i]);
		}
	}

}
