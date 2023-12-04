package sinhvien;
public class CNTT extends SinhVien implements IXepLoai {

    private double java , css , html;

    public CNTT(double java, double css, double html, String ma, String hoTen, boolean gt) {
        super(ma, hoTen, gt);
        this.java = java;
        this.css = css;
        this.html = html;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    @Override
    public String toString() {
        return super.toString() +", " +java + ", " + css + ", " + html +" , Diem trung binh la :" + getDiemTB()+ ", Xep loai :" + xepLoai();
    }
    

    public CNTT() {
    }
    @Override
    public double getDiemTB() {
        return (java+css+html)/3;
    }
    public static void main(String[] args) {
        CNTT call  = new CNTT(9,8,7,"SV001","Thu Ha",true);
        System.out.println(call.toString());
    }
}
