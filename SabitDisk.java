public class SabitDisk extends Donanim{

    private String parcaTurAd="CPU";
    private String sabitDiskAd = "null";
    private float sabitDiskFiyat = 0;
    boolean destek = false;
    int urunsec=0;
    int secenek =0;


    SabitDisk(Kullanici kullanici,String parcaTurAd, String parcaAd,float parcaFiyat) {
        super(kullanici,parcaTurAd,parcaAd,parcaFiyat);
        this.parcaTurAd = parcaTurAd;
    }

    SabitDisk(Kullanici kullanici,String parcaTurAd) {
        super(kullanici,parcaTurAd);
    }


    @Override
    public int UrunSec() { //2


        System.out.println("     SABIT DISKLER     ");
        System.out.println("-----------------------");

        AnaKart anaKartClass = new AnaKart(kullanici);

        //Anakartta M.2 desteği yoksa M.2 SSD alınmamalı. Onun yerine SATA SSD tercih edilmeli (veya hdd).

        if(anaKartClass.getM2destek()==true)
        {
            destek = true;
            secenek=6;
            System.out.println("1-Crucial 240GB BX500 Serisi 3D NAND Sata 3.0 SSD (Okuma 540MB / Yazma 500MB)");
            System.out.println("2-Toshiba 3.5\" 6TB S300 SATA 3.0Gb 256MB Önbellek 5400Rpm 7/24 Güvenlik Diski");
            System.out.println("3-Kioxia 480GB Exceria Serisi Sata 3.0 SSD (555MB Okuma / 540MB Yazma");
            System.out.println("4-Samsung 500GB 980 NVMe M.2 SSD (Okuma Hızı 3100MB / Yazma Hızı 2600MB");
            System.out.println("5-Micron 960GB 5300 PRO SATA 2.5\" (7mm) Non-SED Cloud (Server) SSD");
            System.out.println("6-Kingston 2TB XS2000 Serisi USB 3.2 Harici SSD");

        }
        else
        {
            destek = false;
            secenek=4;
            System.out.println("1-Kingston 480 GB A400 SSDNow SA400S37/480G 2.5\" SATA 3.0 SSD");
            System.out.println("2-Samsung 1TB 870 EVO SATA 3.0 (Okuma 560MB / Yazma 530MB)");
            System.out.println("3-WD Green 480GB 545-465MB/s SSD Disk WDS480G2G0A");
            System.out.println("4-Toshiba 3.5\" 1TB P300 SATA 3.0 64MB Önbellek 7200 Rpm Harddisk");
        }

        System.out.print("Seciminiz :  ");
        urunsec = scanner.nextInt();

        while ( urunsec<1 || urunsec>secenek) //try-catch gelecek
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
            urunsec = scanner.nextInt();
        }


        if(destek)
        {
            switch (urunsec)
            {
                case 1 :
                    setParcaAd("Crucial 240GB BX500 Serisi 3D NAND Sata 3.0 SSD (Okuma 540MB / Yazma 500MB");
                    setParcaFiyat(531F);
                    break;

                case 2 :
                    setParcaAd("Toshiba 3.5\" 6TB S300 SATA 3.0Gb 256MB Önbellek 5400Rpm 7/24 Güvenlik Diski");
                    setParcaFiyat(3189.99F);
                    break;

                case 3 :
                    setParcaAd("Kioxia 480GB Exceria Serisi Sata 3.0 SSD (555MB Okuma / 540MB Yazma");
                    setParcaFiyat(715.85F);
                    break;

                case 4 :
                    setParcaAd("Samsung 500GB 980 NVMe M.2 SSD (Okuma Hızı 3100MB / Yazma Hızı 2600MB");
                    setParcaFiyat(1088.88F);
                    break;

                case 5 :
                    setParcaAd("Micron 960GB 5300 PRO SATA 2.5\" (7mm) Non-SED Cloud (Server) SSD");
                    setParcaFiyat(4535F);
                    break;

                case 6 :
                    setParcaAd("Kingston 2TB XS2000 Serisi USB 3.2 Harici SSD");
                    setParcaFiyat(6788F);
                    break;

            }
        }
        else
        {
            switch (urunsec)
            {
                case 1 :
                    setParcaAd("Kingston 480 GB A400 SSDNow SA400S37/480G 2.5\" SATA 3.0 SSD");
                    setParcaFiyat(524.84F);
                    break;

                case 2 :
                    setParcaAd("Samsung 1TB 870 EVO SATA 3.0 (Okuma 560MB / Yazma 530MB)");
                    setParcaFiyat(2168F);
                    break;

                case 3 :
                    setParcaAd("WD Green 480GB 545-465MB/s SSD Disk WDS480G2G0A");
                    setParcaFiyat(591.5F);
                    break;
                case 4 :
                    setParcaAd("Toshiba 3.5\" 1TB P300 SATA 3.0 64MB Önbellek 7200 Rpm Harddisk");
                    setParcaFiyat(887F);
                    break;
            }
        }


        return urunsec;

    }




    @Override
    public void ParcaBilgilendirme() { //1

        setParcaTurAd("SabitDisk"); //Donanim classında CPU ile ilgili işlemler yapılması için

        System.out.println();
        System.out.println(" ---------------------------------------- SABIT DISK ---------------------------------------- \n");
        System.out.println("Sabit disk ya da Hard disk kısaca HDD ya da Türkçesi ile sabit disk sürücüsü veri depolanması amacı \n" +
                "ile kullanılan manyetik kayıt ortamlarıdır. Önceleri büyük boyutları ve yüksek fiyatları nedeni ile sadece\n" +
                "bilgisayar merkezlerinde kullanılan sabit diskler, cep telefonları ve sayısal fotoğraf makineleri içine \n" +
                "sığabilecek kadar küçülen boyutları ile günlük hayatımıza girmişlerdir.\n" +
                "\n" +
                "Sabit disklerin en yoğun kullanım yeri bilgisayarlardır. Ses, görüntü, yazılımlar, veritabanları gibi büyük \n" +
                "miktarlarda bilgi, gerektiğinde kullanılmak üzere sabit disklerde saklanır. Günümüzde sabit diskler veri \n" +
                "aktarımında son derece hızlanmış olsalar da elektromekanik yapıda olduklarından RAM'lara göre yavaştırlar. \n" +
                "Bilgisayarlarda yardımcı ve kalıcı bellek olarak kullanılırlar. Bir bilgisayar yazılımı işletilmeye başladığında, \n" +
                "yazılımın çalışması için gerekli olan bilgiler sabit diskten okunarak çok daha hızlı olan RAM belleğe aktarılır. \n" +
                "Gereksinim duyulan kısım RAM'a sığmayacak kadar büyükse, bilgisayar sabit diskin bir bölümünü RAM bellek gibi kullanır.\n" +
                "\n" +
                "Bilgisayar sabit diskleri genellikle bilgisayarların içinde sabitlenmiş durumda bulunurlar, bilgisayarlara dışarıdan \n" +
                "bağlanabilen taşınabilir olanları da vardır.");

        System.out.println("\n");

    }

    @Override
    public void TeknikBilgi() { //3


        System.out.println("\n");
        System.out.println(urunsec + ". " + getParcaAd() + " GENEL OZELLIKLERI :");
        System.out.println("________________________________________________\n");


        if(destek)
        {
            switch (urunsec)
            {
                case 1 :
                    System.out.println("ECC\tVar\n" +
                            "TRIM desteği\tVar\n" +
                            "SSD form faktörü\t2.5\"\n" +
                            "Okuma hızı, ortam\t540 MB/s\n" +
                            "Bileşen\tPC\n" +
                            "SSD sıcaklık gözleme\tVar\n" +
                            "Standart bağlantı\tSerial ATA III\n" +
                            "MTBF aralığı\t1500000 Saat\n" +
                            "S.M.A.R.T. destek\tVar\n" +
                            "Veri aktarım hızı\t6 Gbit/s\n" +
                            "Yazma hızı, ortam\t500 MB/s\n" +
                            "Hafıza tipi\t3D NAND");
                    System.out.println();
                    break;

                case 2 :
                    System.out.println("Bağlantı Arayüzü\tSata 6Gb/s\n" +
                            "Disk Kapasitesi\t6TB\n" +
                            "HDD Dönüş Hızı\t5400 RPM\n" +
                            "Ön Bellek\t256MB\n" +
                            "Boyut (inch)\t3.5\"\n" +
                            "Model Serisi\tHDWT860UZSVA");
                    System.out.println();
                    break;

                case 3 :
                    System.out.println("MTBF aralığı\t1500000 Saat\n" +
                            "Hafıza tipi\tTLC 3D NAND\n" +
                            "TRIM desteği\tVar\n" +
                            "NVMe\tYok\n" +
                            "Veri aktarım hızı\t6 Gbit/s\n" +
                            "Okuma hızı, ortam\t555 MB/s\n" +
                            "TBW sınıfı\t120\n" +
                            "Yazma hızı, ortam\t540 MB/s\n" +
                            "Bileşen\tLaptop\n" +
                            "SSD form faktörü\t2.5\"\n" +
                            "Rastgele yaz (4KB)\t88000 IOPS\n" +
                            "Rastgele oku (4KB)\t82000 IOPS\n" +
                            "Standart bağlantı\tSerial ATA III");
                    System.out.println();
                    break;

                case 4 :
                    System.out.println("SSD form faktörü\tM.2\n" +
                            "S.M.A.R.T. destek\tVar\n" +
                            "Rastgele oku (4KB)\t400000 IOPS\n" +
                            "NVMe\tVar\n" +
                            "MTBF aralığı\t1500000 Saat\n" +
                            "Rastgele yaz (4KB)\t470000 IOPS\n" +
                            "NVMe sürümü\t44652\n" +
                            "Bileşen\tBilgisayar / laptop\n" +
                            "Standart bağlantı\tPCI Express 3.0\n" +
                            "Okuma hızı, ortam\t3100 MB/s\n" +
                            "Yazma hızı, ortam\t2600 MB/s\n" +
                            "Hafıza tipi\tV-NAND\n" +
                            "Donanım şifreleme\tVar");
                    System.out.println();
                    break;

                case 5 :
                    System.out.println("Hafıza tipi\t3D TLC\n" +
                            "Veri aktarım hızı\t6 Gbit/s\n" +
                            "Bileşen\tBilgisayar / laptop\n" +
                            "Yazma hızı, ortam\t520 MB/s\n" +
                            "Rastgele yaz (4KB)\t35 IOPS\n" +
                            "Rastgele oku (4KB)\t95 IOPS\n" +
                            "SSD form faktörü\t2.5\"\n" +
                            "Standart bağlantı\tSerial ATA III\n" +
                            "MTBF aralığı\t3000000 Saat\n" +
                            "Okuma hızı, ortam\t540 MB/s\n");
                    System.out.println();
                    break;

                case 6 :
                    System.out.println("Bağlantı Arayüzü\tUSB 3.2\n" +
                            "Kapasite\t2 TB\n" +
                            "SSD Tipi\tHarici SSD");
                    System.out.println();
                    break;
            }
        }
        else
        {
            switch (urunsec)
            {
                case 1 :
                    System.out.println("Sabit Sürücü Boyutu\t\u200E480 GB\n" +
                            "Sabit Disk Açıklaması\t\u200EKatı Hal Sürücü\n" +
                            "Sabit Sürücü Arabirimi\t\u200ESerial ATA-600\n" +
                            "Sabit Disk Dönüş Hızı\t\u200E2\n" +
                            "Kablosuz Türü\t\u200E802.11a\n" +
                            "Voltaj\t\u200E220\n" +
                            "Watt Değeri\t\u200E1\n" +
                            "Güç Kaynağı\t\u200EEl ile çalışır\n" +
                            "Donanım Platformu\t\u200ERefer_Manual\n" +
                            "İşletim Sistemi\t\u200EJa");
                    System.out.println();
                    break;

                case 2 :
                    System.out.println("Okuma hızı, ortam\t560 MB/s\n" +
                            "TRIM desteği\tVar\n" +
                            "Standart bağlantı\tSerial ATA III\n" +
                            "MTBF aralığı\t1500000 Saat\n" +
                            "TBW sınıfı\t2400\n" +
                            "S.M.A.R.T. destek\tVar\n" +
                            "SSD form faktörü\t2.5\"\n" +
                            "Hafıza tipi\tV-NAND MLC\n" +
                            "Yazma hızı, ortam\t530 MB/s\n" +
                            "Veri aktarım hızı\t6 Gbit/s\n" +
                            "Rastgele yaz (4KB)\t88000 IOPS\n" +
                            "Rastgele oku (4KB)\t98000 IOPS\n" +
                            "Bileşen\tPC");
                    System.out.println();
                    break;

                case 3 :
                    System.out.println("Bellek Kapasitesi 480 GB\n" +
                            "Disk Boyutu\t2.5 inç\n" +
                            "Ağırlık\t32.7 Gr\n" +
                            "Max Okuma Hızı\t545 MB/s\n" +
                            "Renk\tYeşil\n" +
                            "Darbe Dayanıklılığı\t1500G/0.5ms\n" +
                            "MTBF\t1,000,000 saat\n" +
                            "Titreşim\t5 gRMS\n" +
                            "Yükseklik\t7 mm\n" +
                            "Çalışma Sıcaklığı\t0 ° C ~ 70 ° C\n" +
                            "Sertifikalar\tFCC / UL / TUV / KC / BSMI / VCCI");
                    System.out.println();
                    break;

                case 4 :
                    System.out.println("Tip\tHDD\n" +
                            "Bileşen\tPC\n" +
                            "Standart bağlantı\tSerial ATA III\n" +
                            "Sabit disk sürücüsü hızı\t7200 RPM\n" +
                            "Sabit disk boyutu\t3.5\"\n" +
                            "Ortalama latens\t4,17 ms");
                    System.out.println();
                    break;


            }
        }



    }

    public String getSabitDiskAd() {
        return sabitDiskAd;
    }

    public void setSabitDiskAd(String sabitDiskAd) {
        this.sabitDiskAd = sabitDiskAd;
    }

    public float getSabitDiskFiyat() {
        return sabitDiskFiyat;
    }

    public void setSabitDiskFiyat(float sabitDiskFiyat) {
        this.sabitDiskFiyat = sabitDiskFiyat;
    }
}
