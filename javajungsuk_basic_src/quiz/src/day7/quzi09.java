package day7;
class PhonBook{
	String name;
	String tel;
	static int count;
	
	PhonBook(String name, String tel){
		this.name = name;
		this.tel = tel;
		count++;
	}
	
	void info() {
		System.out.println("이름 : "+ name + "전화번호"+tel +"등록된 멤버 전체 갯수" + count);
	}
}

public class quzi09 {

	public static void main(String[] args) {

		PhonBook pb = new PhonBook("커리", "010-3945-4566");
		pb.info();
	}

}
