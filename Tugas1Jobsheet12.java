import java.util.Scanner;
/**
 * TugasJobsheet12
 */
public class Tugas1Jobsheet12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Data-data
        boolean penggunaanListrik;
        int tarifListrik;
        int jmlPenggunaanListrik;

        //Deklarasi
        System.out.print("Apakah penggunaan listrik melebihi 500kWh? (True/False): ");
        penggunaanListrik = input.nextBoolean();
        System.out.print("Masukkan jumlah penggunaan listrik: ");
        jmlPenggunaanListrik = input.nextInt();
        System.out.print("Masukkan nilai tarif listrik per kWh: ");
        tarifListrik = input.nextInt();
        //Tarif Listrik bernominal Rp. 1500

        //Pengoperasian
        double totalTagihanListrik = jmlPenggunaanListrik * tarifListrik;

        //Hasil pengoperasian dan deklarasi
        System.out.println("Total Tagihan Listrik adalah: Rp." +totalTagihanListrik);
        if (penggunaanListrik == true){
        System.out.println("Dan Penggunaan listrik melebihi 500 kWh");
        }
        if (penggunaanListrik == false){
        System.out.println("Dan Penggunaan listrik tidak melebihi 500 kWh");
        }
         
        
                                            




    }
}