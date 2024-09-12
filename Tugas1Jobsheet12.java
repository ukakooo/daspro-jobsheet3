import java.util.Scanner;
/**
 * TugasJobsheet12
 */
public class Tugas1Jobsheet12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        //Variabel-variabel        
        int tarifListrik, jmlPenggunaanListrik;        

        //Deklarasi
            System.out.print("Masukkan jumlah penggunaan listrik: ");
        jmlPenggunaanListrik = input.nextInt();
        System.out.print("Masukkan nilai tarif listrik per kWh: ");
        tarifListrik = input.nextInt();
        //Tarif Listrik bernominal Rp. 1500

        //Pengoperasian
        boolean penggunaanListrik = jmlPenggunaanListrik >= 500;            
        double totalTagihanListrik = jmlPenggunaanListrik * tarifListrik;
          

        //Hasil pengoperasian dan deklarasi
        System.out.println("Apakah jumlah penggunaan listrik melebihi 500? " +penggunaanListrik);
        System.out.println("Total Tagihan Listrik adalah: Rp." +totalTagihanListrik);
        
       
         
        
                                            




    }
}