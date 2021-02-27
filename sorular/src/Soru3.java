import java.util.Scanner;              //lamba sorusu

public class Soru3 {       
	private static Scanner scan;

	public static void main(String[] args) {
		System.out.println("1. Anahtari acip 2 dk bekleyin.Sonra anahtari kapatin.");
		System.out.println("2. Anahtari acip diger odaya girin.");
		System.out.println("Yanan lambanin numarasini girin:");
		scan = new Scanner(System.in);
		int a = scan.nextInt();		
		if((a<=3 && a>0)) {
			System.out.println("Sonuk lambalardan sicak olanin numarasini girin:");
			int b = scan.nextInt();
			if((b<=3 && b>0)) {
				if(a<b || b<a) {				
				System.out.println("1. Anahtar "+ a + ". lambayi yakar.");
				System.out.println("2. Anahtar "+ b + ". lambayi yakar.");
				System.out.println("3. Anahtar da kalan son lambayi yakar.");
				}
				else { //hocam kafam acayip karisti ayni sayi girilirse diye yazdim bunu 
					System.out.println("hatali giris;ayni sayiyi girdin, program sonlandirildi...");
				}
				}
			else {     // 1 2 3 den baska sayi girilirse...
				System.out.println("hatali giris; sadece 3 lamba var, program sonlandirildi...");
		}
			}
			else {
				System.out.println("hatali giris; sadece 3 lamba var, program sonlandirildi...");
		}
	}
}