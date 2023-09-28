
import java.util.Scanner;


public class SinhVienCNTT {
    public String maSV;
    public String hoTen;
    public boolean gioiTinh;
    private String queQuan;
    private int hocPhanJava;
    private int hocPhanCSS;
    private int hocPhanHTML;
    
    Scanner kb = new Scanner(System.in);
    
    public SinhVienCNTT() {
        
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setHocPhanJava(int hocPhanJava) {
        this.hocPhanJava = hocPhanJava;
    }

    public void setHocPhanCSS(int hocPhanCSS) {
        this.hocPhanCSS = hocPhanCSS;
    }

    public void setHocPhanHTML(int hocPhanHTML) {
        this.hocPhanHTML = hocPhanHTML;
    }

    public void setKb(Scanner kb) {
        this.kb = kb;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public int getHocPhanJava() {
        return hocPhanJava;
    }

    public int getHocPhanCSS() {
        return hocPhanCSS;
    }

    public int getHocPhanHTML() {
        return hocPhanHTML;
    }

    public Scanner getKb() {
        return kb;
    }

    public SinhVienCNTT(String maSV, String hoTen, boolean gioiTinh, String queQuan, float hocPhan, int hocPhanJava, int hocPhanCSS, int hocPhanHTML) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.hocPhanJava = hocPhanJava;
        this.hocPhanCSS = hocPhanCSS;
        this.hocPhanHTML = hocPhanHTML;
    }
   
    
    public void nhap() {
        this.maSV  = kb.nextLine();
        this.hoTen = kb.nextLine();
        this.gioiTinh = kb.hasNextBoolean();
        this.queQuan = kb.nextLine();
        this.hocPhanJava = kb.nextInt();
        this.hocPhanCSS = kb.nextInt();
        this.hocPhanHTML = kb.nextInt();
        
    }
    public float tinhDiemTb() {
        return (this.hocPhanCSS + this.hocPhanHTML + this.hocPhanJava) /3 ;
        
    }

    public String toString() {
        return this.maSV + "-" + this.hoTen + "diem trung binh :" + tinhDiemTb();
    }
    public void inSV() {
        System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \\n",this.maSV,this.hoTen,this.gioiTinh,this.hocPhanCSS,this.hocPhanHTML,this.hocPhanJava,tinhDiemTb());
    }
    
    
}

