import java.util.Scanner;
public class Tugas2Jobsheet12 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Variabel-variabel input
        int jumlahJamKerja, gajiPerJam;
        float nominalDiskon = 10/100f;
        float nominalPajak = 5/100f;

        System.out.print("Masukkan input jumlah jam kerja per hari: ");
        jumlahJamKerja = input.nextInt();
        System.out.print("Masukkan input gaji karyawan per jam: ");
        gajiPerJam = input.nextInt();

        //Pengoperasian
        int gajiPerHari = gajiPerJam * jumlahJamKerja;
        System.out.print("Masukkan input jumlah hari pada bulan ini (29, 30, 31): ");
        int jumlahHariPadaBulanIni = input.nextInt();
        int gajiAwal = gajiPerHari * jumlahHariPadaBulanIni;
        double diskonGaji = gajiAwal * nominalDiskon;
        double gajiSetelahDiskon = gajiAwal + diskonGaji;
        double pajakGaji = gajiSetelahDiskon * nominalPajak;
        double gajiPerBulan = gajiSetelahDiskon - pajakGaji;
        System.out.println("Gaji karyawan per bulan adalah Rp. " +gajiPerBulan);
        


    }
    
}
