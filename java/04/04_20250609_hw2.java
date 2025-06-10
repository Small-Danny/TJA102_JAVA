package hw2;

public class hw2 {
	
	public static void main(String[] args) {
		
		
		//請設計一隻JAVA程式，計算1~1000的偶數和
		int sum = 0;
		for(int i = 0; i <= 1000; i+=2) {
			sum +=  i;
		}
		System.out.println(sum);
		
		//請設計一隻JAVA程式，計算1~10的連乘積(用for迴圈)
		int a = 1;
		for(int b = 1; b <= 10; b++) {
			a *= b;
		}
		System.out.println(a);
		
		//請設計一隻JAVA程式，計算1~10的連乘積(用while迴圈)
		int c = 1;
		int d = 1;
		while(d <= 10) {
			c *= d;
			d++;
		}
		System.out.println(c);
		
		//請設計一隻JAVA程式，輸出結果為以下
		//1 4 9 16 25 36 49 64 81 100
		for(int h = 1; h <= 10; h++) {
			System.out.print(h*h + " ");
		}
			
		//大樂透題目
		System.out.println("\n阿文可以選擇的數字有:");
		int count = 0;
		for(int var = 1; var <= 49; var++ ) {
			if(!String.valueOf(var).contains("4")) {
				System.out.print(var + " ");
				count++;
			}
		}
		System.out.println("\n總共有" + count + "個數字可以選擇");
		
		//請設計一隻JAVA程式，輸出結果為倒置三角形10~1
		for(int x = 10; x >= 1; x--) {
			for(int y = 1; y <= x; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
		
		//請設計一隻JAVA程式，輸出結果為A~F三角形
		for(int q = 1; q <= 6; q++) {
			char ABBCCC = (char)('A'+ q -1);
			for (int r = 1; r <= q; r++) {
				System.out.print(ABBCCC);
			}
			System.out.println();
		}
		
	}
	
}
