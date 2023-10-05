package cs311ag_lec12_tranvanhuy;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PhuonTrinh extends Bac1 {

    ArrayList<Bac1> a = new ArrayList<>();

    public void docFile(String tenFile) {
        try {
            File f = new File("PhuongTrinh.txt");
            if (f.exists()) {
                System.out.println("Doc duoc file");
                Scanner kb = new Scanner(f);
                while (kb.hasNext()) {
                    String line = kb.nextLine();
                    String s[] = line.split(" ");
                    double hs1 = Double.parseDouble(s[1]);
                    double hs2 = Double.parseDouble(s[2]);
                    if (s.length == 3) {
                        double hs3 = Double.parseDouble(s[3]);
                    }
                }
            } else {
                System.out.println("Khong doc duoc file");
            }
        } catch (Exception e) {

        }

    }
    public void giaiPhuongTrinh (){
        for (Bac1 x : a) 
        {
            if (x instanceof Bac1) {
            System.out.println("Phuong trinh "+hs0 +"x + " +hs1+ "co nghiem la :" + (-hs1/hs0));            }
        }
    }
    public static void main(String[] args) {
        PhuonTrinh call = new PhuonTrinh();
        call.docFile("PhuongTrinh.txt");
        call.giaiPhuongTrinh();
    }
}
