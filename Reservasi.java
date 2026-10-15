public abstract class Reservasi {
    protected Tamu tamu;
    protected int malam;

    public Reservasi(Tamu tamu, int malam) {
        this.tamu = tamu;
        this.malam = malam;
    }

    public abstract int hitungTotal(int tarif);

    public int hitungTotal(int tarif, boolean extraBed) {
        int total = hitungTotal(tarif);
        if (extraBed) {
            total += malam * 150000;
        }
        return total;
    }

    public Tamu getTamu() {
        return tamu;
    }

    public int getMalam() {
        return malam;
    }
}