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
     }
     
     public String nama = "";
     public String nim = "";
     
     public Salam(String nama, String nim){
         this.nama = nama;
         this.nim = nim;
     }
     
//     public String nim(String nim){
//         this.nim = nim;
//         System.out.println("Nim : " + nim);
//     }
}
