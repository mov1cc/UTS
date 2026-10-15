public class ReservasiReguler extends Reservasi {

    public ReservasiReguler(Tamu tamu, int malam) {
        super(tamu, malam);
    }

    @Override
    public int hitungTotal(int tarif) {
        int dasar = tarif * malam;
        return dasar + (dasar * 10 / 100);
    }
}