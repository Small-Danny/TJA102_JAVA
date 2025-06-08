package hw1;

public class hw1 {
	public static void main(String[] args) {
//		1：請設計一隻Java程式，計算12，6這兩個數值的和與積
		
		int a = 12,
			b = 6;
		int sum = a + b; // 18
		int product = a * b; // 72
		
		System.out.println("12、6 的和 = " + sum);
		System.out.println("12、6 的積 = " + product);
		System.out.println();
		
		
//		2：請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		
		int egg = 200;
		int donzen = egg / 12;
		int remainder = egg % 12;
		
		System.out.println("200 顆蛋 = " + donzen + "打 " + remainder + "顆");
		System.out.println();
		
		
//		3：請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		
		int x = 256559,
			secoundInDay = 24 * 60 * 60, // 一天有多少秒 
			secoundInHour = 60 * 60; // 一小時有多少秒
		int day = x / secoundInDay;
		int hour = x % secoundInDay / secoundInHour;
		int minute = x % secoundInDay % secoundInHour / 60;
		int secound = x % secoundInDay % secoundInHour % 60;
		
		System.out.println("256559 秒 = " + day + "天 " + hour + "小時 " + minute + "分 " + secound + "秒");
		System.out.println();
		
		
//		4：請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		
		double PI = 3.1415;
		int r = 5;
		double area = r * r * PI; // 圓面積：半徑 * 半徑 * pi
		double per = r * 2 * PI; //圓周長	：半徑 * 2 * pi
		
		System.out.println("半徑為 " + r + " 的圓面積 = " + area);
		System.out.println("半徑為 " + r + " 的圓周長 = " + per);
		System.out.println();
		
		
//		5：某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，
//		請用程式計算10年後，本金加利息共有多少錢 (用複利計算，公式請自行google)
		
//		最終本利和FV = 本金PV * (1 + 利率r)^期數n。 
		int pv = 1_500_000;
		double r1 = 0.02;
		int fv = (int) (pv * (Math.pow(1 + r1, 10)));

		System.out.println("10年後，本金加利息: " + fv + "元");
		System.out.println();
		
		
//		6：請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
// 		5 + 5
// 		5 + ‘5’
// 		5 + “5”
// 		並請用註解各別說明答案的產生原因
		
		System.out.println(5 + 5); 
//		5皆為 int
//		5 + 5 = 10 
		
		System.out.println(5 + '5'); 
// 		5為 int，'5'為 char
// 		因char 是Unicode 字元（16進位），char 和 int 可以轉換的
// 		'5' 的 Unicode編碼是 U+0035（16進位），轉換後為 53（10進位）
// 		5 + 53 = 58
	
		System.out.println(5 + "5"); 
// 		5為 int，"5" 為字串
// 		當字串搭配"+"時會是「文字串接」，不會計算總和
// 		5 + "5" = 55

	}
	
}
