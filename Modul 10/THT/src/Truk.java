public class Truk extends Kendaraan implements DapatSewa, Muatan {
    private double kapasitas;

    public Truk(String platNomor, String merk, int tahunProduksi, double kapasitas) {
        super(platNomor, merk, tahunProduksi);
        this.kapasitas = kapasitas;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas Muatan: " + kapasitas + " ton");
    }

    public double hitungBiayaSewa(int hari) {
        return 2250000 * hari;
    }

    public boolean perluSupir() {
        return true;
    }

    public double kapasitasMuatan() {
        return kapasitas;
    }
}


