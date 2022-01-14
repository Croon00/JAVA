package day5;

import java.util.Scanner;

public class quiz14 {

	public static void main(String[] args) {

//14. 단어의 글자 위치를 무작위로 섞어서 보여주고 원래의 스펠링을 입력하여 단어를 맞추는 
//프로그램을 작성하여라. 
//
//String[] words = { "television", "computer", "mouse", "phone" };
//
//
//[ 실행 결과 ] 
//Q1. lvtsieeoin 의 정답을 입력하세요 >> television
//맞았습니다.
//
//Q2. otepcumr 의 정답을 입력하세요 >> computer 
//맞았습니다.
//
//Q3. usemo 의 정답을 입력하세요  >> asdf
//틀렸습니다.
//
//Q4. ohpne 의 정답을 입력하세요 >> phone
//맞았습니다.

		
		String[] words = {"television", "computer", "mouse","phone"};
		Scanner scanner = new Scanner(System.in);
		String answer = null;
		String word_sample = null;
		
		for(int i = 0; i<words.length; i++) {
			//String char[]로 변환 각각이 문자 배열로 들어가야 해서 변환해주어야 함
			// words[i]의 값 하나씩을 받아준다. words[i]는 문자열이기 때문에 안된다.
			char [] question = words[i].toCharArray();
			
			for(int j = 0; j<question.length; j++) {
	 			int idx = (int)(Math.random()* question.length);
	 			char temp = question[1];
	 			question[i] = question[idx];
	 			question[idx] = temp;
			}
			//문자열 ==> 문자 배열로 바꿔줌
			// word_sample = new String(question);
			word_sample = String.valueOf(question);
			
			System.out.println()
			
			String answer = scanner.nextLine();
			
			
			
			   //      14. 단어의 글자 위치를 무작위로 섞어서 보여주고 원래의 스펠링을 입력하여 단어를 맞추는 
		      //      프로그램을 작성하여라. 
		      //
		      //      String[] words = { "television", "computer", "mouse", "phone" };
		      //
		      //
		      //      [ 실행 결과 ] 
		      //      Q1. lvtsieeoin 의 정답을 입력하세요 >> television
		      //      맞았습니다.
		      //
		      //      Q2. otepcumr 의 정답을 입력하세요 >> computer 
		      //      맞았습니다.
		      //
		      //      Q3. usemo 의 정답을 입력하세요  >> asdf
		      //      틀렸습니다.
		      //
		      //      Q4. ohpne 의 정답을 입력하세요 >> phone
		      //      맞았습니다.
		      
		      /*
		       * 영단어 문자열 배열 
		       * 각 영단어 문자열 섞기 : 문자열 => 문자배열 => 각문자섞기
		       * 퀴즈단어 표시하기 : 문자배열 -> 문자열
		       * 입력 데이타와 정답 영단어가 맞는지 비교  equals() 
		       * 비교에 따른 메세지 출력 
		       * */


		      
//		      String[] words = { "television", "computer", "mouse", "phone" };
//		      Scanner scanner = new Scanner(System.in);
//		      String answer = null; 
//		      String word_sample = null; // 영단어를 섞은 문자열 
//		      
//		      for(int i=0;i<words.length;i++) {
//		         // 각 영단어문자열 => 문자 배열 
//		         // String char[]로 변환
//		         // 문자열.toCharArray() : 문자열 => 문자 배열 
//		         char[] question = words[i].toCharArray(); 
//		         
//		         // 문자섞기 
//		         for(int j=0;j<question.length;j++) {
//		            int idx = (int)(Math.random() * question.length);
//		            char tmp = question[i];
//		            question[i] = question[idx];
//		            question[idx] = tmp;
//		         }
//		         
////		         System.out.println(Arrays.toString(question));
//		         // [i, e, i, t, v, l, s, o, e, n]
//		         
//		         // 문자배열 => 문자열 
//		         // new String(문자배열) 
//		         // String.valueOf(문자배열)
////		         word_sample = new String(question);
//		         word_sample = String.valueOf(question);
//		         // 퀴즈 출력 
//		         System.out.printf("Q %d. %s 의 정답을 입력하세요...", i+1, word_sample);
//		         
//		         answer = scanner.nextLine();
//		         // System.out.println(answer + " " + words[i]);
//		         
//		         // 입력 데이타 = 정답 
//		         if (words[i].equals(answer)) 
//		            System.out.println("맞았습니다");
//		         else 
//		            System.out.println("틀렸습니다");
//		      }   


		}
		

	}

}
