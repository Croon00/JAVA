package day6;

import java.lang.reflect.Array;

public class quiz11 {
	
	static String sum_n(int n) {
		int sum =0;
		for (int i = 1; i<=n; i++) {
			sum +=i;
		}
		return "1~"+n+"까지의 합은"+sum;
	}
	
	static String rect_area(int n, int m) {
		int extent = n*m;
		
		return n+"X"+m+"="+extent;
	}
	static String max(int n[]) {
		int max = -999999;
		if(n.length != 0) {
		for (int i=0; i <=n.length-1; i++) {
			if(max < n[i]) {
				max = n[i];
			}
		}
		}
		return "최대 값은" +max;
				
		
			
			
		}
	static int[] shuffle(int n[]) {
		int temp = 0;
		for (int i=0; i < 10; i++ ) {
			int m = (int)(Math.random()*9+1);
			n[i] = temp;
			n[i] = n[m];
			n[m] = temp;
		}
		return n;
	}
	
	static int[][] make_2dArray() {
		int n[][] = null;
		for (int i = 0; i<= 2; i++) {
			for(int j = 0; j <= 2; j++) {
				n[i][j] =(int)(Math.random()*(99-10+1)+10);
			}
		}
		return n;
	}
		
	


	public static void main(String[] args) {
		
		int n = 100;
		System.out.println(sum_n(n));
		int m = 100;
		int l = 50;
		System.out.println(rect_area(m,l));
		int[] k = {3,2,9,4,7};
		System.out.println(max(k));
		
		
	}

	}
