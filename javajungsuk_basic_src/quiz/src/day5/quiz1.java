package day5;

public class quiz1 {

	public static void main(String[] args) {
//		01. 3�� ����� ������ �迭�� �����ϰ� ����ϵ��� ���α׷����Ͽ���.
//		( �迭 ���̴� 10���� �Ѵ�)
//
//		[ ���� ��� ] 
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
