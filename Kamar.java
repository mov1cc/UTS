public class Kamar {
    private int nomor;
    private String tipe;
    private int tarif;
    private Reservasi reservasiAktif;

    public Kamar(int nomor, String tipe, int tarif) {
        this.nomor = nomor;
        this.tipe = tipe;
        this.tarif = tarif;
    }

    public boolean kosong() {
        return reservasiAktif == null;
    }

    public int getNomor() {
        return nomor;
    }

    public String getTipe() {
        return tipe;
    }

    public int getTarif() {
        return tarif;
    }

    public Reservasi getReservasiAktif() {
        return reservasiAktif;
    }

    public void setReservasiAktif(Reservasi reservasiAktif) {
        this.reservasiAktif = reservasiAktif;
    }
}