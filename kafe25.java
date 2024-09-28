import java.util.Scanner;
public class kafe25 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        double totalHarga, nominalBayar;
        float diskon = 0.1f;
        System.out.println("Member (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.println("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        if (keanggotaan) {
            nominalBayar = totalHarga - (diskon * totalHarga); 
            System.out.println("Diskon 10% diberikan.");
        } else {
            nominalBayar = totalHarga;
            System.out.println("Tidak ada diskon, karena pelanggan bukan member.");
        }
        System.out.println("Total Belanja: Rp " + totalHarga);
        System.out.println("Nominal Bayar setelah diskon: Rp " + nominalBayar);
        int nominalInt = (int) nominalBayar;
        System.out.println("Nominal Bayar: " + nominalInt);
        System.out.println("Keanggotaan pelanggan: " + keanggotaan);
        System.out.println("Item pembelian: " + jmlKopi + " Kopi, " + jmlTeh + " Teh, " + jmlRoti + " Roti.");

        input.close();
    }
}
