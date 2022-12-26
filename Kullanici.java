public class Kullanici {

    private String userName="null",userMail="null",userPassword="null";
    private int userAge=0;




    public void KullaniciBilgileri()
    {
        System.out.println();
        System.out.println("***KULLANICI BILGI EKRANI***  \n");
        System.out.println("AD : " + getUserName());
        System.out.println("YAS : " + getUserAge());
        System.out.println("E-POSTA : " + getUserMail());
        System.out.println("SIFRE : " + getUserPassword());

    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMail() {
        return userMail + "@gmail.com";
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
