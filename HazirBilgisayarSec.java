abstract class HazirBilgisayarSec extends HazirBilgisayarMarkaSec{

    protected String marka;
    private String markaSeriAd="null";
    private String markaBilgisayarAd="null";
    private float markaBilgisayarFiyat=0;


    HazirBilgisayarSec(Kullanici kullanici,String marka)
    {
        super(kullanici);

    }

    public void MetotCalistir()
    {
        MarkaninBilgisayarSerileri();
        TeknikBilgi();
        BilgisayarSepetBilgileri();
        SistemYonlendirme();

    }

    abstract void MarkaninBilgisayarSerileri(); //+
    abstract void TeknikBilgi(); //+
    public void BilgisayarSepetBilgileri()
    {

        System.out.println("");
        System.out.println("\n-------------------------------------------------------------------------------\n");
        System.out.println("--> Bilgisayar Markasi : " + marka);
        System.out.println("--> Bilgisayar Serisi : " + markaSeriAd );
        System.out.println("--> Bilgisayar Adı : " + markaBilgisayarAd);
        System.out.println("--> Bilgisayar Fiyat : " + markaBilgisayarFiyat +"TL" );
        System.out.println("\n-------------------------------------------------------------------------------\n");
        System.out.println();
    }

    public void SistemYonlendirme()
    {
        int turSecim = 0;
        System.out.println("1-Incelemeye devam et");
        System.out.println("2-Sepete Ekle");
        System.out.println("3-Ana Menu");
        System.out.println("4-Cikis");
        System.out.print("Seciminiz :  ");
        turSecim = scanner.nextInt();


       while ( turSecim<1 || turSecim>4) //try-catch gelecek
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
            turSecim = scanner.nextInt();
        }

        switch (turSecim)
        {
            default:
            case 1: //Hazır Bilgisayarları incelemeye devam ediyor
                HazirBilgisayarMarkaSecimi();
                break;
            case 2: //Seçilen ürün sepete ekleniliyor ve sepete yönlendiriliyor
                System.out.println("Urun sepete eklendi! Sepete yonlendiriliyorsunuz!");

                Sepet sepet = new Sepet(kullanici,markaBilgisayarAd,markaBilgisayarFiyat);
                sepet.Ekle();
                SepetYonlendirme();

                break;
            case 3: SistemAnaMenu(); break; //Ana menüye yönlendiriliyor
            case 4: SistemCikis(); break; //Programdan çıkış yapılıyor

        }
    }



    public void SepetYonlendirme()
    {
        int sec=0;
        System.out.println("1-Odemeye Git");
        System.out.println("2-Ana Menu");
        System.out.println("3-Cikis");
        System.out.print("Seciminiz :  ");
        sec = scanner.nextInt();

        while ( sec<1 || sec>3)
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
            sec = scanner.nextInt();
        }

        switch (sec)
        {
            default :
            case 1: // ODEMEYE GIDER
                Sepet sepet = new Sepet(kullanici);

                KartBilgi kartBilgiDeneme = new KartBilgi(kullanici);

                kartBilgiDeneme.KartSecim();

                if (kartBilgiDeneme.KartBakiyeSorgu(sepet.getTotalSepet())){ //Ödeme alınırsa
                    sepet.SepetSifirla();
                    SistemAnaMenu();
                }
                else { //ODEME ALINMAZSA

                    sepet.GuncelSepet();
                    SepetYonlendirme();
                }

                break;
            case 2: SistemAnaMenu(); break;
            case 3: SistemCikis(); break;

        }
    }


    public String getMarkaSeriAd() {
        return markaSeriAd;
    }

    public void setMarkaSeriAd(String markaSeriAd) {
        this.markaSeriAd = markaSeriAd;
    }

    public String getMarkaBilgisayarAd() {
        return markaBilgisayarAd;
    }

    public void setMarkaBilgisayarAd(String markaBilgisayarAd) {
        this.markaBilgisayarAd = markaBilgisayarAd;
    }

    public float getMarkaBilgisayarFiyat() {
        return markaBilgisayarFiyat;
    }

    public void setMarkaBilgisayarFiyat(float markaBilgisayarFiyat) {
        this.markaBilgisayarFiyat = markaBilgisayarFiyat;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
