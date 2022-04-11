import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merchant = DataMerchant
                .tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tampilData();
        System.out.println();
        System.out.println("===Cari Merchant===");
        System.out.print("Input Nama Merchant : ");
        String namaMerchant = input.nextLine();
        System.out.print("Input Nama Produk : ");
        String namaProduk = input.nextLine();
        System.out.print("Input Harga Produk : ");
        double harga = input.nextDouble();
        input.nextLine();
        System.out.println();
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, harga));
        System.out.println("===Menampilkan Data Merchant Terbaru===");
        System.out.println();
        DataMerchant.tampilData();

    }
}
