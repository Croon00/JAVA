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
		System.out.println("���� ���� " + math + "���� ����" + eng +"���� ����" + sc);
	}
	void grade() {
		System.out.println("�� ���� =" + (math+eng+sc) + "��� ����" + (math+eng+sc)/3);
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
