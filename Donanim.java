import java.util.Scanner;

abstract class Donanim extends ToplamaBilgisayar{


    private String parcaTurAd="null";
    private String parcaAd = "null";
    private float parcaFiyat = 0;

    Scanner scanner = new Scanner(System.in);

    Donanim(Kullanici kullanici,String parcaTurAd,String parcaAd,float parcaFiyat) {
        super(kullanici);
        this.parcaTurAd = parcaTurAd;
        this.parcaAd = parcaAd;
        this.parcaFiyat = parcaFiyat;

    }
    Donanim(Kullanici kullanici,String parcaTurAd) {
        super(kullanici);
        this.parcaTurAd = parcaTurAd;

    }


    Donanim(Kullanici kullanici)
    {
        super(kullanici);
    }

    public void MetotCalistir()
    {
        ParcaBilgilendirme();
        UrunSec();
        TeknikBilgi();
        UrunYonlendir();
      // DonanimYonlendirme(); ÜRÜN YÖNLENDİRME İÇERİSİNDE EĞER PARÇA SEPETE EKLENİRSE BİR SONRAKİ DONANİM BİRİMİNİ SEÇMEYE DEVAM EDECEK
    }

    public abstract int UrunSec();

    public void UrunYonlendir(){
        int urunyonlendir=0;

        System.out.println();
        System.out.println("1-) Sepete Ekle");
        System.out.println("2-) " + parcaTurAd +" Bakmaya Devam Et");
        System.out.println("3-) Secimleri sifirla.Yeni bir bilgisayar olustur");
        System.out.println("4-) Cikis");
        System.out.print("Seciminiz : ");
        urunyonlendir = scanner.nextInt();

        while ( urunyonlendir<1 || urunyonlendir>4) //try-catch gelecek
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
            urunyonlendir = scanner.nextInt();
        }

        switch (urunyonlendir)
        {

            //Secilen urun sepete eklendi!
            case 1 :
                DonanimSepeteEkleCikar(parcaAd,parcaFiyat);
                DonanimYonlendirme();
                break;

            //Bulunduğumuz bölümdeki parçalara bakmaya devam edecek
            case 2 :
                MetotCalistir();
                break;

            //Tum secimleri sifirlanip CPU'dan başlanarak yeni bir cihaz oluşturulacak
            case 3 :
                DonanimSepet donanimSepet = new DonanimSepet(kullanici);
                donanimSepet.DonanimSepetSifirla();
                Donanim donanim = new CPU(kullanici,"CPU");
                donanim.MetotCalistir();
                break;

            //Program Kapatılıyor
            case 4 : SistemCikis(); break;
        }

    }

    public abstract void ParcaBilgilendirme();
    public abstract void TeknikBilgi();
    public void DonanimSepeteEkleCikar(String parcaAd,float parcaFiyat)
    {
        System.out.println(parcaTurAd + "-" + parcaAd +" Basarili bir sekilde sepete eklendi!");
        DonanimSepet donanimSepet = new DonanimSepet(kullanici,parcaTurAd,parcaAd,parcaFiyat);
        donanimSepet.Ekle();

    }
    public void DonanimYonlendirme() //BULUNDUĞUMUZ TÜRDEN SONRAKİ GELEN TÜRLERE SIRASIYLA GEÇİŞ YAPAR
    {
        switch (parcaTurAd) //SIRALARI DEĞİŞEBİLİR BAKARSIN
        {
            case "CPU" : // CPU Bölümünden ---> Anakart Bölümüne yönlendirilir
                Donanim donanim = new AnaKart(kullanici,"AnaKart"); //polymorphism
               /* Bu sayede donanim nesnesini Anakart nesnesi gibi kullanabiliyoruz yani Anakart'daki metotlar Donanim class'ında
                bulunan metotları ezerek Anakart'daki metotlar çalışmuş olucak*/
                donanim.MetotCalistir();
                break;

            case "AnaKart" : // Anakart Bolumundan --> Bellek Bolumune yonlendirilir
                //Donanim donanim1 = new EkranKarti(kullanici,"EkranKarti");
                Donanim donanim1 = new Bellek(kullanici,"Bellek");
                donanim1.MetotCalistir();
                break;

            case "Bellek" : // Bellekte Bolumundan --> EkranKarti bolumune
             //   Donanim donanim2 = new Bellek(kullanici,"Bellek");
                Donanim donanim2 = new EkranKarti(kullanici,"EkranKarti");
                donanim2.MetotCalistir();
                break;

            case "EkranKarti" : //EkranKarti Bolumundan --> SabitDisk bolumune
                Donanim donanim3 = new SabitDisk(kullanici,"SabitDisk");
                donanim3.MetotCalistir();
                break;

            case "SabitDisk" : //SabitDisk bolumunden --> GucKaynagi bolumune
                Donanim donanim4 = new GucKaynagi(kullanici,"GucKaynagi");
                donanim4.MetotCalistir();
                break;

            case "GucKaynagi" : // GucKaynagi Bolumunden --> Kasa Bolumune
                Donanim donanim5 = new Kasa(kullanici,"Kasa");
                donanim5.MetotCalistir();
                break;
            case "Kasa" :

                /*BURADA TÜM İÇ DONANIM ELEMANLARI TOPLANIYOR BASARİLİ BİR SEKİLDE TOPLANDIĞI
                * BELİRTİLİR TEK BİR İTEM OLARAK GENEL SEPETE EKLENİR
                * */

                DonanimSepet donanimSepet = new DonanimSepet(kullanici);
                donanimSepet.ToplamaBilgisayarTamamlandi(); // bu metotla beraber donanimsepet sifirlanacak
                break;


        }
    }

    public String getParcaTurAd() {
        return parcaTurAd;
    }

    public void setParcaTurAd(String parcaTurAd) {
        this.parcaTurAd = parcaTurAd;
    }

    public String getParcaAd() {
        return parcaAd;
    }

    public void setParcaAd(String parcaAd) {
        this.parcaAd = parcaAd;
    }

    public float getParcaFiyat() {
        return parcaFiyat;
    }

    public void setParcaFiyat(float parcaFiyat) {
        this.parcaFiyat = parcaFiyat;
    }




}
