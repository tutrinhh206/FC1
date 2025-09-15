package Lec10_ObjectOriented;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public abstract class Nguoi {
    private String hoVaTen;
    private Date ngaySinh;
    private String gioiTinh;
    private int cccd;
    Nguoi(){ 
    }
    public Nguoi(String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cccd = cccd;
    }
    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public Date getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public int getCccd() {
        return cccd;
    }
    public void setCccd(int cccd) {
        this.cccd = cccd;
    }
    public void nhapThongTin() throws ParseException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("# Nhap thong tin: ");
        System.out.print("- Ho va ten: ");setHoVaTen(scanner.nextLine());
        System.out.print("- Ngay sinh(dd/MM/yyyy): ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySinhString= scanner.nextLine();
        setNgaySinh(sdf.parse(ngaySinhString));
        System.out.print("- Gioi tinh: ");setGioiTinh(scanner.nextLine());
        System.out.print("- Can cuoc cong dan");setCccd(Integer.parseInt(scanner.nextLine()));              
    }
    void capNhatNguoiBangCccd(int cccd) throws ParseException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("# Nhap thong tin: ");
        System.out.print("- Ho va ten: ");setHoVaTen(scanner.nextLine());
        System.out.print("- Ngay sinh(dd/MM/yyyy): ");
        SimpleDateFormat sdf = new SimpleDateFormat();
        String ngaySinhString= scanner.nextLine();
        setNgaySinh(sdf.parse(ngaySinhString));
        System.out.print("- Gioi tinh: ");setGioiTinh(scanner.nextLine());
        System.out.print("- Can cuoc cong dan");setCccd(cccd);      
    }
    @Override
    public String toString(){
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        return "Nguoi{" + "hoVaTen" + getHoVaTen() + ", ngaySinh " + sdf.format(getNgaySinh())+
                ", gioiTinh" + getGioiTinh() + ", cccd "+getCccd();
    }   
    public void  xuatThongTin(){
        System.out.println(toString());
    }    
}