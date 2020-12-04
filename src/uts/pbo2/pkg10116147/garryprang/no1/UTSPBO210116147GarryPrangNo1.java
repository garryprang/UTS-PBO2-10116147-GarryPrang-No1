
package uts.pbo2.pkg10116147.garryprang.no1;
/**
 *
 * @author
 * Nama      : Garry Prang
 * NIM       : 10116147
 * Kelas     : PBO-2
 * Deskripsi : Program untuk menghitung umur (UTS No. 1).
 */
import java.util.Scanner;



public class UTSPBO210116147GarryPrangNo1 {
    public static void main(String[] args) {
        Age n = new Age();
        System.out.print("Masukkan tahun lahir anda: ");
        Scanner scanAge = new Scanner(System.in);
        n.setYearBirth(scanAge.nextInt());
        System.out.println();
        System.out.println("========= HASIL PERHITUNGAN UMUR =========");
        System.out.println("Tahun lahir anda\t: " + n.getYearBirth());
        System.out.println("Hari ini tahun\t\t: " + n.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + n.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + n.tandanyaKamu(n.hitungUmur()));
    }
}
