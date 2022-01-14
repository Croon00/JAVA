package day9.com.quiz;

class Mydate {
	private int day;
	private int month;
	public int getDay() {
		return day;
	}
	public void setDay() {
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			day = 31;
		}
		else if(month == 2) {
			day = 28;
		}
		else {
			day = 30;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(1<=month && month <= 12) {
			this.month = month;
		}
	}
	public Mydate(int month) {
		setMonth(month);
		setDay();
	}
	void info() {
		System.out.println(day);
	}
}
public class quiz08 {

}
