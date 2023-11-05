package hanghoa;
public class HangDienMay extends HangHoa {
    String noiSanXuat;

    public HangDienMay() {
    }

    public HangDienMay(String noiSanXuat, int maHang, int soLuong, String ngayNhap, double donGia) {
        super(maHang, soLuong, ngayNhap, donGia);
        this.noiSanXuat = noiSanXuat;
    }
    
    @Override
    public double thanhTien() {
        if (noiSanXuat == "TN")
        return soLuong * donGia;
        return soLuong*donGia*1.2;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    @Override
    public String toString() {
        return super.toString() + noiSanXuat ;
    }
    
}
