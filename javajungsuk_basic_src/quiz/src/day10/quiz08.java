package day10;
abstract class Computer{
	public abstract void display();
	public abstract void typing();
	public void turnOn()
	{
		System.out.println("전원을 켭니다.");
	}
	public void turnOff()
	{
		System.out.println("전원을 끕니다.");
	}
}


class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop Display()");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");		
	}
	
}

class NoteBook extends Computer{

	@Override
	public void display() {
		System.out.println("NoteBook Display()");		
	}

	@Override
	public void typing() {
		System.out.println("NoteBook Typing()");		
	}
	
}

class MyNoteBook extends NoteBook{

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("MyNoteBook Typing()");
	}
	
}
public class quiz08 {

	public static void main(String[] args) {
		DeskTop d = new DeskTop();
		NoteBook n = new NoteBook();
		MyNoteBook m = new MyNoteBook();
		d.display();
		d.typing();
		d.turnOn();
		d.turnOff();
	}

}
