
import java.util.Scanner;


public class Tugas1Tiket {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int hargaTiket = 50000;
        int jml_tiket, total_tiket_terjual = 0;
        float diskon = 0, total_harga = 0, harga_diskon = 0, total_penjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket (masukakan 0 untuk batal) : ");
            jml_tiket = input.nextInt();


            if (jml_tiket == 0) {
                System.out.println("");
                System.out.println("Transaksi Selesai");
                break;
            }

            if (jml_tiket == 0) {
                System.out.println("Jumlah tidak bisa negatif, (masukan 0 untuk batal) : ");
                continue;
            }

            total_tiket_terjual += jml_tiket;
            
            total_harga = jml_tiket * hargaTiket;

            if (jml_tiket > 10) {
                diskon = 0.15f;
                harga_diskon = total_harga - (total_harga * diskon);
            }
            else if (jml_tiket > 4) {
                diskon = 0.1f;
                harga_diskon = total_harga - (total_harga * diskon);
            }
            else {
                harga_diskon = total_harga;
            }

            total_penjualan += harga_diskon;

            System.out.println("Total harga untuk " + jml_tiket + " tiket adalah Rp " + harga_diskon);
            
        } while (true);

        System.out.println("===================================================");
        System.out.println("Total tiket terjual : " + total_tiket_terjual);
        System.out.println("Total penjualan\t    : " + total_penjualan);
        System.out.println("===================================================");
    }
    
}
