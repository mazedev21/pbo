/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author mazedev
 */
public class Main {
    public static void main(String[] args) { 
//        Hewan kucing = new Hewan();
//        kucing.nama = "Mimi";
//        kucing.umur = 3;
//        kucing.suara();
        Hewan kucing = new Hewan("Mimi", 3);
        Hewan anjing = new Hewan("Anjing", 2);

        kucing.suara();
//
        kucing.info();
        
        anjing.info();
        anjing.berlari();
    }
}
