package day7;

import java.lang.reflect.Array;
import java.util.Arrays;

class MyRect{
	int width;
	int height;
	
	void rectInfo(){
		System.out.println("가로 길이 :" + width + "세로 길이" + height);
	}
	static MyRect recCopy (MyRect r){
		MyRect r2 = new MyRect();
		return r2;
	}
}
public class quiz03 {

	public static void main(String[] args) {

		MyRect r = new MyRect();
		r.height = 200;
		r.width = 300;
		
		r.rectInfo();
		MyRect.recCopy(r);
		System.out.println(Arrays.toString(MyRect.recCopy(r)));
	}

}
