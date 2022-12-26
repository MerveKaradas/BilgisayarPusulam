public class Bellek extends Donanim {

    private String parcaTurAd="Bellek";
    private String bellekAd = "null";
    private float bellekFiyat = 0;

    int urunsec=0;
    boolean DDRdestek = false;
    int secenek =0;


    Bellek(Kullanici kullanici,String parcaTurAd, String parcaAd,float parcaFiyat) {
        super(kullanici,parcaTurAd,parcaAd,parcaFiyat);
        this.parcaTurAd = parcaTurAd;
    }

    Bellek(Kullanici kullanici,String parcaTurAd) {
        super(kullanici,parcaTurAd);
    }

    Bellek(Kullanici kullanici)
    {
        super(kullanici);
    }


    @Override
    public int UrunSec() { //2




        System.out.println("     BELLEKLER     ");
        System.out.println("--------------------");

        AnaKart anaKartClass = new AnaKart(kullanici);



        if(anaKartClass.getDDR4destek() == true) //DDR4 Destekleyen Anakartlar
        {
            DDRdestek=true;
            secenek=8;
            System.out.println("1-GSKILL 16GB (2x8GB) TRIDENT Z DDR4 4000MHz CL18 1.35V Dual Kit RGB LED Ram");
            System.out.println("2-Micron 64GB DDR4 3200MHz 2Rx4 RDIMM CL22 Server Ram");
            System.out.println("3-GSKILL 32GB (2x16GB) TRIDENT Z DDR4 4000MHz CL18 1.40V Dual Kit RGB LED Ram");
            System.out.println("4-Micron 128GB DDR4 3200MHz 4Rx4 LRDIMM CL22 Server Ram");
            System.out.println("5-GSKILL 32GB (2x16GB) TRIDENT Z DDR4 4400MHz CL19 1.5V Dual Kit RGB LED PC Ram");
            System.out.println("6-GSKILL 64GB (2x32GB) TRIDENT Z5 SİYAH DDR5 6000MHz CL32 1.40V RGB PC Ram");
            System.out.println("7-Crucial 64GB (2x32GB) DDR5 4800MHz CL40 1.1V Notebook Dual Kit Ram");
            System.out.println("8-GSKILL 8GB (1x8GB) RipjawsV Siyah DDR4 3200Mhz CL16 1.35V Tek Modül Ram");
        }
        else
        {
            DDRdestek=false;
            secenek=5;
            System.out.println("1-GSKILL 32GB (2x16GB) TRIDENT Z5 Siyah DDR5 6000MHz CL32 1.35V RGB PC Ram");
            System.out.println("2-GSKILL 32GB (2x16GB) Ripjaws S5 Siyah DDR5 5200MHz CL36 1.20V Dual Kit Ram");
            System.out.println("3-GSKILL 64GB (2x32GB) TRIDENT Z5 SİYAH DDR5 6000MHz CL32 1.40V RGB PC Ram");
            System.out.println("4-GSKILL 8GB Value DDR3L 1600Mhz CL11 1.35V Tek Modül Notebook Ram");
            System.out.println("5-GSKILL 8GB Value DDR3 1600MHz CL11 Tek Modül Ram");

        }


        System.out.print("Seciminiz :  ");
        urunsec = scanner.nextInt();

        while ( urunsec<1 || urunsec>secenek) //try-catch gelecek
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
            urunsec = scanner.nextInt();
        }


        if(DDRdestek) //DDR4 Destekleyenler
        {
            switch (urunsec)
            {
                case 1 :
                    setParcaAd("GSKILL 16GB (2x8GB) TRIDENT Z DDR4 4000MHz CL18 1.35V Dual Kit RGB LED Ram");
                    setParcaFiyat(2814.6F);
                    break;

                case 2 :
                    setParcaAd("Micron 64GB DDR4 3200MHz 2Rx4 RDIMM CL22 Server Ram");
                    setParcaFiyat(5242F);
                    break;

                case 3 :
                    setParcaAd("GSKILL 32GB (2x16GB) TRIDENT Z DDR4 4000MHz CL18 1.40V Dual Kit RGB LED Ram");
                    setParcaFiyat(3923F);
                    break;

                case 4 :
                    setParcaAd("Micron 128GB DDR4 3200MHz 4Rx4 LRDIMM CL22 Server Ram");
                    setParcaFiyat(16909.99F);
                    break;

                case 5 :
                    setParcaAd("GSKILL 32GB (2x16GB) TRIDENT Z DDR4 4400MHz CL19 1.5V Dual Kit RGB LED PC Ram");
                    setParcaFiyat(4203.89F);
                    break;

                case 6 :
                    setParcaAd("GSKILL 64GB (2x32GB) TRIDENT Z5 SİYAH DDR5 6000MHz CL32 1.40V RGB PC Ram");
                    setParcaFiyat(11119.98F);
                    break;

                case 7 :
                    setParcaAd("Crucial 64GB (2x32GB) DDR5 4800MHz CL40 1.1V Notebook Dual Kit Ram");
                    setParcaFiyat(7034.5F);
                    break;

                case 8 :
                    setParcaAd("GSKILL 8GB (1x8GB) RipjawsV Siyah DDR4 3200Mhz CL16 1.35V Tek Modül Ram");
                    setParcaFiyat(595F);
                    break;

            }
        }
        else //DDR4 Desteklemeyenler
        {
            switch (urunsec)
            {
                case 1 :
                    setParcaAd("GSKILL 32GB (2x16GB) TRIDENT Z5 Siyah DDR5 6000MHz CL32 1.35V RGB PC Ram");
                    setParcaFiyat(5708.89F);
                    break;

                case 2 :
                    setParcaAd("GSKILL 32GB (2x16GB) Ripjaws S5 Siyah DDR5 5200MHz CL36 1.20V Dual Kit Ram");
                    setParcaFiyat(4274.45F);
                    break;

                case 3 :
                    setParcaAd("GSKILL 64GB (2x32GB) TRIDENT Z5 SİYAH DDR5 6000MHz CL32 1.40V RGB PC Ram");
                    setParcaFiyat(11119F);
                    break;

                case 4 :
                    setParcaAd("GSKILL 8GB Value DDR3L 1600Mhz CL11 1.35V Tek Modül Notebook Ram");
                    setParcaFiyat(487F);
                    break;

                case 5 :
                    setParcaAd("GSKILL 8GB Value DDR3 1600MHz CL11 Tek Modül Ram");
                    setParcaFiyat(485F);
                    break;

            }
        }


        return urunsec;

    }




    @Override
    public void ParcaBilgilendirme() { //1

        setParcaTurAd("Bellek"); //Donanim classında Bellek ile ilgili işlemler yapılması için

        System.out.println();
        System.out.println(" ---------------------------------------- BELLEK ---------------------------------------- \n");
        System.out.println("Bellek bilgisayarı oluşturan 3 ana bileşenden biridir. İşlemcinin çalıştırdığı [[Bilgisayar \n" +
                "programı |programı, ]]lar ve programa ait bilgiler bellek üzerinde saklanır. Bellek geçici bir depolama alanıdır. \n" +
                "Bellek üzerindeki bilgiler güç kesildiği anda kaybolurlar. Bu nedenle bilgisayarlarda programları daha uzun süreli \n" +
                "ve kalıcı olarak saklamak için farklı birimler (sabit disk - CD - DVD) mevcuttur.\n" +
                "\n" +
                "Belleğe genellikle Random Access Memory (rastgele erişimli bellek) ifadesinin kısaltması olan RAM adı verilir. \n" +
                "Bu ad bellekte bir konuma rastgele ve hızlı bir şekilde erişebildiğimiz için verilmiştir. RAM'de sadece işlemcide çalışan \n" +
                "program parçaları tutulur ve elektrik kesildiği anda RAM'deki bilgiler silinir. Bilgilerin kalıcı olarak saklandığı yer disktir. \n");

        System.out.println("\n");

    }

    @Override
    public void TeknikBilgi() { //3


        System.out.println("\n");
        System.out.println(urunsec + ". " + getParcaAd() + " OZELLIKLER :");
        System.out.println("________________________________________________\n");


        if(DDRdestek)
        {
            switch (urunsec)
            {
                case 1 :
                    System.out.println("ECC\tYok\n" +
                            "Hafıza kanalları\tDual-channel\n" +
                            "SPD voltajı\t1.2 V\n" +
                            "Dahili hafıza tipi\tDDR4\n" +
                            "CAS latens\t18\n" +
                            "Hafıza voltajı\t1.35 V\n" +
                            "SPD profili\tVar\n" +
                            "Geçici bellek tipi\tUnregistered (unbuffered)\n" +
                            "Bileşen\tPC / sunucu\n" +
                            "Hafıza şekli faktörü\t288-pin DIMM\n" +
                            "SPD hızı\t2133 MHz\n" +
                            "RAM\t16 GB\n" +
                            "Hafıza frekans hızı\t4000 MHz\n" +
                            "Arkaışık\tVar\n" +
                            "Geri plan rengi\tKırmızı / Yeşil / Mavi");
                    System.out.println();
                    break;

                case 2 :
                    System.out.println("2\n" +
                            "Ram Tipi\tDDR4\n" +
                            "Hafıza Bus Hızı\t3200 MHz\n" +
                            "Ram Kapasitesi\t64GB\n" +
                            "Modül Sayısı\t1 x 64GB\n" +
                            "Gecikme Süresi\tCL22\n" +
                            "Kullanım Alanı\tServer");
                    System.out.println();
                    break;

                case 3 :
                    System.out.println("Dahili hafıza tipi\tDDR4\n" +
                            "SPD profili\tVar\n" +
                            "CAS latens\t18\n" +
                            "Hafıza voltajı\t1.4 V\n" +
                            "Geçici bellek tipi\tUnregistered (unbuffered)\n" +
                            "ECC\tYok\n" +
                            "Hafıza kanalları\tDual-channel\n" +
                            "Bileşen\tPC / sunucu\n" +
                            "RAM\t32 GB\n" +
                            "Hafıza frekans hızı\t4000 MHz");
                    System.out.println();
                    break;

                case 4 :
                    System.out.println("Ram Tipi\tDDR4\n" +
                            "Hafıza Bus Hızı\t3200 MHz\n" +
                            "Ram Kapasitesi\t128GB\n" +
                            "Gecikme Süresi\tCL22\n" +
                            "Kullanım Alanı\tServer");
                    System.out.println();
                    break;

                case 5 :
                    System.out.println("Arkaışık\tVar\n" +
                            "Hafıza frekans hızı\t4400 MHz\n" +
                            "Hafıza kanalları\tDual-channel\n" +
                            "Geri plan rengi\tKırmızı / Yeşil / Mavi\n" +
                            "Bileşen\tPC / sunucu\n" +
                            "RAM\t32 GB\n" +
                            "CAS latens\t19\n" +
                            "Geçici bellek tipi\tUnregistered (unbuffered)\n" +
                            "SPD profili\tVar\n" +
                            "ECC\tYok\n" +
                            "Hafıza voltajı\t1.5 V\n" +
                            "Dahili hafıza tipi\tDDR4");
                    System.out.println();
                    break;

                case 6 :
                    System.out.println("Ram Tipi\tDDR5\n" +
                            "Hafıza Bus Hızı\t6000 MHz\n" +
                            "Ram Kapasitesi\t64GB\n" +
                            "Kit\tDual Kit\n" +
                            "Modül Sayısı\t2 x 32GB\n" +
                            "Gecikme Süresi\tCL32\n" +
                            "Kullanım Alanı\tPC");
                    System.out.println();
                    break;

                case 7 :
                    System.out.println("Ram Tipi\tDDR5\n" +
                            "Hafıza Bus Hızı\t4800 MHz\n" +
                            "Ram Kapasitesi\t64GB\n" +
                            "Kit\tDual Kit\n" +
                            "Modül Sayısı\t2 x 32GB\n" +
                            "Gecikme Süresi\t40\n" +
                            "Kullanım Alanı\tPC");
                    System.out.println();
                    break;

                case 8 :
                    System.out.println("\n" +
                            "Hafıza şekli faktörü\t288-pin DIMM\n" +
                            "Geçici bellek tipi\tUnregistered (unbuffered)\n" +
                            "Dahili hafıza tipi\tDDR4\n" +
                            "CAS latens\t16\n" +
                            "Ürün rengi\tSiyah\n" +
                            "Bileşen\tPC / sunucu\n" +
                            "Hafıza voltajı\t1.2,1.35 V\n" +
                            "Soğutma türü\tSoğutucu\n" +
                            "Desteklenen ürünler\tASRock Z170 OC Formula, ASUS Z170, GIGABYTE Z170, MSI Z170\n" +
                            "RAM\t8 GB\n" +
                            "Hafıza frekans hızı\t3200 MHz\n");
                    break;
            }
        }
        else
        {
            switch (urunsec)
            {
                case 1 :
                    System.out.println("Ram Tipi\tDDR5\n" +
                            "Hafıza Bus Hızı\t6000 MHz\n" +
                            "Ram Kapasitesi\t32GB\n" +
                            "Kit\tDual Kit\n" +
                            "Modül Sayısı\t2 x 16GB\n" +
                            "Gecikme Süresi\tCL32\n" +
                            "Kullanım Alanı\tPC");
                    System.out.println();
                    break;

                case 2 :
                    System.out.println("\n" +
                            "Ram Tipi\tDDR5\n" +
                            "Hafıza Bus Hızı\t5200 MHz\n" +
                            "Ram Kapasitesi\t32GB\n" +
                            "Kit\tDual Kit\n" +
                            "Modül Sayısı\t2 x 16GB\n" +
                            "Gecikme Süresi\tCL36\n" +
                            "Kullanım Alanı\tPC");
                    System.out.println();
                    break;

                case 3 :
                    System.out.println("Ram Tipi\tDDR5\n" +
                            "Hafıza Bus Hızı\t6000 MHz\n" +
                            "Ram Kapasitesi\t64GB\n" +
                            "Kit\tDual Kit\n" +
                            "Modül Sayısı\t2 x 32GB\n" +
                            "Gecikme Süresi\tCL32\n" +
                            "Kullanım Alanı\tPC");
                    System.out.println();
                    break;

                case 4 :
                    System.out.println("Hafıza frekans hızı\t1600 MHz\n" +
                            "Hafıza voltajı\t1.35 V\n" +
                            "Hafıza kanalları\tSingle-channel\n" +
                            "RAM\t8 GB\n" +
                            "Bileşen\tLaptop\n" +
                            "Dahili hafıza tipi\tDDR3\n" +
                            "CAS latens\t11\n" +
                            "Hafıza şekli faktörü\t204-pin SO-DIMM");
                    System.out.println();
                    break;

                case 5 :
                    System.out.println("CAS latens\t5\n" +
                            "Hafıza şekli faktörü\t240-pin DIMM\n" +
                            "Dahili hafıza tipi\tDDR3\n" +
                            "RAM\t8 GB\n" +
                            "Hafıza frekans hızı\t1600 MHz\n" +
                            "SPD profili\tVar\n" +
                            "Geçici bellek tipi\tUnregistered (unbuffered)\n" +
                            "Bileşen\tPC / sunucu\n" +
                            "Hafıza voltajı\t1.5 V\n" +
                            "Komut oranı\t2T\n" +
                            "ECC\tYok");
                    System.out.println();
                    break;
            }
        }

    }


    public String getBellekAd() {
        return bellekAd;
    }

    public void setBellekAd(String bellekAd) {
        this.bellekAd = bellekAd;
    }

    public float getBellekFiyat() {
        return bellekFiyat;
    }

    public void setBellekFiyat(float bellekFiyat) {
        this.bellekFiyat = bellekFiyat;
    }

  /*  public boolean isDDR4() {
        return DDR4;
    }

    public void setDDR4(boolean DDR4) {
        this.DDR4 = DDR4;
    } */
}
