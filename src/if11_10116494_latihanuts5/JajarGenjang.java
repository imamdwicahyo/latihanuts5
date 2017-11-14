/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if11_10116494_latihanuts5;

/**
 *
 * @author Imam Dwi Cahyo
 * KElas IF-11
 * NIM 10116494
 */
public class JajarGenjang extends BangunDatar{
    private int luas,keliling;
    final private int sisiAb,sisiBc,sisiCd,sisiDa;
    final private int alas,tinggi;

    public JajarGenjang(int ab,int bc,int cd,int da,int alas,int tinggi){
        this.sisiAb = ab;
        this.sisiBc = bc;
        this.sisiCd = cd;
        this.sisiDa = da;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public void hitungLuas(){
        luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang : "+luas);
    }
    
    @Override
    public void hitungKeliling(){
        keliling = sisiAb + sisiBc + sisiCd + sisiDa;
        System.out.println("Keliling Jajar Genjang : "+keliling);
    }
    
    
    
}
