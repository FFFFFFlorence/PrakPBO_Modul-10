public abstract class Kendaraan {
    public String platNomor;
    public String merk;
    public int tahunProduksi;

    public Kendaraan(String platNomor, String merk, int tahunProduksi) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    public void tampilkanInfo(){
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    public abstract double hitungBiayaSewa(int hari);
    public abstract boolean perluSupir();
}

