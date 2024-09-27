import java.util.Scanner;

public class PemilihanHariDenganIf25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor hari (1-7): ");
        int nomorHari = input.nextInt();
        if (nomorHari >= 1 && nomorHari <= 5) {
            System.out.println("Weekday");
        } else if (nomorHari == 6 || nomorHari == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }

        input.close();
    }
}

