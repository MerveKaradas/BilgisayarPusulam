class CPU extends Donanim {

    private String parcaTurAd="CPU";
    private String cpuAd = "null";
    private float cpuFiyat = 0;
    int urunsec=0;

    private static String cpuSoket="null";


    CPU(Kullanici kullanici,String parcaTurAd, String parcaAd,float parcaFiyat) {
        super(kullanici,parcaTurAd,parcaAd,parcaFiyat);
        this.parcaTurAd = parcaTurAd;
    }

    CPU(Kullanici kullanici,String parcaTurAd) {
        super(kullanici,parcaTurAd);
    }

    public CPU(Kullanici kullanici) {
        super(kullanici);
    }


    @Override
    public int UrunSec() { //2




        System.out.println("     ISLEMCILER     ");
        System.out.println("--------------------");
        System.out.println("1-Intel Core i7 11700F Soket 1200 11. Nesil 2.50GHz 16MB Önbellek 14nm İşlemci");
        System.out.println("2-Intel Core i5 10500 Soket 1200 10. Nesil 3.10GHz 12MB Önbellek 14nm İşlemci");
        System.out.println("3-AMD Ryzen™7 3800X Soket AM4 +WraithPrism(RGB) 3.9 GHz 32MB 105W 7nm İşlemci");
        System.out.println("4-Intel Core i3 10100F Soket 1200 10.Nesil 3.60GHz 6MB Önbellek 14nm İşlemci");
        System.out.println("5-AMD Ryzen™5 5600X Soket AM4 + Wraith Stealth 3.7GHz 32MB 65W 7nm İşlemci");
        System.out.println("6-Intel Core i9 11900K Soket 1200 11. Nesil 3.50GHz 16MB Önbellek 14nm İşlemci");
        System.out.println("7-Intel Core i5 10400 Soket 1200 10. Nesil 2.9GHz 12MB Önbellek 14nm İşlemci");
        System.out.println("8-Intel Core i5 12500 Soket 1700 12. Nesil 3 GHz 18MB Önbellek 10nm İşlemci");
        System.out.println("9-Intel Core i9 12900 Soket 1700 12. Nesil 3.20GHz 30MB Önbellek 10nm İşlemci");
        System.out.print("Seciminiz :  ");
        urunsec = scanner.nextInt();

        while ( urunsec<1 || urunsec>9) //try-catch gelecek
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
            urunsec = scanner.nextInt();
        }

        switch (urunsec)
        {
            case 1 :
                setCpuSoket("Soket 1200");
                setParcaAd("Intel Core i7 11700F Soket 1200 11. Nesil 2.50GHz 16MB Önbellek 14nm İşlemci");
                setParcaFiyat(5599F);
                break;

            case 2 :
                setCpuSoket("Soket 1200");
                setParcaAd("Intel Core i5 10500 Soket 1200 10. Nesil 3.10GHz 12MB Önbellek 14nm İşlemci");
                setParcaFiyat(3939F);
                break;

            case 3 :
                setCpuSoket("Soket AM4");
                setParcaAd("AMD Ryzen™7 3800X Soket AM4+WraithPrism(RGB) 3.9 GHz 32MB 105W 7nm İşlemci");
                setParcaFiyat(7673F);
                break;

            case 4 :
                setCpuSoket("Soket 1200");
                setParcaAd("Intel Core i3 10100F Soket 1200 10.Nesil 3.60GHz 6MB Önbellek 14nm İşlemci");
                setParcaFiyat(2063.98F);
                break;

            case 5 :
                setCpuSoket("Soket AM4");
                setParcaAd("AMD Ryzen™5 5600X Soket AM4 + Wraith Stealth 3.7GHz 32MB 65W 7nm İşlemci");
                setParcaFiyat(3975.99F);
                break;

            case 6 :
                setCpuSoket("Soket 1200");
                setParcaAd("Intel Core i9 11900K Soket 1200 11. Nesil 3.50GHz 16MB Önbellek 14nm İşlemci");
                setParcaFiyat(9199.98F);
                break;

            case 7 :
                setCpuSoket("Soket 1200");
                setParcaAd("Intel Core i5 10400 Soket 1200 10. Nesil 2.9GHz 12MB Önbellek 14nm İşlemci");
                setParcaFiyat(4193.99F);
                break;

            case 8 :
                setCpuSoket("Soket 1700");
                setParcaAd("Intel Core i5 12500 Soket 1700 12. Nesil 3 GHz 18MB Önbellek 10nm İşlemci");
                setParcaFiyat(5599.99F);
                break;

            case 9 :
                setCpuSoket("Soket 1700");
                setParcaAd("Intel Core i9 12900 Soket 1700 12. Nesil 3.20GHz 30MB Önbellek 10nm İşlemci");
                setParcaFiyat(13673.49F);
                break;
        }

        return urunsec;

    }




    @Override
    public void ParcaBilgilendirme() { //1

        setParcaTurAd("CPU"); //Donanim classında CPU ile ilgili işlemler yapılması için

        System.out.println();
        System.out.println(" ---------------------------------------- Merkezî işlem birimi ---------------------------------------- \n");
        System.out.println("Merkezî işlem birimi, dijital bilgisayarların veri işleyen ve yazılım komutlarını gerçekleştiren bölümüdür.\n" +
                "Çalıştırılmakta olan yazılımın içinde bulunan komutları işler. Mikroişlemciler ise tek bir yonga içine yerleştirilmiş \n" +
                "bir merkezî işlem birimidir.\n\n" +
                "Merkezî işlem birimi aritmetik ve mantıksal işlem yapma yeteneğine sahiptir. Giriş ve çıkış birimleri \n" +
                "arasında verilen yazılım ile uygun çalışmayı sağlar. MİB, makine dili denilen düşük seviyeli kodlama sistemi ile \n" +
                "çalışır; bu kodlama sistemi bilgisayarın algılayabileceği işlem kodlarından oluşur.");

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
                System.out.println("İşlemci Çekirdek Sayısı\t8\n" +
                        "İşlemci soketi\tLGA 1200 (Socket H5)\n" +
                        "İşlemci ön bellek türü\tAkıllı Önbellek\n" +
                        "İşlemci üreticisi\tINTEL®\n" +
                        "Sistem busu\t8 GT/s\n" +
                        "Processor base frequency\t2,5 GHz\n" +
                        "Kutu\tVar\n" +
                        "İşlemci\ti7-11700F\n" +
                        "İşlemci çalışma modları\t64-bit\n" +
                        "İşlemci ARK ID'si\t212280\n" +
                        "I·şlemci litografi\t14 nm\n" +
                        "Sıralı işlemci sayısı\t16\n" +
                        "İşlemci destek frekansı\t4,9 GHz\n" +
                        "İşlemci önbelleği\t16 MB\n" +
                        "Termal Tasarım Gücü\t65 W");
                System.out.println();

                break;

            case 2 :
                System.out.println("İşlemci\ti5-10500\n" +
                        "İşlemci üreticisi\tINTEL®\n" +
                        "İşlemci çalışma modları\t64-bit\n" +
                        "İşlemci kod adı\tComet Lake\n" +
                        "İşlemci ARK ID'si\t199277\n" +
                        "Soğutucu dahil\tVar\n" +
                        "İşlemci soketi\tLGA 1200 (Socket H5)\n" +
                        "Nesil\t10th Generation\n" +
                        "I·şlemci litografi\t14 nm\n" +
                        "Termal Tasarım Gücü\t65 W\n" +
                        "Sistem busu\t8 GT/s\n" +
                        "Bileşen\tPC\n" +
                        "Sıralı işlemci sayısı\t12\n" +
                        "Processor base frequency\t3,1 GHz\n" +
                        "Kutu\tVar\n" +
                        "İşlemci destek frekansı\t4,5 GHz\n" +
                        "İşlemci ön bellek türü\tAkıllı Önbellek\n" +
                        "İşlemci Çekirdek Sayısı\t6\n" +
                        "İşlemci önbelleği\t12 MB");
                System.out.println();

                break;

            case 3 :
                System.out.println("İşlemci\t3800X\n" +
                        "Termal Tasarım Gücü\t105 W\n" +
                        "İşlemci üreticisi\tAMD®\n" +
                        "İşlemci Çekirdek Sayısı\t8\n" +
                        "İşlemci çalışma modları\t64-bit\n" +
                        "İşlemci ailesi\tRyzen™ 7\n" +
                        "I·şlemci litografi\t7 nm\n" +
                        "İşlemci önbelleği\t32 MB\n" +
                        "İşlemci ön bellek türü\tL3\n" +
                        "Processor base frequency\t3,9 GHz\n" +
                        "Bileşen\tPC\n" +
                        "İşlemci soketi\tSoket AM4\n" +
                        "Sıralı işlemci sayısı\t16\n" +
                        "Soğutucu dahil\tVar");
                System.out.println();
                break;

            case 4 :
                System.out.println("İşlemci destek frekansı\t4,3 GHz\n" +
                        "İşlemci çalışma modları\t64-bit\n" +
                        "İşlemci ön bellek türü\tAkıllı Önbellek\n" +
                        "İşlemci\ti3-10100F\n" +
                        "İşlemci üreticisi\tINTEL®\n" +
                        "Sıralı işlemci sayısı\t8\n" +
                        "İşlemci önbelleği\t6 MB\n" +
                        "İşlemci ARK ID'si\t203473\n" +
                        "Processor base frequency\t3,6 GHz\n" +
                        "İşlemci Çekirdek Sayısı\t4\n" +
                        "Termal Tasarım Gücü\t65 W\n" +
                        "İşlemci kod adı\tComet Lake\n" +
                        "I·şlemci litografi\t14 nm\n" +
                        "Kutu\tVar\n" +
                        "Bileşen\tPC\n" +
                        "İşlemci soketi\tLGA 1200 (Socket H5)\n" +
                        "Soğutucu dahil\tVar\n" +
                        "Sistem busu\t8 GT/s");
                System.out.println();
                break;

            case 5 :
                System.out.println("İşlemci üreticisi\tAMD®\n" +
                        "İşlemci çalışma modları\t64-bit\n" +
                        "Sıralı işlemci sayısı\t12\n" +
                        "Processor base frequency\t3,7 GHz\n" +
                        "İşlemci ön bellek türü\tL3\n" +
                        "İşlemci\t5600X\n" +
                        "İşlemci Çekirdek Sayısı\t6\n" +
                        "İşlemci soketi\tSoket AM4\n" +
                        "İşlemci destek frekansı\t4,6 GHz\n" +
                        "Bileşen\tPC\n" +
                        "Kutu\tVar\n" +
                        "Termal Tasarım Gücü\t65 W\n" +
                        "I·şlemci litografi\t7 nm\n" +
                        "İşlemci ailesi\tRyzen™ 5\n" +
                        "İşlemci önbelleği\t32 MB");
                System.out.println();
                break;

            case 6 :
                System.out.println("İşlemci üreticisi\tINTEL®\n" +
                        "İşlemci soketi\tLGA 1200 (Socket H5)\n" +
                        "İşlemci\ti9-11900K\n" +
                        "Termal Tasarım Gücü\t125 W\n" +
                        "Kutu\tVar\n" +
                        "İşlemci önbelleği\t16 MB\n" +
                        "Sistem busu\t8 GT/s\n" +
                        "İşlemci Çekirdek Sayısı\t8\n" +
                        "İşlemci çalışma modları\t64-bit\n" +
                        "İşlemci destek frekansı\t5,3 GHz\n" +
                        "İşlemci ARK ID'si\t212325\n" +
                        "Ayarlanabilir TDP-aşağı\t95 W\n" +
                        "I·şlemci litografi\t14 nm\n" +
                        "İşlemci ön bellek türü\tAkıllı Önbellek\n" +
                        "Sıralı işlemci sayısı\t16\n" +
                        "Processor base frequency\t3,5 GHz");
                System.out.println();
                break;

            case 7 :
                System.out.println("İşlemci destek frekansı\t4,3 GHz\n" +
                        "Bileşen\tPC\n" +
                        "İşlemci ön bellek türü\tAkıllı Önbellek\n" +
                        "İşlemci soketi\tLGA 1200 (Socket H5)\n" +
                        "Processor base frequency\t2,9 GHz\n" +
                        "İşlemci Çekirdek Sayısı\t6\n" +
                        "İşlemci önbelleği\t12 MB\n" +
                        "Sistem busu\t8 GT/s\n" +
                        "Sıralı işlemci sayısı\t12\n" +
                        "İşlemci çalışma modları\t64-bit\n" +
                        "İşlemci\ti5-10400\n" +
                        "I·şlemci litografi\t14 nm\n" +
                        "Kutu\tVar\n" +
                        "Termal Tasarım Gücü\t65 W\n" +
                        "İşlemci ARK ID'si\t199271\n" +
                        "İşlemci üreticisi\tINTEL®\n" +
                        "İşlemci kod adı\tComet Lake\n" +
                        "Soğutucu dahil\tVar\n" +
                        "Nesil\t10th Generation");
                System.out.println();
                break;

            case 8 :
                System.out.println("Soğutucu dahil\tYok\n" +
                        "İşlemci\ti5-12500\n" +
                        "İşlemci çalışma modları\t64-bit\n" +
                        "İşlemci ön bellek türü\tAkıllı Önbellek\n" +
                        "Otobüs tipi\tDMI4\n" +
                        "Kutu\tVar\n" +
                        "Maximum turbo power\t117 W\n" +
                        "İşlemci kod adı\tAlder Lake\n" +
                        "Processor base power\t65 W\n" +
                        "İşlemci soketi\tLGA 1700\n" +
                        "Sıralı işlemci sayısı\t12\n" +
                        "İşlemci destek frekansı\t4,6 GHz\n" +
                        "İşlemci önbelleği\t18 MB\n" +
                        "Performance cores\t6\n" +
                        "İşlemci üreticisi\tINTEL®\n" +
                        "İşlemci Çekirdek Sayısı\t6");
                System.out.println();
                break;

            case 9 :
                System.out.println("İşlemci soketi\tLGA 1700\n" +
                        "İşlemci ön bellek türü\tAkıllı Önbellek\n" +
                        "İşlemci ailesi\tIntel® Core™ i9\n" +
                        "Kutu\tVar\n" +
                        "İşlemci kod adı\tAlder Lake\n" +
                        "Maksimum DMI hattı sayısı\t8\n" +
                        "İşlemci üreticisi\tINTEL®\n" +
                        "Sıralı işlemci sayısı\t24\n" +
                        "Performance cores\t8\n" +
                        "İşlemci destek frekansı\t5,1 GHz\n" +
                        "Efficient cores\t8\n" +
                        "İşlemci önbelleği\t30 MB\n" +
                        "Processor base power\t65 W\n" +
                        "İşlemci\ti9-12900\n" +
                        "Atlama\tC0\n" +
                        "İşlemci Çekirdek Sayısı\t16\n" +
                        "Otobüs tipi\tDMI4\n" +
                        "Processor generation\tCore i9\n" +
                        "İşlemci çalışma modları\t64-bit\n" +
                        "Maximum turbo power\t202 W");
                System.out.println();
                break;
        }


    }


    public String getCpuAd() {
        return cpuAd;
    }

    public void setCpuAd(String cpuAd) {
        this.cpuAd = cpuAd;
    }

    public float getCpuFiyat() {
        return cpuFiyat;
    }

    public void setCpuFiyat(float cpuFiyat) {
        this.cpuFiyat = cpuFiyat;
    }

    public String getCpuSoket() {
        return cpuSoket;
    }

    public void setCpuSoket(String cpuSoket) {
        this.cpuSoket = cpuSoket;
    }
}
