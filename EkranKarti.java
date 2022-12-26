public class EkranKarti extends Donanim {

    private String parcaTurAd="EkranKarti";
    private String ekranKartiAd = "null";
    private float ekranKartiFiyat = 0;
    int urunsec=0;


    EkranKarti(Kullanici kullanici,String parcaTurAd, String parcaAd,float parcaFiyat) {
        super(kullanici,parcaTurAd,parcaAd,parcaFiyat);
        this.parcaTurAd = parcaTurAd;
    }

    EkranKarti(Kullanici kullanici,String parcaTurAd) {
        super(kullanici,parcaTurAd);
    }

    EkranKarti(Kullanici kullanici)
    {
        super(kullanici);
    }


    @Override
    public int UrunSec() { //2


        AnaKart anaKartClass = new AnaKart(kullanici);

        System.out.println();
        System.out.println("     EKRAN KARTLARI     ");
        System.out.println("------------------------");
        System.out.println("1-Asus GeForce GT1030 GDDR5 OC 2GB 64Bit NVIDIA DX12 Ekran Kartı");
        System.out.println("2-ASUS GEFORCE DUAL-RTX3060-O8G 8GB GDDR6 192bit 1837MHz Ekran kartı");
        System.out.println("3-GIGABYTE RADEON RX 6700 XT GAMING OC 12GB GDDR6 192Bit AMD Ekran Kartı");
        System.out.println("4-ASUS GeForce GT1030 GDDR5 2GB 64Bit NVIDIA Ekran Kartı");
        System.out.println("5-MSI GEFORCE RTX 3060 VENTUS 2X OC 12GB GDDR6 192bit NVIDIA Ekran Kartı");
        System.out.println("6-SAPPHIRE RADEON RX 7900 XTX GAMING 24GB GDDR6 384Bit AMD Ekran Kartı");
        System.out.println("7-ASUS GeForce GTX 1660 SUPER Phoenix OC 6GB DDR6 192Bit DX12 Nvidia Ekran Kartı");
        System.out.println("8-ASUS GeForce TUF GTX 1660 SUPER GAMING OC 6GB GDDR6 192Bit DX12 Ekran Kartı");
        System.out.print("Seciminiz :  ");
        urunsec = scanner.nextInt();

        while ( urunsec<1 || urunsec>8) //try-catch gelecek
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
            urunsec = scanner.nextInt();
        }

        switch (urunsec)
        {
            case 1 :
                setParcaAd("Asus GeForce GT1030 GDDR5 OC 2GB 64Bit NVIDIA DX12 Ekran Kartı");
                setParcaFiyat(2358.99F);
                if(anaKartClass.getGrafikAraBirimi().equals("PCI-Express 3.0"))
                {
                    System.out.println("ANAKART ILE EKRANKARTI BIRBIRIYLE UYUMLUDUR!\n");
                }
                else
                {
                    System.out.println("ANAKART ILE EKRANKARTI UYSUMADIGINDAN VERIMLILIK DUSECEK!\n");
                }
                break;

            case 2 :
                setParcaAd("ASUS GEFORCE DUAL-RTX3060-O8G 8GB GDDR6 192bit 1837MHz Ekran kartı");
                setParcaFiyat(9634.06F);
                if(anaKartClass.getGrafikAraBirimi().equals("PCI-Express 4.0"))
                {
                    System.out.println("ANAKART ILE EKRANKARTI BIRBIRIYLE UYUMLUDUR!\n");
                }
                else
                {
                    System.out.println("ANAKART ILE EKRANKARTI UYSUMADIGINDAN VERIMLILIK DUSECEK!\n");
                }
                break;

            case 3 :
                setParcaAd("GIGABYTE RADEON RX 6700 XT GAMING OC 12GB GDDR6 192Bit AMD Ekran Kartı");
                setParcaFiyat(24935.10F);
                if(anaKartClass.getGrafikAraBirimi().equals("PCI-Express 4.0"))
                {
                    System.out.println("ANAKART ILE EKRANKARTI BIRBIRIYLE UYUMLUDUR!\n");
                }
                else
                {
                    System.out.println("ANAKART ILE EKRANKARTI UYSUMADIGINDAN VERIMLILIK DUSECEK!\n");
                }
                break;

            case 4 :
                setParcaAd("ASUS GeForce GT1030 GDDR5 2GB 64Bit NVIDIA Ekran Kartı");
                setParcaFiyat(2341.89F);
                if(anaKartClass.getGrafikAraBirimi().equals("PCI-Express 3.0"))
                {
                    System.out.println("ANAKART ILE EKRANKARTI BIRBIRIYLE UYUMLUDUR!\n");
                }
                else
                {
                    System.out.println("ANAKART ILE EKRANKARTI UYSUMADIGINDAN VERIMLILIK DUSECEK!\n");
                }
                break;

            case 5 :
                setParcaAd("MSI GEFORCE RTX 3060 VENTUS 2X OC 12GB GDDR6 192bit NVIDIA Ekran Kartı");
                setParcaFiyat(13719F);
                if(anaKartClass.getGrafikAraBirimi().equals("PCI-Express 4.0"))
                {
                    System.out.println("ANAKART ILE EKRANKARTI BIRBIRIYLE UYUMLUDUR!\n");
                }
                else
                {
                    System.out.println("ANAKART ILE EKRANKARTI UYSUMADIGINDAN VERIMLILIK DUSECEK!\n");
                }
                break;

            case 6 :
                setParcaAd("SAPPHIRE RADEON RX 7900 XTX GAMING 24GB GDDR6 384Bit AMD Ekran Kartı");
                setParcaFiyat(28119F);
                if(anaKartClass.getGrafikAraBirimi().equals("AMD Radeon RX 7900 XTX"))
                {
                    System.out.println("ANAKART ILE EKRANKARTI BIRBIRIYLE UYUMLUDUR!\n");
                }
                else
                {
                    System.out.println("ANAKART ILE EKRANKARTI UYSUMADIGINDAN VERIMLILIK DUSECEK!\n");
                }
                break;

            case 7 :
                setParcaAd("ASUS GeForce GTX 1660 SUPER Phoenix OC 6GB DDR6 192Bit DX12 Nvidia Ekran Kartı");
                setParcaFiyat(6040F);
                if(anaKartClass.getGrafikAraBirimi().equals("PCI-Express 3.0"))
                {
                    System.out.println("ANAKART ILE EKRANKARTI BIRBIRIYLE UYUMLUDUR!\n");
                }
                else
                {
                    System.out.println("ANAKART ILE EKRANKARTI UYSUMADIGINDAN VERIMLILIK DUSECEK!\n");
                }
                break;

            case 8 :
                setParcaAd("ASUS GeForce TUF GTX 1660 SUPER GAMING OC 6GB GDDR6 192Bit DX12 Ekran Kartı");
                setParcaFiyat(6766F);
                if(anaKartClass.getGrafikAraBirimi().equals("PCI-Express 3.0"))
                {
                    System.out.println("ANAKART ILE EKRANKARTI BIRBIRIYLE UYUMLUDUR!\n");
                }
                else
                {
                    System.out.println("ANAKART ILE EKRANKARTI UYSUMADIGINDAN VERIMLILIK DUSECEK!\n");
                }
                break;

        }

        return urunsec;

    }




    @Override
    public void ParcaBilgilendirme() { //1

        setParcaTurAd("EkranKarti"); //Donanim classında EkranKarti ile ilgili işlemler yapılması için

        System.out.println();
        System.out.println(" ---------------------------------------- EKRAN KARTI ---------------------------------------- \n");
        System.out.println("Ekran kartı, bilgisayarın monitöre görüntü vermesini sağlayan bilgisayar donanımına verilen addır. \n" +
                "GPU (Graphic Processing Unit kelimesinin kısaltılmışı) veya Grafik İşlemci Ünitesi olarak da bilinir. \n" +
                "Ekran kartları; harici ayrı bir kart olarak ya da işlemci ünitesine tümleşik (paylaşımlı) olarak da bulunabilmektedir.\n" +
                "\n" +
                "Ekran kartları, bilgisayar içerisinde üretilen yazı ve grafikleri VGA, DVI veya HDMI gibi aktarma donanımları ile\n" +
                "monitöre iletirler. GPU'lar (harici olanlar), anakart üzerinde bulunan çeşitli veri yolları üzerine konumlandırılır. \n" +
                "Günümüzde ekran kartlarının takıldığı en çok kullanılan veri yolu PCI-e olsa da PCI ve PCI-X gibi çeşitli veri yollarına \n" +
                "da takılabilen ekran kartları bulunmaktadır. Ayrıca, Multi-GPU denilen birden fazla ekran kartının takılabildiği sistemler \n" +
                "için Crossfire ve SLI gibi teknolojiler geliştirilmiştir. Günümüz ekran kartlarında pek çok donanım arabirimi bulunmakla \n" +
                "birlikte kartın işlemci gücü ve mimari yapısı büyüdükçe enerji tüketimi de doğru orantılı olarak artar.\n");

        System.out.println("\n");

    }

    @Override
    public void TeknikBilgi() { //3


        System.out.println("\n");
        System.out.println(urunsec + ". " + getParcaAd() + " TEKNIK BILGISI :");
        System.out.println("________________________________________________\n");

        switch (urunsec)
        {
            case 1 :
                System.out.println("FireStream\tYok\n" +
                        "I·şlemci frekansı\t1252 MHz\n" +
                        "Grafik işlemci ailesi\tNVIDIA®\n" +
                        "İşlemci artma saati hızı\t1506 MHz\n" +
                        "Grafik işlemci\tGeForce GT 1030\n" +
                        "CUDA çekirdekleri\t384\n" +
                        "Maksimum çözünürlük\t1920 x 1200\n" +
                        "CUDA\tVar");
                System.out.println();
                break;

            case 2 :
                System.out.println("Ekran Kartı Chipset Marka\tNVIDIA\n" +
                        "Grafik İşlemci\tGeForce RTX 3060\n" +
                        "Grafik İşlemci\tGeForce RTX 3060\n" +
                        "  \n" +
                        "Bellek Arayüzü\t192 Bit\n" +
                        "VGA Slot\tPCI Express 4.0");
                System.out.println();
                break;

            case 3 :
                System.out.println("Grafik işlemci\tRadeon RX 6700 XT\n" +
                        "CUDA\tYok\n" +
                        "Grafik işlemci ailesi\tAMD®\n" +
                        "Akış işlemcileri\t2560\n" +
                        "Maksimum çözünürlük\t7680 x 4320");
                System.out.println("Form faktörü\tFull-Height/Full-Length (FH/FL)\n" +
                        "Soğutma teknolojisi\tGIGABYTE WINDFORCE 3X\n" +
                        "Destek yüksekliği\tFull-Height (FH)\n" +
                        "Işıklandırma rengi\tÇok aşamalı\n" +
                        "Fan çapı\t8 cm\n" +
                        "Soğutma türü\tAktif\n" +
                        "Ürün rengi\tSiyah, Paslanmaz çelik\n" +
                        "Aydınlatme\tVar\n" +
                        "Fan sayısı\t3 fan(lar)");
                System.out.println();
                break;

            case 4 :
                System.out.println("Grafik işlemci\tGeForce GT 1030\n" +
                        "Maksimum çözünürlük\t1920 x 1200\n" +
                        "CUDA\tVar\n" +
                        "İşlemci artma saati hızı\t1506 MHz\n" +
                        "FireStream\tYok\n" +
                        "I·şlemci frekansı\t1266 MHz\n" +
                        "Grafik işlemci ailesi\tNVIDIA®\n" +
                        "OpenGL versiyonu\t4.5\n" +
                        "HDCP\tVar\n" +
                        "PhysX\tVar\n" +
                        "DirectX versiyonu\t12.0");
                System.out.println();
                break;

            case 5 :
                System.out.println("Grafik işlemci\tGeForce RTX 3060\n" +
                        "FireStream\tYok\n" +
                        "Maksimum çözünürlük\t7680 x 4320\n" +
                        "CUDA çekirdekleri\t3584\n" +
                        "CUDA\tVar\n" +
                        "Grafik işlemci ailesi\tNVIDIA®\n" +
                        "Çift sıralı DVI\tYok\n" +
                        "NVIDIA G-SYNC\tVar\n" +
                        "OpenGL versiyonu\t4.6\n" +
                        "HDCP\tVar\n" +
                        "DirectX versiyonu\t12.0\n" +
                        "Entegre TV ayarlayıcı\tYok");
                System.out.println();
                break;

            case 6 :
                System.out.println("Ekran Kartı Chipset Marka\tAMD®\n" +
                        "  İzle\n" +
                        "Grafik İşlemci\tRadeon RX 7900 XTX\n" +
                        "Çekirdek Hızı\t2300 MHz\n" +
                        "Çekirdek Hızı Maks.\t2500 MHz\n" +
                        "Çekirdek Hücre Sayısı\t6144 Stream\n" +
                        "Bellek Tipi\tGDDR6\n" +
                        "Bellek Kapasitesi\t24GB\n" +
                        "Bellek Hızı\t20000 MHz\n" +
                        "Bellek Arayüzü\t384 Bit\n" +
                        "HDMI\t1\n" +
                        "DisplayPort\t2\n" +
                        "TYPE-C\t1\n" +
                        "Maks. Çözünürlük\t7680 x 4320\n" +
                        "Soğutma\tFanlı Soğutma\n" +
                        "  İzle\n" +
                        "Soğutma Fan Sayısı\t3\n" +
                        "Güç Tüketimi\t355W\n" +
                        "Direct X\t12\n" +
                        "VGA Slot\tPCI Express 4.0\n" +
                        "Boyutlar (cm)\t28.7x12.37x5.125");
                System.out.println();
                break;

            case 7 :
                System.out.println("I·şlemci frekansı\t1530 MHz\n" +
                        "Grafik işlemci\tGeForce GTX 1660 SUPER\n" +
                        "Grafik işlemci ailesi\tNVIDIA®\n" +
                        "Maksimum çözünürlük\t7680 x 4320\n" +
                        "CUDA\tVar\n" +
                        "CUDA çekirdekleri\t1408\n" +
                        "İşlemci artma saati hızı\t1830 MHz\n" +
                        "Entegre TV ayarlayıcı\tYok\n" +
                        "OpenGL versiyonu\t4.6\n" +
                        "HDCP\tVar");
                System.out.println();
                break;

            case 8 :
                System.out.println("Maksimum çözünürlük\t7680 x 4320\n" +
                        "CUDA\tVar\n" +
                        "CUDA çekirdekleri\t1408\n" +
                        "FireStream\tYok\n" +
                        "I·şlemci frekansı\t1530 MHz\n" +
                        "İşlemci artma saati hızı\t1860 MHz\n" +
                        "Grafik işlemci\tGeForce GTX 1660 SUPER\n" +
                        "Grafik işlemci ailesi\tNVIDIA®\n" +
                        "NVIDIA G-SYNC\tVar\n" +
                        "Çift sıralı DVI\tVar\n" +
                        "PhysX\tVar\n" +
                        "Entegre TV ayarlayıcı\tYok\n" +
                        "DirectX versiyonu\t12.0\n" +
                        "HDCP\tVar\n" +
                        "NVIDIA GameWorks VR\tVar\n" +
                        "OpenGL versiyonu\t4.6");
                System.out.println();
                break;

        }


    }

    public String getEkranKartiAd() {
        return ekranKartiAd;
    }

    public void setEkranKartiAd(String ekranKartiAd) {
        this.ekranKartiAd = ekranKartiAd;
    }

    public float getEkranKartiFiyat() {
        return ekranKartiFiyat;
    }

    public void setEkranKartiFiyat(float ekranKartiFiyat) {
        this.ekranKartiFiyat = ekranKartiFiyat;
    }
}
