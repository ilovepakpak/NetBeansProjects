
import java.util.ArrayList;
import java.util.Scanner;

public class MangDiemOxy {
    private ArrayList<DiemOxy> a = new ArrayList<DiemOxy>();
    public void nhap(){
        int n;
        Scanner kb=new Scanner(System.in);
        do{
            System.out.println("Tran Van Huy");
            System.out.print("Nhap n>0:");
            n=kb.nextInt();
        }while(n<=0);
        for(int i=1;i<=n;i++){
            System.out.print("Nhap diem thu "+i+" : ");
            int x,y;
            x=kb.nextInt();
            y=kb.nextInt();
            DiemOxy z=new DiemOxy(x,y);
            a.add(z);
        }
    }
    public void xuat(){
        
        for(int i=0;i<a.size();i++)
            System.out.print(a.get(i));
    }
    public DiemOxy min(){
        DiemOxy c=a.get(0);
        for(int i=0;i<a.size();i++)
            if(c.modul()>a.get(i).modul())
                c=a.get(i);
        return c;
    }
    public DiemOxy max(){
        DiemOxy c=a.get(0);
        for(int i=0;i<a.size()-1;i++)
            if(c.modul()<a.get(i).modul())
                c=a.get(i);
        return c;
    }
    public void maxKhoangCach(){
        DiemOxy x=a.get(0), y=a.get(1);
        for(int i=0;i<a.size()-1;i++)
            for(int j=i+1;j<a.size();j++)
                if(x.khoangcach(y)<a.get(i).khoangcach(a.get(j))){
                    x=a.get(i) ; y=a.get(j);}
        System.out.println("5.Max khoang cach :"+x+" --->"+y+" = "+x.khoangcach(y));
    }
    
    public void sapXepTangModul(){
        for(int i=0;i<a.size()-1;i++)
            for(int j=i+1;j<a.size();j++)
                if(a.get(i).modul()>a.get(j).modul()){
                    DiemOxy x=a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, x);
                }
        System.out.print("\n7.Tang modul:");
        xuat();
    }
    public void xoaGoc3(){
         ArrayList<DiemOxy> mangtamthoi = new ArrayList<>();
        for(int i=0;i<a.size();i++){
            if((a.get(i).getOx()*a.get(i).getOy()<0)||(a.get(i).getOx()>0&&a.get(i).getOy()>0)){
            
                mangtamthoi.add(a.get(i));
            }}
            
        System.out.print("6.Sau xoa cac diem goc III:");
        for(int i=0;i<mangtamthoi.size();i++)
            System.out.print(mangtamthoi.get(i));
    }
    public void sapXepGiamOx(){
        for(int i=0;i<a.size()-1;i++)
            for(int j=i+1;j<a.size();j++)
                if(a.get(i).getOx()<a.get(j).getOx()){
                    DiemOxy x=a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, x);
                   
                        }
                
        System.out.print("\n8.Giam Ox:");
       xuat();
    }
    public static void main(String[] args) {
        MangDiemOxy a=new MangDiemOxy();
        a.nhap();
        System.out.print("2.Cac diem ");
        a.xuat();
        System.out.println("\n3.Min = "+a.min()+"="+a.min().modul());
        System.out.println("4.Max = "+a.max()+"="+a.max().modul());
        a.maxKhoangCach();
        a.xoaGoc3();
        a.sapXepTangModul();
        a.sapXepGiamOx();
    }
}
