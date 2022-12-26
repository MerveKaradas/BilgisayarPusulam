public class SistemKayit extends Sistem{

    public SistemKayit(Kullanici kullanici) {
        super(kullanici);
    }

    public void SistemKayitEkrani()
    {
        String kullaniciAd="null",kullaniciMail="null",kullaniciSifre="null";
        int kullaniciYas=0;


        System.out.println("******** UYE OL ********");
        System.out.println();

        System.out.print("Ad : ");
        kullaniciAd = scanner.nextLine();
        kullanici.setUserName(kullaniciAd);


        System.out.print("Yas : ");
        kullaniciYas=scanner.nextInt();
        kullanici.setUserAge(kullaniciYas);
        if (kullaniciYas < 18 || kullaniciYas>= 110)
        {
            kullanici.setUserAge(18);
        }


        System.out.print("E-posta ( _____@gmail.com ) :  "); //ekstradan girerse hata ver
        kullaniciMail = scanner.next();
        kullanici.setUserMail(kullaniciMail);


        System.out.print("Sifre : ");
        kullaniciSifre = scanner.next();
        kullanici.setUserPassword(kullaniciSifre);

        System.out.println(kullanici.getUserName() + ", Bilgisayar Pusulam Uygulamasına kayit oldunuz ! ");

        KartBilgi kartBilgi = new KartBilgi(kullanici);
        kartBilgi.KartBilgiEkle();



        kullanici.KullaniciBilgileri();


    }


}










