package cs311ag_lec11_tranvanhuy;
public class SinhVienKinhTe {
    public String maSV, hoTen , queQuan;
    public boolean gioiTinh;
    public double nLKT , mKT ,diemTb;
    public String getXepLoai() {
        diemTb = (nLKT*2+mKT)/3;
        if (diemTb <=3.5) return "Yeu";
        else if (diemTb <5) return "Trung Binh";
        else if (diemTb <6.5) return "Kha";
        else  if (diemTb <8) return "Gioi";
        else if (diemTb <9) return "Xuat Sac";
        return "Tuyet Voi =))";
    }
    public SinhVienKinhTe(String ma, String ht, boolean gt, String qq, double nlkt, double mkt) {
    }

    public SinhVienKinhTe(String maSV, String hoTen, String queQuan, boolean gioiTinh, double nLKT, double mKT) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.nLKT = nLKT;
        this.mKT = mKT;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public double getnLKT() {
        return nLKT;
    }

    public double getmKT() {
        return mKT;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setnLKT(double nLKT) {
        this.nLKT = nLKT;
    }

    public void setmKT(double mKT) {
        this.mKT = mKT;
    }

    @Override
    public String toString() {
        return "SinhVienKinhTe{" + maSV + "," + hoTen + "," + queQuan + "," +gioiTinh + "," + nLKT + "," + mKT + "," +getXepLoai() +  '}';
    }
    public static void main(String[] args) {
    }
    
}
