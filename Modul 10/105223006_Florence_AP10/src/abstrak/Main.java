package abstrak;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kitty");
        kucing.makan();
        kucing.bersuara();

        Anjing anjing = new Anjing("Buddy");
        anjing.makan();
        anjing.bersuara();
    }
}