package com.hw16;

public class hw01 {

	public static void main(String[] args) {
// 1.請設計一隻java程式,計算12.6這兩個數值的和與積
		int a = 12, b = 6;
		// 和
		int sum = a + b;
		// 積
		int product = a * b;
		System.out.println("和:" + sum + "," + "積:" + product);

// 2.請設計一隻java程式,計算200顆蛋共是幾打幾顆?
		int eggs = 200;
		int donzen = eggs / 12;
		int remainder = eggs % 12;
		System.out.println("一共是:" + donzen + "打" + remainder + "顆");

// 3.請由程式算出256559秒為多少天,多少小時,多少分,與多少秒
		int s = 256559;
		int days = s / (24 * 60 * 60);// 2天
		int hours = s % (24 * 60 * 60) / (60 * 60);// 23小時
		int min = s % (24 * 60 * 60) % (60 * 60) / (60);// 15秒
		int sc = s % (24 * 60 * 60) % (60 * 60) % (60);
		System.out.println(days + "天" + hours + "時" + min + "分" + sc + "秒");

// 4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

		double PI = 3.1415;
		double r = 5;
		double area = r * r * PI;
		double perimeter = 2 * r * PI;

		System.out.printf("圓面積:" + area + "圓周長:" + perimeter);
		System.err.println();

// 5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢(用複利計算,公式請自行google)

		// 初始金額
		double money = 1500000;

		for (int i = 0; i < 10; i++) {
			money += money * 0.02;
		}
		System.out.println(money);
		
		// 初始金額
		int pv = 1500000;
		double r1 = 0.02;
		int fv = (int) (pv * (Math.pow(1 + r1, 10)));
		System.out.println(fv);

// 6.請寫一隻程式,利用System.out.println()印出以下三個運算是結果:
		System.out.println(5 + 5);// int的數字加減
		System.out.println(5 + '5');// (ASCII）對應十進位值是 53
		System.out.println(5 + "5");// 字串跟數字連接會變成字串連起來
	}
	
	

}

