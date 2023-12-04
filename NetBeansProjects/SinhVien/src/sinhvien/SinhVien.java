package sinhvien;
public abstract class SinhVien implements IXepLoai {
        public String ma, hoTen;
        boolean gt;

    public abstract double getDiemTB();    
    public SinhVien() {
    }

    public SinhVien(String ma, String hoTen, boolean gt) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.gt = gt;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }

    @Override
    public String toString() {
        return ma + ", " + hoTen + ", "+ gt ;
    }

    @Override
    public String xepLoai() {
        if (getDiemTB() < 3) return "Kem";
        if (getDiemTB() < 5) return "Yeu";
        if (getDiemTB() < 6.5) return "Trung Binh";
        if (getDiemTB() < 8) return "Kha";
        if (getDiemTB() < 9) return "Gioi";
        else return "Xuat sac";
    }
        
    }
    
