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
		System.out.println("�̸� : "+ name + "��ȭ��ȣ"+tel +"��ϵ� ��� ��ü ����" + count);
	}
}

public class quzi09 {

	public static void main(String[] args) {

		PhonBook pb = new PhonBook("Ŀ��", "010-3945-4566");
		pb.info();
	}

}
