/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotelku;

/**
 *
 * @author Indira Ayu Anggraeni - 2310631170021
 */
public class Kamar {
    private int nomorKamar;
    private String tipeKamar;
    private boolean tersedia;
    private double harga;
    
    public Kamar (int nomorKamar, String tipeKamar, boolean tersedia, double harga) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.tersedia = tersedia;
        this.harga = harga;
    }
    
    public int getNomorKamar() {
        return nomorKamar;
    }
    
    public boolean isTersedia() {
        return tersedia;
    }
    
    public void pesanKamar() {
        if (tersedia) {
            tersedia = false;
        }
    }
    
    public void batalkanReservasi() {
        tersedia = true;
    }
    
    public void detailKamar() {
        System.out.println ("Nomor Kamar: " + nomorKamar + ", Tipe: " + tipeKamar + ", Harga: Rp " + harga);
    }
}
