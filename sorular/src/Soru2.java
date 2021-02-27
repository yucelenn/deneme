import java.util.Scanner;
                                                  // sekilli cubuk sorusu
public class Soru2 {
	private static Scanner scan;

	public static void main(String[] args) {
		System.out.println("Cubuktaki disk sayisini girin:");
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		int k=1,j=1;
		for(int i=a;i>0;i--) {
		    System.out.println("1. cubukta alttan "+i+". siradaki, 2. cubukta alttan "+k+". siraya konur.");
			k++;
		}
		for(int i=a;i>0;i--) {
		    System.out.println("2. cubukta alttan "+i+". siradaki, 3. cubukta alttan "+j+". siraya konur.");
			j++;
		}	
		System.out.println("1. ile 3. cubukta siralama ayni olur...");			
	}
}

