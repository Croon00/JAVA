package day5;

import java.util.Scanner;

public class quiz10 {

	public static void main(String[] args) {
//      10. 태어난 년도를 입력하면 해당 띠를 출력하는 프로그램을 작성하여라. 
      // 태어난년도%12 값이 animal 배열의 인덱스로 설정 
//
//      String[] animal = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀","말", "양"};
//
//         [ 출력 결과 ] 
//         태어난 년도 >>   ?
//         ? 띠입니다. 
            
      String[] animal = {"원숭이", "닭", "개", "돼지", "쥐", "소", 
                        "호랑이", "토끼", "용", "뱀","말", "양"};
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("태어난 년도 >>   ");
      int birth_year = scanner.nextInt();
      
      System.out.println(animal[birth_year%12] + " 띠입니다. ");


	}

}
