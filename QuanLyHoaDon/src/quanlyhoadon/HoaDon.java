package quanlyhoadon;
public abstract class HoaDon implements IHoaDon {
    String maHD , maKH ;
    String ngayHD;
    double donGia;

    public HoaDon() {
    }

    public HoaDon(String maHD, String maKH, String ngayHD, double donGia) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.ngayHD = ngayHD;
        this.donGia = donGia;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return maHD + ", " + maKH + ", " + ngayHD + ", " + donGia ;
    }
    public abstract double tinhThanhTien();
}
