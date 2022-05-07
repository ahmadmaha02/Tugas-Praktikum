import java.util.Arrays;

public class Main {
    static Manusia manusia[];
    static MahasiswaFILKOM mahasiswa[];
    static Pekerja pekerja[];
    static Manager manager[];

    public static void main(String[] args) {
        // Class Manusia
        manusia = new Manusia[3];
        System.out.println(" Class Manusia ");
        System.out.println("=================================================");
        manusia[0] = new Manusia("Ahmad Maha", "215150707111037", true, false);
        manusia[1] = new Manusia("aisya", "215612620784", false, true);
        manusia[2] = new Manusia("martin", "215124072994", true, true);
        System.out.println(manusia[0].toString());
        System.out.println(manusia[1].toString());
        System.out.println(manusia[2].toString());

        // Class MahasiswaFILKOM
        mahasiswa = new MahasiswaFILKOM[3];
        System.out.println(" Class Mahasiswa ");
        System.out.println("=================================================");
        mahasiswa[0] = new MahasiswaFILKOM("205150600111002", 3.9, "luhut marpaung", "199925029106", false, true);
        mahasiswa[1] = new MahasiswaFILKOM("195150200111002", 3.8, "mandapot tarigan", "2003829374606", false, false);
        mahasiswa[2] = new MahasiswaFILKOM("215150707111037", 4.0, "Ahmad Maha", "2002682923109", true, false);
        System.out.println(mahasiswa[0].toString());
        System.out.println(mahasiswa[1].toString());
        System.out.println(mahasiswa[2].toString());

        // Class Pekerja
        pekerja = new Pekerja[3];
        System.out.println(" Class Pekerja ");
        System.out.println("=================================================");
        pekerja[0] = new Pekerja(7, 22, "195102439283", "edi santoso", "2933242352524", true, true);
        pekerja[1] = new Pekerja(9, 28, "200325829957", "sri mulyanti", "243245245224", false, true);
        pekerja[2] = new Pekerja(7, 30, "2002257291648", "cus yaqult", "203245244642", true, false);
        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());

        // Class Manager
        manager = new Manager[3];
        System.out.println(" Class Manager ");
        System.out.println("=================================================");
        manager[0] = new Manager(1000, 6, 30, "200225229106", "anya chan", "2001647443", false, true);
        manager[1] = new Manager(1500, 9, 20, "204837283728", "gon kun", "1351707384392", false, false);
        manager[2] = new Manager(1450, 8, 20, "200225129106", "gojo sama", "193475135113", true, false);
        System.out.println(manager[0].toString());
        System.out.println(manager[1].toString());
        System.out.println(manager[2].toString());

        // Jumlah
        System.out.println(" Total Keseluruhan yang Terdaftar ");
        System.out.println("=================================================");
        System.out.println("Jumlah Manusia : " + manusia.length);
        System.out.println("Jumlah Mahasiswa : " + mahasiswa.length);
        System.out.println("Jumlah Pekerja : " + pekerja.length);
        System.out.println("Jumlah Manager : " + manager.length);
    }
}