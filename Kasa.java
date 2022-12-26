public class Kasa extends Donanim{

    private String parcaTurAd="CPU";
    private String kasaAd = "null";
    private float kasaFiyat = 0;
    int urunsec=0;


    Kasa(Kullanici kullanici,String parcaTurAd, String parcaAd,float parcaFiyat) {
        super(kullanici,parcaTurAd,parcaAd,parcaFiyat);
        this.parcaTurAd = parcaTurAd;
    }

    Kasa(Kullanici kullanici,String parcaTurAd) {
        super(kullanici,parcaTurAd);
    }


    @Override
    public int UrunSec() { //2


    //Anakart kasaya uyumlu olmalı, anakart ATX boyutunda ise kasa da ATX boyutu desteklemeli

        System.out.println("     KASALAR     ");
        System.out.println("--------------------");
        System.out.println("1-MSI MPG GUNGNIR 110R TEMPERED GLASS 4x120mm ARGB FANLI MidT ATX KASA");
        System.out.println("2-ASUS TUF GAMING GT502 TEMPERLI CAM USB TYPE-C SIYAH ATX MID-TOWER GAMING (OYUNCU) KASA");
        System.out.println("3-COOLER MASTER MASTERBOX TD500 650W 80PLUS BRONZE 4x120mm ARGB FANLI SİYAH KASA");
        System.out.println("4-RAMPAGE HACKER 4x120mm RGB FANLI 600W 80PLUS BRONZE MidT ATX GAMING KASA");
        System.out.println("5-FRISBY MESH 4x120mm Dual-Ring RGB 600W 80 PLUS USB3.0 MidT ATX GAMING KASA");
        System.out.println("6-COUGAR MX440 MESH RGB 4x120mm RGB FANLI VTE X2 750W 80PLUS BRONZE MidT ATX KASAv");

        System.out.print("Seciminiz :  ");
        urunsec = scanner.nextInt();

        while ( urunsec<1 || urunsec>6) //try-catch gelecek
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
            urunsec = scanner.nextInt();
        }

        switch (urunsec)
        {
            case 1 :
                setParcaAd("MSI MPG GUNGNIR 110R TEMPERED GLASS 4x120mm ARGB FANLI MidT ATX KASA");
                setParcaFiyat(2671.9F);
                break;

            case 2 :
                setParcaAd("ASUS TUF GAMING GT502 TEMPERLI CAM USB TYPE-C SIYAH ATX MID-TOWER GAMING (OYUNCU) KASA");
                setParcaFiyat(4599.88F);
                break;

            case 3 :
                setParcaAd("COOLER MASTER MASTERBOX TD500 650W 80PLUS BRONZE 4x120mm ARGB FANLI SİYAH KASA");
                setParcaFiyat(3721.5F);
                break;

            case 4 :
                setParcaAd("RAMPAGE HACKER 4x120mm RGB FANLI 600W 80PLUS BRONZE MidT ATX GAMING KASA");
                setParcaFiyat(1985F);
                break;

            case 5 :
                setParcaAd("FRISBY MESH 4x120mm Dual-Ring RGB 600W 80 PLUS USB3.0 MidT ATX GAMING KASA");
                setParcaFiyat(1908F);
                break;

            case 6 :
                setParcaAd("COUGAR MX440 MESH RGB 4x120mm RGB FANLI VTE X2 750W 80PLUS BRONZE MidT ATX KASA");
                setParcaFiyat(3394F);
                break;

        }

        return urunsec;

    }




    @Override
    public void ParcaBilgilendirme() { //1

        setParcaTurAd("Kasa"); //Donanim classında CPU ile ilgili işlemler yapılması için

        System.out.println();
        System.out.println(" ---------------------------------------- KASA ---------------------------------------- \n");
        System.out.println("Bilgisayar kasası, içine yerleştirilecek olan bilgisayar bileşenlerini dışarıdan gelebilecek \n" +
                "fiziksel darbelere karşı korur, elektriksel olarak yalıtır, sahip olduğu fanlarla içerideki sıcak havayı \n" +
                "dışarı atar. İçinde 1 tane anakart takma tepsisi, güç kaynağı yuvası, sabit disk ve CD-ROM sürücü gibi \n" +
                "aygıtların yerleştirilebildiği 5,25 ve 3,5 inçlik yuvalar, arka tarafında soket boşlukları vardır.\n" +
                "\n" +
                "1 tane yeniden başlatma, 1 açma düğmesi ve 1 tane de kilit düğmesine sahip olabilir. Yatay ve dikey \n" +
                "yerleştirilebilenleri, alüminyum veya çelikten yapılanları, birkaç farklı boyda olanları vardır.Bilgisayar\n" +
                "kasası bilgisayarın aynı zamanda sistem birimidir.\n");

        System.out.println("\n");

    }

    @Override
    public void TeknikBilgi() { //3


        System.out.println("\n");
        System.out.println(urunsec + ". " + getParcaAd() + " TASARIMI :");
        System.out.println("________________________________________________\n");

        switch (urunsec)
        {
            case 1 :
                System.out.println("Tip\tPC\n" +
                        "İletişim LED göstergeleri\tHDD\n" +
                        "Raf montajı\tYok\n" +
                        "Işıklandırma rengi\tÇok aşamalı\n" +
                        "Gelişmiş kablo yönetimi\tVar\n" +
                        "Ürün rengi\tSiyah\n" +
                        "Işıklandırma yeri\tBilgisayar soğutucu\n" +
                        "Genişleme yeri sayısı\t7\n" +
                        "Aydınlatme\tVar\n" +
                        "Gömme hoparlörler\tYok\n" +
                        "Toz önleyici filtre\tVar\n" +
                        "3.5\" bölme sayısı\t2\n" +
                        "Form faktörü\tMidi Dikey (Tower)\n" +
                        "Reset tuşu\tVar\n" +
                        "Taşıma tekerleri\tYok\n" +
                        "Yan penceere\tVar\n" +
                        "İç 3.5\" bölme sayısı\t2\n" +
                        "Maksimum PSU uzunluğu\t25 cm\n" +
                        "Açma/kapama düğmesi\tVar\n" +
                        "Malzeme\tMetal, Plastik, SPCC, Temperli cam\n" +
                        "Uygunluk\tOyun");
                System.out.println();
                break;

            case 2 :
                System.out.println("\n" +
                        "Anakart Desteği\tATX, Micro-ATX, Mini-ITX\n" +
                        "Sürücü Yuvaları\t4 x 2.5 inç /3.5 inç Combo\n" +
                        "Genişleme Yuvaları\t8 + 3\n" +
                        "Ön G/Ç Portlar\t1 x USB 3.2 Gen2 Type-C, 2 x USB 3.2 Gen1, 1 x Kulaklık/Mikrofon, LED Kontrol Düğmesi\n" +
                        "Temperli Cam\tÖn Panel, Sol Panel\n" +
                        "Çıkarılabilir Toz Filtreleri\tÜst, Alt, Sağ\n" +
                        "Boyutlar\t285 x 450 x 446 mm\n" +
                        "Ağırlık\t11 Kg\n" +
                        "Fan Desteği\n" +
                        "Üst (Ana Oda)\t3 x 120 mm / 2 x 140 mm\n" +
                        "Yan (Ana Oda)\t3 x 120 mm\n" +
                        "Yan (Arka Oda)\t3 x 120 mm / 2 x 140 mm\n" +
                        "Alt (Ana Oda)\t3 x 120 mm\n" +
                        "Arka (Ana Oda)\t1 x 120 mm\n" +
                        "Radyatör Desteği\n" +
                        "Üst (Ana Oda)\t120 mm / 140 mm / 240 mm / 280 mm / 360 mm\n" +
                        "Yan (Arka Oda)\t120 mm / 240 mm / 360 mm\n" +
                        "Arka (Ana Oda)\t120 mm\n" +
                        "Uyumluluk\n" +
                        "Maks. CPU Soğutucu Yüksekliği\t163 mm\n" +
                        "Maks. GPU Uzunluğu\t400 mm\n" +
                        "Maks. PSU Uzunluğu\t200 mm\n" +
                        "Anakart Desteği\tATX, Micro-ATX, Mini-ITX");
                System.out.println();
                break;

            case 3 :
                System.out.println("Fan Boyutu\t120mm\n" +
                        "Yapı\tMiddle Tower\n" +
                        "Güç Kaynağı\tYok\n" +
                        "Verimlilik\t80 Plus Bronze\n" +
                        "Dahili Fan Sayısı\t4\n" +
                        "Fan Tipi\tARGB\n" +
                        "Fan Yuva Sayısı (Toplam)\t7\n" +
                        "Ekran Kartı Desteği Maks.\t410mm\n" +
                        "Radyatör Boyutu\t120mm\n" +
                        "Radyatör Boyutu\t240mm\n" +
                        "Radyatör Boyutu\t360mm\n" +
                        "Cpu Soğutucu Yüksekliği\t165mm\n" +
                        "3.5\" Yuva Sayısı\t2\n" +
                        "2.5\" Yuva Sayısı\t4\n" +
                        "USB Sayısı\t2\n" +
                        "Ses Çıkışı\tVar\n" +
                        "Mikrofon Çıkışı\tVar\n" +
                        "Kasa Boyutu\t493 x 217 x 469mm\n" +
                        "Güç Değeri\t650W\n" +
                        "Anakart Yapı\tMini ITX\n" +
                        "Anakart Yapı\tATX\n" +
                        "Anakart Yapı\tMicro ATX");
                System.out.println();
                break;

            case 4 :
                System.out.println("Fan Boyutu\t120mm RGB\n" +
                        "Yapı\tMiddle Tower\n" +
                        "Güç Kaynağı\tVar\n" +
                        "Verimlilik\t80 Plus Bronze\n" +
                        "Dahili Fan Sayısı\t4\n" +
                        "Fan Tipi\tRGB\n" +
                        "Fan Yuva Sayısı (Toplam)\t6\n" +
                        "Ekran Kartı Desteği Maks.\t400mm\n" +
                        "Radyatör Boyutu\t240mm\n" +
                        "Radyatör Boyutu\t120mm\n" +
                        "Cpu Soğutucu Yüksekliği\t160mm\n" +
                        "3.5\" Yuva Sayısı\t2\n" +
                        "2.5\" Yuva Sayısı\t2\n" +
                        "USB Sayısı\t3\n" +
                        "Ses Çıkışı\tVar\n" +
                        "Mikrofon Çıkışı\tVar\n" +
                        "Güç Değeri\t600W\n" +
                        "Anakart Yapı\tMicro ATX\n" +
                        "Anakart Yapı\tATX");
                System.out.println();
                break;

            case 5 :
                System.out.println("Fan Boyutu\t120 mm\n" +
                        "Yapı\tMiddle Tower\n" +
                        "Güç Kaynağı\tVar\n" +
                        "Verimlilik\t80 Plus\n" +
                        "Dahili Fan Sayısı\t4\n" +
                        "Fan Tipi\tRGB\n" +
                        "Fan Yuva Sayısı (Toplam)\t6\n" +
                        "Ekran Kartı Desteği Maks.\t350 mm\n" +
                        "Radyatör Boyutu\t120mm\n" +
                        "Radyatör Boyutu\t240mm\n" +
                        "Cpu Soğutucu Yüksekliği\t160 mm\n" +
                        "3.5\" Yuva Sayısı\t2\n" +
                        "2.5\" Yuva Sayısı\t3\n" +
                        "USB Sayısı\t2\n" +
                        "Ses Çıkışı\tVar\n" +
                        "Mikrofon Çıkışı\tVar\n" +
                        "Kasa Boyutu\t405 x 192 x 435 mm\n" +
                        "Güç Değeri\t600 W\n" +
                        "Anakart Yapı\tMini ITX\n" +
                        "Anakart Yapı\tATX\n" +
                        "Anakart Yapı\tMicro ATX");
                System.out.println();
                break;

            case 6 :
                System.out.println("Fan Boyutu\t120mm\n" +
                        "Yapı\tMiddle Tower\n" +
                        "Güç Kaynağı\tVar\n" +
                        "Verimlilik\t80 Plus Bronze\n" +
                        "Dahili Fan Sayısı\t4\n" +
                        "Fan Tipi\tRGB\n" +
                        "Fan Yuva Sayısı (Toplam)\t6\n" +
                        "Ekran Kartı Desteği Maks.\t320mm\n" +
                        "Radyatör Boyutu\t120mm\n" +
                        "Radyatör Boyutu\t240mm\n" +
                        "Radyatör Boyutu\t140mm\n" +
                        "Radyatör Boyutu\t280mm\n" +
                        "Radyatör Boyutu\t360mm\n" +
                        "Cpu Soğutucu Yüksekliği\t170mm\n" +
                        "3.5\" Yuva Sayısı\t2\n" +
                        "2.5\" Yuva Sayısı\t4\n" +
                        "USB Sayısı\t3\n" +
                        "Ses Çıkışı\tVar\n" +
                        "Mikrofon Çıkışı\tVar\n" +
                        "Kasa Boyutu\t215 x 505 x 424 mm\n" +
                        "Güç Değeri\t750W\n" +
                        "Anakart Yapı\tMicro ATX\n" +
                        "Anakart Yapı\tATX\n" +
                        "Anakart Yapı\tMini ITX");
                System.out.println();
                break;

        }


    }

    public String getKasaAd() {
        return kasaAd;
    }

    public void setKasaAd(String kasaAd) {
        this.kasaAd = kasaAd;
    }

    public float getKasaFiyat() {
        return kasaFiyat;
    }

    public void setKasaFiyat(float kasaFiyat) {
        this.kasaFiyat = kasaFiyat;
    }
}
