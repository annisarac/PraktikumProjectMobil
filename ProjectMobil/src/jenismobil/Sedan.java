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
public class Sedan extends JenisMobil{
    //atribut
    public double jarak, kecepatan;
    
    //method hitung bahan bakar
    public double hitungBahanBakar(){
        double bahanBakar = this.jarak/10;
        return bahanBakar;
    }
    
    //method hitung waktu tempuh
    public double hitungWaktuTempuh(){
        double waktuTempuh = this.jarak / this.kecepatan;
        return waktuTempuh;
    }
}
