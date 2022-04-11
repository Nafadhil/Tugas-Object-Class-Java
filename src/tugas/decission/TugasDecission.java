/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.decission;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TugasDecission {
    public static void main(String[] args) {
        int tinggi;
        int berat;
        String status;
        System.out.print("Masukkan Tinggi Badan Anda : ");
        Scanner inputtinggi =new Scanner(System.in);
        tinggi = inputtinggi.nextInt();
        System.out.print("Masukkan Berat Badan Anda : ");
        Scanner inputberat =new Scanner(System.in);
        berat = inputberat.nextInt();
        
        
        if(tinggi >= 140 && berat <= 100)
        {
            status = "Silahkan masuk";
        }
        else
        {
            status = "Mohon maaf anda tidak dapat memasuki wahana";
        }
        System.out.println(status);
    }
}
