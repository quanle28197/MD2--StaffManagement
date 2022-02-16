public class NhanVienPartTime extends NhanVien {
    private double GioLam;

    public NhanVienPartTime(String code, String name, int age, String callNumber, String email, double gioLam) {
        super(code, name, age, callNumber, email);
        GioLam = gioLam;
    }

    public double getGioLam() {
        return GioLam;
    }

    public void setGioLam(double gioLam) {
        GioLam = gioLam;
    }

    @Override
    public double TinhLuong() {
        return getGioLam() * 100000;
    }

    @Override
    public String toString() {
        return "Parttime employees whose salary is:" + TinhLuong() + super.toString();
    }
}
