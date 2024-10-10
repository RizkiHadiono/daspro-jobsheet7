import java.util.Scanner;

public class Tugas2Parkir {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan (1 untuk Mobil, 2 untuk Motor, 0 untuk Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;  // Tarif tetap jika parkir lebih dari 5 jam
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;  // Tarif untuk mobil
                    } else if (jenis == 2) {
                        total += durasi * 2000;  // Tarif untuk motor
                    }
                }
            }

        } while (jenis != 0);  // Loop berlanjut hingga input jenis kendaraan adalah 0

        System.out.println("Total yang harus dibayar: Rp " + total);
        sc.close();
    }
}
