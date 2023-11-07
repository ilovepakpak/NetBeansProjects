package hoadon;
public abstract class HoaDon {
    String maHD,tenKhach;
    String ngayHD;
    double donGia;

    public HoaDon() {
    }

    public HoaDon(String maHD, String tenKhach, String ngayHD, double donGia) {
        this.maHD = maHD;
        this.tenKhach = tenKhach;
        this.ngayHD = ngayHD;
        this.donGia = donGia;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
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
        return   maHD + ", " + tenKhach + ", " + ngayHD + ", " + donGia  ;
    }
    public abstract double tinhThanhTien();
    
}
