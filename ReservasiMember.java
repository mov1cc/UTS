public class ReservasiMember extends Reservasi {

    public ReservasiMember(Tamu tamu, int malam) {
        super(tamu, malam);
    }

    @Override
    public int hitungTotal(int tarif) {
        int dasar = tarif * malam;
        return dasar - (dasar * 15 / 100);
    }
}