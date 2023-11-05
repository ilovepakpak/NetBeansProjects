package hanghoa;
public abstract class HangHoa {
    int maHang,soLuong;
    String ngayNhap;
    double donGia;

    public HangHoa(int maHang, int soLuong, String ngayNhap, double donGia) {
        this.maHang = maHang;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return  maHang + ", " + soLuong + ", " + ngayNhap + ", " + donGia ;
    }

    public HangHoa() {
    }
    public abstract double thanhTien();
    public static void main(String[] args) {
    }
    
}
