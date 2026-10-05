/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author mazedev
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("=====================================");
        System.out.println("    SISTEM MANAJEMEN DATA PRODUK     ");
        System.out.println("=====================================");
        
        // Polimorfisme pada entitas Produk
        Produk produk1 = new Elektronik("Laptop ASUS ROG", 25000000.0, 2);
        Produk produk2 = new Makanan("Biskuit Gandum", 15000.0, "12-10-2027");

        // Pemanggilan metode tampilkanInfo(). .
        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();


        System.out.println("\n=====================================");
        System.out.println("   SISTEM MANAJEMEN DATA PEGAWAI     ");
        System.out.println("=====================================");
        
        // Polimorfisme pada entitas Pegawai
        Pegawai pegawai1 = new PegawaiTetap("Budi Santoso", 8000000.0, 2500000.0);
        Pegawai pegawai2 = new PegawaiKontrak("Siti Aminah", 5000000.0, 12);

        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
