import java.util.ArrayList;

public class Sepet extends Sistem{


    static ArrayList<String> arrayListUrunAd = new ArrayList<>();
    static ArrayList<Float> arrayListUrunFiyat = new ArrayList<>();
    private String UrunAd;
    private float urunFiyat;
    private static float totalSepet=0;
    private static int sayac=0;


    public Sepet(Kullanici kullanici,String urunAd,float urunFiyat)
    {
        super(kullanici);
        this.UrunAd = urunAd;
        this.urunFiyat=urunFiyat;


    }

    public Sepet(Kullanici kullanici)
    {
        super(kullanici);
        this.kullanici=kullanici;
    }

    public void Ekle()
    {
     //   arrayListUrunAd.add(sayac,getUrunAd()); böyle olunca arraylist static olmasa da olur


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
        System.out.println("===================== SEPET =====================");
        SepetArrayListBilgi();
        System.out.println("--------------------------------------------------");
        System.out.println("Urun Adedi :  " + sayac);
        System.out.println("Sepet Toplam Tutar :  "+ totalSepet +"TL");
    }

    public void SepetArrayListBilgi()
    {
        for (int i = 0; i < arrayListUrunAd.size(); i++) {
            System.out.println(arrayListUrunAd.get(i) + "\t\t\t" + arrayListUrunFiyat.get(i) +"TL");
          //  totalSepet += arrayListUrunFiyat.get(i);
           // setTotalSepet(totalSepet);

        }

    }

    public void SepetSifirla() //ödeme alınıp tekrar sepete girinc ehata veriyor
    {

        arrayListUrunAd.clear();
        arrayListUrunFiyat.clear();
        setUrunAd("null");
        setUrunFiyat(0F);
        setTotalSepet(0F);
        totalSepet=0;
        sayac=0;

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



}
