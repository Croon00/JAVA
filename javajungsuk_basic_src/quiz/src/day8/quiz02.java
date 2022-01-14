package day8;
class pen {
	int amount;
	String color;
	int getAmount() { return amount; }
	void setAmount (int amount) { this.amount = amount; }
	String getColor() { return color; }
	void setColor(String color) { this.color = color; }
	pen(){
		
	}
}
class SharpPencil extends pen { // ª˛«¡∆ÊΩΩ
	   int width; // ∆Ê¿« ±Ω±‚
	   SharpPencil(int width){
		   this.width = width;
	   }
	}

	class Ballpen extends pen { // ∫º∆Ê
		
	}

	class FountainPen extends pen{ // ∏∏≥‚« 
	   
	   void refill (int n) { setAmount(n); }
	}
	
public class quiz02 {

	public static void main(String[] args) {
		SharpPencil sharp = new SharpPencil(5);
		sharp.setAmount(10);
		sharp.setColor("red");
		sharp.getAmount();
		sharp.getColor();
		
		
		
	}

}
