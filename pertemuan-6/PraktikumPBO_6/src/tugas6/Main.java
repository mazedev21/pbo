/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author mazedev
 */
public class Main {
    public static void main(String[] args) {
        Buku buku = new Buku(
            "Pemrograman Java",
            100000
        );
        Elektronik elektronik = new Elektronik(
            "Mouse",
            200000
        );
        Pakaian pakaian = new Pakaian(
            "Jaket",
            300000
        );
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);
        double total = keranjang.hitungTotal();
        System.out.println("Total harga setelah diskon: Rp" + total);
    }
}
