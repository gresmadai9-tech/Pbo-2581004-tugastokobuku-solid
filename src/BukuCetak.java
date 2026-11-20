public class BukuCetak extends Buku {
    private int beratGram;
    private int ongkir;

    public BukuCetak(String judul, String penulis, int hargaDasar, int beratGram, int ongkir) {
        super(judul, penulis, hargaDasar);
        this.beratGram = beratGram;
        this.ongkir = ongkir;
    }

    public int getBeratGram() { return beratGram; }
    public int getOngkir() { return ongkir; }

    @Override
    public int hitungHargaAkhir() {
        return getHargaDasar() + ongkir;
    }
}

