package tictactoee;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToee extends Player {

    public ArrayList<Player> a = new ArrayList<>();

    public void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                System.out.println("OK");
                Scanner read = new Scanner (f);
                while(read.hasNext()) {
                    String line = read.nextLine();
                    String s[] = line.split(", ");
                    String ten = s[0];
                    String id = s[1];
                    int game = Integer.parseInt(s[2]);
                    int point = Integer.parseInt(s[3]);
                    a.add(new Player(ten,id,point,game));
                }
            } else {
                System.out.println("Khong doc duoc");
            }
        } catch (Exception e) {
        }
    }
    public void xuat() {
        for (Player x :a) {
            System.out.println(x);
        }System.out.println("");
    }
    public void output() {
        xuat();
    }
    public static void main(String[] args) {
        TicTacToee call = new TicTacToee();
        call.docFile("playerrank.txt");
        call.output();
    }

}
