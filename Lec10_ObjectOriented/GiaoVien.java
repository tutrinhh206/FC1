package Lec10_ObjectOriented;
import java.text.ParseException;
import java.util.Scanner;
public class GiaoVien extends Nguoi {
    private String monDay;
    private double luong;
    public GiaoVien() {
        super();
    }
    public GiaoVien(String hoVaTen, java.util.Date ngaySinh, String gioiTinh, int cccd, String monDay, double luong) {
        super(hoVaTen, ngaySinh, gioiTinh, cccd);
        this.monDay = monDay;
        this.luong = luong;
    }
    public String getMonDay() {
        return monDay;
    }
    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    @Override
    public void nhapThongTin() throws ParseException {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("- Mon day: "); setMonDay(scanner.nextLine());
        System.out.print("- Luong: "); setLuong(Double.parseDouble(scanner.nextLine()));
    }
    @Override
    public String toString() {
        return super.toString() + ", monDay " + monDay + ", luong " + luong + "}";
    }
}

