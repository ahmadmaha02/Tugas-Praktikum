public class Main {
    public static void main(String[] args) {
        Pegawai pegawai;
        pegawai = new Pegawai();
        System.out.println("===================================================");
        System.out.println("\t\t Pegawai Tetap");
        System.out.println("===================================================");
        pegawai = new PegawaiTetap("Ahmad Maha", "293659023648", 9000000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiTetap("Clara Briley", "43483486223", 27000000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiTetap("Cairo Darwin", "835274942784", 16000000);
        System.out.println(pegawai.toString() + "\n");
        System.out.println("===================================================");
        System.out.println("\t\t Pegawai Harian");
        System.out.println("===================================================");
        pegawai = new PegawaiHarian("Popol Kupa", "2146384629", 5000, 40);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiHarian("Martin", "285639405", 5000, 50);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiHarian("gunawan", "27583550797", 5000, 30);
        System.out.println(pegawai.toString() + "\n");
        System.out.println("===================================================");
        System.out.println("\t\t Sales");
        System.out.println("===================================================");
        pegawai = new Sales("loreem", "24532635", 40, 15000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Sales("Harley Irvine", "232472452", 65, 15000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Sales("Loreen Mertie", "354424722", 64, 15000);
        System.out.println(pegawai.toString() + "\n");

    }
}