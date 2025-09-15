package Lec10_ObjectOriented;
import java.text.ParseException;
import java.util.Scanner;
public class Processor {
    public static void main(String[] args) throws ParseException {
        DanhSachNguoi ds = new DanhSachNguoi();
        Scanner sc = new Scanner(System.in);
        int tiepTuc = 1;
        while (tiepTuc == 1) {
            System.out.println("===== MENU =====");
            System.out.println("1. Nhap thong tin (Sinh vien / Giao vien)");
            System.out.println("2. Sua danh sach");
            System.out.println("3. Xoa danh sach");
            System.out.println("4. Xuat danh sach");
            System.out.print("Chon chuc nang: ");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.print("Nhap doi tuong (1-Sinh vien, 2-Giao vien): ");
                    int loai = Integer.parseInt(sc.nextLine());
                    if (loai == 1) {
                        SinhVien sv = new SinhVien();
                        sv.nhapThongTin();
                        ds.themNguoi(sv);
                    } else if (loai == 2) {
                        GiaoVien gv = new GiaoVien();
                        gv.nhapThongTin();
                        ds.themNguoi(gv);
                    } else {
                        System.out.println("Loai khong hop le");
                    }
                    break;
                case 2:
                    System.out.print("Nhap cccd de sua: ");
                    int cccdSua = Integer.parseInt(sc.nextLine());
                    ds.capNhatNguoiBangCccd(cccdSua);
                    break;
                case 3:
                    System.out.print("Nhap cccd de xoa: ");
                    int cccdXoa = Integer.parseInt(sc.nextLine());
                    ds.xoaNguoiBangCccd(cccdXoa);
                    break;
                case 4:
                    ds.xuatDanhSach();
                    break;
                default:
                    System.out.println("Chuc nang khong hop le");
            }
            System.out.print("Tiep tuc? (1-Co, 0-Khong): ");
            tiepTuc = Integer.parseInt(sc.nextLine());
        }
    }
}
