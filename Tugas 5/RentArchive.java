import java.util.ArrayList;

public class RentArchive {

    ArrayList<CarRent> rentData = new ArrayList<>();

    public void Rent(CarRider rider, Car car, int rentDur) {

        if (car.isStatus()) {
            CarRent newCarRent = new CarRent(rider, car, rentDur);
            rentData.add(newCarRent);
            System.out.println("Mobil berhasil disewa");
            car.setStatus("false");
        } else {
            System.out.println("Maaf, mobil sudah disewa");

        }

    }

    public void info() {

        System.out.println("-----------------------------------------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("-----------------------------------------------------");

        for (CarRent rental : rentData) {

            System.out.println("NAMA PEMINJAM   : " + rental.getRider().getName());
            System.out.println("NO. TELPON      : " + rental.getRider().getPhone());
            System.out.println("UMUR            : " + rental.getRider().getAge());
            System.out.println("TIPE MOBIL      : " + rental.getCar().getCarType());
            System.out.println("NO. POLISI      : " + rental.getCar().getPolNum());
            System.out.println("LAMA RENTAL     : " + rental.getRentDur());
            System.out.println("-----------------------------------------------------");

        }

    }
}
