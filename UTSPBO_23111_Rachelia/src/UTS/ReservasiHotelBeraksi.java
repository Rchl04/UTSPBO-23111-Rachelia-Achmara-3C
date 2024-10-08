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
public class ReservasiHotelBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kamar hotel yang tersedia
        KamarHotel[] kamarHotel = {
            new KamarHotel("K01", "Single", 500000, true),
            new KamarHotel("K02", "Double", 750000, true),
            new KamarHotel("K03", "Suite", 1000000, true)
        };

        Admin admin = new Admin("AX1", "Jang Man Wol", "Admin123");
        TamuPelanggan tamuPelanggan = new TamuPelanggan("P001", "Acel", "081514202194", "acel@gmail.com", "acel04");

        System.out.println("Selamat datang di Sistem Reservasi Cheli's Hotel");
        
        boolean running = true;
        
        while (running){
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Pelanggan");
            System.out.println("3. Keluar");
            
            int pilihan = input.nextInt();
            
            switch (pilihan){
                case 1:
                    System.out.print("Masukkan ID Admin: ");
                    String idAdmin = input.next();
                    System.out.print("Masukkan password: ");
                    String passwordAdmin = input.next();
                    
                    if (admin.login(idAdmin, passwordAdmin)) {
                        System.out.println("Login berhasil!");
                        boolean adminRunning = true;
                        while (adminRunning) {
                            admin.MenuProgram();
                            int adminChoice = input.nextInt();
                            switch (adminChoice) {
                                case 1:
                                    admin.lihatKamar(kamarHotel);
                                    break;
                                case 2:
                                    admin.updateKetersediaan(kamarHotel);
                                    break;
                                case 3:
                                    adminRunning = false;
                                    break;
                                default:
                                    System.out.println("Pilihan tidak valid.");
                            }
                        }
                    } else {
                        System.out.println("Login gagal.");
                    }
                    break;
                    
                case 2: // Login Pelanggan
                    System.out.print("Masukkan ID Pelanggan: ");
                    String id = input.next();
                    System.out.print("Masukkan password: ");
                    String password = input.next();
                    
                    if (tamuPelanggan.login(id, password)) {
                        System.out.println("Login gagal.");
                    } else {
                        System.out.println("Login berhasil!");
                        tamuPelanggan.MenuProgram(); 
                        int pelangganChoice = input.nextInt();
                        if (pelangganChoice == 1) {
                            System.out.println("Daftar Kamar Tersedia:");
                            for (int i = 0; i < kamarHotel.length; i++) {
                                if (kamarHotel[i].tersedia()) {
                                    System.out.println((i + 1) + ". " + kamarHotel[i].getInfoKamar());
                                }
                            }

                            System.out.print("Pilih nomor kamar yang ingin dipesan: ");
                            int kamarChoice = input.nextInt();
                            if (kamarHotel[kamarChoice - 1].tersedia()) {
                                System.out.print("Masukkan jumlah malam: ");
                                int jumlahMalam = input.nextInt();
                                Reservasi reservasi = new Reservasi("R001", tamuPelanggan, kamarHotel[kamarChoice - 1], jumlahMalam);
                                System.out.println("Reservasi berhasil!");
                                reservasi.detailReservasi();
                            } else {
                                System.out.println("Kamar sudah dipesan.");
                            }
                        } else {
                            System.out.println("Keluar dari sistem.");
                        }
                    }
                    break;


                case 3: // Keluar
                    System.out.println("Terima kasih telah menggunakan sistem reservasi.");
                    running = false; // Menghentikan loop
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        input.close();
    }
}


        