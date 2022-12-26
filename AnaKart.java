class AnaKart extends Donanim{

    private String parcaTurAd="AnaKart";
    private String anakartAd = "null";
    private float anakartFiyat = 0;

    private static boolean DDR4destek = false;
    private static boolean M2destek=false;

    private String GrafikAraBirimi="null";

    int urunsec=0;
    int bolum=0;

    private static String anaKartSoket="null";


    AnaKart(Kullanici kullanici,String parcaTurAd, String parcaAd,float parcaFiyat) {
        super(kullanici,parcaTurAd,parcaAd,parcaFiyat);
        this.parcaTurAd = parcaTurAd;
    }

    AnaKart(Kullanici kullanici,String parcaTurAd) {
        super(kullanici,parcaTurAd);
    }

    AnaKart(Kullanici kullanici)
    {
        super(kullanici);
    }


    @Override
    public int UrunSec() { //2


        System.out.println("     ANAKARTLAR     ");
        System.out.println("--------------------");
        CPU cpuClass = new CPU(kullanici);
        int secenek=0;


        if(cpuClass.getCpuSoket().equals("Soket 1200")) {

            bolum=1;
            secenek=9;
            System.out.println("1-MSI MAG Z590 TORPEDO Intel Z590 Soket 1200 DDR4 5333(O.C.) M.2 Anakart");
            System.out.println("2-MSI Z590 PLUS Intel Z590 Soket 1200 DDR4 5333MHz (OC) M.2 Anakart");
            System.out.println("3-MSI MAG B460M BAZOOKA Intel B460 Soket 1200 DDR4 2933MHz M.2 Anakart");
            System.out.println("4-MSI MAG B560M MORTAR WIFI Intel B560 Soket 1200 DDR4 5066MHz (OC) M.2 Anakart");
            System.out.println("5-MSI Z490-A PRO Intel Z490 Soket 1200 DDR4 4800(OC) M.2 Anakart");
            System.out.println("6-ASUS PRIME H510M-E Intel H510 Soket 1200 DDR4 3200MHz(OC) M.2 Anakart");
            System.out.println("7-ASUS PRIME B450M-A II AMD B450 Soket AM4 DDR4 4400MHz(O.C.) M.2 Anakart"); //araya kaynamıs duzelt
            System.out.println("8-GIGABYTE Z490I AORUS ULTRA Intel Z490 Soket 1200 DDR4 5000MHz(O.C.) M.2 Anakart");
            System.out.println("9-ASUS PRIME H410M-D INTEL H410 Soket 1200 DDR4 2933MHz(O.C) M.2 Anakart");

            setAnaKartSoket(cpuClass.getCpuSoket());
        }
        else if (cpuClass.getCpuSoket().equals("Soket 1700")) {

            bolum=2;
            secenek=6;
            System.out.println("1-MSI MPG Z690 CARBON WIFI Intel Z690 Soket 1700 DDR5 6666MHz (OC) M.2 Anakart");
            System.out.println("2-ASUS PRIME Z690-A Intel Z690 Soket 1700 DDR5 6000MHz (OC) M.2 Anakart");
            System.out.println("3-ASUS ROGSTRIX Z690-A GAMING WIFI D4 Intel Z690 Soket 1700 DDR4 5333(O.C.)Anakart");
            System.out.println("4-MSI PRO Z790-A WIFI Intel Z790 Soket 1700 DDR4 5333MHZ (OC) M.2 Anakart");
            System.out.println("5-ASUS PRIME B660M-A D4 Intel B660 Soket 1700 DDR4 3200MHz (OC) M.2 Anakart");
            System.out.println("6-ASUS PRIME H610M-K D4 Intel H610 Soket 1700 DDR4 3200MHz M.2 Anakart");

            setAnaKartSoket(cpuClass.getCpuSoket());
        }
        else if (cpuClass.getCpuSoket().equals("Soket AM4")) {

            bolum=3;
            secenek=6;
            System.out.println("1-ASUS TUF B450-PRO GAMING AMD B450 Socket AM4 Ryzen DDR4 4400(O.C)MHz M.2 Anakart");
            System.out.println("2-ASUS TUF GAMING X570-PRO (WI-FI) AM4 X570 AM4 DDR4 5100MHz (O.C.) M.2 Anakart");
            System.out.println("3-ASUS ProArt B550-CREATOR AMD B550 Soket AM4 DDR4 5100MHz (O.C) M.2 Anakart");
            System.out.println("4-MSI X570-A PRO Amd X570 Soket AM4 DDR4 4000(OC) M.2 Anakart");
            System.out.println("5-ASUS PRIME A320M-K A320 AM4 AMD Ryzen™ DDR4 3200(O.C.) MHz M.2 USB 3.1 Anakart");
            System.out.println("6-MSI B450M PRO-VDH MAX Amd B450 Soket AM4 DDR4 3866(OC) M.2 Anakart");


            setAnaKartSoket(cpuClass.getCpuSoket());
        }


        System.out.print("Seciminiz :  ");
        urunsec = scanner.nextInt();

        while ( urunsec<1 || urunsec>secenek) //try-catch gelecek
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
            urunsec = scanner.nextInt();
        }

        switch (bolum) //DDR4 için desteklemesine göre setter getter eklenecek ******** UNUTMA!!
        {
            case 1 : //Soket 1200 içindeki seçenekler için

                switch (urunsec)
                {
                    case 1 :
                        setGrafikAraBirimi("PCI-Express 4.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("MSI MAG Z590 TORPEDO Intel Z590 Soket 1200 DDR4 5333(O.C.) M.2 Anakart");
                        setParcaFiyat(5890.50F);
                        break;

                    case 2 :
                        setGrafikAraBirimi("PCI-Express 2.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("MSI Z590 PLUS Intel Z590 Soket 1200 DDR4 5333MHz (OC) M.2 Anakart");
                        setParcaFiyat(4747.47F);
                        break;

                    case 3 :
                        setGrafikAraBirimi("PCI-Express 3.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("MSI MAG B460M BAZOOKA Intel B460 Soket 1200 DDR4 2933MHz M.2 Anakart");
                        setParcaFiyat(2618F);
                        break;

                    case 4 :
                        setGrafikAraBirimi("PCI-Express 4.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("MSI MAG B560M MORTAR WIFI Intel B560 Soket 1200 DDR4 5066MHz (OC) M.2 Anakart");
                        setParcaFiyat(4104.99F);
                        break;
                    case 5 :
                        setGrafikAraBirimi("PCI-Express 3.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("MSI Z490-A PRO Intel Z490 Soket 1200 DDR4 4800(OC) M.2 Anakart");
                        setParcaFiyat(4293.89F);
                        break;
                    case 6 :
                        setGrafikAraBirimi("PCI-Express 4.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("ASUS PRIME H510M-E Intel H510 Soket 1200 DDR4 3200MHz(OC) M.2 Anakart");
                        setParcaFiyat(1857F);
                        break;
                    case 7 :
                        setGrafikAraBirimi("PCI-Express 3.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("ASUS PRIME B450M-A II AMD B450 Soket AM4 DDR4 4400MHz(O.C.) M.2 Anakart");
                        setParcaFiyat(1886.49F);
                        break;
                    case 8 :
                        setGrafikAraBirimi("PCI-Express 4.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("GIGABYTE Z490I AORUS ULTRA Intel Z490 Soket 1200 DDR4 5000MHz(O.C.) M.2 Anakart");
                        setParcaFiyat(7398.89F);
                        break;
                    case 9 :
                        setGrafikAraBirimi("PCI-Express 3.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("ASUS PRIME H410M-D INTEL H410 Soket 1200 DDR4 2933MHz(O.C) M.2 Anakart");
                        setParcaFiyat(1805F);
                        break;
                }
                break;

            case 2 : //Soket 1700 içerisindeki seçenekler için

                switch (urunsec)
                {
                    case 1 :
                        setGrafikAraBirimi("PCI-Express 5.0");
                        setM2destek(true);
                        setDDR4destek(false);
                        setParcaAd("MSI MPG Z690 CARBON WIFI Intel Z690 Soket 1700 DDR5 6666MHz (OC) M.2 Anakart");
                        setParcaFiyat(11325.99F);
                        break;

                    case 2 :
                        setGrafikAraBirimi("PCI-Express 5.0");
                        setM2destek(true);
                        setDDR4destek(false); //şuna bak
                        setParcaAd("ASUS PRIME Z690-A Intel Z690 Soket 1700 DDR5 6000MHz (OC) M.2 Anakart");
                        setParcaFiyat(8452.55F);
                        break;

                    case 3 :
                        setGrafikAraBirimi("PCI-Express 5.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("ASUS ROGSTRIX Z690-A GAMING WIFI D4 Intel Z690 Soket 1700 DDR4 5333(O.C.)Anakart");
                        setParcaFiyat(8452.99F);
                        break;

                    case 4 :
                        setGrafikAraBirimi("PCI-Express 5.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("MSI PRO Z790-A WIFI Intel Z790 Soket 1700 DDR4 5333MHZ (OC) M.2 Anakart");
                        setParcaFiyat(7321.49F);
                        break;

                    case 5 :
                        setGrafikAraBirimi("PCI-Express 4.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("ASUS PRIME B660M-A D4 Intel B660 Soket 1700 DDR4 3200MHz (OC) M.2 Anakart");
                        setParcaFiyat(4257.79F);
                        break;

                    case 6 :
                        setGrafikAraBirimi("PCI-Express 4.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("ASUS PRIME H610M-K D4 Intel H610 Soket 1700 DDR4 3200MHz M.2 Anakart");
                        setParcaFiyat(2589F);
                        break;
                }
                break;

            case 3 : // Soket Soket AM4 içerisindeki seçenekler için

                switch (urunsec)
                {
                    case 1 :
                        setGrafikAraBirimi("PCI-Express 3.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("ASUS TUF B450-PRO GAMING AMD B450 Socket AM4 Ryzen DDR4 4400(O.C)MHz M.2 Anakart");
                        setParcaFiyat(2856.55F);
                        break;

                    case 2 :
                        setGrafikAraBirimi("PCI-Express 4.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("ASUS TUF GAMING X570-PRO (WI-FI) AM4 X570 AM4 DDR4 5100MHz (O.C.) M.2 Anakart");
                        setParcaFiyat(6056.99F);
                        break;

                    case 3 :
                        setGrafikAraBirimi("PCI-Express 4.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("ASUS ProArt B550-CREATOR AMD B550 Soket AM4 DDR4 5100MHz (O.C) M.2 Anakart");
                        setParcaFiyat(5941F);
                        break;

                    case 4 :
                        setGrafikAraBirimi("PCI-Express 2.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("MSI X570-A PRO Amd X570 Soket AM4 DDR4 4000(OC) M.2 Anakart");
                        setParcaFiyat(4514F);
                        break;

                    case 5 :
                        setGrafikAraBirimi("PCI-Express 3.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("ASUS PRIME A320M-K A320 AM4 AMD Ryzen™ DDR4 3200(O.C.) MHz M.2 USB 3.1 Anakart");
                        setParcaFiyat(1331.99F);
                        break;

                    case 6 :
                        setGrafikAraBirimi("PCI-Express 2.0");
                        setM2destek(true);
                        setDDR4destek(true);
                        setParcaAd("MSI B450M PRO-VDH MAX Amd B450 Soket AM4 DDR4 3866(OC) M.2 Anakart");
                        setParcaFiyat(1775.75F);
                        break;

                }
                break;

        }

        return urunsec;

    }




    @Override
    public void ParcaBilgilendirme() { //1

        setParcaTurAd("AnaKart"); //Donanim classında CPU ile ilgili işlemler yapılması için

        System.out.println(" ------------------------------------------ Anakart ------------------------------------------ \n");
        System.out.println("Bilgisayar başta olmak üzere televizyon ve cep telefonu gibi elektronik cihazlarda da bulunan, \n" +
                "donanımların bir araya toplanması ve bu donanımların birbirleri ile iletişim kurarak koordineli bir şekilde\n" +
                "çalışmalarını sağlayan parçaya anakart (motherboard) denir.\n");

        System.out.println("ANAKART NE ISE YARAR ?");
        System.out.println("________________________");
        System.out.println(
                "1- Güç sağlar ve güç dağitimi yapar.\n" +
                "2- Bios sayesinde islemleri yürütür.\n" +
                "3- Diğer bilesenlerle iletisim kurar.\n" +
                "4- Veri akısını saglar.\n" +
                "5- Bilgisayarın performansini belirler.\n" +
                "6- Bileşenler arasindaki uyum sayesinde maksimum performans saglar.");

        System.out.println("\n");

    }

    @Override
    public void TeknikBilgi() { //3

        System.out.println("\n");
        System.out.println(urunsec + ". " + getParcaAd() + " DAHILI I/O");
        System.out.println("________________________________________________\n");


        switch (bolum)
        {
            case 1:
                switch (urunsec)
                {
                    case 1 :
                        System.out.println("SATA III bağlantı sayısı\t6\n" +
                                "RGB LED pim başlığı\tVar\n" +
                                "Şasi giriş bağlayıcı\tVar\n" +
                                "CPU fan bağlayıcı\tVar\n" +
                                "TPM bağlayıcı\tVar\n" +
                                "12V güç konnektörü\tVar\n" +
                                "USB 2.0 bağlayıcıları\t2\n" +
                                "Ön panel ses bağlayıcısı\tVar");
                        System.out.println();
                        break;

                    case 2 :
                        System.out.println("USB 2.0 bağlayıcıları\t2\n" +
                                "RGB LED pim başlığı\tVar\n" +
                                "CPU fan bağlayıcı\tVar\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "TPM bağlayıcı\tVar\n" +
                                "12V güç konnektörü\tVar\n" +
                                "Şasi giriş bağlayıcı\tVar\n" +
                                "SATA III bağlantı sayısı\t4\n" +
                                "Thunderbolt başlığı\t1");
                        System.out.println();
                        break;

                    case 3 :
                        System.out.println("Seri giriş başlıkları\t1\n" +
                                "USB 2.0 bağlayıcıları\t2\n" +
                                "12V güç konnektörü\tVar\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "TPM bağlayıcı\tVar\n" +
                                "SATA II bağlantı sayısı\t4\n" +
                                "Şasi giriş bağlayıcı\tVar\n" +
                                "RGB LED pim başlığı\tVar\n" +
                                "CPU fan bağlayıcı\tVar\n" +
                                "Paralel bağlantı\tVar");
                        System.out.println();
                        break;

                    case 4 :
                        System.out.println("Şasi giriş bağlayıcı\tVar\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "12V güç konnektörü\tVar\n" +
                                "USB 2.0 bağlayıcıları\t2\n" +
                                "CPU fan bağlayıcı\tVar\n" +
                                "Thunderbolt başlığı\t1\n" +
                                "SATA III bağlantı sayısı\t6");
                        System.out.println();
                        break;

                    case 5 :
                        System.out.println("CPU fan bağlayıcı\tVar\n" +
                                "Güç fanı bağlayıcısı\tVar\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "USB 2.0 bağlayıcıları\t4\n" +
                                "Seri giriş başlıkları\t1\n" +
                                "SATA III bağlantı sayısı\t6\n" +
                                "Ön panel konektörü\tVar\n" +
                                "12V güç konnektörü\tVar\n" +
                                "Şasi giriş bağlayıcı\tVar\n" +
                                "RGB LED pim başlığı\tVar\n" +
                                "TPM bağlayıcı\tVar");
                        System.out.println();
                        break;

                    case 6 :
                        System.out.println("TPM bağlayıcı\tVar\n" +
                                "S/PDIF çıkış bağlayıcı\tVar\n" +
                                "USB 2.0 bağlayıcıları\t2\n" +
                                "RGB LED pim başlığı\tVar\n" +
                                "COM bağlayıcı sayısı\t1\n" +
                                "SATA III bağlantı sayısı\t4\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "CPU fan bağlayıcı\tVar\n" +
                                "12V güç konnektörü\tVar");
                        System.out.println();
                        break;

                    case 7 :
                        System.out.println("\n" +
                                "S/PDIF çıkış bağlayıcı\tVar\n" +
                                "12V güç konnektörü\tVar\n" +
                                "USB 2.0 bağlayıcıları\t2\n" +
                                "Ses konektörü\tVar\n" +
                                "RGB LED pim başlığı\tVar\n" +
                                "CPU fan bağlayıcı\tVar\n" +
                                "SATA III bağlantı sayısı\t6\n" +
                                "COM bağlayıcı sayısı\t1\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "TPM bağlayıcı\tVar\n" +
                                "Ön panel konektörü\tVar");
                        System.out.println();
                        break;

                    case 8 :
                        System.out.println("12V güç konnektörü\tVar\n" +
                                "SATA III bağlantı sayısı\t4\n" +
                                "CPU fan bağlayıcı\tVar\n" +
                                "USB 2.0 bağlayıcıları\t1\n" +
                                "RGB LED pim başlığı\tVar\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "Şasi giriş bağlayıcı\tVar\n" +
                                "Ön panel konektörü\tVar");
                        System.out.println();
                        break;

                    case 9 :
                        System.out.println("CPU fan bağlayıcı\tVar\n" +
                                "USB 2.0 bağlayıcıları\t1\n" +
                                "12V güç konnektörü\tVar\n" +
                                "Ses konektörü\tVar\n" +
                                "S/PDIF çıkış bağlayıcı\tVar\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "SATA III bağlantı sayısı\t4");
                        System.out.println();
                        break;

                }
                break;

            case 2:
                switch (urunsec)
                {
                    case 1 :
                        System.out.println("Şasi giriş bağlayıcı\tVar\n" +
                                "SATA III bağlantı sayısı\t6\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "CPU fan bağlayıcı\tVar\n" +
                                "12V güç konnektörü\tVar\n" +
                                "USB 2.0 bağlayıcıları\t2\n" +
                                "TPM bağlayıcı\tVar");
                        System.out.println();
                        break;

                    case 2 :
                        System.out.println("USB 2.0 bağlayıcıları\t2\n" +
                                "RGB LED pim başlığı\tVar\n" +
                                "TPM bağlayıcı\tVar\n" +
                                "COM bağlayıcı sayısı\t1\n" +
                                "Güç fanı bağlayıcısı\tVar\n" +
                                "SATA III bağlantı sayısı\t4\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "Thunderbolt başlığı\t1\n" +
                                "CPU fan bağlayıcı\tVar\n" +
                                "12V güç konnektörü\tVar");
                        System.out.println();
                        break;

                    case 3 :
                        System.out.println("CPU fan bağlayıcı\tVar\n" +
                                "SATA III bağlantı sayısı\t6\n" +
                                "TPM bağlayıcı\tVar\n" +
                                "12V güç konnektörü\tVar\n" +
                                "USB 2.0 bağlayıcıları\t2\n" +
                                "Thunderbolt başlığı\t1\n" +
                                "S/PDIF çıkış bağlayıcı\tVar");
                        System.out.println();
                        break;

                    case 4 :
                        System.out.println("Soket Tipi\tSoket 1700\n" +
                                "Ram Tipi\tDDR4\n" +
                                "Ram Tipi\tDDR4\n" +
                                "Anakart Markası\tMSI\n" +
                                "Anakart Chipseti\tIntel® Z790\n" +
                                "Anakart Yapı\tATX\n" +
                                "Ram Slot Sayısı\t4\n" +
                                "Maks. Ram Desteği\t128GB\n" +
                                "Desteklenen Ram Hızı\t5333MHZ (OC)\n" +
                                "Maks. Ram Hızı (O.C.)\t5333MHZ (OC)\n" +
                                "M.2 Yuva Sayısı\t4\n" +
                                "USB 3.2\t3\n" +
                                "USB 3.1\t2\n" +
                                "USB 2.0\t2\n" +
                                "TYPE-C\t1\n" +
                                "HDMI\t1\n" +
                                "DisplayPort\t1\n" +
                                "Kablosuz Bağlantı (WI FI)\tYok\n" +
                                "Ethernet\t10/100/1000Mbps");
                        System.out.println();
                        break;
                    case 5 :
                        System.out.println("RGB LED pim başlığı\tVar\n" +
                                "CPU fan bağlayıcı\tVar\n" +
                                "Ön panel konektörü\tVar\n" +
                                "COM bağlayıcı sayısı\t1\n" +
                                "USB 2.0 bağlayıcıları\t3\n" +
                                "Paralel bağlantı\tVar\n" +
                                "S/PDIF çıkış bağlayıcı\tVar\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "TPM bağlayıcı\tVar\n" +
                                "Şasi giriş bağlayıcı\tVar\n" +
                                "SATA III bağlantı sayısı\t4");
                        System.out.println();
                        break;

                    case 6 :
                        System.out.println("\n" +
                                "S/PDIF çıkış bağlayıcı\tVar\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "SATA III bağlantı sayısı\t4\n" +
                                "COM bağlayıcı sayısı\t1\n" +
                                "TPM bağlayıcı\tVar\n" +
                                "RGB LED pim başlığı\tVar\n" +
                                "USB 2.0 bağlayıcıları\t1\n" +
                                "CPU fan bağlayıcı\tVar\n" +
                                "12V güç konnektörü\tVar");
                        System.out.println();
                        break;
                }
                break;



            case 3:
                switch (urunsec)
                {
                    case 1 :
                        System.out.println("S/PDIF çıkış bağlayıcı\tVar\n" +
                                "USB 2.0 bağlayıcıları\t2\n" +
                                "SATA III bağlantı sayısı\t6\n" +
                                "CPU fan bağlayıcı\tVar\n" +
                                "COM bağlayıcı sayısı\t1");
                        System.out.println();
                        break;

                    case 2 :
                        System.out.println("\n" +
                                "SATA III bağlantı sayısı\t8\n" +
                                "USB 2.0 bağlayıcıları\t2" +
                                "Anakart form faktörü\tATX\n" +
                                "Bileşen\tPC\n" +
                                "Anakart yongası\tAMD X570");
                        System.out.println();
                        break;

                    case 3 :
                        System.out.println("Ses konektörü\tVar\n" +
                                "CPU fan bağlayıcı\tVar\n" +
                                "12V güç konnektörü\tVar\n" +
                                "Ön panel konektörü\tVar\n" +
                                "RGB LED pim başlığı\tVar\n" +
                                "USB 2.0 bağlayıcıları\t2\n" +
                                "Thunderbolt başlığı\t2\n" +
                                "COM bağlayıcı sayısı\t1\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "SATA III bağlantı sayısı\t4\n" +
                                "TPM bağlayıcı\tVar");
                        System.out.println();
                        break;

                    case 4 :
                        System.out.println("CPU fan bağlayıcı\tVar\n" +
                                "Şasi giriş bağlayıcı\tVar\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "TPM bağlayıcı\tVar\n" +
                                "USB 2.0 bağlayıcıları\t2\n" +
                                "SATA III bağlantı sayısı\t6\n" +
                                "Seri giriş başlıkları\t1\n" +
                                "Ön panel konektörü\tVar\n" +
                                "RGB LED pim başlığı\tVar\n" +
                                "12V güç konnektörü\tVar");
                        System.out.println();
                        break;
                    case 5 :
                        System.out.println("USB 2.0 bağlayıcıları\t2\n" +
                                "Ön panel ses bağlayıcısı\tVar\n" +
                                "SATA bağlayıcı sayısı\t4\n" +
                                "S/PDIF çıkış bağlayıcı\tVar\n" +
                                "EATX giç bağlayıcı sayısı\t1\n" +
                                "Ses konektörü\tVar\n" +
                                "CPU fan bağlayıcı\tVar");
                        System.out.println();
                        break;
                    case 6 :
                        System.out.println("TPM bağlayıcı\tVar\n" +
                                "Seri giriş başlıkları\t1\n" +
                                "SATA III bağlantı sayısı\t4\n" +
                                "USB 2.0 bağlayıcıları\t4\n" +
                                "Paralel bağlantı\tVar");
                        System.out.println();
                        break;
                }
                break;

        }

    }

    public String getAnakartAd() {
        return anakartAd;
    }

    public void setAnakartAd(String anakartAd) {
        this.anakartAd = anakartAd;
    }

    public float getAnakartFiyat() {
        return anakartFiyat;
    }

    public void setAnakartFiyat(float anakartFiyat) {
        this.anakartFiyat = anakartFiyat;
    }

    public String getAnaKartSoket() {
        return anaKartSoket;
    }

    public void setAnaKartSoket(String anaKartSoket) {
        this.anaKartSoket = anaKartSoket;
    }

    public boolean getDDR4destek() {
        return DDR4destek;
    }

    public void setDDR4destek(boolean DDR4destek) {
        this.DDR4destek = DDR4destek;
    }

    public boolean getM2destek() {
        return M2destek;
    }

    public void setM2destek(boolean m2destek) {
        M2destek = m2destek;
    }

    public String getGrafikAraBirimi() {
        return GrafikAraBirimi;
    }

    public void setGrafikAraBirimi(String grafikAraBirimi) {
        GrafikAraBirimi = grafikAraBirimi;
    }
}
