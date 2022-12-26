public class Monster extends HazirBilgisayarSec{

    private String monsterSeriAd;
    private String monsterBilgisayarAd;
    private float monsterFiyat;


    Monster(Kullanici kullanici, String marka)
    {
        super(kullanici,marka);

    }

    @Override
    void MarkaninBilgisayarSerileri() {


        int seriSec=0;
        System.out.println(" ------MONSTER Serileri------ ");
        System.out.println("1- ABRA Serisi");
        System.out.println("2- TULPAR Serisi");
        System.out.println("3- SEMRUK Serisi");
        System.out.println("4- HUMA Serisi");
        System.out.print("Seciminiz : ");
        seriSec = scanner.nextInt();

        while(seriSec <1 || seriSec>4)
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin :");
            seriSec = scanner.nextInt();
        }


        switch (seriSec)
        {
            default:
            case 1:
                setMonsterSeriAd("ABRA");
                setMarkaSeriAd("ABRA");
                setMarka("Monster");
                int abraSec=0;
                System.out.println("1-) Abra A7 V14.2 17,3 - Gaming Laptop");
                System.out.println("2-) Abra A5 V17.2.1 15,6 - Gaming Laptop");
                System.out.print("Seciminiz : ");
                abraSec = scanner.nextInt();

                try {
                    if (abraSec==1)
                    {
                        setMonsterBilgisayarAd("Abra A7 V14.2 17,3\" Oyun Bilgisayarı");
                        setMonsterFiyat(22699.00F);

                        setMarkaBilgisayarAd("Abra A7 V14.2 17,3\" Oyun Bilgisayarı");
                        setMarkaBilgisayarFiyat(22699.00F);

                    }
                    else if(abraSec==2)
                    {
                        setMonsterBilgisayarAd("Abra A5 V17.2.1 15,6\" Gaming Laptop");
                        setMonsterFiyat(20099.00F);

                        setMarkaBilgisayarAd("Abra A5 V17.2.1 15,6\" Gaming Laptop");
                        setMarkaBilgisayarFiyat(20099.00F);

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



            case 2: //TULPAR();
                setMonsterSeriAd("TULPAR");
                setMarkaSeriAd("TULPAR");
                setMarka("Monster");
                int tulparSec=0;
                System.out.println("1-) Tulpar T7 V20.5 17,3 - Gaming Laptop");
                System.out.println("2-) Tulpar T7 V20.5.6 17,3 - Gaming Laptop");
                System.out.println("3-) Tulpar T7 V21.9 17,3 - Gaming Laptop");
                System.out.print("Seciminiz : ");
                tulparSec = scanner.nextInt();

                try {
                    if (tulparSec==1)
                    {
                        setMonsterBilgisayarAd("Tulpar T7 V20.5 17,3 - Gaming Laptop");
                        setMonsterFiyat(27899.00F);

                        setMarkaBilgisayarAd("Tulpar T7 V20.5 17,3 - Gaming Laptop");
                        setMarkaBilgisayarFiyat(27899.00F);

                    }
                    else if(tulparSec==2)
                    {
                        setMonsterBilgisayarAd("Tulpar T7 V20.5.6 17,3 - Gaming Laptop");
                        setMonsterFiyat(31299.00F);

                        setMarkaBilgisayarAd("Tulpar T7 V20.5.6 17,3 - Gaming Laptop");
                        setMarkaBilgisayarFiyat(31299.00F);
                    }
                    else if(tulparSec==3)
                    {
                        setMonsterBilgisayarAd("Tulpar T7 V21.9 17,3 - Gaming Laptop");
                        setMonsterFiyat(42999.00F);

                        setMarkaBilgisayarAd("Tulpar T7 V21.9 17,3 - Gaming Laptop");
                        setMarkaBilgisayarFiyat(42999.00F);
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




            case 3:// SEMRUK();
                setMonsterSeriAd("SEMRUK");
                setMarkaSeriAd("SEMRUK");
                setMarka("Monster");
                int semrukSec=0;
                System.out.println("1-) Semruk S7 V8.1.2 17,3 - Gaming Laptop");
                System.out.println("2-) Semruk S7 V8.1.1 17,3 - Gaming Laptop");
                System.out.println("3-) Semruk S7 V8.1.3 17,3 - Gaming Laptop");
                System.out.print("Seciminiz : ");
                semrukSec=scanner.nextInt();
                try {
                    if (semrukSec==1)
                    {
                        setMonsterBilgisayarAd("Semruk S7 V8.1.2 17,3 - Gaming Laptop");
                        setMonsterFiyat(149999.00F);

                        setMarkaBilgisayarAd("Semruk S7 V8.1.2 17,3 - Gaming Laptop");
                        setMarkaBilgisayarFiyat(149999.00F);

                    }
                    else if(semrukSec==2)
                    {
                        setMonsterBilgisayarAd("Semruk S7 V8.1.1 17,3 - Gaming Laptop");
                        setMonsterFiyat(89999.00F);

                        setMarkaBilgisayarAd("Semruk S7 V8.1.1 17,3 - Gaming Laptop");
                        setMarkaBilgisayarFiyat(89999.00F);
                    }
                    else if(semrukSec==3)
                    {
                        setMonsterBilgisayarAd("Semruk S7 V8.1.3 17,3 - Gaming Laptop");
                        setMonsterFiyat(79999.00F);

                        setMarkaBilgisayarAd("Semruk S7 V8.1.3 17,3 - Gaming Laptop");
                        setMarkaBilgisayarFiyat(79999.00F);
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
            case 4: //HUMA();
                setMonsterSeriAd("HUMA");
                setMarkaSeriAd("HUMA");
                setMarka("Monster");
                int humaSec=0;
                System.out.println("1-) Huma H4 V4.1.1 14,1 - Business Computer");
                System.out.println("2-) Huma H4 V4.1 14,1 - Business Computer");
                System.out.println("3-) Huma H5 V3.1.1 15,6 - Business Computer");
                System.out.println("4-) Huma H5 V3.2.1 15,6 - Business Computer");
                System.out.print("Seciminiz : ");
                humaSec=scanner.nextInt();

                try {
                    if (humaSec==1)
                    {
                        setMonsterBilgisayarAd("Huma H4 V4.1.1 14,1 - Business Computer");
                        setMonsterFiyat(25999.00F);

                        setMarkaBilgisayarAd("Huma H4 V4.1.1 14,1 - Business Computer");
                        setMarkaBilgisayarFiyat(25999.00F);

                    }
                    else if(humaSec==2)
                    {
                        setMonsterBilgisayarAd("Huma H4 V4.1 14,1 - Business Computer");
                        setMonsterFiyat(20499.00F);

                        setMarkaBilgisayarAd("Huma H4 V4.1 14,1 - Business Computer");
                        setMarkaBilgisayarFiyat(20499.00F);
                    }
                    else if(humaSec==3)
                    {
                        setMonsterBilgisayarAd("Huma H5 V3.1.1 15,6 - Business Computer");
                        setMonsterFiyat(16599.00F);

                        setMarkaBilgisayarAd("Huma H5 V3.1.1 15,6 - Business Computer");
                        setMarkaBilgisayarFiyat(16599.00F);
                    }
                    else if(humaSec==4)
                    {
                        setMonsterBilgisayarAd("Huma H5 V3.2.1 15,6 - Business Computer");
                        setMonsterFiyat(18399.00F);

                        setMarkaBilgisayarAd("Huma H5 V3.2.1 15,6 - Business Computer");
                        setMarkaBilgisayarFiyat(18399.00F);
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

        if(getMonsterSeriAd().equalsIgnoreCase("ABRA"))
        {
            if( getMonsterBilgisayarAd().equals("Abra A7 V14.2 17,3 - Gaming Laptop"))
            {
                System.out.println("\n");

                System.out.println("Teknik Ozellikleri : ");
                System.out.println("Intel® Alder Lake Core™ i5-12500H 12C/16T; 18MB L3; E-CORE Max 3.30GHZ P-CORE Max 4.5GHZ;45W ;10nm SuperFin\n" +
                        "4 GB RTX 3050 Ti 128-Bit Max-P 80Watt + 15 Watt DB 2.0\n" +
                        "17,3\" FHD 1920x1080 144Hz IPS Mat LED Ekran\n" +
                        "8GB (1x8GB) DDR4 1.2V 3200MHz SODIMM\n" +
                        "500GB PCIe M.2 2280 3.0 x4\n" +
                        "FreeDos (İşletim sistemi bulunmamaktadır.\n" +
                        "2 Adet Disk Desteği (2x M.2 SSD)\n" +
                        "RGB Tek Bölge Aydınlatmalı Klavye\n" +
                        "24,9mm Kalınlık\n" +
                        "2,5kg Ağırlık\n" +
                        "Güçlendirilmiş Plastik Kasa Yapısı");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            if ( getMonsterBilgisayarAd().equals("Abra A5 V17.2.1 15,6 - Gaming Laptop"))
            {
                System.out.println("\n-------------------------------------------------------------------------------");
                System.out.println("Teknik Ozellikleri : ");
                System.out.println("Intel® Tiger Lake Core™ i5-11400H 6C/12T; 12MB L3; 8GT/s; 2.7GHz > 4.5GHz; 45W; 10nm SuperFin\n" +
                        "Windows 11 Home Single Language\n" +
                        "Nvidia RTX3050 TI Max-Performance 4GB GDDR6 128-Bit DX12\n" +
                        "15,6\" FHD 1920x1080 144Hz AHVA Mat LED Ekran\n" +
                        "16GB (2x8GB) DDR4 1.2V 3200MHz SODIMM\n" +
                        "500GB PCIe M.2 2280 3.0 x4\n" +
                        "3 Adet Disk Desteği (2x M.2 SSD + 1x 2.5\" Disk)\n" +
                        "RGB Tek Bölge Aydınlatmalı Klavye\n" +
                        "24,9mm Kalınlık\n" +
                        "2,2kg Ağırlık\n" +
                        "Alüminyum İle Güçlendirilmiş Kasa");
                System.out.println("\n-------------------------------------------------------------------------------");

            }

        } else if (getMonsterSeriAd().equalsIgnoreCase("TULPAR"))
        {
            if( getMonsterBilgisayarAd().equals("Tulpar T7 V20.5 17,3 - Gaming Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");

                System.out.println("");

                System.out.println("•Intel® Alder Lake Core™ i7-12700H 14C/20T; 24MB L3; E-CORE Max 3.50GHZ P-CORE Max 4.7GHZ;45W ;10nm SuperFin\r\n"
                        + "• Nvidia RTX3060 Max-Performance 6GB GDDR6 192-Bit\r\n"
                        + "• 17,3\" FHD 1920x1080 144Hz IPS Mat LED Ekran\r\n"
                        + "• 16GB (2x8GB) DDR4 3200MHz\r\n"
                        + "• 512GB SAMSUNG PM991A M.2 SSD PCIe 3.0 x4\r\n"
                        + "• FreeDos (İşletim sistemi bulunmamaktadır)\r\n"
                        + "• 2 Adet Disk Desteği (2x M.2 SSD)\r\n"
                        + "• RGB Tek Bölge Aydınlatmalı Klavye (Türkçe Q)\r\n"
                        + "• 30,05mm Kalınlık\r\n"
                        + "• 2,5kg Ağırlık\r\n"
                        + "• Güçlendirilmiş Plastik Kasa\r\n");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getMonsterBilgisayarAd().equals("Tulpar T7 V20.5.6 17,3 - Gaming Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Intel® Alder Lake Core™ i7-12700H 14C/20T; 24MB L3; E-CORE Max 3.50GHZ P-CORE Max 4.7GHZ;45W ;10nm SuperFin\r\n"
                        + "• Nvidia RTX3060 Max-Performance 6GB GDDR6 192-Bit\r\n"
                        + "• 17,3\" FHD 1920x1080 144Hz IPS Mat LED Ekran\r\n"
                        + "• 32GB (2x16GB) DDR4 3200MHz\r\n"
                        + "• 1TB PCIe M.2 2280 3.0 x4\r\n"
                        + "• FreeDos (İşletim sistemi bulunmamaktadır)\r\n"
                        + "• 2 Adet Disk Desteği (2x M.2 SSD)\r\n"
                        + "• RGB Tek Bölge Aydınlatmalı Klavye (Türkçe Q)\r\n"
                        + "• 30,05mm Kalınlık\r\n"
                        + "• 2,5kg Ağırlık\r\n"
                        + "• Güçlendirilmiş Plastik Kasa\r\n");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getMonsterBilgisayarAd().equals("Tulpar T7 V21.9 17,3 - Gaming Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Intel® Alder Lake Core™ i7-12700H 14C/20T; 24MB L3; E-CORE Max 3.50GHZ P-CORE Max 4.7GHZ;45W ;10nm SuperFin\r\n"
                        + "• 8 GB RTX 3070Ti 256 Bit Max-P 125 Watt + 25Watt DB 2.0\r\n"
                        + "• 17,3\" QHD 2560x1440 165Hz IPS Mat LED Ekran\r\n"
                        + "• 16GB (2x8GB) DDR5 4800MHz\r\n"
                        + "• 512GB SAMSUNG PM991A M.2 SSD PCIe 3.0 x4\r\n"
                        + "• FreeDos (İşletim sistemi bulunmamaktadır.)\r\n"
                        + "• 2 Adet Disk Desteği (2x M.2 SSD)\r\n"
                        + "• RGB 4 Bölge Aydınlatmalı Klavye (Türkçe Q)\r\n"
                        + "• 20mm Kalınlık\r\n"
                        + "• 2,3kg Ağırlık\r\n"
                        + "• Magnezyum Kasa");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }else if (getMonsterSeriAd().equalsIgnoreCase("SEMRUK"))
        {
            if(getMonsterBilgisayarAd().equals("Semruk S7 V8.1.2 17,3 - Gaming Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Intel Rocket Lake Core™ i9-11900K 8C/16T; 16MB L3; 8GT/s; 3.5GHz>5.3GHz; 125W; 14nm\r\n"
                        + "• Windows 11 Pro\r\n"
                        + "• Nvidia RTX3080 Max-Performance 16GB GDDR6 256-Bit\r\n"
                        + "• 17,3\" UHD 3840x2160 %100 Adobe RGB IPS Mat LED Ekran\r\n"
                        + "• 128GB (4x32GB) DDR4 1.2V 2933MHz\r\n"
                        + "• 3x 2TB SAMSUNG PM9A1 M.2 SATA NVME SSD\r\n"
                        + "• 4 Adet Disk Desteği (4x M.2 SSD)\r\n"
                        + "• Özelleştirilebilir RGB Aydınlatmalı Klavye\r\n"
                        + "• 43.5mm İncelik\r\n"
                        + "• 4,5 Kg Ağırlık\r\n");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if(getMonsterBilgisayarAd().equals("Semruk S7 V8.1.1 17,3 - Gaming Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Intel Rocket Lake Core™ i9-11900K 8C/16T; 16MB L3; 8GT/s; 3.5GHz > 5.3GHz; 125W; 14nm\r\n"
                        + "• Windows 11 Pro\r\n"
                        + "• Nvidia RTX3080 Max-Performance 16GB GDDR6 256-Bit\r\n"
                        + "• 17,3\" UHD 3840x2160 %100 Adobe RGB IPS Mat LED Ekran\r\n"
                        + "• 32GB (2x16GB) DDR4 1.2V 3200MHz\r\n"
                        + "• 1TB PCIe M.2 2280 3.0 x4\r\n"
                        + "• 4 Adet Disk Desteği (4x M.2 SSD)\r\n"
                        + "• Özelleştirilebilir RGB Aydınlatmalı Klavye\r\n"
                        + "• 43.5mm İncelik\r\n"
                        + "• 4,5 Kg Ağırlık");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if(getMonsterBilgisayarAd().equals("Semruk S7 V8.1.3 17,3 - Gaming Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Intel Rocket Lake Core™ i9-11900K 8C/16T; 16MB L3; 8GT/s; 3.5GHz > 5.3GHz; 125W; 14nm\r\n"
                        + "• Windows 11 Pro\r\n"
                        + "• Nvidia RTX3080 Max-Performance 16GB GDDR6 256-Bit\r\n"
                        + "• 17,3\" QHD 2560x1440 165Hz %100 sRGB IPS Mat LED Ekran\r\n"
                        + "• 32GB (2x16GB) DDR4 1.2V 3200MHz\r\n"
                        + "• 1TB PCIe M.2 2280 3.0 x4\r\n"
                        + "• 4 Adet Disk Desteği (4x M.2 SSD)\r\n"
                        + "• Özelleştirilebilir RGB Aydınlatmalı Klavye\r\n"
                        + "• 43.5mm İncelik\r\n"
                        + "• 4,5 Kg Ağırlık\r\n");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }else if (getMonsterSeriAd().equalsIgnoreCase("HUMA"))
        {
            if(getMonsterBilgisayarAd().equals("Huma H4 V4.1.1 14,1 - Business Computer")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Intel i7-1165G7-2,8GHz Turbo Boost ile 4,7GHz\r\n"
                        + "• Windows 11 Home Single Language\r\n"
                        + "• Intel® Iris® Xe Graphics (96 Yürütme Birimi)\r\n"
                        + "• 14,1\" FHD 1920x1200 %100 sRGB IPS Mat LED Ekran\r\n"
                        + "• 32GB (2x16GB) DDR4 3200MHz\r\n"
                        + "• 1TB PCIe M.2 2280 3.0 x4\r\n"
                        + "• 2 Adet Disk Desteği (2x M.2 SSD)\r\n"
                        + "• Beyaz Arka Aydınlatmalı Klavye\r\n"
                        + "• 13-15mm İncelik\r\n"
                        + "• 0.99Kg Ağırlık\r\n"
                        + "• Magnezyum");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if(getMonsterBilgisayarAd().equals("Huma H4 V4.1 14,1 - Business Computer")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Intel i7-1165G7-2,8GHz Turbo Boost ile 4,7GHz\r\n"
                        + "• Intel® Iris® Xe Graphics (96 Yürütme Birimi)\r\n"
                        + "• 14,1\" FHD 1920x1200 %100 sRGB IPS Mat LED Ekran\r\n"
                        + "• 16GB (2x8GB) DDR4 3200MHz\r\n"
                        + "• 512GB SAMSUNG PM991A M.2 SSD PCIe 3.0 x4\r\n"
                        + "• FreeDos (İşletim sistemi bulunmamaktadır)\r\n"
                        + "• 2 Adet Disk Desteği (2x M.2 SSD)\r\n"
                        + "• Beyaz Arka Aydınlatmalı Klavye\r\n"
                        + "• 13-15mm İncelik\r\n"
                        + "• 0.99Kg Ağırlık");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if(getMonsterBilgisayarAd().equals("Huma H5 V3.1.1 15,6 - Business Computer")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Intel i5-1135G7 4C/8T; 8MB L3; 4GT/s; 2,4 GHz > 4.2GHz; 28W; 10nm\r\n"
                        + "• Windows 11 Home Single Language\r\n"
                        + "• Intel® Iris® Xe Graphics (80 Yürütme Birimi)\r\n"
                        + "• 15,6\" FHD 1920x1080 165Hz IPS Mat LED Ekran\r\n"
                        + "• 16GB (2x8GB) DDR4 3200MHz\r\n"
                        + "• 1TB PCIe M.2 2280 3.0 x4\r\n"
                        + "• Beyaz Arka Aydınlatmalı Klavye\r\n"
                        + "• 16,7mm İncelik\r\n"
                        + "• 1.7Kg Ağırlık");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if(getMonsterBilgisayarAd().equals("Huma H5 V3.2.1 15,6 - Business Computer")) {
                System.out.println("");

                System.out.println("-------------------Teknik Özellikleri-----------------");
                System.out.println("");

                System.out.println("• Intel i7-1165G7 4C/8T; 12MB L3; 4GT/s; 2,8 GHz > 4.7GHz; 28W; 10nm\r\n"
                        + "• Windows 11 Home Single Language\r\n"
                        + "• Intel® Iris® Xe Graphics (96 Yürütme Birimi)\r\n"
                        + "• 15,6\" FHD 1920x1080 144Hz IPS Mat LED Ekran\r\n"
                        + "• 16GB (2x8GB) DDR4 1.2 3200MHz\r\n"
                        + "• 1TB PCIe M.2 2280 3.0 x4\r\n"
                        + "• Beyaz Arka Aydınlatmalı Klavye\r\n"
                        + "• 16,7mm İncelik\r\n"
                        + "• 1.7Kg Ağırlık");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }
    }

    public String getMonsterSeriAd() {
        return monsterSeriAd;
    }

    public void setMonsterSeriAd(String monsterSeriAd) {
        this.monsterSeriAd = monsterSeriAd;
    }

    public float getMonsterFiyat() {
        return monsterFiyat;
    }

    public void setMonsterFiyat(float monsterFiyat) {
        this.monsterFiyat = monsterFiyat;
    }

    public String getMonsterBilgisayarAd() {
        return monsterBilgisayarAd;
    }

    public void setMonsterBilgisayarAd(String monsterBilgisayarAd) {
        this.monsterBilgisayarAd = monsterBilgisayarAd;
    }

}