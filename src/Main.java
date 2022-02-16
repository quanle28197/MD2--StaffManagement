import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NhanVien nhanvien1 = new NhanVienFullTime("1", "Quang Anh", 23, "0999888666","abc", 10000,1000, 500);
        NhanVien nhanvien2 = new NhanVienFullTime("2", "ThietNN", 23, "0999888666","abc", 12000,10000, 1500);
        NhanVien nhanvien3 = new NhanVienFullTime("2", "Quân", 23, "0999888666","abc", 1000,2000, 1000);
        NhanVien nhanvien4 = new NhanVienPartTime("3", "Trường", 23, "0999888666","abc", 5);
        NhanVien nhanvien5 = new NhanVienPartTime("4", "Tuấn", 23, "0999888666","abc", 10);
        NhanVien nhanvien6 = new NhanVienPartTime("4", "K.Anh", 23, "0999888666","abc", 105);
        List<NhanVien> nhanVienList = new ArrayList<>();
        nhanVienList.add(nhanvien1);
        nhanVienList.add(nhanvien2);
        nhanVienList.add(nhanvien3);
        nhanVienList.add(nhanvien4);
        nhanVienList.add(nhanvien5);
        nhanVienList.add(nhanvien6);
        QuanlyNv quanlyNv = new QuanlyNv();
        quanlyNv.setNhanViens(nhanVienList);
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Add Staff: ");
            System.out.println("2. PartTime Salary:");
            System.out.println("3. Display Staff");
            System.out.println("4. Sort FullTime");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    QuanlyNv.addNhanVien(nhanvien1);
                case 2 :
                    QuanlyNv.sumLuongNhanVienPartTime();
                    break;
                case 3:
                    QuanlyNv.displayNhanVien();
                    break;
                case 4:
                    QuanlyNv.sortNhanVienFullTime();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }

    }
}
