
import java.util.ArrayList;
import java.util.List;

public class QuanlyNv {
    private static List<NhanVien> nhanViens;

    public QuanlyNv(List<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    public QuanlyNv() {
    }

    public void setNhanViens(List<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    public static void displayNhanVien() {
        for (NhanVien nhanVien :nhanViens) {
            System.out.println(nhanVien);
        }
    }
    public static void addNhanVien(NhanVien nhanVien) {
        nhanViens.add(nhanVien);
    }
    public void displayFullTimeNv() {
        double totalSalary = 0;
        List<NhanVienFullTime>nhanVienFullTimeList = new ArrayList<>();
        for (NhanVien nhanVien:nhanViens) {
            totalSalary += nhanVien.TinhLuong();
        }
        double avgSalary = totalSalary/nhanViens.size();
        for (NhanVien nhanVien:nhanViens) {
            if (nhanVien instanceof NhanVienFullTime&&nhanVien.TinhLuong()<avgSalary) {
                nhanVienFullTimeList.add((NhanVienFullTime)nhanVien );
            }
        }
        System.out.println("List of full-time employees with lower-than-average wages");
        if (!nhanVienFullTimeList.isEmpty()) {
            for (NhanVienFullTime nhanVienFullTime:nhanVienFullTimeList) {
                System.out.println(nhanVienFullTime);
            }
        } else {
            System.out.println("No match found");
        }
    }
    public static void sumLuongNhanVienPartTime() {
        double sumLuongNhanVienPartTime = 0;
        for (NhanVien nhanVien: nhanViens) {
            if (nhanVien instanceof NhanVienPartTime) {
                sumLuongNhanVienPartTime += nhanVien.TinhLuong();
            }
        }
        System.out.println("tổng lương bán thời gian là: " + sumLuongNhanVienPartTime);
    }

    public static void sortNhanVienFullTime() {
        List<NhanVienFullTime>nhanVienFullTimeList = new ArrayList<>();
        for (NhanVien nhanVien: nhanVienFullTimeList) {
            if (nhanVien instanceof NhanVienFullTime) {
                nhanVienFullTimeList.add((NhanVienFullTime) nhanVien);
            }
        }
        for (int i = 0; i < nhanVienFullTimeList.size(); i++) {
            for (int j = 0; j < nhanVienFullTimeList.size() - 1; j++) {
                if (nhanVienFullTimeList.get(j).TinhLuong()>nhanVienFullTimeList.get(j+1).TinhLuong()){
                    NhanVienFullTime temp = nhanVienFullTimeList.get(j);
                    nhanVienFullTimeList.set(j,nhanVienFullTimeList.get(j + 1));
                    nhanVienFullTimeList.set(j + 1, temp);
                }
            }
        }
        System.out.println("The list of full-time employees after sorting by increasing salary is:");
        for (NhanVienFullTime nhanVien: nhanVienFullTimeList) {
            System.out.println(nhanVien);
        }
    }
}
