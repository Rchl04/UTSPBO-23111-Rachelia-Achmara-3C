/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo
 */
public class Reservasi {
    private String idReservasi;
    private TamuPelanggan tamu;
    private KamarHotel kamar;
    private int jumlahMalam;
    private double totalHarga;
    
    public Reservasi(String  idReservasi, TamuPelanggan tamu, KamarHotel kamar, int jumlahMalam){
        this.idReservasi = idReservasi;
        this.tamu = tamu;
        this.kamar = kamar;
        this.jumlahMalam = jumlahMalam;
        this.totalHarga = kamar.gethargaPerMalam() * jumlahMalam;
        kamar.bookingKamar();
    }
    
    public double getTotalHarga(){
        return totalHarga;
    }
    
    public void detailReservasi(){
        System.out.println("ID Reservasi: " + idReservasi);
        System.out.println("Kamar: " + kamar.getInfoKamar());
        System.out.println("Lama Menginap : " + jumlahMalam + " malam");
        System.out.println("Total: " + totalHarga);
    }
}
