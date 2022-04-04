/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.oop.object.pkgclass;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    
    Mahasiswa(String Nama, String NIM, String Jurusan){
        nama = Nama;
        nim = NIM;
        jurusan = Jurusan; 
        
        System.out.println("Nama :" +nama);
        System.out.println("NIM :" +nim);
        System.out.println("Jurusan :" +jurusan);
    }
}

public class TugasOOPObjectClass {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Naufal","0001","ITE");
        Mahasiswa mahasiswa2 = new Mahasiswa("Al Fadhil","0002","ITE");
    }    
}
