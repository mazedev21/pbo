/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPraktikum4;

/**
 *
 * @author mazedev
 */
public class Pekerja extends Manusia {
    private int gaji;
    
    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    
    // Getter dan setter untuk atribut gaji
    public int getGaji() {
        return gaji;
    }
    
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    @Override
    public String toString() {
        return "Informasi Pekerja:\n" +
               "- Nama: " + this.getNama() + "\n" +
               "- Usia: " + usia + " tahun\n" +
               "- Pekerjaan: " + pekerjaan + "\n" +
               "- Gaji: Rp" + String.format("%d", gaji);
    }
}
