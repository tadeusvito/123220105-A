/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tahun;
import intro.Salam;
/**
 *
 * @author tadeusvitoo
 */
public class MainKabisat {
    public static void main(String[] args) {
        int tahun = 2022; // Ganti dengan tahun yang ingin Anda periksa
        if (Kabisat.TahunKabisat(tahun)) {
            System.out.println(tahun + " adalah tahun kabisat.");
        } else {
            System.out.println(tahun + " bukan tahun kabisat.");
        }
        
        Salam s = new Salam(); //mengintansiasi class Salam
        int tahun1 = s.bacaTahunLahir();
        System.out.println("apakah " + tahun1 + " adalah tahun kabisat?");
        if (Kabisat.TahunKabisat(tahun1)) {
            System.out.println("tahun kelahiran " + tahun1 + " adalah tahun kabisat.");
        } else {
            System.out.println("tahun kelahiran " + tahun1 + " bukan tahun kabisat.");
        }
    }
}
