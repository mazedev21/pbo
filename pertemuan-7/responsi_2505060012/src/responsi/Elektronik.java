/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author mazedev
 */
public class Elektronik extends Produk {
    private int garansi;
    
    // Konstruktor
    public Elektronik(String namaProduk, double harga, int garansi) {
        // Memanggil konstruktor superclass
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    public int getGaransi() {
        return garansi;
    }
    
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    // Overide metode tampilkanInfo() dari superclass
    @Override
    public void tampilkanInfo() {
        System.out.println("--- Kategori: Elektronik ---");
        // Memanggil metode tampilkanInfo() milik superclass
        super.tampilkanInfo(); 
        System.out.println("Garansi     : " + getGaransi() + " Tahun");
    }
}
