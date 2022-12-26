import java.util.Scanner;

public class AnaMenu extends Sistem{

    Kullanici Kullanici;
    Scanner scanner = new Scanner(System.in);
    AnaMenu(Kullanici kullanici)
    {
        super(kullanici);

    }

    public int AnaMenuEkran()
    {
        System.out.println("\n====== ANA MENU ======\n");

        int sec=0;
        System.out.println("1- Hazır Bilgisayar");
        System.out.println("2- Toplama Bilgisayar");
        System.out.println("3- Sepet");
        System.out.println("4- Cikis");
        System.out.print("Seciminiz : ");
        sec = scanner.nextInt();

        while(sec <1 || sec>4)
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan seceneklerlerden birini secin :");
            sec = scanner.nextInt();
        }

        return sec;

    }




}
