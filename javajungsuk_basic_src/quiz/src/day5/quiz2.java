package day5;

public class quiz2 {

	public static void main(String[] args) {
//		Math.random()�� �̿��Ͽ� 50~99 ������ ���� ������ ������ 
//		�迭�� �����ϰ� ����ϵ��� ���α׷����Ͽ���.
//		( �迭 ���̴� 7�� �Ѵ�)
//
//		[ ���� ��� ] 
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
		      // (int)(Math.random()*(�ִ밪)+1 
		      // min ~ max
		      // (int)(Math.random()*(�ִ밪-�ּҰ�+1))+�ּҰ�
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
