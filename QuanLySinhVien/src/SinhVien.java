public class SinhVien {

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public int getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setDiemTrungBinh(int diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
   private String tenSinhVien ;
   private String queQuan ; 
   private int namSinh;
   private int diemTrungBinh;
   public SinhVien(String tenSinhVien, String queQuan, int namSinh, int diemTrungBinh) {
        this.tenSinhVien = tenSinhVien;
        this.queQuan = queQuan;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }
   
}
