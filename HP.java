public class HP extends HazirBilgisayarSec{

    private String hpSeriAd;
    private String hpBilgisayarAd;
    private float hpFiyat;

    HP(Kullanici kullanici, String marka) {
        super(kullanici, marka);
    }
    void MarkaninBilgisayarSerileri() {
        int seriSec=0;
        System.out.println(" ------HP Serileri------ ");
        System.out.println("1- HP Masaüstü Serisi");
        System.out.println("2- HP Gaming Serisi");
        System.out.println("3- Dizüstü Serisi");
        System.out.print("Seciminiz : ");
        seriSec = scanner.nextInt();

        while(seriSec <1 || seriSec>2)
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin :");
            seriSec = scanner.nextInt();
        }

        switch (seriSec) {
            default:
            case 1: //HPMasaüstü();
                setHpSeriAd("HPMasaüstü");
                setMarkaSeriAd("HPMasaüstü");
                setMarka("HP");
                int hpSec=0;
                System.out.println("1-) HP All-in-One 24-cb1006nt Bundle All-in-One PC");
                System.out.println("2-) HP All-in-One 24-cb1014nt Bundle All-in-One PC");
                System.out.println("3-) HP All-in-One 24-cb1022nt Bundle All-in-One PC");
                System.out.print("Seciminiz : ");
                hpSec = scanner.nextInt();

                try {
                    if (hpSec==1)
                    {
                        setHpBilgisayarAd("HP All-in-One 24-cb1006nt Bundle All-in-One PC");
                        setHpFiyat(20999.00F);

                        setMarkaBilgisayarAd("HP All-in-One 24-cb1006nt Bundle All-in-One PC");
                        setMarkaBilgisayarFiyat(20999.00F);

                    }
                    else if(hpSec==2)
                    {
                        setHpBilgisayarAd("HP All-in-One 24-cb1014nt Bundle All-in-One PC");
                        setHpFiyat(18999.00F);

                        setMarkaBilgisayarAd("HP All-in-One 24-cb1014nt Bundle All-in-One PC");
                        setMarkaBilgisayarFiyat(18999.00F);

                    }
                    else if(hpSec==3)
                    {
                        setHpBilgisayarAd("HP All-in-One 24-cb1022nt Bundle All-in-One PC");
                        setHpFiyat(15999.00F);

                        setMarkaBilgisayarAd("HP All-in-One 24-cb1022nt Bundle All-in-One PC");
                        setMarkaBilgisayarFiyat(15999.00F);

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
            case 2://HPGaming();
                setHpSeriAd("HPGaming");
                setMarkaSeriAd("HPGaming");
                setMarka("HP");
                int gamingSec=0;
                System.out.println("1-) OMEN by HP Laptop 16-c0034nt (556H4EA)");
                System.out.println("2-) OMEN Gaming Laptop 16-k0006nt (6Z5Y5EA)");
                System.out.println("3-) OMEN by HP Laptop 16-b1004nt (68P12EA)");
                System.out.println("4-) OMEN by HP Laptop 17-ck1002nt (6H6R9EA)");
                System.out.print("Seciminiz : ");
                gamingSec = scanner.nextInt();

                try {
                    if (gamingSec==1)
                    {
                        setHpBilgisayarAd("OMEN by HP Laptop 16-c0034nt (556H4EA)");
                        setHpFiyat(25999.00F);

                        setMarkaBilgisayarAd("OMEN by HP Laptop 16-c0034nt (556H4EA)");
                        setMarkaBilgisayarFiyat(25999.00F);

                    }
                    else if(gamingSec==2)
                    {
                        setHpBilgisayarAd("MEN Gaming Laptop 16-k0006nt (6Z5Y5EA)");
                        setHpFiyat(28499.00F);

                        setMarkaBilgisayarAd("MEN Gaming Laptop 16-k0006nt (6Z5Y5EA)");
                        setMarkaBilgisayarFiyat(28499.00F);

                    }
                    else if(gamingSec==3)
                    {
                        setHpBilgisayarAd("OMEN by HP Laptop 16-b1004nt (68P12EA)");
                        setHpFiyat(42799.00F);

                        setMarkaBilgisayarAd("OMEN by HP Laptop 16-b1004nt (68P12EA)");
                        setMarkaBilgisayarFiyat(42799.00F);

                    }
                    else if(gamingSec==4)
                    {
                        setHpBilgisayarAd("OMEN by HP Laptop 17-ck1002nt (6H6R9EA)");
                        setHpFiyat(67599.00F);

                        setMarkaBilgisayarAd("OMEN by HP Laptop 17-ck1002nt (6H6R9EA)");
                        setMarkaBilgisayarFiyat(67599.00F);

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
            case 3://Dizüstü();
                setHpSeriAd("Dizüstü");
                setMarkaSeriAd("Dizüstü");
                setMarka("HP");
                int dizustuSec=0;
                System.out.println("1-) HP Pavilion Laptop 15-eh2005nt (68N92EA)");
                System.out.println("2-) HP Pavilion Laptop 15-eh2009nt (68N96EA)");
                System.out.println("3-) HP Pavilion Laptop 15-eg2005nt (68N84EA)");
                System.out.print("Seciminiz : ");
                dizustuSec = scanner.nextInt();

                try {
                    if (dizustuSec==1)
                    {
                        setHpBilgisayarAd("HP Pavilion Laptop 15-eh2005nt (68N92EA)");
                        setHpFiyat(17599.00F);

                        setMarkaBilgisayarAd("HP Pavilion Laptop 15-eh2005nt (68N92EA)");
                        setMarkaBilgisayarFiyat(17599.00F);

                    }
                    else if(dizustuSec==2)
                    {
                        setHpBilgisayarAd("HP Pavilion Laptop 15-eh2009nt (68N96EA)");
                        setHpFiyat(17599.00F);

                        setMarkaBilgisayarAd("HP Pavilion Laptop 15-eh2009nt (68N96EA)");
                        setMarkaBilgisayarFiyat(17599.00F);

                    }
                    else if(dizustuSec==3)
                    {
                        setHpBilgisayarAd("HP Pavilion Laptop 15-eg2005nt (68N84EA)");
                        setHpFiyat(19999.00F);

                        setMarkaBilgisayarAd("HP Pavilion Laptop 15-eg2005nt (68N84EA)");
                        setMarkaBilgisayarFiyat(19999.00F);

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
        if(getHpSeriAd().equalsIgnoreCase("HPMasaüstü")) {
            if( getHpBilgisayarAd().equals("HP All-in-One 24-cb1006nt Bundle All-in-One PC")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• İşletim Sistemi: Windows 11 Home Single Language \r\n"
                        + "• İşlemci Ailesi: 12. Nesil Intel® Core™ i5 işlemci\r\n"
                        + "• İşlemci: Intel® Core™ i5-1235U \r\n"
                        + "• Bellek: 8 GB DDR4-3200 MHz RAM (1 x 8 GB)\r\n"
                        + "• Bellek Yuvaları: 2 SODIMM\r\n"
                        + "• Dahili Depolama: 512 GB Intel® PCIe® NVMe™ SSD\r\n"
                        + "• Ekran Boyutu: 23,8 inç\r\n"
                        + "• Dokunmatik ekran: Yok");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getHpBilgisayarAd().equals("HP All-in-One 24-cb1014nt Bundle All-in-One PC")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• İşletim Sistemi: Windows 11 Home Single Language \r\n"
                        + "• İşlemci Ailesi: 12. Nesil Intel® Core™ i5 işlemci\r\n"
                        + "• İşlemci: Intel® Core™ i5-1235U \r\n"
                        + "• Bellek: 8 GB DDR4-3200 MHz RAM (1 x 8 GB)\r\n"
                        + "• Bellek Yuvaları: 2 SODIMM\r\n"
                        + "• Dahili Depolama: 512 GB Intel® PCIe® NVMe™ SSD\r\n"
                        + "• Ekran Boyutu: 23,8 inç\r\n"
                        + "• Dokunmatik ekran: Yok");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getHpBilgisayarAd().equals("HP All-in-One 24-cb1022nt Bundle All-in-One PC")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• İşletim Sistemi: Windows 11 Home Single Language \r\n"
                        + "• İşlemci Ailesi: 12. Nesil Intel® Core™ i3 işlemci\r\n"
                        + "• İşlemci: IIntel® Core™ i3-1215U \r\n"
                        + "• Bellek: 8 GB DDR4-3200 MHz RAM (1 x 8 GB)\r\n"
                        + "• Bellek Yuvaları: 2 SODIMM\r\n"
                        + "• Dahili Depolama: 256 GB PCIe® NVMe™ SSD\r\n"
                        + "• Ekran Boyutu: 23,8 inç\r\n"
                        + "• Dokunmatik ekran: Yok");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }
        else if(getHpSeriAd().equalsIgnoreCase("HPGaming")) {
            if( getHpBilgisayarAd().equals("OMEN by HP Laptop 16-c0034nt (556H4EA)")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("• İşletim Sistemi: Windows 11 Home Single Language \r\n"
                        + "• İşlemci Ailesi: AMD Ryzen™ 7 işlemci\r\n"
                        + "• İşlemci: AMD Ryzen™ 7 5800H\r\n"
                        + "• Bellek: 16 GB DDR4-3200 MHz RAM (2 x 8 GB)\r\n"
                        + "• Azami Bellek: Supports up to 32 GB max system memory\r\n"
                        + "• Dahili Depolama: 1 TB PCIe® NVMe™ TLC M.2 SSD\r\n"
                        + "• Ekran Boyutu: 16,1 inç\r\n"
                        + "• Dokunmatik ekran: Yok");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getHpBilgisayarAd().equals("OMEN Gaming Laptop 16-k0006nt (6Z5Y5EA)")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("• İşletim Sistemi: Windows 11 Home Single Language \r\n"
                        + "• İşlemci Ailesi: 12. Nesil Intel® Core™ i5 işlemci\r\n"
                        + "• İşlemci: Intel® Core™ i5-12500H \r\n"
                        + "• Bellek:16 GB DDR5-4800 MHz RAM (2 x 8 GB)\r\n"
                        + "• Dahili Depolama: 512 GB PCIe® NVMe™ TLC SSD\r\n"
                        + "• Ekran Boyutu: 16,1 inç\r\n"
                        + "• Dokunmatik ekran: Yok");

                System.out.println("");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getHpBilgisayarAd().equals("OMEN by HP Laptop 16-b1004nt (68P12EA)")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• İşletim Sistemi: FreeDOS \r\n"
                        + "• İşlemci Ailesi: 12. Nesil Intel® Core™ i7 işlemci\r\n"
                        + "• İşlemci: Intel® Core™ i7-12700H\r\n"
                        + "• Bellek: 16 GB DDR5-4800 MHz RAM (2 x 8 GB)\r\n"
                        + "• Dahili Depolama: 1 TB PCIe® NVMe™ TLC M.2 SSD\r\n"
                        + "• Ekran Boyutu: 16,1 inç\r\n"
                        + "• Dokunmatik ekran: Yok");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getHpBilgisayarAd().equals("OMEN by HP Laptop 17-ck1002nt (6H6R9EA)")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• İşletim Sistemi: FreeDOS \r\n"
                        + "• İşlemci Ailesi: 12. Nesil Intel® Core™ i9 işlemci\r\n"
                        + "• İşlemci: Intel® Core™ i9-12900HX\r\n"
                        + "• Bellek: 32 GB DDR5-4800 MHz RAM (2 x 16 GB)\r\n"
                        + "• Dahili Depolama:1 TB PCIe® NVMe™ TLC M.2 SSD\r\n"
                        + "• Ekran Boyutu: 17,3 inç\r\n"
                        + "• Dokunmatik ekran: Yok");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }
        else if(getHpSeriAd().equalsIgnoreCase("Dizüstü")) {
            if( getHpBilgisayarAd().equals("HP Pavilion Laptop 15-eh2005nt (68N92EA)")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("• İşletim Sistemi: Windows 11 Home Single Language \r\n"
                        + "• İşlemci Ailesi: AMD Ryzen™ 5 işlemci\r\n"
                        + "• İşlemci: AMD Ryzen™ 5 5625U\r\n"
                        + "• Bellek: 8 GB DDR4-3200 MHz RAM (2 x 4 GB)\r\n"
                        + "• Dahili Depolama: 512 GB PCIe® NVMe™ M.2 SSD\r\n"
                        + "• Ekran Boyutu: 15,6 inç\r\n"
                        + "• Dokunmatik ekran: Yok");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getHpBilgisayarAd().equals("HP Pavilion Laptop 15-eh2009nt (68N96EA)")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("• İşletim Sistemi: Windows 11 Home Single Language \r\n"
                        + "• İşlemci Ailesi: AMD Ryzen™ 5 işlemci\r\n"
                        + "• İşlemci: AMD Ryzen™ 5 5625U\r\n"
                        + "• Bellek: 8 GB DDR4-3200 MHz RAM (2 x 4 GB)\r\n"
                        + "• Dahili Depolama: 512 GB PCIe® NVMe™ M.2 SSD\r\n"
                        + "• Ekran Boyutu: 15,6 inç\r\n"
                        + "• Dokunmatik ekran: Yok");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getHpBilgisayarAd().equals("HP Pavilion Laptop 15-eg2005nt (68N84EA)")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("• İşletim Sistemi: Windows 11 Home Single Language \r\n"
                        + "• İşlemci Ailesi: 12. Nesil Intel® Core™ i7 işlemci\r\n"
                        + "• İşlemci: Intel® Core™ i7-1260P\r\n"
                        + "• Bellek: 8 GB DDR4-3200 MHz RAM (2 x 4 GB)\r\n"
                        + "• Dahili Depolama: 512 GB PCIe® NVMe™ M.2 SSD\r\n"
                        + "• Ekran Boyutu: 15,6 inç\r\n"
                        + "• Dokunmatik ekran: Yok");

                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }
    }
    public String getHpSeriAd() {
        return hpSeriAd;
    }
    public void setHpSeriAd(String hpSeriAd) {
        this.hpSeriAd = hpSeriAd;
    }
    public String getHpBilgisayarAd() {
        return hpBilgisayarAd;
    }
    public void setHpBilgisayarAd(String hpBilgisayarAd) {
        this.hpBilgisayarAd = hpBilgisayarAd;
    }
    public float getHpFiyat() {
        return hpFiyat;
    }
    public void setHpFiyat(float hpFiyat) {
        this.hpFiyat = hpFiyat;
    }

}