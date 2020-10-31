package if1.latihan28.gantikata;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Dekripsi Program : program ini berisi untuk menampilkan kata yang telah
 *                    dari sebuah kalimat
 */

import java.util.Scanner; // import kelas scanner

public class GantiKata {
    static Scanner sc = new Scanner(System.in);
    String kalimat, gantiKata, jadiKata;
    
    public void masukkanKalimat() {
        System.out.print("Masukkan Kalimat : ");kalimat = sc.nextLine();
        System.out.print("Ganti Kata       : ");gantiKata = sc.nextLine();
        System.out.print("Menjadi Kata     : ");jadiKata = sc.nextLine();
    }
    
    public String merubahKalimat() {
        return kalimat.replaceAll(gantiKata,jadiKata);
    }
    
    public void tampilKalimat(String hasil) {
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.println("Kalimat Baru : " + hasil);
    }
    
    public static void main(String[] args) {
        GantiKata gantiKata = new GantiKata();
        gantiKata.masukkanKalimat();
        String hasil = gantiKata.merubahKalimat();
        gantiKata.tampilKalimat(hasil);
        System.out.println("Developed by : Rachman Aldiansyah");
    }
}