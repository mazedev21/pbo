/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum3;

/**
 *
 * @author mazedev
 */
public class Mobil {
    private String merk;
    private String model;
    private String warna;
    private int tahun;
    
    public Mobil(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getTahun() {
        return tahun;
    }
    
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    void displayInfo() {
        System.out.println("Merk: "+getMerk()+", Model: "+getModel()+", Warna: "+getWarna()+", Tahun: "+getTahun());
    }
    
    void startEngine() {
        System.out.println("Mesin mobil: "+getMerk()+" "+getModel()+" Menyala");
    }
}
