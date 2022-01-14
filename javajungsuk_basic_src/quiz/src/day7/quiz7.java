package day7;
class Grade {
	int math;
	int eng;
	int sc;
	Grade(int math, int eng, int sc){
		this.math = math;
		this.eng = eng;
		this.sc = sc;
		
	}
	void score () {
		System.out.println("수학 점수 " + math + "영어 점수" + eng +"과학 점수" + sc);
	}
	void grade() {
		System.out.println("총 점수 =" + (math+eng+sc) + "평균 점수" + (math+eng+sc)/3);
	}
}

public class quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grade grade = new Grade(80, 85, 90);
		grade.score();
		grade.grade();

	}

}
