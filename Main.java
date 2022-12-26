import java.util.*;

public class Main {
    public static void main(String[] args) {


        Kullanici kullanici = new Kullanici();
        Sistem sistem = new Sistem(kullanici);
        sistem.SistemGirisMenu();

    }
}