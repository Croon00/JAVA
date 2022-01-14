package day12;

import java.util.Scanner;

public class quiz03 {
	public static void main(String[] args) {
		
		int y = (int)(Math.random()*100 +1);
		Scanner scanner = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.println("1과 100 사이의 수를 입력하시오");
				int x = scanner.nextInt();
				if(y > x) {
					System.out.println("더 큰수를 입력하시오");
				}
				else if(y < x) {
					System.out.println("더 작은 수를 입력하시오");
				}
				else if(y == x) {
					System.out.println("맞췄습니다.");
					break;
				}
			}
			
			
		} catch (Exception e) {
		System.out.println("숫자를 입력하시오");
		}
	}

}
