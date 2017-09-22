/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benuapertama;

import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class DaftarBenua {

    public static void main(String[] args){
        String password,right= "xxcft4532d";
        System.out.println("Password = ");
        Scanner in = new Scanner(System.in);
        password = in.nextLine();
        
        if(password.equals(right)){
            System.out.println("------------------------------");
            System.out.println("Password benar silahkan lanjut");
            System.out.println("------------------------------");
        
        
        BenuaPertama B1 = new BenuaPertama();
        B1.benuapertama();
        
        BenuaKedua B2 = new BenuaKedua();
        B2.benuakedua();
        B2.benuaberikut();
        B2.benuasetelahnya();
        
        BenuaKetiga B3 = new BenuaKetiga();
        B3.benuaketiga();
        B3.benuasetelahnya();
        
        BenuaKeempat B4 = new BenuaKeempat();
        B4.benuaKeempat();
        B4.benuaTerakhir();
        }
        
        else{
        System.out.println("Password yang anda masukkan salah");
        System.out.println("---------------------------------");
        System.out.println("Tidak terdapat daftar benua satupun");
    }
}
}


