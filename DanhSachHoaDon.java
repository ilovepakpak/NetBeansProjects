package hoadon;

import java.io.File;
import java.util.*;

public class DanhSachHoaDon extends HoaDon {
      ArrayList<HoaDon> a = new ArrayList<>();
     public void docFile (String tenFile) {
         try {
             File f = new File(tenFile);
             if (f.exists()) {
                 System.out.println("Read file f");
                 Scanner read = new Scanner(f);
                 while(read.hasNext()) {
                     String s[] = read.nextLine().split(",");
                     String ma = s[0];
                     String nn = s[1];
                     String ten = s[2];
                     double dg = Double.parseDouble(s[3]);
                     int nt = Integer.parseInt(s[4]);
                     if (ma.equalsIgnoreCase("N")) {
                         a.add(new HoaDonTheoNgay(nt,ma,ten,nn,dg));
                     } else 
                         a.add(new HoaDonTheoGio(nt,ma,ten,nn,dg));
                 }
             } else System.out.println("Can't read f");
         } catch (Exception e) {
         }
     }
     public void xuat() {
         for (HoaDon x : a) 
             System.out.println(x);
         System.out.println("");
     }
     public void lietKeHoaDonTheoMoiLoai() {
         for (HoaDon x :a ) {
             if(x instanceof HoaDonTheoNgay) {
                 System.out.println(x);
                 System.out.println("");
             }
             else if (x instanceof HoaDonTheoGio) {
                 System.out.println(x);
                 System.out.println("");
             }
         }
     }
     public void timThanhTienLonNhatMoiLoai() {
            double maxN = 0 , maxH = 0;
         for (HoaDon x : a ) {
             if(x instanceof HoaDonTheoGio)
             {
                 if (maxN < x.tinhThanhTien())
                     maxN = x.tinhThanhTien();
             } else if(x instanceof HoaDonTheoGio)
             {
                 if (maxH < x.tinhThanhTien())
                     maxH = x.tinhThanhTien();
             }
         }
         System.out.println("Hoa don ngay co thanh tien cao nhat" + maxN);
         System.out.println("Hoa don theo gio co thanh tien cao nhat" + maxH);
     }
     public void output(){
         xuat();
         lietKeHoaDonTheoMoiLoai();
         timThanhTienLonNhatMoiLoai();
         
     }
     @Override
    public double tinhThanhTien() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
     public static void main(String[] args) {
         
        DanhSachHoaDon call =  new DanhSachHoaDon();
         call.docFile("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\HoaDon");
        call.output();
    }
    
}
