public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
        
    }
}
