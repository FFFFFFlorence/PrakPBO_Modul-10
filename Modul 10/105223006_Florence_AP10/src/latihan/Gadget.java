package latihan;

public interface Gadget {
    void hidupkan();

    default void cekBaterai() {
        System.out.println("100%");
    }

    static void info() {
        System.out.println("Ini adalah interface Gadget");
    }

    
}