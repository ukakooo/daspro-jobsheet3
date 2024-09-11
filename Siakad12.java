/**
 * Siakad12
 */
import java.util.Scanner;
public class Siakad12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.println("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        nilaiKuis*= 0.2;
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        nilaiTugas*= 0.15;
        System.out.println("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        nilaiUTS*= 0.3;
        System.out.println("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        nilaiUAS*= 0.35;
        nilaiAkhir = nilaiKuis + nilaiTugas + nilaiUTS + nilaiUAS;
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}