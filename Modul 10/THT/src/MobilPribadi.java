public class MobilPribadi extends Kendaraan implements DapatSewa{
    public MobilPribadi(String platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
    }

    public double hitungBiayaSewa(int hari) {
        return 300000 * hari;
    }

    public boolean perluSupir() {
        return false;
    }
}


