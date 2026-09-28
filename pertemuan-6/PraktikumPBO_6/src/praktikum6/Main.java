/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author mazedev
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan();
        kucing.bersuara();
        kucing.makan("ikan"); // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2); // Memanggil metoder makan() yang di overload
    }
}

