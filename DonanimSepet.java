import java.util.ArrayList;

public class DonanimSepet extends ToplamaBilgisayar{

    static ArrayList<String> arrayListUrunAd = new ArrayList<>();
    static ArrayList<Float> arrayListUrunFiyat = new ArrayList<>();
    private String UrunAd;
    private float urunFiyat;

    private String urunTurAd;
    private static float totalSepet=0;
    private static int sayac=0;
    private static int ToplamaBilgisayarSayi=0;

    public DonanimSepet(Kullanici kullanici,String urunTurAd,String urunAd,float urunFiyat)
    {
        super(kullanici);
        this.UrunAd = urunAd;
        this.urunFiyat=urunFiyat;


    }

    DonanimSepet(Kullanici kullanici) {
        super(kullanici);
    }

    public void Ekle()
    {

        sayac++;

        arrayListUrunAd.add(getUrunAd());
        arrayListUrunFiyat.add(getUrunFiyat());
        totalSepet += arrayListUrunFiyat.get(sayac-1);
        setTotalSepet(totalSepet);


        GuncelSepet();
    }



    public void GuncelSepet()
    {
        System.out.println("\n");
        System.out.println("===================== DONANIM SEPET =====================");
        SepetArrayListBilgi();
        System.out.println("--------------------------------------------------");
        System.out.println("Urun Adedi :  " + sayac);
        System.out.println("Sepet Toplam Tutar :  "+ totalSepet +"TL");
    }

    public void SepetArrayListBilgi()
    {
        for (int i = 0; i < arrayListUrunAd.size(); i++) {
            System.out.println(arrayListUrunAd.get(i) + "\t\t\t" + arrayListUrunFiyat.get(i) +"TL");

        }

    }

    public void DonanimSepetSifirla()
    {
        arrayListUrunAd.clear();
        arrayListUrunFiyat.clear();
        setUrunAd("null");
        setUrunFiyat(0F);
        setTotalSepet(0F);
        totalSepet=0;
        sayac=0;

    }

    public void ToplamaBilgisayarTamamlandi()
    {

        System.out.println("Secilen itemlerle basarili bir sekilde bilgisayariniz olusturulmustur!");
        GenelSepeteEkle();

        DonanimSepetSifirla();
        System.out.println("Sepete Yönlendiriliyorsunuz ");

        SepetYonlendirme();

        //Tek bir item olarak Toplama Bilgisayar -1 adı altında Genel Sepete fiyatıyla beraber eklencek
        //DonanimSepet içerisindekiler sıfırlanacak
    }


    public void GenelSepeteEkle()
    {
        ToplamaBilgisayarSayi++;
        Sepet sepet = new Sepet(kullanici, ToplamaBilgisayarSayi + "-Toplama Bilgisayar",totalSepet);
        sepet.Ekle();

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

                break;
            case 2: SistemAnaMenu(); break;
            case 3: SistemCikis(); break;

        }
    }



    public String getUrunAd() {
        return UrunAd;
    }

    public void setUrunAd(String urunAd) {
        UrunAd = urunAd;
    }

    public float getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(float urunFiyat) {
        this.urunFiyat = urunFiyat;
    }

    public float getTotalSepet() {
        return totalSepet;
    }

    public void setTotalSepet(float totalSepet) {
        this.totalSepet = totalSepet;
    }

    public String getUrunTurAd() {
        return urunTurAd;
    }

    public void setUrunTurAd(String urunTurAd) {
        this.urunTurAd = urunTurAd;
    }


}
