public abstract class Buku {
    private String judul;
    private String penulis;
    private int hargaDasar;

    public Buku(String judul, String penulis, int hargaDasar) {
        this.judul = judul;
        this.penulis = penulis;
        this.hargaDasar = hargaDasar;
    }

    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public int getHargaDasar() { return hargaDasar; }
    public abstract int hitungHargaAkhir();

    protected static String formatRupiah(int angka) {
        return String.format("Rp%,d", angka);
    }
}
