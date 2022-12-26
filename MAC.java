
public class MAC extends HazirBilgisayarSec{

    private String macSeriAd;
    private String macBilgisayarAd;
    private float macFiyat;

    MAC(Kullanici kullanici,String marka) {
        super(kullanici,marka);
    }

    @Override
    void MarkaninBilgisayarSerileri() {

        int seriSec=0;
        System.out.println(" ------MAC Serileri------ ");
        System.out.println("1- MacBook Air Serisi");
        System.out.println("2- MacBook Pro Serisi");
        System.out.print("Seciminiz : ");
        seriSec = scanner.nextInt();

        while(seriSec <1 || seriSec>2)
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin :");
            seriSec = scanner.nextInt();
        }


        switch (seriSec)
        {
            default:
            case 1: //MacBookAir();
                setMacSeriAd("MacBookAir");
                setMarkaSeriAd("MacBookAir");
                setMarka("MAC");
                int macSec=0;
                System.out.println("1-) 2020 Apple MacBook Air Laptop");
                System.out.println("2-) M2 çipli 2022 Apple MacBook Air Laptop");
                System.out.print("Seciminiz : ");
                macSec = scanner.nextInt();

                try {
                    if (macSec==1)
                    {
                        setMacBilgisayarAd("2020 Apple MacBook Air Laptop");
                        setMacFiyat(19299.00F);

                        setMarkaBilgisayarAd("2020 Apple MacBook Air Laptop");
                        setMarkaBilgisayarFiyat(19299.00F);

                    }
                    else if(macSec==2)
                    {
                        setMacBilgisayarAd("M2 çipli 2022 Apple MacBook Air Laptop");
                        setMacFiyat(30468.00F);

                        setMarkaBilgisayarAd("M2 çipli 2022 Apple MacBook Air Laptop");
                        setMarkaBilgisayarFiyat(30468.00F);

                    }
                    else {
                        throw new Exception("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
                    }
                }
                catch(Exception hata) {
                    System.out.println();
                    System.out.println(hata.getMessage());
                    System.out.println("");
                    MarkaninBilgisayarSerileri();

                }
                break;
            case 2: //MacBookPro();
                setMacSeriAd("MacBookPro");
                setMarkaSeriAd("MacBookPro");
                setMarka("MAC");
                int macpSec=0;
                System.out.println("1-) Apple MacBook Pro 13inç M1");
                System.out.println("2-) Apple MacBook Pro 13inç M2");
                System.out.print("Seciminiz : ");
                macpSec = scanner.nextInt();

                try {
                    if (macpSec==1)
                    {
                        setMacBilgisayarAd("Apple MacBook Pro 13inç M1");
                        setMacFiyat(19299.00F);

                        setMarkaBilgisayarAd("Apple MacBook Pro 13inç M1");
                        setMarkaBilgisayarFiyat(19299.00F);

                    }
                    else if(macpSec==2)
                    {
                        setMacBilgisayarAd("Apple MacBook Pro 13inç  M2");
                        setMacFiyat(30468.00F);

                        setMarkaBilgisayarAd("Apple MacBook Pro 13inç  M2");
                        setMarkaBilgisayarFiyat(30468.00F);

                    }
                    else {
                        throw new Exception("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
                    }
                }
                catch(Exception hata) {
                    System.out.println();
                    System.out.println(hata.getMessage());
                    System.out.println("");
                    MarkaninBilgisayarSerileri();

                }
                break;
        }
    }

    @Override
    void TeknikBilgi() {
        if(getMacSeriAd().equalsIgnoreCase("MacBookAir")) {
            if( getMacBilgisayarAd().equals("2020 Apple MacBook Air Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Marka: Apple\r\n"
                        + "• Model Adı: MacBook Air\r\n"
                        + "• Ekran Boyutu:13 İnç\r\n"
                        + "• Sabit Disk Boyutu: 256\r\n"
                        + "• CPU Modeli: Apple M1\r\n"
                        + "• Kurulu RAM Belleği Boyutu: 8 GB\r\n"
                        + "• İşletim Sistemi: Mac OS\r\n"
                        + "• Önemli Özellik: Yerleşik web kamerası\r\n"
                        + "• Grafik Kartı Açıklaması: Tümleşik\r\n");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getMacBilgisayarAd().equals("M2 çipli 2022 Apple MacBook Air Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Marka	Apple\r\n"
                        + "• Model Adı: MacBook Air\r\n"
                        + "• Ekran Boyutu:13.6 İnç\r\n"
                        + "• Sabit Disk Boyutu: 512 GB\r\n"
                        + "• CPU Modeli: Others\r\n"
                        + "• Kurulu RAM Belleği Boyutu: 8 GB\r\n"
                        + "• İşletim Sistemi: Mac OS\r\n"
                        + "• Önemli Özellik: Parmak İzi Okuyucu, Arkadan Aydınlatmalı Klavye\r\n"
                        + "• Grafik Kartı Açıklaması: Tümleşik\r\n");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }
        if(getMacSeriAd().equalsIgnoreCase("MacBookPro")) {
            if( getMacBilgisayarAd().equals("Apple MacBook Pro 13inç M1")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("• Marka: Apple\r\n"
                        + "• Model Adı: MacBook Pro\r\n"
                        + "• Ekran Boyutu:13.3 inç\r\n"
                        + "• Ekran Kartı Modeli: Apple GPU\r\n"
                        + "• Sabit Disk Boyutu: 256\r\n"
                        + "• CPU Modeli: Apple M1\r\n"
                        + "• Kurulu RAM Belleği Boyutu: 8 GB\r\n"
                        + "• İşletim Sistemi: Mac OS\r\n"
                        + "• İşletim Sistemi Yazlımı: macOS Big Sur");
                System.out.println("\n-------------------------------------------------------------------------------");

                System.out.println("");
            }
            else if( getMacBilgisayarAd().equals("Apple MacBook Pro 13inç  M2")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Marka	Apple\r\n"
                        + "• Model Adı: MacBook Pro\r\n"
                        + "• Ekran Boyutu:13.3 inç\r\n"
                        + "• Sabit Disk Boyutu: 256 GB\r\n"
                        + "• CPU Modeli: Apple M2\r\n"
                        + "• Kurulu RAM Belleği Boyutu: 8 GB\r\n"
                        + "• İşletim Sistemi: Mac OS\r\n"
                        + "• İşletim Sistemi: macOS Monterey");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }
    }

    public String getMacSeriAd() {
        return macSeriAd;
    }

    public void setMacSeriAd(String macSeriAd) {
        this.macSeriAd = macSeriAd;
    }

    public float getMacFiyat() {
        return macFiyat;
    }

    public void setMacFiyat(float macFiyat) {
        this.macFiyat = macFiyat;
    }

    public String getMacBilgisayarAd() {
        return macBilgisayarAd;
    }

    public void setMacBilgisayarAd(String macBilgisayarAd) {
        this.macBilgisayarAd = macBilgisayarAd;
    }

}