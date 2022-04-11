public class Baju {
    private String jenis;
    private int harga;
    private int jumlah;
    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;

    public void setJenis(String jenis) {

        this.jenis = jenis;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    void hargaa() {
        if (jumlah > 100) {

            harga = jumlah * 95000;
            System.out.println("harga Per buah :" + 95000);
            System.out.println("Total harga    :" + harga);
        } else {
            harga = jumlah * bajuA;
            System.out.println("harga Per buah :" + bajuA);
            System.out.println("Total harga    :" + harga);
        }

    }

    void hargab() {
        if (jumlah > 100) {
            harga = jumlah * 120000;
            System.out.println("harga Per buah :" + 120000);
            System.out.println("Total harga    :" + harga);
        } else {
            harga = jumlah * bajuB;
            System.out.println("harga Per buah :" + bajuB);
            System.out.println("Total harga    :" + harga);
        }
    }

    void hargac() {
        if (jumlah > 100) {
            harga = jumlah * 160000;
            System.out.println("harga Per buah :" + 160000);
            System.out.println("Total harga    :" + harga);
        } else {
            harga = jumlah * bajuC;
            System.out.println("harga Per buah :" + bajuC);
            System.out.println("Total harga    :" + harga);
        }
    }

    void display() {
        if (jenis.equalsIgnoreCase("a")) {
            hargaa();
        } else if (jenis.equalsIgnoreCase("b")) {
            hargab();
        } else if (jenis.equalsIgnoreCase("c")) {
            hargac();
        }

    }

    public void getPrintdata() {
        System.out.println("jenis yang anda beli : " + jenis);
        display();
    }

    public void batas() {
        System.out.println("==================================================");
    }
}
