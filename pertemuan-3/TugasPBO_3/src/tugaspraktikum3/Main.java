/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum3;

/**
 *
 * @author mazedev
 */
public class Main {
    public static void main(String[] args) {
        Mobil sedan = new Mobil("Mercedes", "X86", 2025);
        Mobil sport = new Mobil("Chevrolet", "Camaro", 2026);
        sedan.displayInfo();
        sport.displayInfo();
        
        sedan.startEngine();
        sedan.setWarna("Merah");
        sedan.displayInfo();
    }
}
