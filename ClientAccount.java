import java.util.Scanner;
public class ClientAccount extends People {
    private String clientID;
    private int warning;
    public ClientAccount(String ho, String ten, boolean sex, Date age, String clientID, int warning) {
        super(ho, ten, sex, age);
        this.clientID = clientID;
        this.warning= warning;
    }
    public String getClientID() {
        return clientID;
    }
    public void setClientID(String clientID){
        this.clientID = clientID;
    }

    public int getWarning() {
        return warning;
    }
    public void setWarning(int warning) {
        this.warning = warning;
    }
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        clientID = sc.nextLine();

        System.out.print("Warning: ");
        warning = sc.nextInt();
    }
}
