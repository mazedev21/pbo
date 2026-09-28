/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPraktikum4;

/**
 *
 * @author mazedev
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Henji", 20, "WebDev", 5000000);
        
        // Menampilkan informsi pekerja1
        System.out.println(pekerja1);
        
        // Merubah nama pekerja1
        pekerja1.setNama("Putra");
        
        System.out.println(pekerja1);
        
        System.out.println(pekerja1.usia);
        System.out.println(pekerja1.pekerjaan);
//        System.out.println(pekerja1.gaji);
        
    }
}
