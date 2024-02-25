/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intro;

/**
 *
 * @author tadeusvitoo
 */
public class MainSalam {
     public static void main(String[] args) {
        String greeting = Salam.getSalam();
        System.out.println(greeting);
        Salam s = new Salam();
        System.out.println("Nama : " + s.nama);
        System.out.println("NIM : " + s.nim);
        System.out.println("Tahun Lahir : " + s.tahunLahir);
        System.out.println("====================================");
    }
     
}
