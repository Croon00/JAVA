package java_quiz;

public class day2_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		08. 다음의 문장들을 조건식으로 표현하라.
//
//		1. int 형 변수 x 가 10보다 크고 보다 작을 때  true인 조건식
		int x = 20;
		if (x >=10) {
			System.out.println("true");
		}
		
//		2. char 형 변수 ch 가 공백이나 탭(\t)이 아닐 때  true인 조건식
		char ch = ' ';
		if (ch==' ' || ch != '\t');
		
		
//		3. char  형 변수 ch 가 'x' 또는 'X' 일 때  true인 조건식
		char ch1 = 'x';
		if(ch1 == 'x' || ch1 == 'X');
//		4. char 형 변수 ch 가 숫자(‘0’~‘9’)일 때  true인 조건식 true
		char ch2 = '8';
		if((int)ch2>=0 && (int)ch2<=9);
		
//		5. char 형 변수 ch 가 영문자(대문자 또는 소문자) 일 때  true 인 조건식
		
		
//		6. boolean 형 변수 powerOn 이  false 일 때 true 인 조건식
		boolean powerOn = true;
		if(powerOn == false);
		
		
		
//		7. 문자열 참조변수 str 이 "yes" 일 때 true 인 조건식
		
		String str = new String("yes");
		
		System.out.println(str.equals("yes"));
		
		
		
		
		  // 08. 다음의 문장들을 조건식으로 표현하라.
	      // p125 4-1

	      //      1. int 형 변수 x 가 10 보다 크고 20 보다 작을 때  true인 조건식
	      //      2. char 형 변수 ch 가 공백이나 탭(\t)이 아닐 때  true인 조건식
	      //      3. char  형 변수 ch 가 'x' 또는 'X' 일 때  true인 조건식
	      //      4. char 형 변수 ch 가 숫자('0'~'9')일 때  true인 조건식 true
	      //      5. char 형 변수 ch 가 영문자(대문자 또는 소문자) 일 때  true 인 조건식
	      //      6. boolean 형 변수 powerOn 이  false 일 때 true 인 조건식
	      //      7. 문자열 참조변수 str 이 "yes" 일 때 true 인 조건식

	      //1. int 형 변수 x 가 10 보다 크고 20 보다 작을 때  true인 조건식
	      int x = 100;
	      System.out.println((10 < x) && (x < 20));       

	      //2. char 형 변수 ch 가 공백이나 탭(\t)이 아닐 때  true인 조건식
	      // \n , \t, \r
	      char ch1 = '\t';
	      System.out.println(!(ch1 == ' ' || ch1 =='\t'));    

	      //3. char  형 변수 ch 가 'x' 또는 'X' 일 때  true인 조건식
	      char ch2 = 'g';
	      System.out.println((ch2 == 'x') || (ch2 == 'X'));    

	      //4. char 형 변수 ch 가 숫자('0'~'9')일 때  true인 조건식 true
	      char ch3 = '0';
	      System.out.println('0' <= ch3 && ch3 <='9');    

	      //5. char 형 변수 ch 가 영문자(대문자 또는 소문자) 일 때  true 인 조건식
	      char ch4 = '6';
	      System.out.println(('a' <= ch4 && ch4 <= 'z') || ('A' <= ch4 && ch4 <= 'Z')); 

	      //6. boolean 형 변수 powerOn 이  false 일 때 true 인 조건식
	      boolean powerOn = false;
	      System.out.println(!powerOn); 

	      //7. 문자열 참조변수 str 이 "yes" 일 때 true 인 조건식
	      //         String str = "yes";
	      String str = new String("yes");

	      System.out.println(str=="yes"); // false
	      System.out.println(str.equals("yes")); // true
	}

}















