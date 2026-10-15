public class Invoice {

    public void cetak(Kamar kamar) {
        Reservasi r = kamar.getReservasiAktif();

        if (r == null) {
            System.out.println("Kamar kosong");
            return;
        }

        System.out.println("===== INVOICE =====");
        System.out.println("Nama Tamu : " + r.getTamu().getNama());
        System.out.println("Kamar     : " + kamar.getNomor());
        System.out.println("Tipe      : " + kamar.getTipe());
        System.out.println("Malam     : " + r.getMalam());
        System.out.println("Total     : Rp" + r.hitungTotal(kamar.getTarif()));
    }
}