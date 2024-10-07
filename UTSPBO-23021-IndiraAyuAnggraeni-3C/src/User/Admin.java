/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;
import Hotelku.Kamar;
import java.util.ArrayList;

/**
 *
 * @author Indira Ayu Anggraeni - 2310631170021
 */
public class Admin extends User implements Pengguna {
    private ArrayList <Kamar> Kamarku;
    
    public Admin (String namaPengguna, String kataSandi, ArrayList <Kamar> Kamarku) {
        super (namaPengguna, kataSandi);
        this.Kamarku = Kamarku;
    }
   
    @Override
    public void lihatReservasi() {
        System.out.println ("Admin " + getNamaPengguna() + " Melihat Semua Reservasi.");
        for (Kamar kamar : Kamarku) {
            kamar.detailKamar();
        }
    }
    
    @Override
    public void pesanKamar(Kamar kamar) {
        kamar.pesanKamar();
        System.out.println ("Admin Memesan Kamar " + kamar.getNomorKamar());
    }

    @Override
    public void batalkanReservasi(Kamar kamar) {
        kamar.batalkanReservasi();
        System.out.println ("Admin Membatalkan Reservasi untuk Kamar " + kamar.getNomorKamar());
    }
     
    public void tambahKamar (Kamar kamar) {
        Kamarku.add (kamar);
        System.out.println ("Kamar " + kamar.getNomorKamar() + " Telah Ditambahkan.");
    }
    
    public void lihatKamarTersedia() {
        System.out.println ("Kamar yang tersedia: ");
        for (Kamar kamar : Kamarku) {
            if (kamar.isTersedia()) {
                kamar.detailKamar();
            }
        }
    }   
}
