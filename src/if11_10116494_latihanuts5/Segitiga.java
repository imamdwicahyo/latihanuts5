/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if11_10116494_latihanuts5;

/**
 *
 * @author Imam Dwi Cahyo
 * Kelas IF-11
 * NIM 10116494
 */
public class Segitiga implements BangunDatar{
    private int luas,keliling;
    final private int sisiAb,sisiBc,sisiCa;
    final private int alas,tinggi;
    
    public Segitiga(int sisiAb,int sisiBc,int sisiCa,int alas,int tinggi){
        this.sisiAb = sisiAb;
        this.sisiBc = sisiBc;
        this.sisiCa = sisiCa;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public void hitungLuas(){
        luas =  (alas * tinggi)/2;
        System.out.println("Luas Segitiga : "+luas);
    }
    
    @Override
    public void hitungKeliling(){
        keliling = sisiAb + sisiBc + sisiCa;
        System.out.println("Keliling Segitiga : "+keliling);
    }
    
}
