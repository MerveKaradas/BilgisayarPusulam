
public class Dell extends HazirBilgisayarSec{

    private String dellSeriAd;
    private String dellBilgisayarAd;
    private float dellFiyat;

    Dell(Kullanici kullanici, String marka) {
        super(kullanici, marka);
    }
    void MarkaninBilgisayarSerileri() {
        int seriSec=0;
        System.out.println(" ------DELL Serileri------ ");
        System.out.println("1- G Serisi");
        System.out.println("2- Alienwarel Serisi");
        System.out.print("Seciminiz : ");
        seriSec = scanner.nextInt();

        while(seriSec <1 || seriSec>2)
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin :");
            seriSec = scanner.nextInt();
        }

        switch (seriSec) {
            default:
            case 1://GSerisi();
                setDellSeriAd("GSerisi");
                setMarkaSeriAd("GSerisi");
                setMarka("Dell");
                int gSec=0;
                System.out.println("1-) DELL Gaming G5 15 G55201800U");
                System.out.println("2-) Dell Gaming G15 5525");
                System.out.println("3-) Dell G15 SE 5520 i9-12900H");
                System.out.print("Seciminiz : ");
                gSec = scanner.nextInt();

                try {
                    if (gSec==1)
                    {
                        setDellBilgisayarAd("DELL Gaming G5 15 G55201800U");
                        setDellFiyat(22699.00F);

                        setMarkaBilgisayarAd("DELL Gaming G5 15 G55201800U");
                        setMarkaBilgisayarFiyat(22699.00F);

                    }
                    else if(gSec==2)
                    {
                        setDellBilgisayarAd("Dell Gaming G15 5525");
                        setDellFiyat(22489.00F);

                        setMarkaBilgisayarAd("Dell Gaming G15 5525");
                        setMarkaBilgisayarFiyat(22489.00F);

                    }
                    else if(gSec==3)
                    {
                        setDellBilgisayarAd("Dell G15 SE 5520 i9-12900H");
                        setDellFiyat(50999.00F);

                        setMarkaBilgisayarAd("Dell G15 SE 5520 i9-12900H");
                        setMarkaBilgisayarFiyat(50999.00F);

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
            case 2://Alienwarel();
                setDellSeriAd("Alienwarel");
                setMarkaSeriAd("Alienwarel");
                setMarka("Dell");
                int alienSec=0;
                System.out.println("1-) Alienware - M15 R5 15.6 Fhd Gaming Laptop");
                System.out.println("2-) Alienware m15 R5 5900HX Laptop");
                System.out.print("Seciminiz : ");
                alienSec = scanner.nextInt();
                try {
                    if (alienSec==1)
                    {
                        setDellBilgisayarAd("Alienware - M15 R5 15.6 Fhd Gaming Laptop");
                        setDellFiyat(56650.00F);

                        setMarkaBilgisayarAd("Alienware - M15 R5 15.6 Fhd Gaming Laptop");
                        setMarkaBilgisayarFiyat(56650.00F);

                    }
                    else if(alienSec==2)
                    {
                        setDellBilgisayarAd("Alienware m15 R5 5900HX Laptop");
                        setDellFiyat(56650.00F);

                        setMarkaBilgisayarAd("Alienware m15 R5 5900HX Laptop");
                        setMarkaBilgisayarFiyat(56650.00F);

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
        if(getDellSeriAd().equalsIgnoreCase("GSerisi")) {
            if( getDellBilgisayarAd().equals("DELL Gaming G5 15 G55201800U")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• İşletim Sistemi: Ubuntu\r\n"
                        + "• RAM(Sistem Belleği): 16 GB\r\n"
                        + "• İşlemci Tipi: Intel Core i7\r\n"
                        + "• Ekran Kartı Hafızası: 6 GB\r\n"
                        + "• Ekran Kartı: Nvidia GeForce RTX 3060\r\n"
                        + "• İşllemci: 12700H\r\n"
                        + "• Garanti Tipi: Resmi Distribütör Garantili\r\n"
                        + "• Harddisk Kapasitesi: Yok\r\n"
                        + "• Ekran Boyutu: 15,6 inç");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getDellBilgisayarAd().equals("Dell Gaming G15 5525")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• İşletim Sistemi: Windows\r\n"
                        + "• RAM(Sistem Belleği): 16 GB\r\n"
                        + "• İşlemci Tipi: AMD Ryzen 5 6600H\r\n"
                        + "• Ekran Kartı Hafızası: 4 GB\r\n"
                        + "• Ekran Karı: NVIDIA GeForce RTX 3050\r\n"
                        + "• İşlemci:AMD Ryzen 5 \r\n"
                        + "• Garanti Tipi: Resmi Distribütör Garantili\r\n"
                        + "• SSD Kapasitesi: 512 GB\r\n"
                        + "• Ekran Boyutu: 15,6 inç");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getDellBilgisayarAd().equals("Dell G15 SE 5520 i9-12900H")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Seri: G15 SE 5520\r\n"
                        + "• Ekran Boyut: 15.6 İnç\r\n"
                        + "• CPU Modeli: Intel Core i9\r\n"
                        + "• Kurulu RAM Belleği Boyutu: 16 GB\r\n"
                        + "• İşletim Sistemi: Windows 11\r\n"
                        + "• Grafik Kartı Açıklaması: Özel\r\n"
                        + "• CPU Hızı: 3.5 GHz\r\n"
                        + "• Sabit Sürücü Açıklaması: SSD\r\n"
                        + "• Çözünürlük: 1080p");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }
        else if(getDellSeriAd().equalsIgnoreCase("Alienwarel")) {
            if( getDellBilgisayarAd().equals("Alienware - M15 R5 15.6 Fhd Gaming Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• İşlemci: 11800H\r\n"
                        + "• RAM: 16 GB\r\n"
                        + "• Ekran Boyutu: 15,6 inç\r\n"
                        + "• Ekran Kartı Hafızası: 6 GB\r\n"
                        + "• İşletim Sistemi: Windows 11 Pro\r\n"
                        + "• İşlemci Tipi: Intel Core i7\r\n"
                        + "• Ekran Kartı: Nvidia GeForce RTX 3070\r\n"
                        + "• Harddisk Kapasitesi: Belirtilmemiş\r\n");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getDellBilgisayarAd().equals("Alienware m15 R5 5900HX Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Form faktörü: Kapaklı \r\n"
                        + "• İşlemci ailesi: AMD Ryzen 9\r\n"
                        + "• İşlemci: 5900HX\r\n"
                        + "• İşlemci frekansı: 3,3 GHz. \r\n"
                        + "• Ekran boyutu: 39,6 cm (15.6\")\r\n"
                        + "• HD türü: Full HD kalitesi\r\n"
                        + "• Ekran çözünürlüğü: 1920 x 1080 Piksel\r\n"
                        + "• RAM: 16 GB\r\n"
                        + "• Dahili hafıza tipi: DDR4-SDRAM");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }

    }
    public String getDellSeriAd() {
        return dellSeriAd;
    }
    public void setDellSeriAd(String dellSeriAd) {
        this.dellSeriAd = dellSeriAd;
    }
    public String getDellBilgisayarAd() {
        return dellBilgisayarAd;
    }
    public void setDellBilgisayarAd(String dellBilgisayarAd) {
        this.dellBilgisayarAd = dellBilgisayarAd;
    }
    public float getDellFiyat() {
        return dellFiyat;
    }
    public void setDellFiyat(float dellFiyat) {
        this.dellFiyat = dellFiyat;
    }
}