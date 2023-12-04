package sinhvien;
public class KinhTe extends SinhVien implements IXepLoai {

    private double mKT,nLKT;

    public KinhTe() {
    }

    public KinhTe(double mKT, double nLKT, String ma, String hoTen, boolean gt) {
        super(ma, hoTen, gt);
        this.mKT = mKT;
        this.nLKT = nLKT;
    }

    public double getmKT() {
        return mKT;
    }

    public void setmKT(double mKT) {
        this.mKT = mKT;
    }

    public double getnLKT() {
        return nLKT;
    }

    public void setnLKT(double nLKT) {
        this.nLKT = nLKT;
    }

    @Override
    public String toString() {
        return super.toString() +", " + mKT + ", " + nLKT + ", Diem trung binh la :" +getDiemTB() + ", Xep loai :" +xepLoai();
    }
    
    @Override
    public double getDiemTB() {
        return (mKT*2+nLKT)/3;
        
    }
    public static void main(String[] args) {
        KinhTe call = new KinhTe(9, 7, "SV001", "Thu Ha", true);
        System.out.println(call.toString());

    }
    
}
