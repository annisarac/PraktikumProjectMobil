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
public abstract class JenisMobil {
    public abstract double hitungBahanBakar();
    public abstract double hitungWaktuTempuh();
    public void tampilHasil(){
        System.out.println("Perkiraan bahan bakarnya :  "+ this.hitungWaktuTempuh());
        System.out.println("Waktu Tempuhnya : " + this.hitungBahanBakar());
    }
}
