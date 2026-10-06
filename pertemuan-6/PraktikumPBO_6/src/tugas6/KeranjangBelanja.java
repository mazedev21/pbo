/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author mazedev
 */
import java.util.ArrayList;
import java.util.List;
public class KeranjangBelanja {
    private List<Produk> daftarProduk;
    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }
    public double hitungTotal() {
        double total = 0;
        for (Produk produk : daftarProduk) {
            double diskon = produk.hitungDiskon();
            double hargaSetelahDiskon = produk.getHarga() - diskon;
            total += hargaSetelahDiskon;
        }
        return total;
    }
}
