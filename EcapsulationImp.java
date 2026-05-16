class Instagram {
    private String account_name;
    private String password;
    Instagram() {
        this.account_name = "navyasri_dussa";
        this.password = "pass";
    }
    Instagram(String acc, String pass) {
        this.account_name = acc;
        this.password = pass;
    }
    void Getter() {
        System.out.println("Account Name: " + this.account_name);
        System.out.println("Password: " + this.password);
    }
    void Setpass(String newPass) {
        this.password = newPass;
    }
}
public class EcapsulationImp {
    public static void main(String[] args) {
        Instagram insta = new Instagram();
        insta.Getter();
        insta.Setpass("3417821");
        insta.Getter();
    }
}