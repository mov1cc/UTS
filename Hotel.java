public class Hotel {
    private String nama;
    private Manajer manajer;
    private Kamar[] kamar;

    public Hotel(String nama, Manajer manajer, int jumlahKamar) {
        this.nama = nama;
        this.manajer = manajer;
        kamar = new Kamar[jumlahKamar];

        for (int i = 0; i < jumlahKamar; i++) {
            if (i < 2) {
                kamar[i] = new Kamar(i + 1, "Deluxe", 750000);
            } else {
                kamar[i] = new Kamar(i + 1, "Standard", 500000);
            }
        }
    }

    public boolean checkIn(Reservasi r) {
        for (Kamar k : kamar) {
            if (k.getTipe().equals("Standard") && k.kosong()) {
                k.setReservasiAktif(r);
                return true;
            }
        }
        return false;
    }

    public boolean checkIn(Reservasi r, int nomorKamar) {
        if (nomorKamar < 1 || nomorKamar > kamar.length) {
            return false;
        }

        Kamar k = kamar[nomorKamar - 1];

        if (k.kosong()) {
            k.setReservasiAktif(r);
            return true;
        }

        return false;
    }

    public Kamar[] getKamar() {
        return kamar;
    }
}