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
 * Deskripsi program : menampilkan hasil nilai mahasiswa
 */
public class NilaiMahasiswa {
    
    private double nilaiQuiz, nilaiUTS, nilaiUAS;
    private char index;

    public NilaiMahasiswa(double nilaiQuiz, double nilaiUTS, double nilaiUAS) {
        this.nilaiQuiz = nilaiQuiz;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public void setIndex(char index) {
        this.index = index;
    }
    
    public double getNilaiQuiz() {
        return nilaiQuiz;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    public double getNilaiUAS() {
        return nilaiUAS;
    }
    
    public char getIndex() {
        return index;
    }
    
    public double hitungNilaiAkhir(double nilaiQuiz, double nilaiUTS, double nilaiUAS) {
        return (0.2*nilaiQuiz + 0.3*nilaiUTS + 0.5*nilaiUAS);
    }
    
    public void tampilIndexKet(double nilaiAkhir) {
        String ket;
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            index = 'A';
            ket = "Sangat Baik";
        }
        else if (nilaiAkhir >= 68 && nilaiAkhir <= 80) {
            index = 'B';
            ket = "Baik";
        }    
        else if (nilaiAkhir >= 56 && nilaiAkhir <= 68) {
            index = 'C';
            ket = "Cukup";
        }    
        else if (nilaiAkhir >= 45 && nilaiAkhir <= 56) {
            index = 'D';
            ket = "Kurang";
        }    
        else {
            index = 'E';
            ket = "Sangat Kurang";
        }
        System.out.println("\nIndex = " + index);
        System.out.println("Keterangan = " + ket);
    }
    
}
