package cs311ag_lec12_tranvanhuy;

import java.util.Scanner;

public class Bac1 extends Bac2 {
    double hs1 , hs0 ;

    public Bac1() {
    }

    public Bac1(double hs1, double hs0) {
        this.hs1 = hs1;
        this.hs0 = hs0;
    }

    public Bac1(double hs1, double hs0, double hs2) {
        this.hs1 = hs1;
        this.hs0 = hs0;
    }

   

    public double getHs1() {
        return hs1;
    }

    public void setHs1(double hs1) {
        this.hs1 = hs1;
    }

    public double getHs0() {
        return hs0;
    }

    public void setHs0(double hs0) {
        this.hs0 = hs0;
    }
//    @Override
//    public String toString() {
//        return "Bac1 "  + ", hs1=" + hs1 + ", hs0=" + hs0 + super.toString() ;
//    }
    public void giaiBac1(){
        if ( hs0 == 0 ) { 
        }
        else {
            System.out.println(-this.hs1/this.hs0);
        }
    }
      @Override
    public double getHs2() {
        return hs2;
    }
      @Override
    public void setHs2(double hs2) {
        this.hs2 = hs2;
    }
//    public void nhap() {
//        Scanner  kb = new Scanner(System.in);
//        this.hs0 = kb.nextDouble();
//        this.hs1 = kb.nextDouble();
//    }
    public static void main(String[] args) {
        Bac1 call =  new Bac1();
//        call.nhap();
        call.giaiBac1();
    }

    
}
