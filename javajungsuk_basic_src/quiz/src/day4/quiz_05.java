package day4;

public class quiz_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		15.  ���� for ���� while ������ �����Ͽ���. 
//
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
		int i = 0;
		int j = 0;
		while(i<=10) {
			i++;
			j = 1;
			while(j<=i) {
				j++;
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}
