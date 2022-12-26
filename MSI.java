
public class MSI extends HazirBilgisayarSec{

    private String msiSeriAd;
    private String msiBilgisayarAd;
    private float msiFiyat;

    MSI(Kullanici kullanici, String marka) {
        super(kullanici, marka);
    }
    void MarkaninBilgisayarSerileri() {

        int seriSec=0;
        System.out.println(" ------MSI Serileri------ ");
        System.out.println("1- Gaming Laptop");
        System.out.println("2- İçerik Üretici Laptoplar");
        System.out.print("Seciminiz : ");
        seriSec = scanner.nextInt();

        while(seriSec <1 || seriSec>2)
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin :");
            seriSec = scanner.nextInt();
        }

        switch (seriSec) {
            default:
            case 1://Gaming
                setMsiSeriAd("Gaming");
                setMarkaSeriAd("Gaming");
                setMarka("MSI");
                int msiSec=0;
                System.out.println("1-) Alpha 17, AMD Advantage™ Edition");
                System.out.println("2-) Delta 15, AMD Advantage™ Edition");
                System.out.println("3-) Bravo 15");
                System.out.println("4-) Crosshair 17 - B12U");
                System.out.print("Seciminiz : ");
                msiSec = scanner.nextInt();

                try {
                    if (msiSec==1)
                    {
                        setMsiBilgisayarAd("Alpha 17, AMD Advantage™ Edition");
                        setMsiFiyat(35999.00F);

                        setMarkaBilgisayarAd("Alpha 17, AMD Advantage™ Edition");
                        setMarkaBilgisayarFiyat(35999.00F);

                    }
                    else if(msiSec==2)
                    {
                        setMsiBilgisayarAd("Delta 15, AMD Advantage™ Edition");
                        setMsiFiyat(31445.00F);

                        setMarkaBilgisayarAd("Delta 15, AMD Advantage™ Edition");
                        setMarkaBilgisayarFiyat(31445.00F);

                    }
                    else if(msiSec==3)
                    {
                        setMsiBilgisayarAd("Bravo 15");
                        setMsiFiyat(28999.00F);

                        setMarkaBilgisayarAd("Bravo 15");
                        setMarkaBilgisayarFiyat(28999.00F);

                    }
                    else if(msiSec==4)
                    {
                        setMsiBilgisayarAd("Crosshair 17 - B12U");
                        setMsiFiyat(27499.00F);

                        setMarkaBilgisayarAd("Crosshair 17 - B12U");
                        setMarkaBilgisayarFiyat(27499.00F);

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
            case 2://IcerikUretici
                setMsiSeriAd("IcerikUretici");
                setMarkaSeriAd("IcerikUretici");
                setMarka("MSI");
                int icerikSec=0;
                System.out.println("1-) CreatorPro X17 - A12U");
                System.out.println("2-) Creator Z17 - A12U");
                System.out.println("3-) Creator Z16 - A12U");
                System.out.println("4-) Creator M16 - A12U");
                System.out.print("Seciminiz : ");
                icerikSec = scanner.nextInt();

                try {
                    if (icerikSec==1)
                    {
                        setMsiBilgisayarAd("CreatorPro X17 - A12U");
                        setMsiFiyat(69000.00F);

                        setMarkaBilgisayarAd("CreatorPro X17 - A12U");
                        setMarkaBilgisayarFiyat(69000.00F);

                    }
                    else if(icerikSec==2)
                    {
                        setMsiBilgisayarAd("Creator Z17 - A12U");
                        setMsiFiyat(68803.00F);

                        setMarkaBilgisayarAd("Creator Z17 - A12U");
                        setMarkaBilgisayarFiyat(68803.00F);

                    }
                    else if(icerikSec==3)
                    {
                        setMsiBilgisayarAd("Creator Z16 - A12U");
                        setMsiFiyat(63999.00F);

                        setMarkaBilgisayarAd("Creator Z16 - A12U");
                        setMarkaBilgisayarFiyat(63999.00F);

                    }
                    else if(icerikSec==4)
                    {
                        setMsiBilgisayarAd("Creator M16 - A12U");
                        setMsiFiyat(59999.00F);

                        setMarkaBilgisayarAd("Creator M16 - A12U");
                        setMarkaBilgisayarFiyat(59999.00F);

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
    void TeknikBilgi() {
        if(getMsiSeriAd().equalsIgnoreCase("Gaming")) {
            if( getMsiBilgisayarAd().equals("Alpha 17, AMD Advantage™ Edition")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("• AMD Ryzen™ 7 5800H Mobil işlemci (max)\r\n"
                        + "• Windows 10 Home\r\n"
                        + "• Windows 11'e ÜCRETSİZ Yükseltme*\r\n"
                        + "• AMD Radeon™ RX 6600M 8GB GDDR6 grafikler\r\n"
                        + "• 17.3\" Full HD (1920x1080),144 Hz Tazeleme oranı, IPS-sınıfı panel (seçime bağlı)\r\n"
                        + "• RGB Gaming klavye (numerik tuş takımı)\r\n"
                        + "• Özel Cooler Boost 5 Teknolojisi\r\n"
                        + "• MSI Center ve özel Gaming Modu\r\n"
                        + "• MSI App Player ile mobil ve PC arasında kesintisiz geçiş\r\n"
                        + "• HD Ses");

                System.out.println("");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getMsiBilgisayarAd().equals("Delta 15, AMD Advantage™ Edition")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• AMD Ryzen™ 9 5900HX Mobile İşlemci (max)\r\n"
                        + "• Windows 10 Home\r\n"
                        + "• Windows 11'e ÜCRETSİZ Yükseltme*\r\n"
                        + "• AMD Radeon™ RX 6700M 10GB GDDR6 grafikler (max)\r\n"
                        + "• 15.6\" Full HD (1920x1080), 240 Hz tazeleme oranı, IPS-sınıfı panel (seçime bağlı)\r\n"
                        + "• RGB arkadan ışıklandırmalı Gaming klavye\r\n"
                        + "• Exclusive Cooler Boost 5 teknolojisi\r\n"
                        + "• MSI Center ve özel Gaming Modu•\r\n"
                        + "• MSI App Player ile mobil ve PC arasında kesintisiz geçiş\r\n"
                        + "• HD ses");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getMsiBilgisayarAd().equals("Bravo 15")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• AMD Ryzen™ 7 5800H Mobil İşlemci (max)\r\n"
                        + "• Windows 10 Home\r\n"
                        + "• Windows 11'e ÜCRETSİZ Yükseltme*\r\n"
                        + "• AMD Radeon™ RX 5500M 4GB GDDR6 Mobil Grafikler (max)•\r\n"
                        + "• 15.6” Full HD (1920x1080), 144 Hz Tazeleme Oranı, IPS sınıfı panel (seçime bağlı)\r\n"
                        + "• High-Res Audio Ready\r\n"
                        + "• Yepyeni MSI Center ve özel Gaming Modu\r\n"
                        + "• MSI App Player ile mobil cihazl ve PC arasında kesintisiz oyun deneyimi for seamless gaming experience between mobile and PC");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getMsiBilgisayarAd().equals("Crosshair 17 - B12U")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• En yeni 12.Nesil Intel® Core™ i9 işlemci (max)\r\n"
                        + "• Windows 11 Home / Windows 11 Pro\r\n"
                        + "• En yeni GeForce RTX™ 3070 Ti Laptop GPU 8GB GDDR6 (max)\r\n"
                        + "• 17.3\" Full HD (1920x1080), 360 Hz Tazeleme Oranı, IPS Sınıfı Panel(seçime bağlı)\r\n"
                        + "• SPECTRUM ARKADAN IŞIKLANDIRMALI KLAVYE\r\n"
                        + "• Exclusive Cooler Boost 5 Technology\r\n"
                        + "• MSI Center yazılımı ve özel Gaming modu, yepyeni SmartAuto ve Ambient Silent AI ile en iyi kullanıcı deneyimi\r\n"
                        + "• MSI APP Player, mobil oyunlar ve PC platformu arasında farketmeden geçiş yapmanızı sağlar.\r\n"
                        + "• High-Resolution Audio ready");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }
        if(getMsiSeriAd().equalsIgnoreCase("IcerikUretici")) {
            if( getMsiBilgisayarAd().equals("CreatorPro X17 - A12U")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• En yeni 12.nesil Intel® Core™ i9-12900HX CPU'ya kadar işlemci\r\n"
                        + "• Windows 11 Home / Windows 11 Pro\r\n"
                        + "• NVIDIA RTX™ A5500 Laptop GPU (16GB GDDR6)\r\n"
                        + "• NVIDIA RTX™ A3000 12GB Laptop GPU (GDDR6)\r\n"
                        + "• 17.3\" UHD (3840x2160), 120 Hz tazeleme oranı, %100 DCI-P3(Tipik), IPS-seviyesi panel\r\n"
                        + "• Per-Key RGB keyboard by SteelSeries\r\n"
                        + "• Cam yüzeyli touchpad (Daha geniş yüzeyli,130 x 82 mm)");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getMsiBilgisayarAd().equals("Creator Z17 - A12U")) {
                System.out.println("Creator Z17 - A12U");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("• En yeni 12.Nesil Intel® Core™ i9 işlemci (max)\r\n"
                        + "• Windows 11 Home / Windows 11 Pro\r\n"
                        + "• NVIDIA® GeForce RTX™ 3080 Ti Laptop GPU 16GB GDDR6(A12UHS/T)\r\n"
                        + "• NVIDIA® GeForce RTX™ 3080 Laptop GPU 8GB GDDR6(A12UH/T)\r\n"
                        + "• NVIDIA® GeForce RTX™ 3070 Ti Laptop GPU 8GB GDDR6(A12UGS/T)\r\n"
                        + "• NVIDIA® GeForce RTX™ Studio Laptop\r\n"
                        + "• Ultra-hafif 2.49kg, Ultra-ince19mm\r\n"
                        + "• 17\" QHD+ (2560x1600), 16:10, Dokunmatik Ekran, 165Hz Tazeleme Oranı, 100% DCI-P3(Tipik), IPS Sınıfı Panel, MSI Pen Desteği (seçime bağlı)");

                System.out.println("");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getMsiBilgisayarAd().equals("Creator Z16 - A12U")) {
                System.out.println("Creator Z16 - A12U");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• En yeni 12.Nesil Intel® Core™ i7 işlemci\r\n"
                        + "• Windows 11 Home / Windows 11 Pro\r\n"
                        + "• NVIDIA® GeForce RTX™ 3060 Laptop GPU 6GB GDDR6(A11UET)\r\n"
                        + "• NVIDIA® GeForce RTX™ Studio Laptop\r\n"
                        + "• Ultra-hafif 2.2kg, Ultra-ince 15.9mm\r\n"
                        + "• 16” QHD+ (2560x1600), 16:10, Dokunmatik ekran, 120Hz tazeleme oranı, 100% DCI-P3(tipik), IPS-Sınıfı panel (seçime bağlı)");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getMsiBilgisayarAd().equals("Creator M16 - A12U")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("Creator M16 - A12U");

                System.out.println("• En yeni 12.Nesil Intel® Core™ i7 işlemci\r\n"
                        + "• Windows 11 Home / Windows 11 Pro\r\n"
                        + "• NVIDIA® GeForce RTX™ 3050 Ti Laptop GPU 4GB GDDR6 (A12UD)\r\n"
                        + "• NVIDIA® GeForce RTX™ 3050 Laptop GPU 4GB GDDR6 (A12UC)\r\n"
                        + "• Ultra-hafif 2.26kg, Ultra-ince 23.95mm\r\n"
                        + "• 16” QHD+ (2560x1600), 16:10, %100 DCI-P3(Tipik), IPS Sınıfı Panel (seçime bağlı)");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }
    }

    public String getMsiSeriAd() {
        return msiSeriAd;
    }
    public void setMsiSeriAd(String msiSeriAd) {
        this.msiSeriAd = msiSeriAd;
    }
    public String getMsiBilgisayarAd() {
        return msiBilgisayarAd;
    }
    public void setMsiBilgisayarAd(String msiBilgisayarAd) {
        this.msiBilgisayarAd = msiBilgisayarAd;
    }
    public float getMsiFiyat() {
        return msiFiyat;
    }
    public void setMsiFiyat(float msiFiyat) {
        this.msiFiyat = msiFiyat;
    }
}