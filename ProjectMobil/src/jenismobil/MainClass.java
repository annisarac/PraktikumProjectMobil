/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenismobil;

/**
 *
 * @author news
 */
public class MainClass {
    public static void main(String[] args){
        Sedan s = new Sedan();
        SUV su = new SUV();
        MPV m = new MPV();
        
        String[][] jarakPerjalanan = {
            {"A", "Sedan", "107", "60"},
            {"B", "Sedan", "538", "65"},
            {"C", "SUV", "662", "57"},
            {"D", "SUV", "471", "62"},
            {"E", "MPV", "541", "64"},
            {"F", "MPV", "433", "53"}
        };
        
        for(int i = 0; i < jarakPerjalanan.length; i++){
            if(jarakPerjalanan[i][1] == "Sedan"){
                s.jarak = Double.parseDouble(jarakPerjalanan[i][2]);
                s.kecepatan = Double.parseDouble(jarakPerjalanan[i][3]);
                s.hitungBahanBakar();
                s.hitungWaktuTempuh();
                System.out.println("\n");
                System.out.println("Mobil " + jarakPerjalanan[i][0]);
                s.tampilHasil();
            }else if(jarakPerjalanan[i][1] == "SUV"){
                su.jarak = Double.parseDouble(jarakPerjalanan[i][2]);
                su.kecepatan = Double.parseDouble(jarakPerjalanan[i][3]);
                su.hitungBahanBakar();
                su.hitungWaktuTempuh();
                System.out.println("\n");
                System.out.println("Mobil " + jarakPerjalanan[i][0]);
                su.tampilHasil();
            }else if(jarakPerjalanan[i][1] == "MPV"){
                m.jarak = Double.parseDouble(jarakPerjalanan[i][2]);
                m.kecepatan = Double.parseDouble(jarakPerjalanan[i][3]);
                m.hitungBahanBakar();
                m.hitungWaktuTempuh();
                System.out.println("\n");
                System.out.println("Mobil " + jarakPerjalanan[i][0]);
                m.tampilHasil();
            }else{
                System.out.println("Jenis Mobil Tidak ditemukan");
            }
        }
    }
}
