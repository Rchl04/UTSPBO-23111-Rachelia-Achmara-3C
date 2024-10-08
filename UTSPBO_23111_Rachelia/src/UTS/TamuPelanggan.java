/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo
 */
public class TamuPelanggan extends Pengguna{
    private String email;
    
    public TamuPelanggan(String idTamu, String namaTamu, String noHP, String email, String password){
        super(idTamu, namaTamu, password);
        this.email = email;
    }
    
    @Override
        public void MenuProgram() {
        System.out.println("Selamat datang, " + this.nama);
        System.out.println("1. Pesan Kamar");
        System.out.println("2. Keluar");
    }
}