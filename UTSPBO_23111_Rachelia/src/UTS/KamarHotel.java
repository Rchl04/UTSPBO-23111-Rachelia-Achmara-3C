/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo
 */
public class KamarHotel {
    private String noKamar;
    private String tipeKamar;
    private double hargaPerMalam;
    private boolean ketersediaan;
    
    public KamarHotel(String noKamar, String tipeKamar, double hargaPerMalam, boolean ketersediaan){
        this.noKamar = noKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.ketersediaan = ketersediaan;
    }
    
    public boolean tersedia(){
        return ketersediaan;
    }
    
    public void bookingKamar(){
        this.ketersediaan = false;
    }
    
     public void setKetersediaan(boolean ketersediaan) {
        this.ketersediaan = ketersediaan;
    }
     
    public String getInfoKamar(){
        return "Kamar " + tipeKamar + " | Harga: " +hargaPerMalam + " | Ketersediaan: " + (ketersediaan ? "Tersedia" : "Sudah di Booking");
    }
    
    public double gethargaPerMalam(){
        return hargaPerMalam;
    }
}