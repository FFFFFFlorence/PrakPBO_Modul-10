package interface;

public class Mobil extends Pemilik implements Kendaraan, Pabrik {
    Mobil(String nama){
        super(nama);

    }

    @Override
    public void nyalakanmesin(){
        System.out.println("Mobil nyala");
    }

    @Override
    public void matikanmesin(){
        System.out.println("Mobil mati");
    }

    @Override
    public void produksikendaraan() {
        System.out.println("Produksi mobil");
    }

    @Override
    public void pemilikKendaraan(String namaPemilik) {
        System.out.println(namaPemilik + " adalah Pemilik mobil " + nama);
    }
}