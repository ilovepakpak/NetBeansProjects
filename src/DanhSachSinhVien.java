

import java.util.ArrayList;
import java.util.Scanner;

 public class DanhSachSinhVien  extends kethua  {
     int n ;
      ArrayList<kethua> a = new ArrayList<>(); 
     public void nhap() {
       
         Scanner kb = new Scanner(System.in);    
   do {
       System.out.println("Nhap vao so sinh vien");
       n = kb.nextInt();
       
   }while ( n <= 0 );
     for (int i = 0 ; i < n ; i++) {
        System.out.println("Nhap vao ten");
        ten = kb.nextLine();
        System.out.println("Nhap vao 2");
        gioiTinh = kb.nextLine();
        System.out.println("Nhap vao 3");
        diaChi = kb.nextLine();
        System.out.println("Nhap vao 4");        
        ngaySinh = kb.nextLine();
        System.out.println("Nhap vao 5");
        maSinhVien = kb.nextLine();
        System.out.println("Nhap vao 6");        
        diemTrungBinh = kb.nextDouble();
        a.add(new kethua(ten,gioiTinh,diaChi,ngaySinh,maSinhVien,diemTrungBinh));
    }
    
}
     
   public void lietKe () {
       for (kethua x : a ) {
           System.out.println(x);
           System.out.println("");
       }
   }
   public double timDiemLonNhat() {
           for (int i = 0 ; i< n ; i++) 
           if (a.get(i).diemTrungBinh > a.get(i+1).diemTrungBinh )  
           return a.get(i).diemTrungBinh;
           else
               return a.get(i).diemTrungBinh = a.get(i+1).diemTrungBinh;
       
   }
   public void output() {
       
   }    
   public static void main(String[] args) {
     
    DanhSachSinhVien call = new DanhSachSinhVien();
    call.nhap();
    call.lietKe();
}
 }
