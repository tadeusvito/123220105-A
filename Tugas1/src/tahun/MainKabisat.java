/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tahun;

/**
 *
 * @author tadeusvitoo
 */
public class MainKabisat {
    public static void main(String[] args) {
        int tahun = 2024; // Ganti dengan tahun yang ingin Anda periksa
        
        if (Kabisat.TahunKabisat(tahun)) {
            System.out.println(tahun + " adalah tahun kabisat.");
        } else {
            System.out.println(tahun + " bukan tahun kabisat.");
        }
    }
}
