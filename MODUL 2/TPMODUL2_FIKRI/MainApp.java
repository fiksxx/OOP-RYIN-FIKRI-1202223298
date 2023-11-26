import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Informasi Mobil
        System.out.print("Masukkan Nomor Identifikasi Mobil: ");
        String nomorIdentifikasiMobil = input.nextLine();
        System.out.print("Masukkan Kecepatan Maksimum Mobil: ");
        double kecepatanMaksimumMobil = input.nextDouble();
        System.out.print("Masukkan Kapasitas Penumpang Mobil: ");
        int kapasitasPenumpangMobil = input.nextInt();
        System.out.print("Masukkan Jumlah Pintu Mobil: ");
        int jumlahPintuMobil = input.nextInt();
        
        // Consume the newline character
        input.nextLine();

        // Definisi dan inisialisasi objek Kendaraan (Mobil)
        Kendaraan mobil = new Mobil(nomorIdentifikasiMobil, kecepatanMaksimumMobil, kapasitasPenumpangMobil, jumlahPintuMobil);
        System.out.println("\nInformasi Mobil:");
        System.out.println(mobil);

        // Input Informasi Bus
        System.out.print("\nMasukkan Nomor Identifikasi Bus: ");
        String nomorIdentifikasiBus = input.nextLine();
        System.out.print("Masukkan Kecepatan Maksimum Bus: ");
        double kecepatanMaksimumBus = input.nextDouble();
        System.out.print("Masukkan Kapasitas Penumpang Bus: ");
        int kapasitasPenumpangBus = input.nextInt();
        System.out.print("Masukkan Jumlah Kursi Bus: ");
        int jumlahKursiBus = input.nextInt();

        // Consume the newline character
        input.nextLine();

        // Definisi dan inisialisasi objek Kendaraan (Bus)
        Kendaraan bus = new Bus(nomorIdentifikasiBus, kecepatanMaksimumBus, kapasitasPenumpangBus, jumlahKursiBus);
        System.out.println("\nInformasi Bus:");
        System.out.println(bus);

        // Input Jarak Tempuh
        System.out.print("\nMasukkan Jarak Tempuh yang ingin ditempuh (dalam km): ");
        double jarakTempuh = input.nextDouble();

        // Menghitung dan menampilkan waktu tempuh untuk kedua jenis kendaraan
        System.out.println("\nWaktu tempuh Mobil: " + mobil.hitungWaktuTempuh(jarakTempuh) + " jam");
        System.out.println("Waktu tempuh Bus: " + bus.hitungWaktuTempuh(jarakTempuh) + " jam");
    }
}
