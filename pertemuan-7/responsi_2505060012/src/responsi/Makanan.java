/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author mazedev
 */
public class Makanan extends Produk {
    private String tanggalKadaluwarsa;
    
    public Makanan(String namaProduk, double harga, String tanggalKadaluwarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluwarsa = tanggalKadaluwarsa;
    }
    
    public String getTanggalKadaluwarsa() {
        return tanggalKadaluwarsa;
    }
    
    public void setTanggalKadaluwarsa(String tanggalKadaluwarsa) {
        this.tanggalKadaluwarsa = tanggalKadaluwarsa;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("--- Kategori: Makanan ---");
        super.tampilkanInfo();
        System.out.println("Exp. Date   : " + getTanggalKadaluwarsa());
    }
}
