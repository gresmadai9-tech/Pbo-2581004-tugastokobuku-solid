public class TokoBukuSolid {
    public static void main(String[] args) {
        Buku pemrogramanJava = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750, 10000);
        Buku algoritmaDasar = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400, 5000);
        Buku belajarOOP = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5, 0.20);
        Buku kisahProgrammer = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240, 0.10);

        Keranjang keranjang1 = new Keranjang();
        keranjang1.tambah(pemrogramanJava);
        keranjang1.tambah(algoritmaDasar);
        keranjang1.tambah(belajarOOP);
        keranjang1.tambah(kisahProgrammer);

        Keranjang keranjang2 = new Keranjang();
        keranjang2.tambah(belajarOOP);

        MetodeBayar[] pilihan = {
                new Tunai(),
                new Transfer(),
                new EWallet(),
                new Voucher(100000)
        };

        StrukPrinter printer = new StrukPrinter();
        printer.cetakKeranjang("KERANJANG PERTAMA", keranjang1);
        printer.cetakPembayaran(keranjang1.hitungTotal(), pilihan);

        printer.cetakKeranjang("KERANJANG KEDUA", keranjang2);
        printer.cetakPembayaran(keranjang2.hitungTotal(), pilihan);
    }
}

