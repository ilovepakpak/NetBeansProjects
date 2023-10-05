package cs311ag_lec12_tranvanhuy;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PhuonTrinh1 extends Bac1 {
    private ArrayList<Bac1> a = new ArrayList<>();
    public void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                System.out.println("Doc duoc file");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    String line = read.nextLine();
                    String s[] = line.split(",");
                    double s0 = Double.parseDouble(s[0]);
                    double s1 = Double.parseDouble(s[1]);
                    if (s.length == 3) {
                        double s2 = Double.parseDouble(s[2]);
                        a.add(new Bac1(s1, s0, s2));
                    } else {
                        a.add(new Bac1(s1, s0));
                    }
                }
            } else {
                System.out.println("Khong doc duoc file");
            }
        } catch (Exception e) {
            
        }

    }
    public void lietKe() {
        for (Bac1 x : a ) 
            System.out.println(x);
        System.out.println("");
    }
//
//     public void giaiPhuongTrinh() {
//         for (Bac1 x : a) {
//             if (x instanceof Bac1) {
//                 System.out.println(x);
//               }
//                if (x instanceof Bac2) {
//                 System.out.println(x);
//             }
//             }
//     }

    public static void main(String[] args) {
        PhuonTrinh1 call = new PhuonTrinh1();
        call.docFile("PhuongTrinh.txt");
        call.lietKe();
    }
}
