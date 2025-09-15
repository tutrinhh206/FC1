package Lec10_ObjectOriented;
import java.text.ParseException;
import java.util.ArrayList;
public class DanhSachNguoi {
    private ArrayList<Nguoi> ds = new ArrayList<>();
    public void themNguoi(Nguoi n) {
        ds.add(n);
    }
    public void xuatDanhSach() {
        for (Nguoi n : ds) {
            n.xuatThongTin();
        }
    }
    public void capNhatNguoiBangCccd(int cccd) throws ParseException {
        for (Nguoi n : ds) {
            if (n.getCccd() == cccd) {
                n.capNhatNguoiBangCccd(cccd);
                return;
            }
        }
        System.out.println("Khong tim thay nguoi co cccd nay");
    }
    public void xoaNguoiBangCccd(int cccd) {
        for (Nguoi n : ds) {
            if (n.getCccd() == cccd) {
                ds.remove(n);
                System.out.println("Da xoa nguoi co cccd " + cccd);
                return;
            }
        }
        System.out.println("Khong tim thay nguoi co cccd nay");
    }
}
