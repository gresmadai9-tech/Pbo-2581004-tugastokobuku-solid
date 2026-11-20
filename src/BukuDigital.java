public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMB;
    private double diskon;

    public BukuDigital(String judul, String penulis, int hargaDasar, double ukuranMB, double diskon) {
        super(judul, penulis, hargaDasar);
        this.ukuranMB = ukuranMB;
        this.diskon = diskon;
    }

    public double getUkuranMB() { return ukuranMB; }
    public double getDiskon() { return diskon; }

    @Override
    public String getUkuranAtauDurasi() {
        return ukuranMB + " MB";
    }

    @Override
    public int hitungHargaAkhir() {
        return (int)(getHargaDasar() * (1 - diskon));
    }
}

