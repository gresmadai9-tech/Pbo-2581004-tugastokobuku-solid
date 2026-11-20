import java.util.ArrayList;

public class Keranjang {
    private ArrayList<Buku> isi;

    public Keranjang() {
        isi = new ArrayList<>();
    }

    public void tambah(Buku b) {
        isi.add(b);
    }

    public ArrayList<Buku> getIsi() {
        return isi;
    }

    public int hitungTotal() {
        int total = 0;
        for (Buku b : isi) {
            total += b.hitungHargaAkhir();
        }
        return total;
    }
}

