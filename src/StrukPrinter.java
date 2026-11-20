public class StrukPrinter {
    public void cetakKeranjang(String judul, Keranjang keranjang) {
        System.out.println("=========== " + judul + " ===========");
        for (Buku b : keranjang.getIsi()) {
            System.out.println(b.getJudul() + " (" + b.getPenulis() + ")");
            System.out.println("  Harga       : " + Buku.formatRupiah(b.getHargaDasar()));

            if (b instanceof BukuCetak) {
                BukuCetak bc = (BukuCetak) b;
                System.out.println("  Keterangan  : " + bc.getBeratGram() + " gram, ongkir " + Buku.formatRupiah(bc.getOngkir()));
            } else if (b instanceof BukuDigital) {
                BukuDigital bd = (BukuDigital) b;
                System.out.printf("  Keterangan  : %s, diskon %.0f%%%n", bd.getUkuranAtauDurasi(), bd.getDiskon() * 100);
            } else if (b instanceof BukuAudio) {
                BukuAudio ba = (BukuAudio) b;
                System.out.printf("  Keterangan  : %s, diskon %.0f%%%n", ba.getUkuranAtauDurasi(), ba.getDiskon() * 100);
            }

            System.out.println("  Harga akhir : " + Buku.formatRupiah(b.hitungHargaAkhir()));
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total belanja : " + Buku.formatRupiah(keranjang.hitungTotal()));
    }

    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        System.out.println("-------------- PEMBAYARAN ---------------");
        for (MetodeBayar m : pilihan) {
            System.out.printf("%-20s : %s%n", m.nama(), Buku.formatRupiah(m.totalBayar(totalBelanja)));
        }
        System.out.println();
    }
}

