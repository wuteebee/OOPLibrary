import java.util.Scanner;
public class Date {
    protected int day, month, year;
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Day: ");
        this.day = sc.nextInt();
        System.out.print("Month: ");
        this.month = sc.nextInt();
        System.out.print("Year: ");
        this.year = sc.nextInt();

        //sc.close();
    }
    public String xuat() {
        return day + "/" + month + "/" + year;
    }
}
