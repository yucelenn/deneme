
import java.util.Scanner;

public class Soru1 {                     //kurt-coban-koyun sorusu: hocam oyun gibi yaptim.

    private static Scanner scan;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("coban ilk hangisini karsiya gecirsin? kurt icin 1 , koyun icin 2 , saman icin 3 basin:");
            scan = new Scanner(System.in);
            int a = scan.nextInt();
            switch (a) {
                case 1: //kurdu karsiya gecirirse
                    System.out.println("koyun samani yer...");
                    break;
                case 2://koyunu karsiya gecirirse
                    System.out.println("coban koyunu birakip kiyiya dondukten sonra hangisini karsiya gecirsin? kurt icin 1 , saman icin 2 basin:");
                    int b = scan.nextInt();
                    switch (b) {
                        case 1://kurdu karsiya gecirirse
                            for (int k = 0; k < 100; k++) {
                                System.out.println("coban,kurt ve koyun karsi kiyida.cobanin; yalniz donmesi icin 1 , koyunla birlikte donmesi icin 2 bas�n:");
                                int c = scan.nextInt();
                                switch (c) {
                                    case 1://yalniz donup kurtla koyunu birlikte birakirsa
                                        System.out.println("kurt koyunu yer...");
                                        break;
                                    case 2://koyunla birlikte donerse
                                        System.out.println("coban koyunu geri getirdi.samani karsiya gecirip yalniz dondu,koyunu karsiya gecirerek gorevi tamamladi.");
                                        i = 101;
                                        k = 101;
                                        break;
                                }
                            }
                            break;

                        case 2://samani karsiya gecirirse.samanla koyun karsi kiyida
                            for (int j = 0; j < 100; j++) {
                                System.out.println("coban samani karsiya gecirdi.coban,koyun ve saman karsi kiyida.coban�n yalniz donmesi icin 1 , koyunla donmesi icin 2 basin:");
                                int e = scan.nextInt();
                                switch (e) {
                                    case 1://yalniz d�nerse
                                        System.out.println("koyun samani yer...");
                                        break;
                                    case 2://koyunla d�nerse
                                        System.out.println("coban koyun geri getirdi.koyunu ilk kiyiya birakip kurdu karsiya gecirdi ve yalniz donup kurdu karsiya gecirerek gorevi tamamladi.");
                                        i = 101;
                                        j = 101;
                                        break;
                                }
                            }
                            break;
                    }
                    break;
                case 3://samani karsiya gecirirse
                    System.out.println("kurt koyunu yer...");
                    break;
            }
        }

    }
}
