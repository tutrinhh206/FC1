package Lec10_ObjectOriented;
import java.text.ParseException;
import java.util.Scanner;
public class SinhVien extends Nguoi {
    private String lop;
    private String nganh;
    public SinhVien() {
        super();
    }
    public SinhVien(String hoVaTen, java.util.Date ngaySinh, String gioiTinh, int cccd, String lop, String nganh) {
        super(hoVaTen, ngaySinh, gioiTinh, cccd);
        this.lop = lop;
        this.nganh = nganh;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public String getNganh() {
        return nganh;
    }
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    @Override
    public void nhapThongTin() throws ParseException {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("- Lop: "); setLop(scanner.nextLine());
        System.out.print("- Nganh: "); setNganh(scanner.nextLine());
    }
    @Override
    public String toString() {
        return super.toString() + ", lop " + lop + ", nganh " + nganh + "}";
    }
}
