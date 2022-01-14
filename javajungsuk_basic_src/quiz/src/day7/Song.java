package day7;

class Songg{
	String title;
	String singer;
	int year;
	String country;
	
	static int cnt;
	Songg(){
		
	}
	Songg(String title, String singer, int year, String country){
		this.title = title;
		this.singer = singer;
		this.year = year;
		this.country = country;
		Songg.cnt++;
	}
	
	void info() {
		System.out.println(title + " "  + singer + " " + year + " " + country+ " " +cnt);
	}
}

public class Song {

	public static void main(String[] args) {

		
		Songg song = new Songg("찾아라 비밀의 열쇠", "신태일", 2005, "대한민국");
		song.info();
		Songg song2 = new Songg("Beliver", "Imagine Dragon", 2017, "미국");
		song2.info();
		Songg song3 = new Songg("torches", "Aimer", 2018, "일본");
		song3.info();
	}

}
