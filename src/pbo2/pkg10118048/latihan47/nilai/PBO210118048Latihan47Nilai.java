/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan47.nilai;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan hasil nilai Mahasiswa
 */
public class PBO210118048Latihan47Nilai {

    public static void main(String[] args) {
        
        NilaiMahasiswa nilaiMhs = new NilaiMahasiswa(75, 45, 34);
        System.out.println("Quiz\t\t= " + nilaiMhs.getNilaiQuiz());
        System.out.println("UTS\t\t= " + nilaiMhs.getNilaiUTS());
        System.out.println("UAS\t\t= " + nilaiMhs.getNilaiUAS());
        System.out.println("\nNilai Akhir\t= " + nilaiMhs.hitungNilaiAkhir(
                nilaiMhs.getNilaiQuiz(), nilaiMhs.getNilaiUTS(), nilaiMhs.getNilaiUAS()));
        nilaiMhs.tampilIndexKet(nilaiMhs.hitungNilaiAkhir(nilaiMhs.getNilaiQuiz(), 
                nilaiMhs.getNilaiUTS(), nilaiMhs.getNilaiUAS()));
                
    }

}
