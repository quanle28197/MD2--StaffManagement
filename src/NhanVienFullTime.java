public class NhanVienFullTime extends NhanVien {
    private double TienThuong;
    private double TienPhat;
    private double LuongCung;

    public NhanVienFullTime(String code, String name, int age, String callNumber, String email, double tienThuong, double tienPhat, double luongCung) {
        super(code, name, age, callNumber, email);
        TienThuong = tienThuong;
        TienPhat = tienPhat;
        LuongCung = luongCung;
    }

    public double getTienThuong() {
        return TienThuong;
    }

    public void setTienThuong(double tienThuong) {
        TienThuong = tienThuong;
    }

    public double getTienPhat() {
        return TienPhat;
    }

    public void setTienPhat(double tienPhat) {
        TienPhat = tienPhat;
    }

    public double getLuongCung() {
        return LuongCung;
    }

    public void setLuongCung(double luongCung) {
        LuongCung = luongCung;
    }

    @Override
    public double TinhLuong() {
        return getLuongCung() + (getTienThuong() - getTienPhat());
    }

    @Override
    public String toString() {
        return "Full-time employees whose salary is: " + TinhLuong() + super.toString();
    }
}
