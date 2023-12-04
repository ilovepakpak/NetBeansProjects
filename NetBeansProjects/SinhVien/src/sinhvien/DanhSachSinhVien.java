package sinhvien;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien extends SinhVien{
    public ArrayList<SinhVien> a = new ArrayList<>();
    public void docFile(String tenFile) {
        try {
            File f = new File (tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                   String s[] = read.nextLine().split(", ");
                    String ma = s[0];
                    String ten = s[1];
                    boolean gt = Boolean.parseBoolean(s[2]);
                    double d1 = Double.parseDouble(s[3]);
                    double d2 = Double.parseDouble(s[4]);
                    if (a.size() == 6) {
                        double d3 = Double.parseDouble(s[5]);
                        a.add(new CNTT(d1,d2,d3,ma,ten,gt));
                    }else a.add(new KinhTe(d1,d2,ma,ten,gt));
                    
                }
            }
        } catch (Exception e) {
        }
    }
    public void xuat() {
        for (SinhVien x :a) {
            System.out.println(x);
        } System.out.println("");
    }
    public String demSinhVienGioi(){
        int count=0;
        for (SinhVien x:a){
            if (x.getDiemTB()>=8) {
                count++;
            }
        }return "So sinh vien gioi la :" + count;
    }
    public String demSinhVienCNTT() {
        int count=0;
        for (SinhVien x : a) {
            if (x instanceof CNTT) {
                count++;
                System.out.println(count);
            }
        } return "So sinh vien cong nghe thong tin la :"+ count;
    }
    public String demSinhVienKinhTe() {
        int count=0;
        for (SinhVien x :a) {
            if (x instanceof KinhTe) {
                count++;
            }
        } return "So sinh vien kinh te la :"+ count;
    }
    public String maxDiemSinhVienTrungBinh() {
        double max =0;
        for (SinhVien x :a) {
            if (max < x.getDiemTB()) {
                max=x.getDiemTB();
            }
        }return "Sinh vien co so diem trung binh lon nhat la " + max ;
    }
    
    public void output() {
        xuat();
        System.out.println(demSinhVienCNTT());
        System.out.println(demSinhVienKinhTe());
        System.out.println(maxDiemSinhVienTrungBinh());
        System.out.println(demSinhVienGioi());
        
        
        
    }
    public static void main(String[] args) {
        DanhSachSinhVien call = new DanhSachSinhVien();
        call.docFile("SinhVien.txt");
        call.output();
    } 
    @Override
    public double getDiemTB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
