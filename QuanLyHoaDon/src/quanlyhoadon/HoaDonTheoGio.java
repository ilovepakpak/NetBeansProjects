package quanlyhoadon;
public class HoaDonTheoGio extends HoaDon {
    public int soGioThue;

    public HoaDonTheoGio() {
    }

    public HoaDonTheoGio(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    public HoaDonTheoGio(int soGioThue, String maHD, String maKH, String ngayHD, double donGia) {
        super(maHD, maKH, ngayHD, donGia);
        this.soGioThue = soGioThue;
    }

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    @Override
    public String toString() {
        return super.toString()+ ", " + soGioThue +", So thanh tien la : " +tinhThanhTien();
    }

    @Override
    public double tinhThanhTien() {
        return soGioThue*super.donGia;
    }
    
    
    
}
