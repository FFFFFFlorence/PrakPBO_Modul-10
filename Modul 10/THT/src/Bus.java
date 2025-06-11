public class Bus extends Kendaraan implements DapatSewa{
    public Bus(String platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();
    }

    public double hitungBiayaSewa(int hari) {
        return 650000 * hari;
    }
    
    public boolean perluSupir() {
        return true;
    }    
}

