public class BukuAudio extends Buku implements BisaDiunduh {
    private int durasiMenit;
    private double diskon;

    public BukuAudio(String judul, String penulis, int hargaDasar, int durasiMenit, double diskon) {
        super(judul, penulis, hargaDasar);
        this.durasiMenit = durasiMenit;
        this.diskon = diskon;
    }

    public int getDurasiMenit() { return durasiMenit; }
    public double getDiskon() { return diskon; }

    @Override
    public String getUkuranAtauDurasi() {
        return durasiMenit + " menit";
    }

    @Override
    public int hitungHargaAkhir() {
        return (int)(getHargaDasar() * (1 - diskon));
    }
}

