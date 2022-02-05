package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

		Scanner scan = new Scanner(System.in);
    	
		System.out.println("Lütfen yasinizi giriniz");
		int yas= scan.nextInt();
		
		System.out.println("Lütfen kilonuzu kg olarak giriniz");
		int kilo= scan.nextInt();
		
		if (yas<=18)  {
			System.out.println("yasin kücük canim kan bagisi yapamazsin");
		} else if (yas>18 && kilo<=50)  {
			System.out.println("Cok zayifsin canim kan bagisi yapamazsin");
		} else if  (yas>18 && kilo>50)  {
			System.out.println("Kedi olali bir fare tuttun kan bagisi yapabilirsin");
		
	scan.close();
		}

	}

}
