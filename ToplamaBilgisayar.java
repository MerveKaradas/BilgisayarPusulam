public class ToplamaBilgisayar extends AnaMenu{

    ToplamaBilgisayar(Kullanici kullanici) {
        super(kullanici);

    }

    public void ToplamaBilgisayarGiris()
    {
        ToplamaBilgisayarNedir();
        ToplamaBilgisayarNasilYapilir();
        ToplamaBilgisayarlarBasla();
    }

    public void ToplamaBilgisayarlarBasla()
    {
        Donanim donanim = new CPU(kullanici,"CPU"); //CPU da bir donanimdir
        /* Bu sayede donanim nesnesini CPU türünde oluşan bir nesne gibi kullanabiliyoruz yani CPU'daki metotlar Donanim class'ında
         bulunan metotları ezerek CPU'daki metotlar çalışmış olucak */
        donanim.MetotCalistir();
    }

    public void ToplamaBilgisayarNedir()
    {
        System.out.println();
        System.out.println("---------------------------------- TOPLAMA BİLGİSAYAR ----------------------------------\n");

        System.out.println("TOPLAMA BILGISAYAR NEDIR ? ");
        System.out.println("___________________________");
        System.out.println("Özel olarak oluşturulmuş bilgisayar veya Toplama bilgisayar, hazır PC olarak da bilinen\n" +
                "bilgisayar tedarikçisinden eksiksiz bir sistem olarak satın alınmak yerine, genellikle \nticari kullanıma" +
                " hazır bileşenler olmak üzere mevcut bileşenlerden oluşturulmuş bir bilgisayardır.\n" +
                "\n" +
                "Toplama bilgisayarın montajı, hazır bilgisayar satın almaya kıyasla genellikle daha ucuz olarak kabul edilir,\n" +
                "çünkü özel tesislerde bilgisayar inşa etmekle ilgili emeği içermez, ve bunun yerine işçilik, kullanıcı\n" +
                "tarafından kendi ev yapımı bilgisayarını monte ederken yapılır.\n" +
                "\n" +
                "Bu nedenle, giderek daha fazla oyuncu kendi oyun bilgisayarlarını toplamayı tercih etmektedir.\n" +
                "Donanımı ayrı olarak satın almak ve evde monte etmek sadece daha ucuz olmakla kalmaz, bu aynı \n" +
                "zamanda kullanıcının bilgisayarı kendi ihtiyaçlarına göre özelleştirme olanağı sağlar.");

        System.out.println();
    }

    public void ToplamaBilgisayarNasilYapilir()
    {

        System.out.println("TOPLAMA BILGISAYAR NASIL OLUSTURULUR ? ");
        System.out.println("_______________________________________");
        System.out.println("Bilgisayari olusturan temelde 8 adet bilesen vardir.");
        System.out.println("1- Islemci \n" +
                "2- Anakart\n" +
                "3- RAM\n" +
                "4- Ekran Karti\n" +
                "5- Depolama Birimi\n" +
                "6- Guc Kaynagi\n" +
                "7- Kasa\n");

        System.out.println("Bilgisayari olustururken bu temel birimler birbiriyle uyusmalari gereklidir.\n");

        System.out.println("UYUMLU OLMASI GEREKEN PARCALAR : ");
        System.out.println("__________________________________");
        System.out.println("1-) İşlemci soketi ile anakart soketi aynı olmalı.\n" +
                "2-) Anakart ile RAM uyumu olmalı yani RAM DDR4 ise anakart da DDR4 desteklemeli.\n" +
                "3-) Ekran kartı PCI-e sürümü ile anakartınki uyuşmalı (zorunluluk değil ama tam verim almak açısından)\n" +
                "4-) Anakartta M.2 desteği yoksa M.2 SSD alınmamalı. Onun yerine SATA SSD tercih edilmeli (veya hdd).\n" +
                "5-) Ekran kartı çıkış portu ile monitörün giriş portu birbiriyle aynı olmalı" +
                " (dönüştürücü aparat kullanmak zorunda kalmamak için).");

        System.out.println();
    }


}
