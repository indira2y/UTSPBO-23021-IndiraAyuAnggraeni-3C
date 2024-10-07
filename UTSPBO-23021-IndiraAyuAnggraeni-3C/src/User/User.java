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
public abstract class User {
    private String namaPengguna;
    private String kataSandi;
    private ArrayList <Kamar> reservasi;
    
    public User (String namaPengguna, String kataSandi) {
        this.namaPengguna = namaPengguna;
        this.kataSandi = kataSandi;
        this.reservasi = new ArrayList <>();
    }
    
      
    public String getNamaPengguna() {
        return namaPengguna;
    }
    
     public ArrayList<Kamar> getReservasi() {
        return reservasi;
    }
}
