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
public class IF11_10116494_LATIHANUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JajarGenjang genjang1 = new JajarGenjang(50, 60, 70, 80, 100, 120);
        genjang1.hitungKeliling();
        genjang1.hitungLuas();
        
        Segitiga seg1 = new Segitiga(50, 60, 70, 100, 120);
        seg1.hitungKeliling();
        seg1.hitungLuas();
    }
    
}
