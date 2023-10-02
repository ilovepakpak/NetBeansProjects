package cs311ag_lec11_tranvanhuy;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CS311AG_Lec11_TranVanHuy {

    public ArrayList<SinhVienKinhTe> a = new ArrayList<>();
         
    public void docFIle(String tenFile) {
         
    try {
        File f = new File(tenFile); 
            Scanner read = new Scanner(f);
            while (read.hasNext()) {
                String line  = read.nextLine();
                String s[] = line.split(",");
                String ma = s[0];
                String ht = s[1];
                boolean gt = Boolean.parseBoolean(s[2]);
                String qq = s[3];
                double nlkt = Double.parseDouble(s[4]);
                double mkt = Double.parseDouble(s[5]);
                a.add(new SinhVienKinhTe(ma,ht,qq,gt,nlkt,mkt));
            }
        } catch (Exception e) {
        }
    }
    private void xuat(String noiDung) {
        System.out.println(noiDung);
        for (SinhVienKinhTe x : a)
            System.out.println(x);
    }
    public double tinhTBChung() {
        double s=0;
        for (SinhVienKinhTe x : a) 
            s+= x.getDiemTb();
        return s/=a.size();
    }
    public double tinhDiemTrungBinhTheoGioiTinh(boolean gt) {
        double s = 0, dem = 0; 
        for (SinhVienKinhTe x :a ) 
            if (x.isGioiTinh() != gt) {
            } else {
                s=s+x.getDiemTb();
                dem++;
            }
        if ( dem == 0 ) return 0;
        return s/dem;
    }
    public void loaiSV (double x) {
        int i = 0 ;
        while (i<a.size())
            if(a.get(i).getDiemTb() < tinhTBChung())
                a.remove(i);
            else i++;
                }
    public void giamDanTheoDiem(){
        for (int i= 0; i<a.size() ; i++) {
            for (int j = i+1 ; j <a.size() ; j++) {
                if (a.get(i).getDiemTb() <a.get(j).getDiemTb()) {
                    SinhVienKinhTe x = a.get(j);
                    a.set(i,a.get(j));
                    a.set(j,x);
                }
            }
        }
    }
    public void xacDinhViThu() {
        System.out.println("\nXac dinh vi thu");
        for(int i = 0 ; i <a.size(); i++) {
            int dem =0;
            for (int j  = 0 ; j <a.size(); j++) {
                if(a.get(i).getDiemTb() < a.get(j).getDiemTb()) 
                    dem++;
                System.out.println(a.get(i).getHoTen() + " " + a.get(i).getDiemTb()+ "vi thu " + (dem+1));
            }
        }
    }
    public void output(){
        xuat("a.DSSV vua doc tu File");
        System.out.println("b. Diem Trung binh chung " + tinhTBChung());
        System.out.println("c. Diem Trung Binh Nam " + tinhDiemTrungBinhTheoGioiTinh(true));
        System.out.println("c. Diem Trung Binh Nu " + tinhDiemTrungBinhTheoGioiTinh(false));
        loaiSV(tinhTBChung());
        xuat("d.Danh sach sinh vien sau khi loai");
        giamDanTheoDiem();
        xuat("e.Danh sach sinh vien giam dan theo diem");
        xacDinhViThu();
        
    } 
    public static void main(String[] args) {
        CS311AG_Lec11_TranVanHuy call = new CS311AG_Lec11_TranVanHuy();
        call.docFIle("SV_KinhTe.txt");
        call.output();
    }
}
