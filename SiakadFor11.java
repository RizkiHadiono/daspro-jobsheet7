import java.util.Scanner;

public class SiakadFor11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            
            // Mengecek nilai tertinggi
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            
            // Mengecek nilai terendah
            if (nilai < terendah) {
                terendah = nilai;
            }
            
            // Mengecek apakah mahasiswa lulus atau tidak
            if (nilai >= 60) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        
        // Menampilkan hasil nilai tertinggi dan terendah
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        // Menampilkan jumlah mahasiswa yang lulus dan tidak lulus
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidakLulus);
    }
}
