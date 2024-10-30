import java.util.Scanner;
public class People {
    protected String ho, ten;
    protected boolean sex;
    protected Date age;
   
    public People(String ho, String ten, boolean sex, Date age) {
        this.ho = ho;
        this.ten = ten;
        this.sex = sex;
        this.age = age;
    }

    public String getho() {
        return ho;
    }
    public void setho(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isSex() {
        return sex;
    }
    public void setSet(boolean sex) {
        this.sex = sex;
    }

    public Date getAge() {
        return age;
    }
    public void setAge(Date age) {
        this.age = age;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho: ");
        this.ho = sc.nextLine();
        System.out.print("Ten: ");
        this.ten = sc.nextLine();
        System.out.print("Sex(Male=true or Female=false): ");
        this.sex = sc.nextBoolean();
        System.out.print("Age: ");
        this.age = new Date(0, 0, 0);
        this.age.nhap();
        //sc.close();
    }
    public void xuat() {
        System.out.format("%-10s| %-10s| %-10s| %-10s| ", ho, ten, (sex ? "Male" : "Female"), age.xuat());
    }
}