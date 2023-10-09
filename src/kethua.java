public class kethua extends Nguoi {
    String maSinhVien;
    double diemTrungBinh;

    public kethua() {
    }

    public kethua( String ten, String gioiTinh, String diaChi, String ngaySinh , String maSinhVien, double diemTrungBinh) {
        super(ten, gioiTinh, diaChi, ngaySinh);
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "maSinhVien= " + maSinhVien + "," + super.toString() + ", diemTrungBinh=" + diemTrungBinh ;
    }
    public static void main(String[] args) {
        
    }
    
}
