/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hotelku;
import User.Admin;
import User.Costumer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Indira Ayu Anggraeni - 2310631170021
 */
public class ReservasiHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaHotel = "Dirfavs Hotel";
        
        System.out.println ("Welcome My Beloved Costumer in " + namaHotel + "!");
        
        ArrayList<Kamar> Kamarku = new ArrayList<>();
        Kamarku.add (new Kamar (101, "Standar", true, 250000));
        Kamarku.add (new Kamar (102, "VIP", true, 500000));
        Kamarku.add (new Kamar (103, "VVIP", true, 700000));
        Kamarku.add (new Kamar (104, "Suite", true, 1500000));
        Kamarku.add (new Kamar (105, "Deluxe", true, 2500000));
        
        Costumer costumer = new Costumer ("Elizabeth", "12345678");
        Admin admin = new Admin ("Dira", "adminpass", Kamarku);
        
        int pilihan;
        
        do {
            System.out.println("\n=== Menu Reservasi Dirfavs Hotel ===");
            System.out.println("1. Lihat Kamar yang Tersedia");
            System.out.println("2. Pesan Kamar");
            System.out.println("3. Batalkan Reservasi");
            System.out.println("4. Lihat Reservasi Anda");
            System.out.println("5. Admin - Lihat Semua Kamar");
            System.out.println("6. Admin - Tambah Kamar");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            Scanner scanner = new Scanner(System.in);
            pilihan = scanner.nextInt();
            
        switch (pilihan) {
            case 1:
                admin.lihatKamarTersedia();
                break;
            case 2:
                System.out.println ("Masukkan Nomor Kamar yang ingin Dipesan: ");
                int nomorKamar = scanner.nextInt();
                Kamar kamarTerpilih = Kamarku.stream()
                        .filter(kamar -> nomorKamar == kamar.getNomorKamar())
                        .findFirst()
                        .orElse(null);
                
                if (kamarTerpilih != null) {
                    costumer.pesanKamar(kamarTerpilih);
                } else {
                    System.out.println ("Kamar tidak Ditemukan.");
                }
                break;
            case 3:
                System.out.println ("Masukkan Nomor Kamar untuk Membatalkan Reservasi: ");
                int nomorKamarBatal = scanner.nextInt();
                Kamar kamarBatal = Kamarku.stream()
                        .filter(kamar -> nomorKamarBatal == kamar.getNomorKamar())
                        .findFirst()
                        .orElse(null);
                if (kamarBatal != null) {
                    costumer.batalkanReservasi(kamarBatal);
                } else {
                    System.out.println ("Kamar Tidak Ditemukan.");
                }
                break;
            case 4:
                costumer.lihatReservasi();
                break;
            case 5:
                admin.lihatReservasi();
                break;
            case 6: 
                 System.out.print("Masukkan nomor kamar baru: ");
                    int nomorKamarBaru = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Masukkan tipe kamar baru: ");
                    String tipeKamarBaru = scanner.nextLine();
                    System.out.print("Apakah kamar ini tersedia (Ya/Tidak): ");
                    String inputKetersediaan = scanner.nextLine();
                    boolean ketersediaanBaru = inputKetersediaan.equalsIgnoreCase("Ya");
                    System.out.print("Masukkan harga kamar baru: ");
                    double hargaBaru = scanner.nextDouble();

                    Kamar kamarBaru = new Kamar(nomorKamarBaru, tipeKamarBaru, ketersediaanBaru, hargaBaru);
                    admin.tambahKamar(kamarBaru);
                    break;
            case 0:
                System.out.println ("Terima Kasih sudah menggunakan layanan kami :)");
                break;
            default:
                System.out.println ("Pilihan tidak valid, Try again!");
                break;         
        }
    } while (pilihan !=0);
        
    System.out.println ("Have a Nice Day! Hope to See You again in Dirfavs Hotel!");     
    }   
}
