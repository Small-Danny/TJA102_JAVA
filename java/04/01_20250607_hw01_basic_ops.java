package hw1;

public class Homework_250605 {

	public static void main(String[] args) {
		
		//1.請設計一隻Java程式，計算12，6這兩個數值的和與積
		System.out.println("12+6=" + 12+6);
		System.out.println("12*6=" + 12*6);
		
		//2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆?(一打為12顆)
		int num1 = 200/12;
		int num2 = 200%12;
		
		System.out.println("200顆雞蛋共是" + num1 +"打，餘"+ num2 +"顆");
		
		//3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int day = 256559/(24*60*60);
		int dayleft  = 256559%(24*60*60);
		int hour = dayleft/(60*60);
		int hourleft = dayleft%(60*60);
		int min = hourleft/60;
		int sec = hourleft%60;
		
		System.out.printf("256559秒共有:%d天%d小時%d分%d秒\n", day, hour, min, sec );
		
		//4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		
		final double pi = 3.1415;
		int r = 5;
		double c = 2*pi*r;
		double a = pi*r*r;
		
		System.out.println("半徑為5的圓周長=" + c +"\n半徑為5的圓面積=" + a);
		
		//5.某人在銀行存入150萬，銀行利率為2%，美果每年利息都繼續存入銀行，請用程式計算10年後
		//  本金加利息共有多少錢(用複利計算)
		
		double cash = 1500000;
		double rate = 0.02;
		int year = 10;
		
		
		for(int i =1; i <= year; i++) {
			cash = cash*(1 + rate);
		}
		
		System.out.printf("10年後本金加利息共有%f元\n", cash);
		
		
		//6.請寫一隻程式，利用System.out.println(印出以下三個運算試結果，並註解產生原因)
		
		System.out.println(5+5); //數字運算5+5=10
		System.out.println(5+'5'); //數字+數字5的unicode運算 = 58
		System.out.println(5+"5"); //數字+字串5的運算 = 55
		
		
	
	}
	
}
