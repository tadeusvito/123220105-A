/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intro;

/**
 *
 * @author tadeusvitoo
 */
public class Salam {
    public static String getSalam() {
        return "Hello, World!";
    }
     public Salam(){
         nama = "Tadeus Vito Gavra Sitanggang";
         nim = "123220105";
         tahunLahir = 2004;
     }
     
     public String nama = "";
     public String nim = "";
     public int tahunLahir = 0;
     
     public Salam(String nama, String nim, int tahunLahir){
         this.nama = nama;
         this.nim = nim;
         this.tahunLahir = tahunLahir;
     }
     
     public int bacaTahunLahir(){ //method membaca tahun kelahiran
         return tahunLahir;
     }
     
}
