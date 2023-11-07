package hoadon;
public class HoaDonTheoNgay extends HoaDon {
    int soNgayThue;

    public HoaDonTheoNgay() {
    }

    public HoaDonTheoNgay(int soNgayThue, String maHD, String tenKhach, String ngayHD, double donGia) {
        super(maHD, tenKhach, ngayHD, donGia);
        this.soNgayThue = soNgayThue;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public String toString() {
        return super.toString() +", " + soNgayThue + tinhThanhTien();
    }
    
    @Override
    public double tinhThanhTien() {
        if(soNgayThue<=7)
        return getSoNgayThue()*super.getDonGia();
        return (getSoNgayThue()-7*super.getDonGia())+getSoNgayThue()*super.getDonGia()*0.8;
    }
    public static void main(String[] args) {
        HoaDonTheoNgay call = new HoaDonTheoNgay(002,"002","Ha","21/12/2020",200);
        call.toString();
    }
   
}
