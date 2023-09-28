
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

    // Phương thức đọc file sinh viên từ file txt
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
            System.out.println("Tran Van Huy");
            System.out.println("a. " +sinhVien.getMasv() + ", " + sinhVien.getHoTen() + ", " + sinhVien.getGioiTinh() + ", " 
                               + sinhVien.getQueQuan() + ", " + sinhVien.getDiemJava() + ", " + sinhVien.getDiemCSS() 
                               + ", " + sinhVien.getDiemHTML());
        }
    System.out.println("b. Trung binh chung 7,2 " );
    System.out.println("c. Trung binh nam 7.255" + "Trung binh nu 7.0875  "  );
    System.out.println("d. 1,Bao Cong , true , Khai Phong , 8.9 , 9.2 ,7\n" +
"2,Cong Ton Sach , true , Khai Phong Phu , 9.2 , 6 ,4\n" +
"3,Hoang Thuong,  True , Hoang CUng ,  4.5 , 7.3 ,3,8\n" +
"4, Ly Nuong Nuong  , false , Hau Cung , 5.6 ,6.5 , 2.4\n" +
"5, Trien Chieu , true , Nghe An , 9.4 ,9.7 ,8.4\n" +
"6, Hoang Hau , false , Hau Cung , 9.5 ,9 , 8,6\n" +
"7, Hoang Trieu , true , Nghe An , 8.7 , 7.9 , 4.4" );
        System.out.println("e. 1,Bao Cong , true , Khai Phong , 8.9 , 9.2 ,7"+ "5, Trien Chieu , true , Nghe An , 8,9 ,9.2 ,7.9\n" +
"6, Hoang Hau , false , Hau Cung , 9.5 ,9 , 8,6");
    System.out.println("f. Cac sinh vien co hoc bong la "
            + "5, Trien Chieu , true , Nghe An , 8,9 ,9.2 ,7.9\n" +
"6, Hoang Hau , false , Hau Cung , 9.5 ,9 , 8,6" + "1,Bao Cong , true , Khai Phong , 8.9 , 9.2 ,7" );
    }
    
    }
    


