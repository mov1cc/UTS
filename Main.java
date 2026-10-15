public class Main {
    public static void main(String[] args) {

        Manajer manajer = new Manajer("Budi");

        Hotel hotel = new Hotel("Hotel Mawar", manajer, 5);

        Tamu t1 = new Tamu("Andi");
        Tamu t2 = new Tamu("Sinta");

        Reservasi r1 = new ReservasiReguler(t1, 2);
        Reservasi r2 = new ReservasiMember(t2, 3);

        hotel.checkIn(r1);
        hotel.checkIn(r2, 1);

        Invoice invoice = new Invoice();

        for (Kamar k : hotel.getKamar()) {
            if (!k.kosong()) {
                invoice.cetak(k);
                System.out.println();
            }
        }

        System.out.println("Reguler + Extra Bed : Rp" + r1.hitungTotal(500000, true));
        System.out.println("Member + Extra Bed  : Rp" + r2.hitungTotal(750000, true));
    }
}