
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<SinhVienCNTT> danhSachSinhVien = docFileSinhVien("sv_cntt.txt");
        inDanhSachSinhVien(danhSachSinhVien);
    }

    public static List<SinhVienCNTT> docFileSinhVien(String fileName) {
        List<SinhVienCNTT> danhSachSinhVien = new ArrayList<>();

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                int masv = Integer.parseInt(parts[0]);
                String hoTen = parts[1];
                String gioiTinh = parts[2];
                String queQuan = parts[3];
                double diemJava = Double.parseDouble(parts[4]);
                double diemCSS = Double.parseDouble(parts[5]);
                double diemHTML = Double.parseDouble(parts[6]);

                SinhVienCNTT sinhVien = new SinhVienCNTT();
                sinhVien.setMasv(masv);
                sinhVien.setHoTen(hoTen);
                sinhVien.setGioiTinh(gioiTinh);
                sinhVien.setQueQuan(queQuan);
                sinhVien.setDiemJava(diemJava);
                sinhVien.setDiemCSS(diemCSS);
                sinhVien.setDiemHTML(diemHTML);

                // Thêm sinh viên vào danh sách
                danhSachSinhVien.add(sinhVien);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return danhSachSinhVien;
    }

    public static void inDanhSachSinhVien(List<SinhVienCNTT> danhSachSinhVien) {
        for (SinhVienCNTT sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien.getMasv() + ", " + sinhVien.getHoTen() + ", " + sinhVien.getGioiTinh() + ", " 
                               + sinhVien.getQueQuan() + ", " + sinhVien.getDiemJava() + ", " + sinhVien.getDiemCSS() 
                               + ", " + sinhVien.getDiemHTML());
        }
    }
}
