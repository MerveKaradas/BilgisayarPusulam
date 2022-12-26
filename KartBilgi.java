import java.util.ArrayList;
import java.util.Scanner;

public class KartBilgi extends SistemKayit{
    Scanner scanner = new Scanner(System.in);

    static ArrayList<String> arrayListKartAd = new ArrayList<>();
    static ArrayList<Double> arrayListKartNo = new ArrayList<>();
    static ArrayList<Double> arrayListKartBakiye = new ArrayList<>();
    static ArrayList<Integer> arrayListCCV = new ArrayList<>();

    private static int kartSayisi=arrayListKartAd.size();


    private static int secilenKartIndex=0;

    private static String kartName="null";
    private static double kartNo=0,kartBakiye=0;
    private static int CCV=0;

    private static int sayac=0;


    public KartBilgi(Kullanici kullanici)
    {
        super(kullanici);

    }



    public void KartBilgiEkle()
    {

        String kartAd;
        double kartNo;
        int kartCCV;
        System.out.println("\n");
        System.out.println("***** KART EKLE *****");
        System.out.println();

        System.out.print("Kart Adı :  ");
        arrayListKartAd.add(scanner.next());

        System.out.print("Kart No :  ");
        arrayListKartNo.add(scanner.nextDouble());

        System.out.print("CCV : ");
        arrayListCCV.add(scanner.nextInt());



        arrayListKartBakiye.add(Math.random()*100000 + 100000);


        System.out.println(arrayListKartAd.get(sayac) + ", kartiniz hesabiniza basarili bir sekilde kaydedilmistir.");

        KayitliKartlarim();

    }

    public void KayitliKartlarim()
    {
        System.out.println();
        System.out.println("***** KART BILGI *****\n");


        for (int i = 0; i < arrayListKartAd.size(); i++) {
            System.out.println("Kart Adi : " + arrayListKartAd.get(i));
            System.out.println("Kart No : " + arrayListKartNo.get(i));
            System.out.println("Kart CCV : " + arrayListCCV.get(i));
            System.out.println("Kart Bakiye : "+ arrayListKartBakiye.get(i)+"TL");
            System.out.println();
        }

        sayac++;
        System.out.println("Hesabinizda " + sayac + " adet kayitli kartiniz bulunmaktadir");

    }

    public void KartSecim()
    {
        int kartSec=0;

        for (int i = 0; i < arrayListKartAd.size(); i++) {
            System.out.println(i+1 +"-) " + arrayListKartAd.get(i));

        }
        System.out.println("Hesabınızda tanimlanan " + sayac + " adet kart bulunmaktadir.");

        System.out.print("Hangi kart ile devam etmek istersiniz? : ");
        kartSec = scanner.nextInt();


        setKartName(arrayListKartAd.get(kartSec-1));
        setKartNo(arrayListKartNo.get(kartSec-1));
        setCCV(arrayListCCV.get(kartSec-1));
        setKartBakiye(arrayListKartBakiye.get(kartSec-1));

        secilenKartIndex = kartSec-1;

        SecilenKartBilgi();

    }

    public void SecilenKartBilgi()
    {
        System.out.println("Secilen Kart Bilgileri : ");
        System.out.println();
        System.out.println("Kart Adi : " + getKartName());
        System.out.println("Kart No : " + getKartNo());
        System.out.println("Kart CCV : " + getCCV());
        System.out.println("Kart Bakiye : "+ getKartBakiye());
    }

    
    public boolean KartBakiyeSorgu(double SepetTutar)
    {
        if(SepetTutar > getKartBakiye())
        {
            System.out.println(getKartName() + " kartinda bakiye yetersiz!");
            if(sayac>1) //1'den fazla kart varsa
            {
                int sec=0;
                System.out.println("Farkli bir kart secmek ya da yeni bir kart eklemek ister misiniz?  ");
                System.out.println("1-)Farkli Bir Kart Seç");
                System.out.println("2-)Yeni Kart Ekle");
                System.out.println("3-)Sepete Dön");
                System.out.print("Seciminiz : ");
                sec = scanner.nextInt();

                while (sec<1 || sec>3)
                {
                    System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
                    sec = scanner.nextInt();

                }
                
                if (sec==1) { //Kayitli kartlardan bir kart seçecek
                    KartSecim();
                }
                else if (sec==2) { //Yeni bir kart ekleyecek
                    KartBilgiEkle();
                }
                else {

                    System.out.println("Sepete Yonlendiriliyorsunuz ...");
                    return false;

                }
                
            }
            else {
                int secim;
                System.out.println("Yeni bir kart eklemek ister misiniz? ");
                System.out.println("1-)EVET");
                System.out.println("2-)HAYIR");
                System.out.print("Seciminiz : ");
                secim = scanner.nextInt();

                while (secim<1 || secim>2)
                {
                    System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
                    secim = scanner.nextInt();

                }

                if (secim==1) {
                    KartBilgiEkle();
                }
                else {
                    System.out.println("Sepete Yonlendiriliyorsunuz ...");
                    return false;
                }


            }

        }

        else
        {
            System.out.println("Secilen " + getKartName() + " kartindan odeme aliniyor...");
            arrayListKartBakiye.set(secilenKartIndex,arrayListKartBakiye.get(secilenKartIndex)-SepetTutar);
          //  arrayListKartBakiye.remove(secilenKartIndex+1);
            setKartBakiye(arrayListKartBakiye.get(secilenKartIndex));
            System.out.println("Odeme alindi! Siparisiniz basarili bir sekilde olusturuldu.");
            System.out.println(getKartName() + " Kart Bakiye : " + getKartBakiye());



            return true;

        }
        return false; //default değer
    }
        




    public String getKartName() {
        return kartName;
    }

    public void setKartName(String kartName) {
        this.kartName = kartName;
    }

    public double getKartNo() {
        return kartNo;
    }

    public void setKartNo(double kartNo) {
        this.kartNo = kartNo;
    }

    public int getCCV() {
        return CCV;
    }

    public void setCCV(int CCV) {
        this.CCV = CCV;
    }

    public double getKartBakiye() {
        return kartBakiye;
    }

    public void setKartBakiye(double kartBakiye) {
        this.kartBakiye = kartBakiye;
    }

    public static int getSayac() {
        return sayac;
    }

    public static void setSayac(int sayac) {
        KartBilgi.sayac = sayac;
    }


    public static int getSecilenKartIndex() {
        return secilenKartIndex;
    }

    public static void setSecilenKartIndex(int secilenKartIndex) {
        KartBilgi.secilenKartIndex = secilenKartIndex;
    }
}
