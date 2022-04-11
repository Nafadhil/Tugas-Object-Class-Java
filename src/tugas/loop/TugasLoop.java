/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.loop;

import java.util.Scanner;
public class TugasLoop {
    public static void main(String[] args) {
       int a = 1;
       int banyak = 0; 
       System.out.print("Masukkan Banyak Hello World : ");
       Scanner input =new Scanner(System.in);
       banyak = input.nextInt();

        while (a <= banyak){
           System.out.println(a + ". Hello World");
           a++;
        }
    }     
}
