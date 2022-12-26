import java.util.Scanner;

public class Sistem {

    Kullanici kullanici = new Kullanici();
    Scanner scanner = new Scanner(System.in);
    public Sistem(Kullanici kullanici)
    {
        this.kullanici = kullanici;

    }

    public void SistemGirisMenu()
    {
        int girisSec=0;
        System.out.println("\n\n");
        System.out.println("==========BILGISAYAR PUSULAM==========");
        System.out.println();
        System.out.println();

        System.out.println("1-Giris Yap");
        System.out.println("2-Kayit Ol");
        System.out.print("Seciminiz : ");
        girisSec = scanner.nextInt();

        while (!(girisSec==1 || girisSec==2))
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
            girisSec = scanner.nextInt();
        }

        switch (girisSec)
        {
            default :
            case 1 :

                SistemGiris sistemGiris = new SistemGiris(kullanici);
                sistemGiris.SistemGirisEkrani();
            break;

            case 2 :

                SistemKayit sistemKayit = new SistemKayit(kullanici);
                sistemKayit.SistemKayitEkrani();
                new SistemGiris(kullanici).SistemGirisEkrani();
                break;

        }


    }

    public void SistemAnaMenu()
    {
        AnaMenu anaMenu = new AnaMenu(kullanici);
        switch ( anaMenu.AnaMenuEkran())
        {
            case 1:
                HazirBilgisayarMarkaSec hazirBilgisayarMarkaSec = new HazirBilgisayarMarkaSec(kullanici);
                hazirBilgisayarMarkaSec.HazirBilgisayarMarkaSecimi();
                break;
            case 2:
                ToplamaBilgisayar toplamaBilgisayar = new ToplamaBilgisayar(kullanici);
                toplamaBilgisayar.ToplamaBilgisayarGiris();
                break;
            case 3:
               Sepet sepet = new Sepet(kullanici);
               sepet.GuncelSepet();
               SepetYonlendirme();

                break;
            default:
            case 4 :
                SistemCikis(); break;
        }

    }

    public void SistemCikis()
    {
        System.out.println("Kullanicimiz " + kullanici.getUserName() +", iyi günler dileriz.");
    }

    public void SepetYonlendirme()
    {
        int sec=0;
        System.out.println("1-Odemeye Git");
        System.out.println("2-Ana Menu");
        System.out.println("3-Cikis");
        System.out.print("Seciminiz :  ");
        sec = scanner.nextInt();

        while ( sec<1 || sec>3) //try-catch gelecek
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
            sec = scanner.nextInt();
        }

        switch (sec)
        {
            default :
            case 1:
                Sepet sepet = new Sepet(kullanici);

                System.out.println("Odemeye gidilecek");
                KartBilgi kartBilgiDeneme = new KartBilgi(kullanici);
                kartBilgiDeneme.KartSecim();

                if (kartBilgiDeneme.KartBakiyeSorgu(sepet.getTotalSepet())){ //Ödeme alınırsa
                    sepet.SepetSifirla();
                    SistemAnaMenu();
                }
                else { //Ödeme alınamazsa

                    sepet.GuncelSepet();
                    SepetYonlendirme();
                }
                /* Eğer ödeme alınırsa kart bakiye sorgu true dönsün ve sepet içi sıfırlansın eğer ödeme alınmazsa tekrar sepete
                 * yönlendirme yap */
                break;
            case 2: SistemAnaMenu(); break;
            case 3: SistemCikis(); break;

        }
    }



}
