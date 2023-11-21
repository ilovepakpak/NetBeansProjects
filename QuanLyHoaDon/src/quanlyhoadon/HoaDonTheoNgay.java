package quanlyhoadon;
public class HoaDonTheoNgay extends HoaDon {
    public int soNgayThue;

    public HoaDonTheoNgay() {
    }

    public HoaDonTheoNgay(int soNgayThue, String maHD, String maKH, String ngayHD, double donGia) {
        super(maHD, maKH, ngayHD, donGia);
        this.soNgayThue = soNgayThue;
    }

    @Override
    public String toString() {
        return super.toString()+", "+ soNgayThue + ", Thanh tien la : " + tinhThanhTien();
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    
    @Override
    public double tinhThanhTien() {
        if (soNgayThue>7) return soNgayThue*super.donGia*0.8;
        return soNgayThue*super.donGia;
    }
    
}
