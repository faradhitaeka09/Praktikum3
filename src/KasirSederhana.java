import java.util.Scanner;

/**
 * @author Faradhita
 * @since 29/10/2023
 * @implNote Program kasir ini menghitung harga barang dengan cara di jumlahkan
 * @version no version
 * @class Program kasir untuk menghitung barang yang di beli orang
 */

public class KasirSederhana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHarga = 0; // Inisialisasi variabel total Harga dengan nilai 0
        boolean isSelesai = false; // Inisialisasi variabel isSelesai dengan nilai false

        System.out.println("===== PROGRAM KASIR SEDERHANA =====");

        // Perulangan akan terus berjalan selama isSelesai bernilai false

        while (Check(isSelesai)) {

            System.out.print("Masukkan harga barang (atau 0 untuk selesai): ");
            int hargaBarang = scanner.nextInt(); // Menerima input harga barang dari user

            if (Exit(hargaBarang)) {
                isSelesai = true; // Mengubah nilai isSelesai menjadi true jika user selesai memasukkan barang
            } else {
                totalHarga += hargaBarang; // Menambahkan harga barang ke variabel totalHarga
            }
        }

        System.out.println("Total harga yang harus dibayar: " + totalHarga);
        scanner.close();
    }

    /**
     * @param hargaBarang berupa angka yang bukan 0
     * @return total harga dari barang yang di tambahkan
     */
    private static boolean Exit(int hargaBarang) {
        return hargaBarang == 0;
    }

    /**
     * @param isSelesai di isi angka, jika angka != 0 loop terus berjalan
     * @return loop akan terhenti jika isSelesai = true
     */
    private static boolean Check(boolean isSelesai) {
        return !isSelesai;
    }
}
