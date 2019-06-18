package chapter_3;

import java.util.Scanner;

public class HaftasonuMuHaftaiciMi {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir gun girin (Pazartesi icin 1 pazar icin 7");
		int gun = input.nextInt();
		
		switch (gun) {
		case 1:
		case 2:
		case 3:
			System.out.println("Bu 3. case de");
		case 4:
		case 5:
			System.out.println("Hafta ici");
		
		
			break;
			
		case 6:
		case 7:
			System.out.println("Hafta sonu");

		default:
			System.out.println("Yanlis girdi");
			break;
		}
		System.out.println("Devam etmek istiyor musunuz?");
		String cevap = input.next();
		
		switch (cevap.charAt(0)) {
		case 'e':
		case 'E':	
			System.out.println("Iyi devam et o zaman");
			break;
		case 'h':
		case 'H':
			System.out.println("Sen bilirsin");
			break;

		default:
			System.out.println("Ne dedigini anlamiyorum");
		
		}
		
	}

}
