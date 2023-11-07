package hoadon;
public class HoaDonTheoGio extends HoaDon {
    int soGioThue;

    public HoaDonTheoGio(int soGioThue, String maHD, String tenKhach, String ngayHD, double donGia) {
        super(maHD, tenKhach, ngayHD, donGia);
        this.soGioThue = soGioThue;
    }

    @Override
    public String toString() {
        return super.toString()+ ", " + soGioThue + tinhThanhTien();
    }

    

 
    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }
    public HoaDonTheoGio() {
    }
    
    @Override
    public double tinhThanhTien() {
        return getSoGioThue()*super.getDonGia();
    }
    public static void main(String[] args) {
        HoaDonTheoGio call = new HoaDonTheoGio(002,"002","Ha","21/12/2020",200);
        call.toString();
    }

}
