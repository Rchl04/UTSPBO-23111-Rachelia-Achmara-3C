/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Admin extends Pengguna {
  public Admin(String idAdmin, String namaAdmin, String passwordAdmin){
      super(idAdmin, namaAdmin, passwordAdmin);
  }

  @Override
  public void MenuProgram(){
    System.out.println("Selamat datang, Admin " + this.nama);
    System.out.println("1. Lihat Ketersediaan Kamar");
    System.out.println("2. Update Ketersediaan Kamar");
    System.out.println("3. Keluar");
    }
  
  public void lihatKamar(KamarHotel[] kamarHotel) {
        System.out.println("Daftar Kamar:");
        for (KamarHotel k : kamarHotel) {
            System.out.println(k.getInfoKamar());
        }
  }
  public void updateKetersediaan(KamarHotel[] kamarHotel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nomor kamar yang ingin diupdate (1 - " + kamarHotel.length + "):");
        int nomorKamar = scanner.nextInt();
        
        if (nomorKamar > 0 && nomorKamar <= kamarHotel.length) {
            KamarHotel kamar = kamarHotel[nomorKamar - 1];
            System.out.println("Kamar yang dipilih: " + kamar.getInfoKamar());
            System.out.println("Apakah kamar ini tersedia? (true/false): ");
            boolean ketersediaanBaru = scanner.nextBoolean();
            kamar.setKetersediaan(ketersediaanBaru);
            System.out.println("Ketersediaan kamar telah diperbarui.");
        } else {
            System.out.println("Nomor kamar tidak valid.");
        }
    }
}