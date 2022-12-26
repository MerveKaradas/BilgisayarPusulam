public class HazirBilgisayarMarkaSec extends AnaMenu{


    String marka="null";
    HazirBilgisayarMarkaSec(Kullanici Kullanici) {
        super(Kullanici);
    }

    public void HazirBilgisayarMarkaSecimi()
    {

        int markaSec=0;
        System.out.println();
        System.out.println("========= Bilgisayar Markaları =========");
        System.out.println("1-Monster");
        System.out.println("2-MAC");
        System.out.println("3-HP");
        System.out.println("4-MSI");
        System.out.println("5-Dell");
        System.out.print("Seciminiz :  ");
        markaSec = scanner.nextInt();
        System.out.println();

        while ( markaSec<1 || markaSec>5)
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
            markaSec = scanner.nextInt();
        }

        switch (markaSec)
        {
            default:
            case 1: Monster(); break;
            case 2: MAC(); break;
            case 3: HP(); break;
            case 4: MSI(); break;
            case 5: Dell(); break;

        }

    }


    public void Monster()
    {
        marka = "MONSTER";                                                     //HazirBilgisayarSec'den referans gostererek obje ürettik Monster
        HazirBilgisayarSec hazirBilgisayarSec = new Monster(kullanici,marka); // referansın alt sınıfı old. için polymorphism kullanılabildi
        hazirBilgisayarSec.MetotCalistir();

    }

    public void MAC()
    {

        HazirBilgisayarSec hazirBilgisayarSec = new MAC(kullanici,marka);
        hazirBilgisayarSec.MetotCalistir();
    }

    public void HP()
    {
        HazirBilgisayarSec hazirBilgisayarSec = new HP(kullanici,marka);
        hazirBilgisayarSec.MetotCalistir();
    }

    public void MSI()
    {

        HazirBilgisayarSec hazirBilgisayarSec = new MSI(kullanici,marka);
        hazirBilgisayarSec.MetotCalistir();
    }

    public void Dell()
    {
        HazirBilgisayarSec hazirBilgisayarSec = new Dell(kullanici,marka);
        hazirBilgisayarSec.MetotCalistir();
    }
}
