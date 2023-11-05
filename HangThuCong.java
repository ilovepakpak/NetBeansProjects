package hanghoa;
public class HangThuCong extends HangHoa {
    String nhaSanXuat;

    public HangThuCong(String nhaSanXuat, int maHang, int soLuong, String ngayNhap, double donGia) {
        super(maHang, soLuong, ngayNhap, donGia);
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return super.toString() + nhaSanXuat ;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public HangThuCong() {
    }
    @Override
    public double thanhTien() {
            return soLuong*donGia;
            
    }
    
}
