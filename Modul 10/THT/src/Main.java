public class Main {
    public static void main(String[] args) {
        Kendaraan bus = new Bus("B1234CD", "Mercedes", 2020);
        Kendaraan mobilPribadi = new MobilPribadi("B5678EF", "Toyota", 2019);
        Kendaraan truk = new Truk("B9101GH", "Isuzu", 2018, 5.0);

        System.out.println();
        bus.tampilkanInfo();
        System.out.println("Biaya Sewa Bus untuk 3 hari: " + bus.hitungBiayaSewa(3));
        System.out.println("Perlu Supir: " + bus.perluSupir()); 
        System.out.println();
        mobilPribadi.tampilkanInfo();
        System.out.println("Biaya Sewa Mobil Pribadi untuk 2 hari: " + mobilPribadi.hitungBiayaSewa(2));
        System.out.println("Perlu Supir: " + mobilPribadi.perluSupir());
        System.out.println();
        truk.tampilkanInfo();
        System.out.println("Biaya Sewa Truk untuk 4 hari: " + truk.hitungBiayaSewa(4));
        System.out.println("Perlu Supir: " + truk.perluSupir());
        System.out.println();
    }
}


