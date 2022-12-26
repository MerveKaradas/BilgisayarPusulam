public class SistemGiris extends Sistem {


    public SistemGiris(Kullanici kullanici) {
        super(kullanici);
    }

    public void SistemGirisEkrani()
    {
        String eMail,sifre;

        System.out.println("******** GIRIS YAP ********");
        System.out.println();



        if(kullanici.getUserMail().equals("null@gmail.com"))
        {
            System.out.println("Sistemde kayitli kullanici bulunmamaktadir! Oncelikle kayit olunuz.");
            SistemGirisMenu();

        }
        else
        {
            System.out.print("E-mail :  ");
            eMail = scanner.next();
            while(!(eMail.equals(kullanici.getUserMail())))
            {
                System.out.print("Lütfen geçerli bir e-posta adresi giriniz! : ");
                eMail = scanner.next();
            }

            System.out.print("Sifre :  ");
            sifre = scanner.next() ;
            while(!(sifre.equals(kullanici.getUserPassword())))
            {
                System.out.print("Sifre e-posta adresiyle uyusmuyor.Lutfen tekrar giriniz! : ");
                sifre = scanner.next();
            }

            if((eMail.equals(kullanici.getUserMail()) && sifre.equals(kullanici.getUserPassword())) )
            {
                System.out.println(kullanici.getUserName() + ", Bilgisayar Pusulam'a Hos Geldiniz!");
                SistemAnaMenu();
            }



        }



    }
}
