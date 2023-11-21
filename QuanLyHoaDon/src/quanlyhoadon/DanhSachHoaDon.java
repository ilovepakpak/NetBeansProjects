package quanlyhoadon;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachHoaDon extends HoaDon {

    public ArrayList<IHoaDon> a = new ArrayList<>();

    public void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    String line = read.nextLine();
                    String s[] = line.split(", ");
                    String ma = s[0];
                    String ngay = s[1];
                    String ten = s[2];
                    double dg = Double.parseDouble(s[3]);
                    int thoigian = Integer.parseInt(s[4]);
                    if (s[0].equalsIgnoreCase("N")) {
                        a.add(new HoaDonTheoNgay(thoigian, ma, ten, ngay, dg));
                    } else {
                        a.add(new HoaDonTheoGio(thoigian, ma, ten, ngay, dg));
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    public void xuat() {
        for (IHoaDon x : a) {
            System.out.println(x);
        }
        System.out.println("");
    }

    /* public void xuatTheoNgay() {
         for (IHoaDon x :a) {
            if (x instanceof HoaDonTheoNgay) {
                System.out.println(x);
            } System.out.println("");
     }
     }
     public void xuatTheoGio() {
        for (IHoaDon x :a) {
        if (x instanceof HoaDonTheoGio)
                System.out.println(x);
            } System.out.println("");
     } */
    public void timThanhTienCaoNhatTheoLoai() {
        double max = 0;
        for (IHoaDon x : a) {
            if (x instanceof HoaDonTheoNgay) {
                if (x.tinhThanhTien() >= max) {
                    max = x.tinhThanhTien();
                }
            }
        }
        System.out.println("So tien hoa don lon nhat theo ngay la :" + max);
    }

    public void timThanhTienCaoNhatTheoGio() {
        double max = 0;
        for (IHoaDon x : a) {
            if (x instanceof HoaDonTheoGio) {
                if (x.tinhThanhTien() > max) {
                    max = x.tinhThanhTien();
                }
            }
        }
        System.out.println("So tien hoa don lon nhat theo gio la :" + max);
    }

    public void xoaHoaDonTheoMa(String ma) {
        for (IHoaDon x : a) {
            if (a.equals(ma) == true) {
                a.remove(ma);
            }
        }
        System.out.println("Hoa don sau khi da xoa");
        xuat();
    }

    public void giamDanHoaDonTheoThanhTien() {
        for (IHoaDon x : a) {
            for (int i = 0; i < a.size(); i++) {
                for (int j = 0; j < a.size(); j++) {
                }
            }
        }
    }

    public void output() {
        xuat();
        timThanhTienCaoNhatTheoLoai();
        timThanhTienCaoNhatTheoGio();
        Scanner ma1 = new Scanner(System.in);
        String ma = "G002";
        System.out.println("Xoa hoa don ma " + ma);
        xoaHoaDonTheoMa(ma);

    }

    @Override
    public double tinhThanhTien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        DanhSachHoaDon call = new DanhSachHoaDon();
        call.docFile("HoaDon.txt");
        call.output();

    }
}
