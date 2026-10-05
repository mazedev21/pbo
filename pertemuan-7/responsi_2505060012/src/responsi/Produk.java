/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author mazedev
 */
public class Produk {
    // Enkapsulasi
    private String namaProduk;
    private double harga;
    
    // Konstruktor untuk inisialisasi atribut
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    // Getter dan setter
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // Method tampilkaninfo()
    public void tampilkanInfo() {
        System.out.println("Nama Produk : " + getNamaProduk());
        System.out.println("Harga       : Rp" + getHarga());
    }
}
