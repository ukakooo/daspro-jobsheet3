import java.util.Scanner;
/**
 * TugasJobsheet12
 */
public class Tugas1Jobsheet12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        //Variabel-variabel        
        int tarifListrik;
        int jmlPenggunaanListrik;        

        //Deklarasi
            System.out.print("Masukkan jumlah penggunaan listrik: ");
        jmlPenggunaanListrik = input.nextInt();
        System.out.print("Masukkan nilai tarif listrik per kWh: ");
        tarifListrik = input.nextInt();
        //Tarif Listrik bernominal Rp. 1500

        //Pengoperasian
        double totalTagihanListrik = jmlPenggunaanListrik * tarifListrik;
        boolean penggunaanListrik = jmlPenggunaanListrik >= 500;        

        //Hasil pengoperasian dan deklarasi
        System.out.println("Total Tagihan Listrik adalah: Rp." +totalTagihanListrik);
        System.out.println("Apakah jumlah penggunaan listrik melebihi 500? " +penggunaanListrik);
       
         
        
                                            




    }
}