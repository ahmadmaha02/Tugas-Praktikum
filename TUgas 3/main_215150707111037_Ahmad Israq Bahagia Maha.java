import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Baju baju = new Baju();
        System.out.println("Erigo Store");
        baju.batas();
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        baju.batas();
        System.out.print("Baju yang akan  anda beli bertipe : ");
        String jenis = in.nextLine();
        baju.setJenis(jenis);

        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        int jumlah = in.nextInt();
        baju.setJumlah(jumlah);
        baju.batas();

        baju.getPrintdata();

    }
}
