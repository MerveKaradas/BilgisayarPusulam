public class GucKaynagi extends Donanim{

    private String parcaTurAd="CPU";
    private String cpuAd = "null";
    private float cpuFiyat = 0;
    int urunsec=0;


    GucKaynagi(Kullanici kullanici,String parcaTurAd, String parcaAd,float parcaFiyat) {
        super(kullanici,parcaTurAd,parcaAd,parcaFiyat);
        this.parcaTurAd = parcaTurAd;
    }

    GucKaynagi(Kullanici kullanici,String parcaTurAd) {
        super(kullanici,parcaTurAd);
    }


    @Override
    public int UrunSec() { //2


        System.out.println("     GUC KAYNAKLARI     ");
        System.out.println("------------------------");
        System.out.println("1-ZALMAN ZM1200-EBTII WATTTERA 80PLUS GOLD 1200W GÜÇ KAYNAĞI");
        System.out.println("2-ASUS ROG STRIX WHITE 850W 80 PLUS GOLD GÜÇ KAYNAĞI");
        System.out.println("3-ASUS ROG THOR 850W 80 PLUS PLATINUM AURO SYNC & OLED EKRANLI GÜÇ KAYNAĞI");
        System.out.println("4-THERMALTAKE TOUGHPOWER GRAND 80PLUS PLATINUM 1050W GÜÇ KAYNAĞI");
        System.out.println("5-POWERBOOST 2000W 140mm FANLI GÜÇ KAYNAĞI");
        System.out.println("6-COOLER MASTER XG PLUS 850W 80+ PLATINYUM RGB FULL MODÜLER GÜÇ KAYNAĞI");
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
                setParcaAd("ZALMAN ZM1200-EBTII WATTTERA 80PLUS GOLD 1200W GÜÇ KAYNAĞI");
                setParcaFiyat(5834.99F);
                break;

            case 2 :
                setParcaAd("ASUS ROG STRIX WHITE 850W 80 PLUS GOLD GÜÇ KAYNAĞI");
                setParcaFiyat(5768.89F);
                break;

            case 3 :
                setParcaAd("ASUS ROG THOR 850W 80 PLUS PLATINUM AURO SYNC & OLED EKRANLI GÜÇ KAYNAĞI"); // değiş
                setParcaFiyat(7203.1F);
                break;

            case 4 :
                setParcaAd("THERMALTAKE TOUGHPOWER GRAND 80PLUS PLATINUM 1050W GÜÇ KAYNAĞI");
                setParcaFiyat(5187.5F);
                break;

            case 5 :
                setParcaAd("POWERBOOST 2000W 140mm FANLI GÜÇ KAYNAĞI");
                setParcaFiyat(4437.70F);
                break;

            case 6 :
                setParcaAd("COOLER MASTER XG PLUS 850W 80+ PLATINYUM RGB FULL MODÜLER GÜÇ KAYNAĞI");
                setParcaFiyat(6502F);
                break;
        }

        return urunsec;

    }




    @Override
    public void ParcaBilgilendirme() { //1

        setParcaTurAd("GucKaynagi"); //Donanim classında CPU ile ilgili işlemler yapılması için

        System.out.println();
        System.out.println(" ---------------------------------------- GUC KAYNAGI ---------------------------------------- \n");
        System.out.println("Power supply bilinen adıyla güç kaynağı bilgisayarda yer alan donanımları çalıştırarak gereken \n" +
                "enerjinin eşit oranda dağıtılması için kullanılan parça olarak tanımlanır. Power supply olarak bilinen bu parçanın \n" +
                "bir diğer adı da PSU yani power supply unit şeklindedir.\n" +
                "\n" +
                "Güç kaynağı elektrik enerjisini, DC akıma dönüştürür. Buna göre, DC akıma dönüşen enerji bilgisayar için gereken \n" +
                "desteği sağlamış olur.  Bilgisayarlarda geniş yer kaplayan güç kaynağı aynı zamanda farklı cihazların çalışmasında \n" +
                "da aktif rol oynar.\n" +
                "\n" +
                "Genel olarak standart bir bilgisayarda kullanılan güç kaynağı yaklaşık 300 ile 600 Watt değerine sahiptir. \n" +
                "Başlangıçta 220 Watt olan elektrik güç kaynağı daha sonra 6 -12 Watt seviyesine doğru dönüşme sağlar.\n");

        System.out.println("\n");

    }

    @Override
    public void TeknikBilgi() { //3


        System.out.println("\n");
        System.out.println(urunsec + ". " + getParcaAd() + " OZELLIKLERI :");
        System.out.println("________________________________________________\n");

        switch (urunsec)
        {
            case 1 :
                System.out.println("Birleşik güç (+12V)\t1200 W\n" +
                        "güç koruma özellikleri\tAşırı akım, Aşırı güç, Aşırı voltaj, Aşırı ısınma, Kısa devre, Düşük akım\n" +
                        "Güç faktörü\t99\n" +
                        "Verimlilik\t91%\n" +
                        "Birleşik güç (-12V)\t3,6 W\n" +
                        "Toplam güç\t1200 W\n" +
                        "Güç Faktörü Düzeltme türü\tAktif\n" +
                        "Birleşik güç (+5Vsb)\t15 W\n" +
                        "AC girdi frekansı\t50/60 Hz\n" +
                        "Giriş akımı\t6 -12 A\n" +
                        "AC girdi voltajı\t100 - 240 V");
                System.out.println();
                break;

            case 2 :
                System.out.println("Toplam güç\t850 W\n" +
                        "AC girdi voltajı\t100 - 240 V\n" +
                        "güç koruma özellikleri\tAşırı akım, Aşırı güç, Aşırı voltaj, Kısa devre");
                System.out.println();
                break;

            case 3 :
                System.out.println("Verimlilik\t80%\n" +
                        "güç koruma özellikleri\tAşırı akım, Aşırı güç, Aşırı voltaj, Kısa devre\n" +
                        "AC girdi voltajı\t100 - 240 V\n" +
                        "Toplam güç\t852 W");
                System.out.println();
                break;

            case 4 :
                System.out.println("Birleşik güç (+12V)\t1000 W\n" +
                        "güç koruma özellikleri\tAşırı akım, Aşırı güç, Aşırı voltaj, Aşırı ısınma, Kısa devre, Düşük voltaj\n" +
                        "Güç Faktörü Düzeltme türü\tAktif\n" +
                        "AC girdi voltajı\t100 - 240 V\n" +
                        "Birleşik güç (-12V)\t3,6 W\n" +
                        "Verimlilik\t92%\n" +
                        "Birleşik güç (+3.3V)\t120 W\n" +
                        "Bekleme süresi\t16 ms\n" +
                        "Maksimum güç\t1260 W\n" +
                        "Birleşik güç (+5Vsb)\t15 W\n" +
                        "Giriş akımı\t13 A\n" +
                        "Toplam güç\t1050 W\n" +
                        "Birleşik güç (+5V)\t120 W\n" +
                        "AC girdi frekansı\t50 - 60 Hz");
                System.out.println();
                break;

            case 5 :
                System.out.println("Verimlilik\t80 Plus Gold\n" +
                        "Fan Boyutu\t140 mm\n" +
                        "Güç Değeri\t2000 W");
                System.out.println();
                break;

            case 6 :
                System.out.println("AC girdi frekansı\t50/60 Hz\n" +
                        "Verimlilik\t92%\n" +
                        "Birleşik güç (+12V)\t850 W\n" +
                        "Birleşik güç (-12V)\t3,6 W\n" +
                        "Bekleme süresi\t16 ms\n" +
                        "Toplam güç\t850 W\n" +
                        "Giriş akımı\t6 - 12 A\n" +
                        "Birleşik güç (+5Vsb)\t15 W\n" +
                        "AC girdi voltajı\t100 - 240 V\n" +
                        "Güç Faktörü Düzeltme türü\tAktif\n" +
                        "Birleşik güç (+5V)\t120 W\n" +
                        "güç koruma özellikleri\tAşırı akım, Aşırı güç, Aşırı voltaj, Aşırı ısınma, Kısa devre, Düşük voltaj\n" +
                        "Birleşik güç (+3.3V)\t120 W");
                System.out.println();
                break;

        }


    }


}
